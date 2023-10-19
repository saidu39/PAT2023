/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.IOException;

/**
 *
 * @author Saien Naidu
 */
public class StartingRound {
    
    /**
     *
     * @throws IOException
     */        
    
    public static int startingRound = 1;
    
    /**
     *
     * @param maxParticipants
     * @return
     * @throws IOException
     */
    public static int getStartingRound(int maxParticipants) throws IOException{
        
        switch(maxParticipants) {
            case 1,2 -> startingRound = 5;
            case 3,4 -> startingRound = 4;
            case 5,6,7,8 -> startingRound = 3;
            case 9,10,11,12,13,14,15,16 -> startingRound = 2;
            case 17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32 -> startingRound = 1;    
        }
        
        return startingRound;
        
    }
}
