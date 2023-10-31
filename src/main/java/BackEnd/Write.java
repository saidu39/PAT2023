/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import static UI.TournaTool_UI.maxParticipants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Saien Naidu
 */
public class Write {

    public static int pos = 0;
    public static int round = 0;
    public static String score = "0";
    public static String block = "";

    public static boolean roundChanged0 = false;
    public static boolean roundChanged1 = false;
    public static boolean roundChanged2 = false;
    public static boolean roundChanged3 = false;
    public static boolean roundChanged4 = false;
    public static boolean roundChanged5 = false;
    public static boolean roundChanged6 = false;
    public static boolean roundChanged7 = false;

    public static String addNewParticipant(String tournamentName, String participantName) throws IOException {

        try (FileWriter participantsFW = new FileWriter("allParticipants.txt", true)) {
            int tournamentNum = Read.getNumOfTournaments();
            int startingRound = StartingInfo.getStartingRound(maxParticipants);
            int maxStartingRoundPos = StartingInfo.getMaxStartingRoundPos(maxParticipants);

            switch (tournamentNum) {
                case 0:
                    if (roundChanged0 == false) {
                        round = startingRound;
                    }
            }

            pos++;

            switch (round) {
                case 1 -> {
                    if (pos > 32) {
                        pos = 1;
                        round = 2;
                    }
                }
                case 2 -> {
                    if (pos > 16) {
                        pos = 1;
                        round = 3;
                    }
                }
                case 3 -> {
                    if (pos > 8) {
                        pos = 1;
                        round = 4;
                    }
                }
                case 4 -> {
                    if (pos > 4) {
                        pos = 1;
                        round = 5;
                    }
                }
                case 5 -> {
                    if (pos > 2) {
                        pos = 1;
                        round = 6;
                    }
                }

            }

            if (round == startingRound && pos > maxStartingRoundPos) {
                round++;

                if (pos == 3) {
                    pos = 2;
                }

                if (pos > 3) {
                    pos = pos / 2;
                }

                switch (tournamentNum) {
                    case 0:
                        roundChanged0 = true;
                }
            }

            participantsFW.write(tournamentName + "#" + round + "#" + pos + "#" + participantName + "#" + "0" + "\n");
            addScore(tournamentName, round, pos, "0");
            participantsFW.close();
        }
        return participantName;

    }

    public static void updateParticipants(int round, int pos, String score) throws IOException {

        File participantsFile = new File("allParticipants.txt");
        Scanner participantsSC = new Scanner(participantsFile);

        while (participantsSC.hasNext()) {
            String line = participantsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String tournamentName = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            String name = lineSC.next();
            String givenScore = lineSC.next();

            if (round == givenRound && pos == givenPos) {

                givenRound++;
                givenPos = ((pos / 2) + (pos % 2));

                try (FileWriter participantsFW = new FileWriter("allParticipants.txt", true)) {
                    participantsFW.write(tournamentName + "#" + givenRound + "#" + givenPos + "#" + name + "#" + score + "\n");
                    updateScore(tournamentName, givenRound, givenPos, score, true);
                }

            }

        }

    }

    public static void saveTournament(String tournament, int maxParticipants) throws IOException {

        int tournamentNum = Read.getNumOfTournaments();

        try (FileWriter tournamentsFW = new FileWriter("allTournaments.txt", true)) {
            tournamentsFW.write(tournamentNum + "#" + tournament + "#" + maxParticipants);
        }
    }

    public static void increaseTotalTournaments() throws IOException {

        File totalTournaments = new File("totalTournaments.txt");

        try (Scanner totalTournamentsSC = new Scanner(totalTournaments)) {
            int currentTotalTournaments = totalTournamentsSC.nextInt();
            int newTotalTournaments = currentTotalTournaments + 1;

            PrintWriter totalTournamentsPW;

            try (FileWriter totalTournamentsFW = new FileWriter("totalTournaments.txt", false)) {
                totalTournamentsPW = new PrintWriter(totalTournamentsFW);
                totalTournamentsPW.print(newTotalTournaments);
            }
            totalTournamentsPW.close();
        }

    }

    public static void firstParticipantsSet0() throws IOException {

        try (FileWriter checkFW = new FileWriter("firstParticipantsSetCheckT0.txt", false)) {
            checkFW.write("no");
        }

    }

