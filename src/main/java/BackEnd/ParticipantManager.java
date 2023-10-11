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
 * @author LATITUDE 5480
 */
public class ParticipantManager {
    
    public static String tournament = "";
    public static String participantRound = "0";
    public static String participantPos = "0";
    public static String name = "uhuh";
    public static String score = "0";
    
    public static void addParticipant(String participantName) throws FileNotFoundException, IOException{

        File participantsFile = new File("src\\main\\resources\\participants.txt");
        
        FileWriter participantsFW = new FileWriter("src\\main\\resources\\participants.txt",true);
        participantsFW.write("\n"+participantName);
        participantsFW.close();
        
    } 
    
    public static String getParticipantName(int round, int position) throws FileNotFoundException{
        int previousRound = round - 1;
        String p1 = "";
        int p1Score = 0;
        int p1PreviousPosition = position*2 - 1;   //3*2 -1 = 5
        String p2 = "";
        int p2Score = 0;
        int p2PreviousPosition = position*2;    //3*2 = 6

        File f = new File("src\\main\\resources\\participants.txt");
        Scanner fileSc = new Scanner(f);
        

        while(fileSc.hasNext()){ //use a while loop, not an if statement
            String line = fileSc.nextLine(); //grab the whole line
            Scanner lineSc = new Scanner(line).useDelimiter("#"); //use a second scanner to tokenize the line

            String competition = lineSc.next();
            round = lineSc.nextInt();
            position = lineSc.nextInt();
            String name = lineSc.next();
            int score = lineSc.nextInt();

            //here you can now do checks like "if(position > 1)" or something like that.
            if(round == previousRound && position == p1PreviousPosition){
                p1 = name;
                p1Score = score;
            }
            if(round == previousRound && position == p2PreviousPosition){
                p2 = name;
                p2Score = score;
            }

            if(p1Score > p2Score){
            return p1;
            } else {
                return p2;
            }
        }
        return null;
    }
}