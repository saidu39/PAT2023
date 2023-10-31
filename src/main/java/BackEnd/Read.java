/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LATITUDE 5480
 */
public class Read {

    public static int matchNumber = 0;

    public static String getTournamentName(int tournamentNum) throws FileNotFoundException {

        File tournamentsFile = new File("allTournaments.txt");
        Scanner tournamentsSC = new Scanner(tournamentsFile);

        while (tournamentsSC.hasNext()) {

            String line = tournamentsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            int givenTournamentNum = lineSC.nextInt();
            String givenTournamentName = lineSC.next();

            if (givenTournamentNum == tournamentNum) {
                String tournamentName = givenTournamentName;
                tournamentsSC.close();
                return tournamentName;
            }

        }
        return "";

    }

    public static int getMaxParticipants(int tournamentNum) throws FileNotFoundException {

        File tournamentsFile = new File("allTournaments.txt");
        Scanner tournamentsSC = new Scanner(tournamentsFile);

        while (tournamentsSC.hasNext()) {

            String line = tournamentsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            int givenTournamentNum = lineSC.nextInt();
            String tournamentName = lineSC.next();
            int maxParticipants = lineSC.nextInt();

            if (tournamentNum == givenTournamentNum) {
                tournamentsSC.close();
                return maxParticipants;
            }

        }
        return 0;
    }

    public static String getParticipants(String tournamentName, int round, int pos) throws FileNotFoundException {

        File participantFile = new File("allParticipants.txt");
        Scanner participantFileSC = new Scanner(participantFile);

        while (participantFileSC.hasNext()) {

            String line = participantFileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String givenTournamentName = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            String givenName = lineSC.next();
            int score = lineSC.nextInt();

            if (givenTournamentName.equals(tournamentName) && givenRound == round && givenPos == pos) {
                String name = givenName;
                participantFileSC.close();
                return name;
            }

        }
        return " ";

    }

    public static int getParticipantRound(String tournamentName, String name, int pos) throws FileNotFoundException {

        File participantFile = new File("allParticipants.txt");
        Scanner participantFileSC = new Scanner(participantFile);

        while (participantFileSC.hasNext()) {

            String line = participantFileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String givenTournament = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            String givenName = lineSC.next();
            String score = lineSC.next();

            if (givenTournament.equals(tournamentName) && name.equals(givenName)) {
                int round = givenRound;
                participantFileSC.close();
                return round;
            }

        }
        return 0;

    }

    public static int getParticipantPos(String tournamentName, String name) throws FileNotFoundException {

        File participantFile = new File("allParticipants.txt");
        Scanner participantFileSC = new Scanner(participantFile);

        while (participantFileSC.hasNext()) {

            String line = participantFileSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String competition = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            String givenName = lineSC.next();
            String score = lineSC.next();

            if (competition.equals(tournamentName) && name.equals(givenName)) {
                int pos = givenPos;
                participantFileSC.close();
                return pos;
            }
        }
        return 0;
    }

    public static String getParticipantScore(String participantName, int participantRound) throws FileNotFoundException {

        File participantsFile = new File("allParticipants.txt");
        Scanner participantsSC = new Scanner(participantsFile);

        while (participantsSC.hasNext()) {
            String line = participantsSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String tournamentName = lineSC.next();
            int givenRound = lineSC.nextInt();
            int pos = lineSC.nextInt();
            String givenName = lineSC.next();
            String score = lineSC.next();

            if (givenRound == participantRound && givenName.equals(participantName)) {
                return score;
            }
        }
        return " ";
    }

    public static int getNumOfTournaments() throws FileNotFoundException {

        File tournamentNumFile = new File("totalTournaments.txt");
        int totalTournamentsNum;
        try (Scanner tournamentNumSC = new Scanner(tournamentNumFile)) {
            totalTournamentsNum = tournamentNumSC.nextInt();
        }

        return totalTournamentsNum;

    }

    public static String getStartingParticipants(int pos) throws FileNotFoundException {

        File participantsFile = new File("allParticipants.txt");

        try (Scanner participantsSC = new Scanner(participantsFile)) {
            while (participantsSC.hasNext()) {
                String line = participantsSC.nextLine();
                try (Scanner lineSC = new Scanner(line).useDelimiter("#")) {

                    String tournament = lineSC.next();
                    int round = lineSC.nextInt();
                    int givenPos = lineSC.nextInt();
                    String name = lineSC.next();
                    String score = lineSC.next();

                    if (givenPos == pos) {
                        return name;
                    }
                }

            }
        }
        return "";
    }

    public static String firstParticipantsSetCheck() throws FileNotFoundException {

        File checkFile = new File("firstParticipantsSetCheckT0.txt");

        String check;
        try (Scanner blockSC = new Scanner(checkFile)) {
            check = blockSC.next();
        }

        return check;

    }

    public static String getNextRightParticipant0(String tournamentName) throws FileNotFoundException, IOException {

        File currentParticipantsFile = new File("currentParticipantRight0.txt");
        try (Scanner currentParticipantsSC = new Scanner(currentParticipantsFile)) {

            String line = currentParticipantsSC.nextLine();

            try (Scanner lineSC = new Scanner(line).useDelimiter("#")) {
                String givenTournamentName = lineSC.next();
                int round = lineSC.nextInt();
                int pos = lineSC.nextInt();
                String name = lineSC.next();
                int score = lineSC.nextInt();

                return name;
            }
        }
    }

    public static String getNextLeftParticipant0(String tournamentName) throws FileNotFoundException, IOException {

        File currentParticipantsFile = new File("currentParticipantLeft0.txt");
        try (Scanner currentParticipantsSC = new Scanner(currentParticipantsFile)) {

            String line = currentParticipantsSC.nextLine();

            try (Scanner lineSC = new Scanner(line).useDelimiter("#")) {
                String givenTournamentName = lineSC.next();
                int round = lineSC.nextInt();
                int pos = lineSC.nextInt();
                String name = lineSC.next();
                int score = lineSC.nextInt();

                return name;
            }

        }
    }
    
        public static String getScores(String tournamentName, int round, int pos) throws FileNotFoundException{
        File scoresFile = new File("allScores.txt");
        Scanner scoresSC = new Scanner(scoresFile);
        
        while (scoresSC.hasNext()){
            String line = scoresSC.nextLine();
            Scanner lineSC = new Scanner(line).useDelimiter("#");
            
            String givenTournamentName = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            String score = lineSC.next();
            
            if (givenTournamentName.equals(tournamentName) && givenRound == round && givenPos == pos){
                return score;
            }
        }
        return " ";
    }
}