    public static String setParticipantLeft0(String participantName, int givenRound, int givenPos, int tournamentNum) throws FileNotFoundException, IOException {

        try (FileWriter currentParticipantLeft0FW = new FileWriter("currentParticipantLeft0.txt", false)) {

            String tournament = Read.getTournamentName(tournamentNum);
            currentParticipantLeft0FW.write(tournament + "#" + givenRound + "#" + givenPos + "#" + participantName + "#" + 0);
            return participantName;

        }
    }

    public static String setParticipantRight0(String participantName, int givenRound, int givenPos, int tournamentNum) throws FileNotFoundException, IOException {

        try (FileWriter currentParticipantLeft0FW = new FileWriter("currentParticipantRight0.txt", false)) {

            String tournament = Read.getTournamentName(tournamentNum);
            currentParticipantLeft0FW.write(tournament + "#" + givenRound + "#" + givenPos + "#" + participantName + "#" + 0);
            return participantName;

        }

    }

    public static String updateParticipantLeft0(int startingRound, int startingPos) throws IOException {

        File participantsFile = new File("allParticipants.txt");
        Scanner participantsSC = new Scanner(participantsFile);

        while (participantsSC.hasNext()) {

            String line = participantsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String tournamentName = lineSC.next();
            round = lineSC.nextInt();
            pos = lineSC.nextInt();
            String name = lineSC.next();
            String score = lineSC.next();
            
            if ((pos % 2 == 1)  && (((round == startingRound) && (pos > startingPos)) || ((round > startingRound)  && (pos <= startingPos)))) {
                try (FileWriter nextLeftParticipantFW = new FileWriter("currentParticipantLeft0.txt", false)) {
                    nextLeftParticipantFW.write(line);
                }
                return name;
            }

        }
        return "";

    }

    public static String updateParticipantRight0(int startingRound, int startingPos) throws IOException {

        File participantsFile = new File("allParticipants.txt");
        Scanner participantsSC = new Scanner(participantsFile);

        while (participantsSC.hasNext()) {

            String line = participantsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String tournamentName = lineSC.next();
            round = lineSC.nextInt();
            pos = lineSC.nextInt();
            String name = lineSC.next();
            String score = lineSC.next();
            
            if ((pos % 2 == 0)  && (((round == startingRound) && (pos > startingPos)) || ((round > startingRound)  && (pos <= startingPos)))) {
                try (FileWriter nextLeftParticipantFW = new FileWriter("currentParticipantRight0.txt", false)) {
                    nextLeftParticipantFW.write(line);
                }
                return name;
            }

        }
        return "";

    }
    
    public static void addScore(String tournamentName, int round, int pos, String score) throws IOException{
        
        try (FileWriter scoreFW = new FileWriter("allScores.txt", true)) {
            scoreFW.write(tournamentName + "#" + round + "#" + pos + "#" + score + "\n");
        }
        
    }
    
    public static void updateScore(String tournamentName, int round, int pos, String score, boolean check) throws IOException{
        
        try (FileWriter scoreFW = new FileWriter("allScores.txt", true)) {
            
            if (check == true){
                round--;
                pos = (pos * 2) - (pos % 2);
            }
            
            scoreFW.write(tournamentName + "#" + round + "#" + pos + "#" + score + "\n");
        }
        
    }
    
    /*    public static String getParticipantName(int round, int position) throws FileNotFoundException {

        int previousRound = round - 1;

        String p1 = "";
        int p1Score = 0;
        int p1PreviousPosition = position * 2 - 1;   //3*2 -1 = 5

        String p2 = "";
        int p2Score = 0;
        int p2PreviousPosition = position * 2;    //3*2 = 6

        File f = new File("participants.txt");
        Scanner fileSc = new Scanner(f);

        while (fileSc.hasNext()) { //use a while loop, not an if statement

            String line = fileSc.nextLine(); //grab the whole line
            Scanner lineSc = new Scanner(line).useDelimiter("#"); //use a second scanner to tokenize the line

            String competition = lineSc.next();
            round = lineSc.nextInt();
            position = lineSc.nextInt();
            String name = lineSc.next();
            int score = lineSc.nextInt();

            //here you can now do checks like "if(maxStartingRoundPos > 1)" or something like that.
            if (round == previousRound && position == p1PreviousPosition) {
                p1 = name;
                p1Score = score;
            }
            if (round == previousRound && position == p2PreviousPosition) {
                p2 = name;
                p2Score = score;
            }

            if (p1Score > p2Score) {
                return p1;
            } else {
                return p2;
            }
        }
        return null;
    }
     */
}
