/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Saien Naidu
 */
public class WriteParticipants {

    public static int pos = 0;
    public static int participantsAdded = 0;
    public static int startingRound = 1;
    public static int score = 0;
    
    public static String addParticipant(String tournament, String participantName, int maxParticipants) throws IOException{
        
        startingRound = BackEnd.StartingRound.getStartingRound(maxParticipants);
        
        File participantsFile = new File("participants.txt");
        try (FileWriter participantsFW = new FileWriter("participants.txt", true)) {
            pos++;
            participantsFW.write(tournament + "#" + startingRound + "#" + pos + "#" + participantName + "#" + score + "\n");
        }
        
        return participantName;
    }

    public static String getParticipantName(int round, int position) throws FileNotFoundException {

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

            //here you can now do checks like "if(position > 1)" or something like that.
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
}
