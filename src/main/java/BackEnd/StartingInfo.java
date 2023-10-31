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
public class StartingInfo {

    public static int maxStartingRoundPos = 0;
    public static int startingRound = 1;

    /**
     *
     * @throws IOException
     */
    /**
     *
     * @param maxParticipants
     * @return
     * @throws IOException
     */
    public static int getMaxStartingRoundPos(int maxParticipants) throws IOException {

        switch (maxParticipants) {

            case 2 -> {
                maxStartingRoundPos = 2;
                startingRound = 5;
            }

            case 3 -> {
                maxStartingRoundPos = 2;
                startingRound = 4;
            }

            case 4 -> {
                maxStartingRoundPos = 4;
                startingRound = 4;
            }

            case 5 -> {
                maxStartingRoundPos = 2;
                startingRound = 3;
            }

            case 6 -> {
                maxStartingRoundPos = 4;
                startingRound = 3;
            }

            case 7 -> {
                maxStartingRoundPos = 6;
                startingRound = 3;
            }

            case 8 -> {
                maxStartingRoundPos = 8;
                startingRound = 3;
            }

            case 9 -> {
                maxStartingRoundPos = 2;
                startingRound = 2;
            }

            case 10 -> {
                maxStartingRoundPos = 4;
                startingRound = 2;
            }

            case 11 -> {
                maxStartingRoundPos = 6;
                startingRound = 2;
            }

            case 12 -> {
                maxStartingRoundPos = 8;
                startingRound = 2;
            }

            case 13 -> {
                maxStartingRoundPos = 10;
                startingRound = 2;
            }

            case 14 -> {
                maxStartingRoundPos = 12;
                startingRound = 2;
            }

            case 15 -> {
                maxStartingRoundPos = 14;
                startingRound = 2;
            }

            case 16 -> {
                maxStartingRoundPos = 16;
                startingRound = 2;
            }

            case 17 -> {
                maxStartingRoundPos = 2;
                startingRound = 1;
            }

            case 18 -> {
                maxStartingRoundPos = 4;
                startingRound = 1;
            }

            case 19 -> {
                maxStartingRoundPos = 6;
                startingRound = 1;
            }

            case 20 -> {
                maxStartingRoundPos = 8;
                startingRound = 1;
            }

            case 21 -> {
                maxStartingRoundPos = 10;
                startingRound = 1;
            }

            case 22 -> {
                maxStartingRoundPos = 12;
                startingRound = 1;
            }

            case 23 -> {
                maxStartingRoundPos = 14;
                startingRound = 1;
            }

            case 24 -> {
                maxStartingRoundPos = 16;
                startingRound = 1;
            }

            case 25 -> {
                maxStartingRoundPos = 18;
                startingRound = 1;
            }

            case 26 -> {
                maxStartingRoundPos = 20;
                startingRound = 1;
            }

            case 27 -> {
                maxStartingRoundPos = 22;
                startingRound = 1;
            }

            case 28 -> {
                maxStartingRoundPos = 24;
                startingRound = 1;
            }

            case 29 -> {
                maxStartingRoundPos = 26;
                startingRound = 1;
            }

            case 30 -> {
                maxStartingRoundPos = 28;
                startingRound = 1;
            }

            case 31 -> {
                maxStartingRoundPos = 30;
                startingRound = 1;
            }

            case 32 -> {
                maxStartingRoundPos = 32;
                startingRound = 1;
            }
        }

        return maxStartingRoundPos;

    }

    public static int getStartingRound(int maxParticipants) throws IOException {

        switch (maxParticipants) {

            case 2 -> {
                maxStartingRoundPos = 2;
                startingRound = 5;
            }

            case 3 -> {
                maxStartingRoundPos = 2;
                startingRound = 4;
            }

            case 4 -> {
                maxStartingRoundPos = 4;
                startingRound = 4;
            }

            case 5 -> {
                maxStartingRoundPos = 2;
                startingRound = 3;
            }

            case 6 -> {
                maxStartingRoundPos = 4;
                startingRound = 3;
            }

            case 7 -> {
                maxStartingRoundPos = 6;
                startingRound = 3;
            }

            case 8 -> {
                maxStartingRoundPos = 8;
                startingRound = 3;
            }

            case 9 -> {
                maxStartingRoundPos = 2;
                startingRound = 2;
            }

            case 10 -> {
                maxStartingRoundPos = 4;
                startingRound = 2;
            }

            case 11 -> {
                maxStartingRoundPos = 6;
                startingRound = 2;
            }

            case 12 -> {
                maxStartingRoundPos = 8;
                startingRound = 2;
            }

            case 13 -> {
                maxStartingRoundPos = 10;
                startingRound = 2;
            }

            case 14 -> {
                maxStartingRoundPos = 12;
                startingRound = 2;
            }

            case 15 -> {
                maxStartingRoundPos = 14;
                startingRound = 2;
            }

            case 16 -> {
                maxStartingRoundPos = 16;
                startingRound = 2;
            }

            case 17 -> {
                maxStartingRoundPos = 2;
                startingRound = 1;
            }

            case 18 -> {
                maxStartingRoundPos = 4;
                startingRound = 1;
            }

            case 19 -> {
                maxStartingRoundPos = 6;
                startingRound = 1;
            }

            case 20 -> {
                maxStartingRoundPos = 8;
                startingRound = 1;
            }

            case 21 -> {
                maxStartingRoundPos = 10;
                startingRound = 1;
            }

            case 22 -> {
                maxStartingRoundPos = 12;
                startingRound = 1;
            }

            case 23 -> {
                maxStartingRoundPos = 14;
                startingRound = 1;
            }

            case 24 -> {
                maxStartingRoundPos = 16;
                startingRound = 1;
            }

            case 25 -> {
                maxStartingRoundPos = 18;
                startingRound = 1;
            }

            case 26 -> {
                maxStartingRoundPos = 20;
                startingRound = 1;
            }

            case 27 -> {
                maxStartingRoundPos = 22;
                startingRound = 1;
            }

            case 28 -> {
                maxStartingRoundPos = 24;
                startingRound = 1;
            }

            case 29 -> {
                maxStartingRoundPos = 26;
                startingRound = 1;
            }

            case 30 -> {
                maxStartingRoundPos = 28;
                startingRound = 1;
            }

            case 31 -> {
                maxStartingRoundPos = 30;
                startingRound = 1;
            }

            case 32 -> {
                maxStartingRoundPos = 32;
                startingRound = 1;
            }
        }

        return startingRound;

    }
}
