/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BackEnd.Read;
import BackEnd.StartingInfo;
import BackEnd.Write;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LATITUDE 5480
 */
public class SavedTournament0_UI extends javax.swing.JFrame {

    public static int round = 0;
    public static int maxParticipants0;
    public String victor;
    public String loser;
    public String winningSide;

    private void updateBracket() throws FileNotFoundException, IOException {
        
        R1participant0.setText(Read.getParticipants(Read.getTournamentName(0), 1, 1));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 1));
        R1participant1.setText(Read.getParticipants(Read.getTournamentName(0), 1, 2));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 2));
        R1participant2.setText(Read.getParticipants(Read.getTournamentName(0), 1, 3));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 3));
        R1participant3.setText(Read.getParticipants(Read.getTournamentName(0), 1, 4));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 4));
        R1participant4.setText(Read.getParticipants(Read.getTournamentName(0), 1, 5));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 5));
        R1participant5.setText(Read.getParticipants(Read.getTournamentName(0), 1, 6));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 6));
        R1participant6.setText(Read.getParticipants(Read.getTournamentName(0), 1, 7));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 7));
        R1participant7.setText(Read.getParticipants(Read.getTournamentName(0), 1, 8));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 8));
        R1participant8.setText(Read.getParticipants(Read.getTournamentName(0), 1, 9));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 9));
        R1participant9.setText(Read.getParticipants(Read.getTournamentName(0), 1, 10));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 10));
        R1participant10.setText(Read.getParticipants(Read.getTournamentName(0), 1, 11));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 11));
        R1participant11.setText(Read.getParticipants(Read.getTournamentName(0), 1, 12));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 12));
        R1participant12.setText(Read.getParticipants(Read.getTournamentName(0), 1, 13));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 13));
        R1participant13.setText(Read.getParticipants(Read.getTournamentName(0), 1, 14));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 14));
        R1participant14.setText(Read.getParticipants(Read.getTournamentName(0), 1, 15));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 15));
        R1participant15.setText(Read.getParticipants(Read.getTournamentName(0), 1, 16));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 16));
        R1participant16.setText(Read.getParticipants(Read.getTournamentName(0), 1, 17));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 17));
        R1participant17.setText(Read.getParticipants(Read.getTournamentName(0), 1, 18));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 18));
        R1participant18.setText(Read.getParticipants(Read.getTournamentName(0), 1, 19));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 19));
        R1participant19.setText(Read.getParticipants(Read.getTournamentName(0), 1, 20));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 20));
        R1participant20.setText(Read.getParticipants(Read.getTournamentName(0), 1, 21));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 21));
        R1participant21.setText(Read.getParticipants(Read.getTournamentName(0), 1, 22));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 22));
        R1participant22.setText(Read.getParticipants(Read.getTournamentName(0), 1, 23));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 23));
        R1participant23.setText(Read.getParticipants(Read.getTournamentName(0), 1, 24));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 24));
        R1participant24.setText(Read.getParticipants(Read.getTournamentName(0), 1, 25));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 25));
        R1participant25.setText(Read.getParticipants(Read.getTournamentName(0), 1, 26));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 26));
        R1participant26.setText(Read.getParticipants(Read.getTournamentName(0), 1, 27));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 27));
        R1participant27.setText(Read.getParticipants(Read.getTournamentName(0), 1, 28));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 28));
        R1participant28.setText(Read.getParticipants(Read.getTournamentName(0), 1, 29));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 29));
        R1participant29.setText(Read.getParticipants(Read.getTournamentName(0), 1, 30));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 30));
        R1participant30.setText(Read.getParticipants(Read.getTournamentName(0), 1, 31));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 31));
        R1participant31.setText(Read.getParticipants(Read.getTournamentName(0), 1, 32));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 1, 32));

        R2participant0.setText(Read.getParticipants(Read.getTournamentName(0), 2, 1));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 1));
        R2participant1.setText(Read.getParticipants(Read.getTournamentName(0), 2, 2));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 2));
        R2participant2.setText(Read.getParticipants(Read.getTournamentName(0), 2, 3));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 3));
        R2participant3.setText(Read.getParticipants(Read.getTournamentName(0), 2, 4));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 4));
        R2participant4.setText(Read.getParticipants(Read.getTournamentName(0), 2, 5));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 5));
        R2participant5.setText(Read.getParticipants(Read.getTournamentName(0), 2, 6));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 6));
        R2participant6.setText(Read.getParticipants(Read.getTournamentName(0), 2, 7));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 7));
        R2participant7.setText(Read.getParticipants(Read.getTournamentName(0), 2, 8));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 8));
        R2participant8.setText(Read.getParticipants(Read.getTournamentName(0), 2, 9));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 9));
        R2participant9.setText(Read.getParticipants(Read.getTournamentName(0), 2, 10));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 10));
        R2participant10.setText(Read.getParticipants(Read.getTournamentName(0), 2, 11));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 11));
        R2participant11.setText(Read.getParticipants(Read.getTournamentName(0), 2, 12));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 12));
        R2participant12.setText(Read.getParticipants(Read.getTournamentName(0), 2, 13));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 13));
        R2participant13.setText(Read.getParticipants(Read.getTournamentName(0), 2, 14));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 14));
        R2participant14.setText(Read.getParticipants(Read.getTournamentName(0), 2, 15));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 15));
        R2participant15.setText(Read.getParticipants(Read.getTournamentName(0), 2, 16));
        R1points0.setText(Read.getScores(Read.getTournamentName(0), 2, 16));

        R3participant0.setText(Read.getParticipants(Read.getTournamentName(0), 3, 1));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 1));
        R3participant1.setText(Read.getParticipants(Read.getTournamentName(0), 3, 2));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 2));
        R3participant2.setText(Read.getParticipants(Read.getTournamentName(0), 3, 3));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 3));
        R3participant3.setText(Read.getParticipants(Read.getTournamentName(0), 3, 4));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 4));
        R3participant4.setText(Read.getParticipants(Read.getTournamentName(0), 3, 5));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 5));
        R3participant5.setText(Read.getParticipants(Read.getTournamentName(0), 3, 6));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 6));
        R3participant6.setText(Read.getParticipants(Read.getTournamentName(0), 3, 7));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 7));
        R3participant7.setText(Read.getParticipants(Read.getTournamentName(0), 3, 8));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),3, 8));

        R4participant0.setText(Read.getParticipants(Read.getTournamentName(0), 4, 1));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),4, 1));
        R4participant1.setText(Read.getParticipants(Read.getTournamentName(0), 4, 2));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),4, 2));
        R4participant2.setText(Read.getParticipants(Read.getTournamentName(0), 4, 3));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),4, 3));
        R4participant3.setText(Read.getParticipants(Read.getTournamentName(0), 4, 4));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),4, 4));

        R5participant0.setText(Read.getParticipants(Read.getTournamentName(0), 5, 1));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),5, 1));
        R5participant1.setText(Read.getParticipants(Read.getTournamentName(0), 5, 2));
        R1points0.setText(Read.getScores(Read.getTournamentName(0),5, 2));

    }

    public String getWinner() throws FileNotFoundException {

        String nameLeft = participantLeft_txt.getText();
        String nameRight = participantRight_txt.getText();

        int pointLeft = Integer.parseInt(participantLeftScore_txtField.getText());
        int pointRight = Integer.parseInt(participantRightScore_txtField.getText());

        if (pointLeft < pointRight) {
            winningSide = "right";
            round = Read.getParticipantRound(Read.getTournamentName(0), nameRight, Read.getParticipantPos(Read.getTournamentName(0), nameRight));
            return nameRight;
        } else {
            winningSide = "left";
            round = Read.getParticipantRound(Read.getTournamentName(0), nameLeft, Read.getParticipantPos(Read.getTournamentName(0), nameLeft));
            return nameLeft;
        }

    }

    private void setStartingParticipants() throws FileNotFoundException, IOException {

        String check = Read.firstParticipantsSetCheck();

        if (check.equals("yes")) {

            String left = Read.getStartingParticipants(1);
            String right = Read.getStartingParticipants(2);

            Write.setParticipantLeft0(left, StartingInfo.getStartingRound(Read.getMaxParticipants(0)), (StartingInfo.getMaxStartingRoundPos(Read.getMaxParticipants(0)) - 1), 0);
            Write.setParticipantRight0(right, StartingInfo.getStartingRound(Read.getMaxParticipants(0)), StartingInfo.getMaxStartingRoundPos(Read.getMaxParticipants(0)), 0);

            participantLeft_txt.setText(left);
            participantRight_txt.setText(right);

            Write.firstParticipantsSet0();

        } else {
            
            participantLeft_txt.setText(Read.getNextLeftParticipant0(Read.getTournamentName(0)));
            participantRight_txt.setText(Read.getNextRightParticipant0(Read.getTournamentName(0)));
            
        }

    }

    public void proceed() throws FileNotFoundException, IOException {

        String tournament = Read.getTournamentName(0);
        victor = winnerName_txt.getText();
        if (!participantLeft_txt.getText().equals(victor)){
            loser = participantLeft_txt.getText();
        } else {
            loser = participantRight_txt.getText();
        }
        int pos = Read.getParticipantPos(Read.getTournamentName(0), victor);
        String scoreLeft = participantLeftScore_txtField.getText();
        String scoreRight = participantRightScore_txtField.getText();

        int whilePos = pos;

        while (whilePos <= 32) {
            switch (round) {

                case 1:

                    switch (whilePos) {

                        case 1, 2 -> {
                            R1points0.setText(scoreLeft);
                            R1points1.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 3, 4 -> {
                            R1points2.setText(scoreLeft);
                            R1points3.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 5, 6 -> {
                            R1points4.setText(scoreLeft);
                            R1points5.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 7, 8 -> {
                            R1points6.setText(scoreLeft);
                            R1points7.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 9, 10 -> {
                            R1points8.setText(scoreLeft);
                            R1points9.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 11, 12 -> {
                            R1points10.setText(scoreLeft);
                            R1points11.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 13, 14 -> {
                            R1points12.setText(scoreLeft);
                            R1points13.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 15, 16 -> {
                            R1points14.setText(scoreLeft);
                            R1points15.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 17, 18 -> {
                            R1points16.setText(scoreLeft);
                            R1points17.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 19, 20 -> {
                            R1points18.setText(scoreLeft);
                            R1points19.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 21, 22 -> {
                            R1points20.setText(scoreLeft);
                            R1points21.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 23, 24 -> {
                            R1points22.setText(scoreLeft);
                            R1points23.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 25, 26 -> {
                            R1points24.setText(scoreLeft);
                            R1points25.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 27, 28 -> {
                            R1points26.setText(scoreLeft);
                            R1points27.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 29, 30 -> {
                            R1points28.setText(scoreLeft);
                            R1points29.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 31, 32 -> {
                            R1points30.setText(scoreLeft);
                            R1points31.setText(scoreRight);
                            whilePos = 33;
                        }

                    }

                case 2:

                    switch (whilePos) {

                        case 1, 2 -> {
                            R2points0.setText(scoreLeft);
                            R2points1.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 3, 4 -> {
                            R2points2.setText(scoreLeft);
                            R2points3.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 5, 6 -> {
                            R2points4.setText(scoreLeft);
                            R2points5.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 7, 8 -> {
                            R2points6.setText(scoreLeft);
                            R2points7.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 9, 10 -> {
                            R2points8.setText(scoreLeft);
                            R2points9.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 11, 12 -> {
                            R2points10.setText(scoreLeft);
                            R2points11.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 13, 14 -> {
                            R2points12.setText(scoreLeft);
                            R2points13.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 15, 16 -> {
                            R2points14.setText(scoreLeft);
                            R2points15.setText(scoreRight);
                            whilePos = 33;
                        }
                    }

                case 3:

                    switch (whilePos) {

                        case 1, 2 -> {
                            R3points0.setText(scoreLeft);
                            R3points1.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 3, 4 -> {
                            R3points2.setText(scoreLeft);
                            R3points3.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 5, 6 -> {
                            R3points4.setText(scoreLeft);
                            R3points5.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 7, 8 -> {
                            R3points6.setText(scoreLeft);
                            R3points7.setText(scoreRight);
                            whilePos = 33;
                        }

                    }

                case 4:

                    switch (whilePos) {

                        case 1, 2 -> {
                            R4points0.setText(scoreLeft);
                            R4points1.setText(scoreRight);
                            whilePos = 33;
                        }
                        case 3, 4 -> {
                            R4points2.setText(scoreLeft);
                            R4points3.setText(scoreRight);
                            whilePos = 33;
                        }

                    }

                case 5:

                    switch (whilePos) {

                        case 1, 2 -> {
                            R5points0.setText(scoreLeft);
                            R5points1.setText(scoreRight);
                            whilePos = 33;
                        }

                    }
            }
        }

        
        
        if (winningSide.equals("left")){
            Write.updateParticipants(round, pos, scoreLeft);
            Write.updateScore(Read.getTournamentName(0), round++, (pos + 1), scoreRight, false);
            participantLeft_txt.setText(Write.updateParticipantLeft0(round, pos));
            participantRight_txt.setText(Write.updateParticipantRight0(round, (pos + 1)));
        } else {
            Write.updateParticipants(round, pos, scoreRight);
            Write.updateScore(Read.getTournamentName(0), round++, (pos - 1) , scoreLeft, false);
            participantLeft_txt.setText(Write.updateParticipantLeft0(round, (pos - 1)));
            participantRight_txt.setText(Write.updateParticipantRight0(round, pos));
        }
        
        participantLeftScore_txtField.setText("");
        participantRightScore_txtField.setText("");
        winnerName_txt.setText("");
        
        updateBracket();

        /*switch (pos) {

            case 1, 2, 5, 6, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, 29, 30 -> {
                participantLeft_txt.setText(Write.setParticipantLeft0(victor, (round + 1), ((pos / 2) + (pos % 2)), 0));
                participantRight_txt.setText(Write.setParticipantRight0(Read.getParticipants(Read.getTournamentName(0), (round + 1), pos), (round + 1), pos, 0));
            }

            case 3, 4, 7, 8, 11, 12, 15, 16, 19, 20, 23, 24, 27, 28, 31, 32 -> {
                participantRight_txt.setText(Write.setParticipantRight0(victor, (round + 1), ((pos / 2) + (pos % 2)), 0));
                participantLeft_txt.setText(Write.setParticipantLeft0(Read.getParticipants(Read.getTournamentName(0), (round + 1), pos), (round + 1), pos, 0));
            }

        }*/

    }

    /**
     * Creates new form SavedTournament0_UI
     *
     * @throws java.io.IOException
     */
    public SavedTournament0_UI() throws IOException {
        initComponents();
        updateBracket();
        setStartingParticipants();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbed = new javax.swing.JTabbedPane();
        proceed_UPpanel = new javax.swing.JPanel();
        proceed_LOWpanel = new javax.swing.JPanel();
        participantLeft_txt = new javax.swing.JLabel();
        participantRight_txt = new javax.swing.JLabel();
        participantLeftScore_txtField = new javax.swing.JTextField();
        participantRightScore_txtField = new javax.swing.JTextField();
        confirm_button = new javax.swing.JButton();
        winner_txt = new javax.swing.JLabel();
        winnerName_txt = new javax.swing.JLabel();
        proceed_button = new javax.swing.JButton();
        bracket_ScrollPane = new javax.swing.JScrollPane();
        knockoutTournament_panel = new javax.swing.JPanel();
        roundOf32_txt = new javax.swing.JLabel();
        roundOf32_panel = new javax.swing.JPanel();
        R1participant0 = new javax.swing.JLabel();
        R1participant1 = new javax.swing.JLabel();
        R1participant2 = new javax.swing.JLabel();
        R1participant3 = new javax.swing.JLabel();
        R1participant4 = new javax.swing.JLabel();
        R1participant5 = new javax.swing.JLabel();
        R1participant6 = new javax.swing.JLabel();
        R1participant7 = new javax.swing.JLabel();
        R1participant8 = new javax.swing.JLabel();
        R1participant9 = new javax.swing.JLabel();
        R1participant10 = new javax.swing.JLabel();
        R1participant11 = new javax.swing.JLabel();
        R1participant12 = new javax.swing.JLabel();
        R1participant13 = new javax.swing.JLabel();
        R1participant14 = new javax.swing.JLabel();
        R1participant15 = new javax.swing.JLabel();
        R1participant16 = new javax.swing.JLabel();
        R1participant17 = new javax.swing.JLabel();
        R1participant18 = new javax.swing.JLabel();
        R1participant19 = new javax.swing.JLabel();
        R1participant20 = new javax.swing.JLabel();
        R1participant21 = new javax.swing.JLabel();
        R1participant22 = new javax.swing.JLabel();
        R1participant23 = new javax.swing.JLabel();
        R1participant24 = new javax.swing.JLabel();
        R1participant25 = new javax.swing.JLabel();
        R1participant26 = new javax.swing.JLabel();
        R1participant27 = new javax.swing.JLabel();
        R1participant28 = new javax.swing.JLabel();
        R1participant29 = new javax.swing.JLabel();
        R1participant30 = new javax.swing.JLabel();
        R1participant31 = new javax.swing.JLabel();
        R1points0 = new javax.swing.JLabel();
        R1points1 = new javax.swing.JLabel();
        R1points2 = new javax.swing.JLabel();
        R1points3 = new javax.swing.JLabel();
        R1points4 = new javax.swing.JLabel();
        R1points5 = new javax.swing.JLabel();
        R1points6 = new javax.swing.JLabel();
        R1points7 = new javax.swing.JLabel();
        R1points8 = new javax.swing.JLabel();
        R1points9 = new javax.swing.JLabel();
        R1points10 = new javax.swing.JLabel();
        R1points11 = new javax.swing.JLabel();
        R1points12 = new javax.swing.JLabel();
        R1points13 = new javax.swing.JLabel();
        R1points14 = new javax.swing.JLabel();
        R1points15 = new javax.swing.JLabel();
        R1points16 = new javax.swing.JLabel();
        R1points17 = new javax.swing.JLabel();
        R1points18 = new javax.swing.JLabel();
        R1points19 = new javax.swing.JLabel();
        R1points20 = new javax.swing.JLabel();
        R1points21 = new javax.swing.JLabel();
        R1points22 = new javax.swing.JLabel();
        R1points23 = new javax.swing.JLabel();
        R1points24 = new javax.swing.JLabel();
        R1points25 = new javax.swing.JLabel();
        R1points26 = new javax.swing.JLabel();
        R1points27 = new javax.swing.JLabel();
        R1points28 = new javax.swing.JLabel();
        R1points29 = new javax.swing.JLabel();
        R1points30 = new javax.swing.JLabel();
        R1points31 = new javax.swing.JLabel();
        roundOf16_panel = new javax.swing.JPanel();
        R2participant0 = new javax.swing.JLabel();
        R2participant1 = new javax.swing.JLabel();
        R2participant2 = new javax.swing.JLabel();
        R2participant3 = new javax.swing.JLabel();
        R2participant4 = new javax.swing.JLabel();
        R2participant5 = new javax.swing.JLabel();
        R2participant6 = new javax.swing.JLabel();
        R2participant7 = new javax.swing.JLabel();
        R2participant8 = new javax.swing.JLabel();
        R2participant9 = new javax.swing.JLabel();
        R2participant10 = new javax.swing.JLabel();
        R2participant11 = new javax.swing.JLabel();
        R2participant12 = new javax.swing.JLabel();
        R2participant13 = new javax.swing.JLabel();
        R2participant14 = new javax.swing.JLabel();
        R2participant15 = new javax.swing.JLabel();
        R2points0 = new javax.swing.JLabel();
        R2points1 = new javax.swing.JLabel();
        R2points2 = new javax.swing.JLabel();
        R2points3 = new javax.swing.JLabel();
        R2points4 = new javax.swing.JLabel();
        R2points5 = new javax.swing.JLabel();
        R2points6 = new javax.swing.JLabel();
        R2points7 = new javax.swing.JLabel();
        R2points8 = new javax.swing.JLabel();
        R2points9 = new javax.swing.JLabel();
        R2points10 = new javax.swing.JLabel();
        R2points11 = new javax.swing.JLabel();
        R2points12 = new javax.swing.JLabel();
        R2points13 = new javax.swing.JLabel();
        R2points14 = new javax.swing.JLabel();
        R2points15 = new javax.swing.JLabel();
        quarterFinals_panel = new javax.swing.JPanel();
        R3participant0 = new javax.swing.JLabel();
        R3participant2 = new javax.swing.JLabel();
        R3participant3 = new javax.swing.JLabel();
        R3participant4 = new javax.swing.JLabel();
        R3participant5 = new javax.swing.JLabel();
        R3participant6 = new javax.swing.JLabel();
        R3participant7 = new javax.swing.JLabel();
        R3participant1 = new javax.swing.JLabel();
        R3points0 = new javax.swing.JLabel();
        R3points1 = new javax.swing.JLabel();
        R3points2 = new javax.swing.JLabel();
        R3points3 = new javax.swing.JLabel();
        R3points4 = new javax.swing.JLabel();
        R3points5 = new javax.swing.JLabel();
        R3points6 = new javax.swing.JLabel();
        R3points7 = new javax.swing.JLabel();
        roundOd16_txt = new javax.swing.JLabel();
        quaterFinals_txt = new javax.swing.JLabel();
        semiFinals_panel = new javax.swing.JPanel();
        R4participant0 = new javax.swing.JLabel();
        R4points0 = new javax.swing.JLabel();
        R4participant1 = new javax.swing.JLabel();
        R4points1 = new javax.swing.JLabel();
        R4participant2 = new javax.swing.JLabel();
        R4points2 = new javax.swing.JLabel();
        R4participant3 = new javax.swing.JLabel();
        R4points3 = new javax.swing.JLabel();
        finals_panel = new javax.swing.JPanel();
        R5participant0 = new javax.swing.JLabel();
        R5points0 = new javax.swing.JLabel();
        R5participant1 = new javax.swing.JLabel();
        R5points1 = new javax.swing.JLabel();
        semiFinals_txt = new javax.swing.JLabel();
        finals_txt = new javax.swing.JLabel();
        winners_panel = new javax.swing.JPanel();
        winner = new javax.swing.JLabel();
        winner_txt1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        main_panel8 = new javax.swing.JPanel();
        appLogo_img8 = new javax.swing.JLabel();
        create_txt8 = new javax.swing.JLabel();
        manage_txt8 = new javax.swing.JLabel();
        setting_txt8 = new javax.swing.JLabel();
        feedback_txt8 = new javax.swing.JLabel();
        exit_button8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTabbed.setBackground(new java.awt.Color(153, 0, 0));
        mainTabbed.setForeground(new java.awt.Color(255, 102, 102));
        mainTabbed.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        proceed_LOWpanel.setBackground(new java.awt.Color(51, 0, 0));

        participantLeft_txt.setBackground(new java.awt.Color(0, 0, 0));
        participantLeft_txt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        participantLeft_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        participantLeft_txt.setText(" ");
        participantLeft_txt.setToolTipText("");
        participantLeft_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        participantRight_txt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        participantRight_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        participantRight_txt.setText(" ");
        participantRight_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        participantLeftScore_txtField.setBackground(new java.awt.Color(0, 0, 0));
        participantLeftScore_txtField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        participantLeftScore_txtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        participantLeftScore_txtField.setText("Enter points");
        participantLeftScore_txtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        participantLeftScore_txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantLeftScore_txtFieldActionPerformed(evt);
            }
        });

        participantRightScore_txtField.setBackground(new java.awt.Color(0, 0, 0));
        participantRightScore_txtField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        participantRightScore_txtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        participantRightScore_txtField.setText("Enter points");
        participantRightScore_txtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        participantRightScore_txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantRightScore_txtFieldActionPerformed(evt);
            }
        });

        confirm_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        confirm_button.setText("Confirm");
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });

        winner_txt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        winner_txt.setForeground(new java.awt.Color(255, 204, 0));
        winner_txt.setText("Winner:");
        winner_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        winnerName_txt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        winnerName_txt.setText(" ");
        winnerName_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        proceed_button.setBackground(new java.awt.Color(0, 0, 0));
        proceed_button.setText("Proceed");
        proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proceed_LOWpanelLayout = new javax.swing.GroupLayout(proceed_LOWpanel);
        proceed_LOWpanel.setLayout(proceed_LOWpanelLayout);
        proceed_LOWpanelLayout.setHorizontalGroup(
            proceed_LOWpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(proceed_LOWpanelLayout.createSequentialGroup()
                .addGroup(proceed_LOWpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proceed_LOWpanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(confirm_button)
                        .addGap(134, 134, 134))
                    .addGroup(proceed_LOWpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(proceed_LOWpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(participantLeft_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(participantRight_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(participantLeftScore_txtField)
                            .addComponent(participantRightScore_txtField))
                        .addGap(27, 27, 27)))
                .addComponent(winner_txt)
                .addGap(18, 18, 18)
                .addComponent(winnerName_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceed_button)
                .addContainerGap())
        );
        proceed_LOWpanelLayout.setVerticalGroup(
            proceed_LOWpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proceed_LOWpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(participantLeft_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(participantLeftScore_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(proceed_LOWpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winner_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(winnerName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm_button)
                    .addComponent(proceed_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(participantRightScore_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(participantRight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout proceed_UPpanelLayout = new javax.swing.GroupLayout(proceed_UPpanel);
        proceed_UPpanel.setLayout(proceed_UPpanelLayout);
        proceed_UPpanelLayout.setHorizontalGroup(
            proceed_UPpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proceed_LOWpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        proceed_UPpanelLayout.setVerticalGroup(
            proceed_UPpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proceed_LOWpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainTabbed.addTab("PROCEED", proceed_UPpanel);

        knockoutTournament_panel.setBackground(new java.awt.Color(0, 0, 0));

        roundOf32_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roundOf32_txt.setForeground(new java.awt.Color(102, 0, 0));
        roundOf32_txt.setText("Round of 32");

        roundOf32_panel.setBackground(new java.awt.Color(0, 0, 0));
        roundOf32_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundOf32_panel.setForeground(new java.awt.Color(51, 0, 0));

        R1participant0.setBackground(new java.awt.Color(255, 255, 255));
        R1participant0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant0.setForeground(new java.awt.Color(255, 255, 255));
        R1participant0.setText(" ");
        R1participant0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant1.setBackground(new java.awt.Color(255, 255, 255));
        R1participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant1.setForeground(new java.awt.Color(255, 255, 255));
        R1participant1.setText(" ");
        R1participant1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant2.setBackground(new java.awt.Color(255, 255, 255));
        R1participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant2.setForeground(new java.awt.Color(255, 255, 255));
        R1participant2.setText(" ");
        R1participant2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant3.setBackground(new java.awt.Color(255, 255, 255));
        R1participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant3.setForeground(new java.awt.Color(255, 255, 255));
        R1participant3.setText(" ");
        R1participant3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant4.setBackground(new java.awt.Color(255, 255, 255));
        R1participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant4.setForeground(new java.awt.Color(255, 255, 255));
        R1participant4.setText(" ");
        R1participant4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant5.setBackground(new java.awt.Color(255, 255, 255));
        R1participant5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant5.setForeground(new java.awt.Color(255, 255, 255));
        R1participant5.setText(" ");
        R1participant5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant6.setBackground(new java.awt.Color(255, 255, 255));
        R1participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant6.setForeground(new java.awt.Color(255, 255, 255));
        R1participant6.setText(" ");
        R1participant6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant7.setBackground(new java.awt.Color(255, 255, 255));
        R1participant7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant7.setForeground(new java.awt.Color(255, 255, 255));
        R1participant7.setText(" ");
        R1participant7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant8.setBackground(new java.awt.Color(255, 255, 255));
        R1participant8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant8.setForeground(new java.awt.Color(255, 255, 255));
        R1participant8.setText(" ");
        R1participant8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant9.setBackground(new java.awt.Color(255, 255, 255));
        R1participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant9.setForeground(new java.awt.Color(255, 255, 255));
        R1participant9.setText(" ");
        R1participant9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant10.setBackground(new java.awt.Color(255, 255, 255));
        R1participant10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant10.setForeground(new java.awt.Color(255, 255, 255));
        R1participant10.setText(" ");
        R1participant10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant11.setBackground(new java.awt.Color(255, 255, 255));
        R1participant11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant11.setForeground(new java.awt.Color(255, 255, 255));
        R1participant11.setText(" ");
        R1participant11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant12.setBackground(new java.awt.Color(255, 255, 255));
        R1participant12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant12.setForeground(new java.awt.Color(255, 255, 255));
        R1participant12.setText(" ");
        R1participant12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant13.setBackground(new java.awt.Color(255, 255, 255));
        R1participant13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant13.setForeground(new java.awt.Color(255, 255, 255));
        R1participant13.setText(" ");
        R1participant13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant14.setBackground(new java.awt.Color(255, 255, 255));
        R1participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant14.setForeground(new java.awt.Color(255, 255, 255));
        R1participant14.setText(" ");
        R1participant14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant15.setBackground(new java.awt.Color(255, 255, 255));
        R1participant15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant15.setForeground(new java.awt.Color(255, 255, 255));
        R1participant15.setText(" ");
        R1participant15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant16.setBackground(new java.awt.Color(255, 255, 255));
        R1participant16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant16.setForeground(new java.awt.Color(255, 255, 255));
        R1participant16.setText(" ");
        R1participant16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant17.setBackground(new java.awt.Color(255, 255, 255));
        R1participant17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant17.setForeground(new java.awt.Color(255, 255, 255));
        R1participant17.setText(" ");
        R1participant17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant18.setBackground(new java.awt.Color(255, 255, 255));
        R1participant18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant18.setForeground(new java.awt.Color(255, 255, 255));
        R1participant18.setText(" ");
        R1participant18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant19.setBackground(new java.awt.Color(255, 255, 255));
        R1participant19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant19.setForeground(new java.awt.Color(255, 255, 255));
        R1participant19.setText(" ");
        R1participant19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant20.setBackground(new java.awt.Color(255, 255, 255));
        R1participant20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant20.setForeground(new java.awt.Color(255, 255, 255));
        R1participant20.setText(" ");
        R1participant20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant21.setBackground(new java.awt.Color(255, 255, 255));
        R1participant21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant21.setForeground(new java.awt.Color(255, 255, 255));
        R1participant21.setText(" ");
        R1participant21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant22.setBackground(new java.awt.Color(255, 255, 255));
        R1participant22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant22.setForeground(new java.awt.Color(255, 255, 255));
        R1participant22.setText(" ");
        R1participant22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant23.setBackground(new java.awt.Color(255, 255, 255));
        R1participant23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant23.setForeground(new java.awt.Color(255, 255, 255));
        R1participant23.setText(" ");
        R1participant23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant24.setBackground(new java.awt.Color(255, 255, 255));
        R1participant24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant24.setForeground(new java.awt.Color(255, 255, 255));
        R1participant24.setText(" ");
        R1participant24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant25.setBackground(new java.awt.Color(255, 255, 255));
        R1participant25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant25.setForeground(new java.awt.Color(255, 255, 255));
        R1participant25.setText(" ");
        R1participant25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant26.setBackground(new java.awt.Color(255, 255, 255));
        R1participant26.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant26.setForeground(new java.awt.Color(255, 255, 255));
        R1participant26.setText(" ");
        R1participant26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant27.setBackground(new java.awt.Color(255, 255, 255));
        R1participant27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant27.setForeground(new java.awt.Color(255, 255, 255));
        R1participant27.setText(" ");
        R1participant27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant28.setBackground(new java.awt.Color(255, 255, 255));
        R1participant28.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant28.setForeground(new java.awt.Color(255, 255, 255));
        R1participant28.setText(" ");
        R1participant28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant29.setBackground(new java.awt.Color(255, 255, 255));
        R1participant29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant29.setForeground(new java.awt.Color(255, 255, 255));
        R1participant29.setText(" ");
        R1participant29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant30.setBackground(new java.awt.Color(255, 255, 255));
        R1participant30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant30.setForeground(new java.awt.Color(255, 255, 255));
        R1participant30.setText(" ");
        R1participant30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1participant31.setBackground(new java.awt.Color(255, 255, 255));
        R1participant31.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant31.setForeground(new java.awt.Color(255, 255, 255));
        R1participant31.setText(" ");
        R1participant31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R1points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points0.setText(" ");

        R1points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points1.setText(" ");

        R1points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points2.setText(" ");

        R1points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points3.setText(" ");

        R1points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points4.setText(" ");

        R1points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points5.setText(" ");

        R1points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points6.setText(" ");

        R1points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points7.setText(" ");

        R1points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points8.setText(" ");

        R1points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points9.setText(" ");

        R1points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points10.setText(" ");

        R1points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points11.setText(" ");

        R1points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points12.setText(" ");

        R1points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points13.setText(" ");

        R1points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points14.setText(" ");

        R1points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points15.setText(" ");

        R1points16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points16.setText(" ");

        R1points17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points17.setText(" ");

        R1points18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points18.setText(" ");

        R1points19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points19.setText(" ");

        R1points20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points20.setText(" ");

        R1points21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points21.setText(" ");

        R1points22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points22.setText(" ");

        R1points23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points23.setText(" ");

        R1points24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points24.setText(" ");

        R1points25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points25.setText(" ");

        R1points26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points26.setText(" ");

        R1points27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points27.setText(" ");

        R1points28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points28.setText(" ");

        R1points29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points29.setText(" ");

        R1points30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points30.setText(" ");

        R1points31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points31.setText(" ");

        javax.swing.GroupLayout roundOf32_panelLayout = new javax.swing.GroupLayout(roundOf32_panel);
        roundOf32_panel.setLayout(roundOf32_panelLayout);
        roundOf32_panelLayout.setHorizontalGroup(
            roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R1participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R1points1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1points0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R1participant31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1participant30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R1points30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1points31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        roundOf32_panelLayout.setVerticalGroup(
            roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant0)
                    .addComponent(R1points0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant1)
                    .addComponent(R1points1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant2)
                    .addComponent(R1points2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant3)
                    .addComponent(R1points3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant4)
                    .addComponent(R1points4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant5)
                    .addComponent(R1points5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant6)
                    .addComponent(R1points6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant7)
                    .addComponent(R1points7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant8)
                    .addComponent(R1points8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant9)
                    .addComponent(R1points9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant10)
                    .addComponent(R1points10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant11)
                    .addComponent(R1points11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant12)
                    .addComponent(R1points12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant13)
                    .addComponent(R1points13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant14)
                    .addComponent(R1points14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant15)
                    .addComponent(R1points15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant16)
                    .addComponent(R1points16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant17)
                    .addComponent(R1points17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant18)
                    .addComponent(R1points18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant19)
                    .addComponent(R1points19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant20)
                    .addComponent(R1points20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant21)
                    .addComponent(R1points21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant22)
                    .addComponent(R1points22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant23)
                    .addComponent(R1points23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant24)
                    .addComponent(R1points24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant25)
                    .addComponent(R1points25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant26)
                    .addComponent(R1points26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant27)
                    .addComponent(R1points27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant28)
                    .addComponent(R1points28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant29)
                    .addComponent(R1points29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant30)
                    .addComponent(R1points30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant31)
                    .addComponent(R1points31)))
        );

        roundOf16_panel.setBackground(new java.awt.Color(0, 0, 0));
        roundOf16_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R2participant0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant0.setText(" ");
        R2participant0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant1.setText(" ");
        R2participant1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant2.setText(" ");
        R2participant2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant3.setText(" ");
        R2participant3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant4.setText(" ");
        R2participant4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant5.setText(" ");
        R2participant5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant6.setText(" ");
        R2participant6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant7.setText(" ");
        R2participant7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant8.setText(" ");
        R2participant8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant9.setText(" ");
        R2participant9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant10.setText(" ");
        R2participant10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant11.setText(" ");
        R2participant11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant12.setText(" ");
        R2participant12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant13.setText(" ");
        R2participant13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant14.setText(" ");
        R2participant14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2participant15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant15.setText(" ");
        R2participant15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        R2points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points0.setText(" ");

        R2points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points1.setText(" ");
        R2points1.setToolTipText("");

        R2points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points2.setText(" ");
        R2points2.setToolTipText("");

        R2points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points3.setText(" ");
        R2points3.setToolTipText("");

        R2points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points4.setText(" ");
        R2points4.setToolTipText("");

        R2points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points5.setText(" ");
        R2points5.setToolTipText("");

        R2points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points6.setText(" ");
        R2points6.setToolTipText("");

        R2points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points7.setText(" ");
        R2points7.setToolTipText("");

        R2points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points8.setText(" ");
        R2points8.setToolTipText("");

        R2points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points9.setText(" ");
        R2points9.setToolTipText("");

        R2points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points10.setText(" ");
        R2points10.setToolTipText("");

        R2points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points11.setText(" ");
        R2points11.setToolTipText("");

        R2points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points12.setText(" ");
        R2points12.setToolTipText("");

        R2points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points13.setText(" ");
        R2points13.setToolTipText("");

        R2points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points14.setText(" ");
        R2points14.setToolTipText("");

        R2points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points15.setText(" ");
        R2points15.setToolTipText("");

        javax.swing.GroupLayout roundOf16_panelLayout = new javax.swing.GroupLayout(roundOf16_panel);
        roundOf16_panel.setLayout(roundOf16_panelLayout);
        roundOf16_panelLayout.setHorizontalGroup(
            roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf16_panelLayout.createSequentialGroup()
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R2participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R2points0, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(R2points1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf16_panelLayout.createSequentialGroup()
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R2participant8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R2participant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R2points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        roundOf16_panelLayout.setVerticalGroup(
            roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant0)
                    .addComponent(R2points0))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant1)
                    .addComponent(R2points1))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant2)
                    .addComponent(R2points2))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant3)
                    .addComponent(R2points3))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant4)
                    .addComponent(R2points4))
                .addGap(31, 31, 31)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points5))
                .addGap(31, 31, 31)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R2participant6)
                    .addComponent(R2points6))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R2participant7)
                    .addComponent(R2points7))
                .addGap(31, 31, 31)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R2participant8)
                    .addComponent(R2points8))
                .addGap(31, 31, 31)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant15)
                    .addComponent(R2points9))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant14)
                    .addComponent(R2points10))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant13)
                    .addComponent(R2points11))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant12)
                    .addComponent(R2points12))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant11)
                    .addComponent(R2points13))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant10)
                    .addComponent(R2points14))
                .addGap(30, 30, 30)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant9)
                    .addComponent(R2points15))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        quarterFinals_panel.setBackground(new java.awt.Color(0, 0, 0));
        quarterFinals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R3participant0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant0.setForeground(new java.awt.Color(255, 255, 255));
        R3participant0.setText(" ");
        R3participant0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant2.setForeground(new java.awt.Color(255, 255, 255));
        R3participant2.setText(" ");
        R3participant2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant3.setForeground(new java.awt.Color(255, 255, 255));
        R3participant3.setText(" ");
        R3participant3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant4.setForeground(new java.awt.Color(255, 255, 255));
        R3participant4.setText(" ");
        R3participant4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant5.setForeground(new java.awt.Color(255, 255, 255));
        R3participant5.setText(" ");
        R3participant5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant6.setForeground(new java.awt.Color(255, 255, 255));
        R3participant6.setText(" ");
        R3participant6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant7.setForeground(new java.awt.Color(255, 255, 255));
        R3participant7.setText(" ");
        R3participant7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant1.setForeground(new java.awt.Color(255, 255, 255));
        R3participant1.setText(" ");
        R3participant1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R3points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points0.setText(" ");

        R3points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points1.setText(" ");

        R3points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points2.setText(" ");

        R3points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points3.setText(" ");

        R3points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points4.setText(" ");

        R3points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points5.setText(" ");

        R3points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points6.setText(" ");

        R3points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points7.setText(" ");

        javax.swing.GroupLayout quarterFinals_panelLayout = new javax.swing.GroupLayout(quarterFinals_panel);
        quarterFinals_panel.setLayout(quarterFinals_panelLayout);
        quarterFinals_panelLayout.setHorizontalGroup(
            quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(R3participant7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(R3participant6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R3points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quarterFinals_panelLayout.setVerticalGroup(
            quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant0)
                    .addComponent(R3points0))
                .addGap(78, 78, 78)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant1)
                    .addComponent(R3points1))
                .addGap(78, 78, 78)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant2)
                    .addComponent(R3points2))
                .addGap(78, 78, 78)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant3)
                    .addComponent(R3points3))
                .addGap(80, 80, 80)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant4)
                    .addComponent(R3points4))
                .addGap(78, 78, 78)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant5)
                    .addComponent(R3points5))
                .addGap(78, 78, 78)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant6)
                    .addComponent(R3points6))
                .addGap(79, 79, 79)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant7)
                    .addComponent(R3points7))
                .addGap(32, 32, 32))
        );

        roundOd16_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roundOd16_txt.setForeground(new java.awt.Color(102, 0, 0));
        roundOd16_txt.setText("Round of 16");

        quaterFinals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        quaterFinals_txt.setForeground(new java.awt.Color(153, 0, 0));
        quaterFinals_txt.setText("Quarter-Finals");

        semiFinals_panel.setBackground(new java.awt.Color(0, 0, 0));
        semiFinals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        semiFinals_panel.setForeground(new java.awt.Color(51, 0, 0));

        R4participant0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R4participant0.setText(" ");
        R4participant0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R4points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points0.setText(" ");

        R4participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R4participant1.setText(" ");
        R4participant1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R4points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points1.setText(" ");

        R4participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R4participant2.setText(" ");
        R4participant2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R4points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points2.setText(" ");

        R4participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R4participant3.setText(" ");
        R4participant3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));

        R4points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points3.setText(" ");

        javax.swing.GroupLayout semiFinals_panelLayout = new javax.swing.GroupLayout(semiFinals_panel);
        semiFinals_panel.setLayout(semiFinals_panelLayout);
        semiFinals_panelLayout.setHorizontalGroup(
            semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4points1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        semiFinals_panelLayout.setVerticalGroup(
            semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant0)
                    .addComponent(R4points0))
                .addGap(176, 176, 176)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant1)
                    .addComponent(R4points1))
                .addGap(176, 176, 176)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant2)
                    .addComponent(R4points2))
                .addGap(176, 176, 176)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant3)
                    .addComponent(R4points3))
                .addGap(77, 77, 77))
        );

        finals_panel.setBackground(new java.awt.Color(0, 0, 0));
        finals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R5participant0.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        R5participant0.setForeground(new java.awt.Color(255, 255, 255));
        R5participant0.setText(" ");
        R5participant0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        R5points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points0.setText(" ");

        R5participant1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        R5participant1.setForeground(new java.awt.Color(255, 255, 255));
        R5participant1.setText(" ");
        R5participant1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        R5points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points1.setText(" ");

        javax.swing.GroupLayout finals_panelLayout = new javax.swing.GroupLayout(finals_panel);
        finals_panel.setLayout(finals_panelLayout);
        finals_panelLayout.setHorizontalGroup(
            finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finals_panelLayout.createSequentialGroup()
                .addComponent(R5participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R5points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(finals_panelLayout.createSequentialGroup()
                .addComponent(R5participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R5points1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        finals_panelLayout.setVerticalGroup(
            finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finals_panelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5participant0)
                    .addComponent(R5points0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5participant1)
                    .addComponent(R5points1))
                .addGap(200, 200, 200))
        );

        semiFinals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        semiFinals_txt.setForeground(new java.awt.Color(153, 0, 0));
        semiFinals_txt.setText("Semi-Finals");

        finals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        finals_txt.setForeground(new java.awt.Color(255, 0, 0));
        finals_txt.setText("Finals");

        winners_panel.setBackground(new java.awt.Color(0, 0, 0));
        winners_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        winner.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        winner.setForeground(new java.awt.Color(255, 255, 255));
        winner.setText(" ");
        winner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0)));

        javax.swing.GroupLayout winners_panelLayout = new javax.swing.GroupLayout(winners_panel);
        winners_panel.setLayout(winners_panelLayout);
        winners_panelLayout.setHorizontalGroup(
            winners_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        winners_panelLayout.setVerticalGroup(
            winners_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winners_panelLayout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(winner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        winner_txt1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        winner_txt1.setForeground(new java.awt.Color(255, 204, 0));
        winner_txt1.setText("Winner");

        javax.swing.GroupLayout knockoutTournament_panelLayout = new javax.swing.GroupLayout(knockoutTournament_panel);
        knockoutTournament_panel.setLayout(knockoutTournament_panelLayout);
        knockoutTournament_panelLayout.setHorizontalGroup(
            knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundOf32_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundOf32_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundOd16_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(roundOf16_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quaterFinals_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quarterFinals_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(semiFinals_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semiFinals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(finals_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(winners_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winner_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );
        knockoutTournament_panelLayout.setVerticalGroup(
            knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, knockoutTournament_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roundOf32_txt)
                        .addComponent(roundOd16_txt)
                        .addComponent(quaterFinals_txt)
                        .addComponent(finals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(winner_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(semiFinals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(finals_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semiFinals_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quarterFinals_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundOf16_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundOf32_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winners_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        bracket_ScrollPane.setViewportView(knockoutTournament_panel);

        mainTabbed.addTab("BRACKET", bracket_ScrollPane);

        main_panel8.setBackground(new java.awt.Color(0, 0, 0));
        main_panel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        appLogo_img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inAppLogo.png"))); // NOI18N

        create_txt8.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        create_txt8.setForeground(new java.awt.Color(255, 102, 102));
        create_txt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_txt8.setText("CREATE:");

        manage_txt8.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        manage_txt8.setForeground(new java.awt.Color(255, 102, 102));
        manage_txt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manage_txt8.setText("BRACKET");

        setting_txt8.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        setting_txt8.setForeground(new java.awt.Color(255, 102, 102));
        setting_txt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setting_txt8.setText("SETTINGS:");

        feedback_txt8.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        feedback_txt8.setForeground(new java.awt.Color(255, 102, 102));
        feedback_txt8.setText("FEEDBACK:");

        exit_button8.setBackground(new java.awt.Color(255, 0, 0));
        exit_button8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        exit_button8.setText("HOME");
        exit_button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panel8Layout = new javax.swing.GroupLayout(main_panel8);
        main_panel8.setLayout(main_panel8Layout);
        main_panel8Layout.setHorizontalGroup(
            main_panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(main_panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feedback_txt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setting_txt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manage_txt8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(create_txt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(exit_button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appLogo_img8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        main_panel8Layout.setVerticalGroup(
            main_panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLogo_img8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create_txt8)
                .addGap(60, 60, 60)
                .addComponent(manage_txt8)
                .addGap(60, 60, 60)
                .addComponent(setting_txt8)
                .addGap(60, 60, 60)
                .addComponent(feedback_txt8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(exit_button8))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(main_panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(main_panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainTabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button8ActionPerformed
        try {
            TournaTool_UI tournatool_frame = new TournaTool_UI();
            tournatool_frame.show();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exit_button8ActionPerformed

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttonActionPerformed
        try {
            // TODO add your handling code here:
            winnerName_txt.setText(getWinner());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SavedTournament0_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirm_buttonActionPerformed

    private void participantLeftScore_txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantLeftScore_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantLeftScore_txtFieldActionPerformed

    private void proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_buttonActionPerformed
        try {
            // TODO add your handling code here:
            proceed();
        } catch (IOException ex) {
            Logger.getLogger(SavedTournament0_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_proceed_buttonActionPerformed

    private void participantRightScore_txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantRightScore_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantRightScore_txtFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SavedTournament0_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SavedTournament0_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SavedTournament0_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SavedTournament0_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new SavedTournament0_UI().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(SavedTournament0_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R1participant0;
    private javax.swing.JLabel R1participant1;
    private javax.swing.JLabel R1participant10;
    private javax.swing.JLabel R1participant11;
    private javax.swing.JLabel R1participant12;
    private javax.swing.JLabel R1participant13;
    private javax.swing.JLabel R1participant14;
    private javax.swing.JLabel R1participant15;
    private javax.swing.JLabel R1participant16;
    private javax.swing.JLabel R1participant17;
    private javax.swing.JLabel R1participant18;
    private javax.swing.JLabel R1participant19;
    private javax.swing.JLabel R1participant2;
    private javax.swing.JLabel R1participant20;
    private javax.swing.JLabel R1participant21;
    private javax.swing.JLabel R1participant22;
    private javax.swing.JLabel R1participant23;
    private javax.swing.JLabel R1participant24;
    private javax.swing.JLabel R1participant25;
    private javax.swing.JLabel R1participant26;
    private javax.swing.JLabel R1participant27;
    private javax.swing.JLabel R1participant28;
    private javax.swing.JLabel R1participant29;
    private javax.swing.JLabel R1participant3;
    private javax.swing.JLabel R1participant30;
    private javax.swing.JLabel R1participant31;
    private javax.swing.JLabel R1participant4;
    private javax.swing.JLabel R1participant5;
    private javax.swing.JLabel R1participant6;
    private javax.swing.JLabel R1participant7;
    private javax.swing.JLabel R1participant8;
    private javax.swing.JLabel R1participant9;
    private javax.swing.JLabel R1points0;
    private javax.swing.JLabel R1points1;
    private javax.swing.JLabel R1points10;
    private javax.swing.JLabel R1points11;
    private javax.swing.JLabel R1points12;
    private javax.swing.JLabel R1points13;
    private javax.swing.JLabel R1points14;
    private javax.swing.JLabel R1points15;
    private javax.swing.JLabel R1points16;
    private javax.swing.JLabel R1points17;
    private javax.swing.JLabel R1points18;
    private javax.swing.JLabel R1points19;
    private javax.swing.JLabel R1points2;
    private javax.swing.JLabel R1points20;
    private javax.swing.JLabel R1points21;
    private javax.swing.JLabel R1points22;
    private javax.swing.JLabel R1points23;
    private javax.swing.JLabel R1points24;
    private javax.swing.JLabel R1points25;
    private javax.swing.JLabel R1points26;
    private javax.swing.JLabel R1points27;
    private javax.swing.JLabel R1points28;
    private javax.swing.JLabel R1points29;
    private javax.swing.JLabel R1points3;
    private javax.swing.JLabel R1points30;
    private javax.swing.JLabel R1points31;
    private javax.swing.JLabel R1points4;
    private javax.swing.JLabel R1points5;
    private javax.swing.JLabel R1points6;
    private javax.swing.JLabel R1points7;
    private javax.swing.JLabel R1points8;
    private javax.swing.JLabel R1points9;
    private javax.swing.JLabel R2participant0;
    private javax.swing.JLabel R2participant1;
    private javax.swing.JLabel R2participant10;
    private javax.swing.JLabel R2participant11;
    private javax.swing.JLabel R2participant12;
    private javax.swing.JLabel R2participant13;
    private javax.swing.JLabel R2participant14;
    private javax.swing.JLabel R2participant15;
    private javax.swing.JLabel R2participant2;
    private javax.swing.JLabel R2participant3;
    private javax.swing.JLabel R2participant4;
    private javax.swing.JLabel R2participant5;
    private javax.swing.JLabel R2participant6;
    private javax.swing.JLabel R2participant7;
    private javax.swing.JLabel R2participant8;
    private javax.swing.JLabel R2participant9;
    private javax.swing.JLabel R2points0;
    private javax.swing.JLabel R2points1;
    private javax.swing.JLabel R2points10;
    private javax.swing.JLabel R2points11;
    private javax.swing.JLabel R2points12;
    private javax.swing.JLabel R2points13;
    private javax.swing.JLabel R2points14;
    private javax.swing.JLabel R2points15;
    private javax.swing.JLabel R2points2;
    private javax.swing.JLabel R2points3;
    private javax.swing.JLabel R2points4;
    private javax.swing.JLabel R2points5;
    private javax.swing.JLabel R2points6;
    private javax.swing.JLabel R2points7;
    private javax.swing.JLabel R2points8;
    private javax.swing.JLabel R2points9;
    private javax.swing.JLabel R3participant0;
    private javax.swing.JLabel R3participant1;
    private javax.swing.JLabel R3participant2;
    private javax.swing.JLabel R3participant3;
    private javax.swing.JLabel R3participant4;
    private javax.swing.JLabel R3participant5;
    private javax.swing.JLabel R3participant6;
    private javax.swing.JLabel R3participant7;
    private javax.swing.JLabel R3points0;
    private javax.swing.JLabel R3points1;
    private javax.swing.JLabel R3points2;
    private javax.swing.JLabel R3points3;
    private javax.swing.JLabel R3points4;
    private javax.swing.JLabel R3points5;
    private javax.swing.JLabel R3points6;
    private javax.swing.JLabel R3points7;
    private javax.swing.JLabel R4participant0;
    private javax.swing.JLabel R4participant1;
    private javax.swing.JLabel R4participant2;
    private javax.swing.JLabel R4participant3;
    private javax.swing.JLabel R4points0;
    private javax.swing.JLabel R4points1;
    private javax.swing.JLabel R4points2;
    private javax.swing.JLabel R4points3;
    private javax.swing.JLabel R5participant0;
    private javax.swing.JLabel R5participant1;
    private javax.swing.JLabel R5points0;
    private javax.swing.JLabel R5points1;
    private javax.swing.JLabel appLogo_img8;
    private javax.swing.JScrollPane bracket_ScrollPane;
    private javax.swing.JButton confirm_button;
    private javax.swing.JLabel create_txt8;
    private javax.swing.JButton exit_button8;
    private javax.swing.JLabel feedback_txt8;
    private javax.swing.JPanel finals_panel;
    private javax.swing.JLabel finals_txt;
    private javax.swing.JPanel knockoutTournament_panel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbed;
    private javax.swing.JPanel main_panel8;
    private javax.swing.JLabel manage_txt8;
    private javax.swing.JTextField participantLeftScore_txtField;
    private javax.swing.JLabel participantLeft_txt;
    private javax.swing.JTextField participantRightScore_txtField;
    private javax.swing.JLabel participantRight_txt;
    private javax.swing.JPanel proceed_LOWpanel;
    private javax.swing.JPanel proceed_UPpanel;
    private javax.swing.JButton proceed_button;
    private javax.swing.JPanel quarterFinals_panel;
    private javax.swing.JLabel quaterFinals_txt;
    private javax.swing.JLabel roundOd16_txt;
    private javax.swing.JPanel roundOf16_panel;
    private javax.swing.JPanel roundOf32_panel;
    private javax.swing.JLabel roundOf32_txt;
    private javax.swing.JPanel semiFinals_panel;
    private javax.swing.JLabel semiFinals_txt;
    private javax.swing.JLabel setting_txt8;
    private javax.swing.JLabel winner;
    private javax.swing.JLabel winnerName_txt;
    private javax.swing.JLabel winner_txt;
    private javax.swing.JLabel winner_txt1;
    private javax.swing.JPanel winners_panel;
    // End of variables declaration//GEN-END:variables
}
