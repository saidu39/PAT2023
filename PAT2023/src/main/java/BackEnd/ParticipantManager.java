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
    
    public static void addParticipant(String participantName) throws FileNotFoundException, IOException{

        File participantsFile = new File("src\\main\\resources\\participants.txt");
        
        FileWriter participantsFW = new FileWriter("participants.txt",true);
        participantsFW.write("\n"+participantName);
        participantsFW.close();
        
    }
    
    public static String getParticipantName(String round, String pos) throws FileNotFoundException{
        
        String tournament = "";
        String score = "0";
        String participant = "";

        File participantsFile = new File("src\\main\\resources\\participants.txt");
        Scanner participantsSC = new Scanner(participantsFile).useDelimiter("#");

        while (participantsSC.hasNext()){
            
            tournament = participantsSC.next();
            score = participantsSC.next();
            participant = participantsSC.next();
            
            if (participantsSC.next().equals(round)){
                if (participantsSC.next().equals(pos)){
                    participant = participantsSC.next();
                    score = participantsSC.next();
                }
            }
        
        return participant;
        
    }
