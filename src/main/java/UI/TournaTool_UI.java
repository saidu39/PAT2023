/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BackEnd.Read;
import static BackEnd.Read.getTournamentName;
import BackEnd.Write;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saien Naidu
 */
public class TournaTool_UI extends javax.swing.JFrame {

    public static int participantsAdded = 0;
    public static int maxParticipants = 0;
    
    public static String tournament0 = "Empty save";
    public static String tournament1 = "Empty save";
    public static String tournament2 = "Empty save";
    public static String tournament3 = "Empty save";
    public static String tournament4 = "Empty save";
    public static String tournament5 = "Empty save";
    public static String tournament6 = "Empty save";
    public static String tournament7 = "Empty save";
    
    
    
    private void resetColors() {
        Color bold = new Color(222, 222, 222);

        title_txt.setForeground(bold);

    }
    
    public int getMaxParticipants(){
        maxParticipants = (int) participants_spinner.getValue();
        return maxParticipants;
    }

    private void changeSaveButton(String tournamentName) throws FileNotFoundException {

        int currentTournament = Read.getNumOfTournaments();
        
        switch (currentTournament) {

            case 0 -> {
                savedTournament0_button.setText(tournamentName);
                tournament0 = tournamentName;
            }

            case 1 -> {
                savedTournament1_button.setText(tournamentName);
                tournament1 = tournamentName;
            }

            case 2 -> {
                savedTournament2_button.setText(tournamentName);
                tournament2 = tournamentName;
            }

            case 3 -> {
                savedTournament3_button.setText(tournamentName);
                tournament3 = tournamentName;
            }

            case 4 -> {
                savedTournament4_button.setText(tournamentName);
                tournament4 = tournamentName;
            }

            case 5 -> {
                savedTournament5_button.setText(tournamentName);
                tournament5 = tournamentName;
            }

            case 6 -> {
                savedTournament6_button.setText(tournamentName);
                tournament6 = tournamentName;
            }

            case 7 -> {
                savedTournament7_button.setText(tournamentName);
                tournament7 = tournamentName;
            }

            default -> {
            }

        }

        currentTournament++;

    }
    
