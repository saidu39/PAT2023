/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unused;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LATITUDE 5480
 */
public class TournaToolCode {
    
    public static void writeParticipants(String participantName) throws FileNotFoundException, IOException{

        File participantsFile = new File ("src\\main\\java\\BackEnd\\participants.txt");
        Scanner participantsSC = new Scanner(participantsFile);
        FileWriter participantsFW = new FileWriter("src\\main\\java\\BackEnd\\participants.txt");
        
        participantsFW.write(participantName);

    }
    
}
