/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Saien Naidu
 */
public class InitializeBracket {
    
    public static String getParticipants(String tournamentName, int round, int pos) throws FileNotFoundException{
        
        File participantFile = new File("participants.txt");
        Scanner participantFileSC = new Scanner(participantFile);
        String name = "default";
        
        while (participantFileSC.hasNext()) {

            String line = participantFileSC.nextLine(); 
            Scanner lineSC = new Scanner(line).useDelimiter("#");

            String competition = lineSC.next();
            int givenRound = lineSC.nextInt();
            int givenPos = lineSC.nextInt();
            name = lineSC.next();
            int score = lineSC.nextInt();
            
            if (givenRound == round && givenPos == pos){
                return name;
            }
            
        } 
        return null;
    }
}