    private void writeParticipants() throws FileNotFoundException {
        
        String tournament = title_txtField.getText();
        String participantName = participants_txtField.getText();
        getMaxParticipants();

        if (participantsAdded < maxParticipants && !"".equals(participantName)) {
            try {
                participants_txtArea.append(Write.addNewParticipant(tournament, participantName) + "\n");
                participantsAdded++;
                participants_txtField.setText("");
            } catch (IOException ex) {
                Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }

    private void saveTournament() throws IOException {

        int totalTournaments = BackEnd.Read.getNumOfTournaments();

        if (totalTournaments < 8) {
            
            BackEnd.Write.saveTournament(title_txtField.getText(), getMaxParticipants());
            
            title_txtField.setText("");
            participants_txtArea.setText("");
           
            changeSaveButton(BackEnd.Read.getTournamentName(Read.getNumOfTournaments()));
            Write.increaseTotalTournaments();

            totalTournaments++;

        }

    }

    private void updateSaveButton() throws FileNotFoundException{
        
        int tournamentsToGo = BackEnd.Read.getNumOfTournaments();

        while (tournamentsToGo > 0) {
            
            if (tournamentsToGo == 1){
                savedTournament0_button.setText(getTournamentName(0));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 2){
                savedTournament0_button.setText(getTournamentName(1));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 3){
                savedTournament0_button.setText(getTournamentName(2));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 4){
                savedTournament0_button.setText(getTournamentName(3));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 5){
                savedTournament0_button.setText(getTournamentName(4));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 6){
                savedTournament0_button.setText(getTournamentName(5));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 7){
                savedTournament0_button.setText(getTournamentName(6));
                tournamentsToGo--;
            }
            
            if (tournamentsToGo == 8){
                savedTournament0_button.setText(getTournamentName(7));
                tournamentsToGo--;
            }
            
        }
    }
    /**
     * Creates new form TournaTool
     *
     * @throws java.io.FileNotFoundException
     */
    public TournaTool_UI() throws FileNotFoundException, IOException {
        
        initComponents();
        
        resetColors();
        setLocationRelativeTo(null);
        
        updateSaveButton();
    }    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        appLogo_img = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        mainTabbed = new javax.swing.JTabbedPane();
        create_panel = new javax.swing.JPanel();
        title_txt = new javax.swing.JLabel();
        title_txtField = new javax.swing.JTextField();
        participants_scrollPane = new javax.swing.JScrollPane();
        participants_txtArea = new javax.swing.JTextArea();
        participants_txt = new javax.swing.JLabel();
        participants_spinner = new javax.swing.JSpinner();
        maxParticipants_txt = new javax.swing.JLabel();
        participants_txtField = new javax.swing.JTextField();
        participants_button = new javax.swing.JButton();
        continue_button = new javax.swing.JButton();
        manage_panel = new javax.swing.JPanel();
        savedTournament4_image = new javax.swing.JLabel();
        savedTournament0_button = new javax.swing.JButton();
        savedTournament0_image = new javax.swing.JLabel();
        savedTournament4_button = new javax.swing.JButton();
        savedTournament1_image = new javax.swing.JLabel();
        savedTournament1_button = new javax.swing.JButton();
        savedTournament5_image = new javax.swing.JLabel();
        savedTournament5_button = new javax.swing.JButton();
        savedTournament2_image = new javax.swing.JLabel();
        savedTournament2_button = new javax.swing.JButton();
        savedTournament6_image = new javax.swing.JLabel();
        savedTournament6_button = new javax.swing.JButton();
        savedTournament3_image = new javax.swing.JLabel();
        savedTournament3_button = new javax.swing.JButton();
        savedTournament7_image = new javax.swing.JLabel();
        savedTournament7_button = new javax.swing.JButton();
        feedback_panel = new javax.swing.JPanel();
        creator_txt = new javax.swing.JLabel();
        myName_txt = new javax.swing.JLabel();
        contact1_txt = new javax.swing.JLabel();
        myEmail_txt = new javax.swing.JLabel();
        contact0_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setMinimumSize(new java.awt.Dimension(853, 480));
        setName("MainScrean"); // NOI18N

        main_panel.setBackground(new java.awt.Color(0, 0, 0));
        main_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        appLogo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inAppLogo.png"))); // NOI18N

        exit_button.setBackground(new java.awt.Color(255, 0, 0));
        exit_button.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        exit_button.setText("EXIT");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appLogo_img, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLogo_img, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_button))
        );

        mainTabbed.setBackground(new java.awt.Color(153, 0, 0));
        mainTabbed.setForeground(new java.awt.Color(255, 102, 102));
        mainTabbed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainTabbed.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        mainTabbed.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mainTabbedPropertyChange(evt);
            }
        });

        create_panel.setBackground(new java.awt.Color(51, 0, 0));

        title_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        title_txt.setText("Title");

        title_txtField.setBackground(new java.awt.Color(0, 0, 0));
        title_txtField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        title_txtField.setForeground(new java.awt.Color(204, 204, 204));
        title_txtField.setText("Enter title...");
        title_txtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        title_txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title_txtFieldActionPerformed(evt);
            }
        });

        participants_txtArea.setBackground(new java.awt.Color(0, 0, 0));
        participants_txtArea.setColumns(20);
        participants_txtArea.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        participants_txtArea.setRows(5);
        participants_txtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        participants_scrollPane.setViewportView(participants_txtArea);

        participants_txt.setBackground(new java.awt.Color(255, 255, 255));
        participants_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        participants_txt.setText("Participants:");

        participants_spinner.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        participants_spinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 32, 1));
        participants_spinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        participants_spinner.setOpaque(false);

        maxParticipants_txt.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        maxParticipants_txt.setForeground(new java.awt.Color(102, 102, 102));
        maxParticipants_txt.setText("Max: 32");

        participants_txtField.setBackground(new java.awt.Color(0, 0, 0));
        participants_txtField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        participants_txtField.setForeground(new java.awt.Color(204, 204, 204));
        participants_txtField.setText("Enter participant name...");
        participants_txtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        participants_txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participants_txtFieldActionPerformed(evt);
            }
        });

        participants_button.setBackground(new java.awt.Color(0, 0, 0));
        participants_button.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        participants_button.setText("OK");
        participants_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        participants_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                participants_buttonMouseClicked(evt);
            }
        });
        participants_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participants_buttonActionPerformed(evt);
            }
        });

        continue_button.setBackground(new java.awt.Color(0, 0, 0));
        continue_button.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        continue_button.setForeground(new java.awt.Color(255, 255, 255));
        continue_button.setText("Save Tournament Info");
        continue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout create_panelLayout = new javax.swing.GroupLayout(create_panel);
        create_panel.setLayout(create_panelLayout);
        create_panelLayout.setHorizontalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_txt)
                    .addComponent(title_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_panelLayout.createSequentialGroup()
                                .addComponent(participants_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(participants_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxParticipants_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(participants_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(participants_button, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                            .addComponent(participants_scrollPane)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continue_button)))
                .addContainerGap())
        );
        create_panelLayout.setVerticalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participants_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participants_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxParticipants_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participants_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participants_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_panelLayout.createSequentialGroup()
                        .addComponent(title_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(create_panelLayout.createSequentialGroup()
                        .addComponent(participants_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(continue_button)))
                .addGap(12, 12, 12))
        );

        mainTabbed.addTab("CREATE", create_panel);

        manage_panel.setBackground(new java.awt.Color(51, 0, 0));
        manage_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manage_panel.setForeground(new java.awt.Color(51, 51, 51));

        savedTournament4_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament4_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament4_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament4_image.setText("image");
        savedTournament4_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament0_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament0_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament0_button.setForeground(new java.awt.Color(204, 204, 204));
        savedTournament0_button.setText("Empty save");
        savedTournament0_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        savedTournament0_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedTournament0_buttonActionPerformed(evt);
            }
        });

        savedTournament0_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament0_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament0_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament0_image.setText("image");
        savedTournament0_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament4_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament4_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament4_button.setText("Empty save");

        savedTournament1_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament1_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament1_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament1_image.setText("image");
        savedTournament1_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament1_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament1_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament1_button.setText("Empty save");
        savedTournament1_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament5_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament5_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament5_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament5_image.setText("image");
        savedTournament5_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament5_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament5_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament5_button.setText("Empty save");

        savedTournament2_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament2_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament2_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament2_image.setText("image");
        savedTournament2_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament2_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament2_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament2_button.setText("Empty save");
        savedTournament2_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament6_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament6_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament6_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament6_image.setText("image");
        savedTournament6_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament6_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament6_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament6_button.setText("Empty save");

        savedTournament3_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament3_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament3_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament3_image.setText("image");
        savedTournament3_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament3_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament3_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament3_button.setText("Empty save");
        savedTournament3_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament7_image.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament7_image.setForeground(new java.awt.Color(153, 153, 153));
        savedTournament7_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savedTournament7_image.setText("image");
        savedTournament7_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        savedTournament7_button.setBackground(new java.awt.Color(0, 0, 0));
        savedTournament7_button.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        savedTournament7_button.setText("Empty save");

        javax.swing.GroupLayout manage_panelLayout = new javax.swing.GroupLayout(manage_panel);
        manage_panel.setLayout(manage_panelLayout);
        manage_panelLayout.setHorizontalGroup(
            manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manage_panelLayout.createSequentialGroup()
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(savedTournament0_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savedTournament0_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(savedTournament4_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savedTournament1_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(manage_panelLayout.createSequentialGroup()
                                .addComponent(savedTournament1_image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(savedTournament5_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(manage_panelLayout.createSequentialGroup()
                        .addComponent(savedTournament4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(savedTournament5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manage_panelLayout.createSequentialGroup()
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savedTournament6_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(savedTournament6_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(savedTournament7_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(savedTournament7_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manage_panelLayout.createSequentialGroup()
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savedTournament2_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(savedTournament2_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(savedTournament3_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(savedTournament3_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        manage_panelLayout.setVerticalGroup(
            manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savedTournament1_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament0_image, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(savedTournament2_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament3_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(savedTournament1_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(savedTournament3_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament2_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament0_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savedTournament5_image, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(savedTournament4_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament6_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savedTournament7_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savedTournament5_button, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(savedTournament7_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(savedTournament4_button)
                        .addComponent(savedTournament6_button)))
                .addContainerGap())
        );

        mainTabbed.addTab("MANAGE", manage_panel);

        feedback_panel.setBackground(new java.awt.Color(51, 0, 0));

        creator_txt.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        creator_txt.setForeground(new java.awt.Color(255, 102, 102));
        creator_txt.setText("CREATOR:");

        myName_txt.setBackground(new java.awt.Color(255, 255, 255));
        myName_txt.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        myName_txt.setForeground(new java.awt.Color(255, 255, 255));
        myName_txt.setText("Saien Naidu");

        contact1_txt.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        contact1_txt.setForeground(new java.awt.Color(255, 102, 102));
        contact1_txt.setText("if you have any problems, suggests or just want to chat!");

        myEmail_txt.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        myEmail_txt.setForeground(new java.awt.Color(255, 255, 255));
        myEmail_txt.setText("saiennaidu99@gmail.com");

        contact0_txt.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        contact0_txt.setForeground(new java.awt.Color(255, 102, 102));
        contact0_txt.setText("Please contact me at:");

        javax.swing.GroupLayout feedback_panelLayout = new javax.swing.GroupLayout(feedback_panel);
        feedback_panel.setLayout(feedback_panelLayout);
        feedback_panelLayout.setHorizontalGroup(
            feedback_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedback_panelLayout.createSequentialGroup()
                .addGroup(feedback_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(contact0_txt))
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(creator_txt))
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(contact1_txt))
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(feedback_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myEmail_txt)
                            .addComponent(myName_txt))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        feedback_panelLayout.setVerticalGroup(
            feedback_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedback_panelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(creator_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myName_txt)
                .addGap(91, 91, 91)
                .addComponent(contact0_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myEmail_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact1_txt)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        mainTabbed.addTab("FEEDBACK", feedback_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainTabbed))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbed)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainTabbedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mainTabbedPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_mainTabbedPropertyChange

    private void participants_txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participants_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participants_txtFieldActionPerformed

    private void continue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_buttonActionPerformed
        try {
            // TODO add your handling code here:
            saveTournament();
        } catch (IOException ex) {
            Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_continue_buttonActionPerformed

    private void title_txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title_txtFieldActionPerformed

    private void participants_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_participants_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_participants_buttonMouseClicked

    private void participants_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participants_buttonActionPerformed
        try {
            // TODO add your handling code here:
            writeParticipants();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_participants_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void savedTournament0_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedTournament0_buttonActionPerformed

        try {
            SavedTournament0_UI tournament1_frame = new SavedTournament0_UI();
            tournament1_frame.show();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_savedTournament0_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TournaTool_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TournaTool_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TournaTool_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TournaTool_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TournaTool_UI().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TournaTool_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLogo_img;
    private javax.swing.JLabel contact0_txt;
    private javax.swing.JLabel contact1_txt;
    private javax.swing.JButton continue_button;
    private javax.swing.JPanel create_panel;
    private javax.swing.JLabel creator_txt;
    private javax.swing.JButton exit_button;
    private javax.swing.JPanel feedback_panel;
    private javax.swing.JTabbedPane mainTabbed;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel manage_panel;
    private javax.swing.JLabel maxParticipants_txt;
    private javax.swing.JLabel myEmail_txt;
    private javax.swing.JLabel myName_txt;
    private javax.swing.JButton participants_button;
    private javax.swing.JScrollPane participants_scrollPane;
    private javax.swing.JSpinner participants_spinner;
    private javax.swing.JLabel participants_txt;
    private javax.swing.JTextArea participants_txtArea;
    private javax.swing.JTextField participants_txtField;
    private javax.swing.JButton savedTournament0_button;
    private javax.swing.JLabel savedTournament0_image;
    private javax.swing.JButton savedTournament1_button;
    private javax.swing.JLabel savedTournament1_image;
    private javax.swing.JButton savedTournament2_button;
    private javax.swing.JLabel savedTournament2_image;
    private javax.swing.JButton savedTournament3_button;
    private javax.swing.JLabel savedTournament3_image;
    private javax.swing.JButton savedTournament4_button;
    private javax.swing.JLabel savedTournament4_image;
    private javax.swing.JButton savedTournament5_button;
    private javax.swing.JLabel savedTournament5_image;
    private javax.swing.JButton savedTournament6_button;
    private javax.swing.JLabel savedTournament6_image;
    private javax.swing.JButton savedTournament7_button;
    private javax.swing.JLabel savedTournament7_image;
    private javax.swing.JLabel title_txt;
    private javax.swing.JTextField title_txtField;
    // End of variables declaration//GEN-END:variables
}
