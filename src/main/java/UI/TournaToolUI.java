 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.table.DefaultTableModel;
import BackEnd.TournaToolCode;

/**
 *
 * @author LATITUDE 5480
 */
public class TournaToolUI extends javax.swing.JFrame {

    /**
     * Creates new form TournaTool
     */
    public TournaToolUI() {
        initComponents();
        
        //Round Robin table
        
        String [] columns = new String[8];
        columns[0] = "Contestants";
        columns[1] = "Stat 1";
        columns[2] = "Stat 2";
        columns[3] = "Stat 3";
        columns[4] = "Stat 4";
        columns[5] = "Stat 5";
        columns[6] = "Stat 6";
        columns[7] = "Stat 7";
        
        int num_rows = 8;
        int num_cols = 30;
        
        String[][] stats = new String[num_rows][num_cols];
        
        stats[0][0] = "50";
        stats[0][1] = "50";
        stats[0][2] = "50";
        stats[0][3] = "50";
        stats[0][4] = "50";
        stats[0][5] = "50";
        stats[0][6] = "50";
        stats[0][7] = "50";
        stats[0][8] = "50";
        stats[0][9] = "50";
        stats[0][10] = "50";
        stats[0][11] = "50";
        stats[0][12] = "50";
        stats[0][13] = "50";
        stats[0][14] = "50";
        stats[0][15] = "50";
        stats[0][16] = "50";
        stats[0][17] = "50";
        stats[0][18] = "50";
        stats[0][19] = "50";
        stats[0][20] = "50";
        stats[0][21] = "50";
        stats[0][22] = "50";
        stats[0][23] = "50";
        stats[0][24] = "50";
        stats[0][25] = "50";
        stats[0][26] = "50";
        stats[0][27] = "50";
        stats[0][28] = "50";
        stats[0][29] = "50";
        stats[1][1] = "50";
        stats[1][2] = "50";
        stats[1][3] = "50";
        stats[1][4] = "50";
        stats[1][5] = "50";
        stats[1][6] = "50";
        stats[1][7] = "50";
        stats[1][8] = "50";
        stats[1][9] = "50";
        stats[1][10] = "50";
        stats[1][11] = "50";
        stats[1][12] = "50";
        stats[1][13] = "50";
        stats[1][14] = "50";
        stats[1][15] = "50";
        stats[1][16] = "50";
        stats[1][17] = "50";
        stats[1][18] = "50";
        stats[1][19] = "50";
        stats[1][20] = "50";
        stats[1][21] = "50";
        stats[1][22] = "50";
        stats[1][23] = "50";
        stats[1][24] = "50";
        stats[1][25] = "50";
        stats[1][26] = "50";
        stats[1][27] = "50";
        stats[1][28] = "50";
        stats[1][29] = "50";
        stats[2][0] = "50";
        stats[2][1] = "50";
        stats[2][2] = "50";
        stats[2][3] = "50";
        stats[2][4] = "50";
        stats[2][5] = "50";
        stats[2][6] = "50";
        stats[2][7] = "50";
        stats[2][8] = "50";
        stats[2][9] = "50";
        stats[2][10] = "50";
        stats[2][11] = "50";
        stats[2][12] = "50";
        stats[2][13] = "50";
        stats[2][14] = "50";
        stats[2][15] = "50";
        stats[2][16] = "50";
        stats[2][17] = "50";
        stats[2][18] = "50";
        stats[2][19] = "50";
        stats[2][20] = "50";
        stats[2][21] = "50";
        stats[2][22] = "50";
        stats[2][23] = "50";
        stats[2][24] = "50";
        stats[2][25] = "50";
        stats[2][26] = "50";
        stats[2][27] = "50";
        stats[2][28] = "50";
        stats[2][29] = "50";
        stats[3][0] = "50";
        stats[3][1] = "50";
        stats[3][2] = "50";
        stats[3][3] = "50";
        stats[3][4] = "50";
        stats[3][5] = "50";
        stats[3][6] = "50";
        stats[3][7] = "50";
        stats[3][8] = "50";
        stats[3][9] = "50";
        stats[3][10] = "50";
        stats[3][11] = "50";
        stats[3][12] = "50";
        stats[3][13] = "50";
        stats[3][14] = "50";
        stats[3][15] = "50";
        stats[3][16] = "50";
        stats[3][17] = "50";
        stats[3][18] = "50";
        stats[3][19] = "50";
        stats[3][20] = "50";
        stats[3][21] = "50";
        stats[3][22] = "50";
        stats[3][23] = "50";
        stats[3][24] = "50";
        stats[3][25] = "50";
        stats[3][26] = "50";
        stats[3][27] = "50";
        stats[3][28] = "50";
        stats[3][29] = "50";
        stats[4][1] = "50";
        stats[4][2] = "50";
        stats[4][3] = "50";
        stats[4][4] = "50";
        stats[4][5] = "50";
        stats[4][6] = "50";
        stats[4][7] = "50";
        stats[4][8] = "50";
        stats[4][9] = "50";
        stats[4][10] = "50";
        stats[4][11] = "50";
        stats[4][12] = "50";
        stats[4][13] = "50";
        stats[4][14] = "50";
        stats[4][15] = "50";
        stats[4][16] = "50";
        stats[4][17] = "50";
        stats[4][18] = "50";
        stats[4][19] = "50";
        stats[4][20] = "50";
        stats[4][21] = "50";
        stats[4][22] = "50";
        stats[4][23] = "50";
        stats[4][24] = "50";
        stats[4][25] = "50";
        stats[4][26] = "50";
        stats[4][27] = "50";
        stats[4][28] = "50";
        stats[4][29] = "50";
        stats[5][0] = "50";
        stats[5][1] = "50";
        stats[5][2] = "50";
        stats[5][3] = "50";
        stats[5][4] = "50";
        stats[5][5] = "50";
        stats[5][6] = "50";
        stats[5][7] = "50";
        stats[5][8] = "50";
        stats[5][9] = "50";
        stats[5][10] = "50";
        stats[5][1] = "50";
        stats[5][12] = "50";
        stats[5][13] = "50";
        stats[5][14] = "50";
        stats[5][15] = "50";
        stats[5][16] = "50";
        stats[5][17] = "50";
        stats[5][18] = "50";
        stats[5][19] = "50";
        stats[5][20] = "50";
        stats[5][21] = "50";
        stats[5][22] = "50";
        stats[5][23] = "50";
        stats[5][24] = "50";
        stats[5][25] = "50";
        stats[5][26] = "50";
        stats[5][27] = "50";
        stats[5][28] = "50";
        stats[5][29] = "50";
        stats[6][0] = "50";
        stats[6][1] = "50";
        stats[6][2] = "50";
        stats[6][3] = "50";
        stats[6][4] = "50";
        stats[6][5] = "50";
        stats[6][6] = "50";
        stats[6][7] = "50";
        stats[6][8] = "50";
        stats[6][9] = "50";
        stats[6][10] = "50";
        stats[6][11] = "50";
        stats[6][12] = "50";
        stats[6][13] = "50";
        stats[6][14] = "50";
        stats[6][15] = "50";
        stats[6][16] = "50";
        stats[6][17] = "50";
        stats[6][18] = "50";
        stats[6][19] = "50";
        stats[6][20] = "50";
        stats[6][21] = "50";
        stats[6][22] = "50";
        stats[6][23] = "50";
        stats[6][24] = "50";
        stats[6][25] = "50";
        stats[6][26] = "50";
        stats[6][27] = "50";
        stats[6][28] = "50";
        stats[6][29] = "50";
        stats[7][0] = "50";
        stats[7][1] = "50";
        stats[7][2] = "50";
        stats[7][3] = "50";
        stats[7][4] = "50";
        stats[7][5] = "50";
        stats[7][6] = "50";
        stats[7][7] = "50";
        stats[7][8] = "50";
        stats[7][9] = "50";
        stats[7][10] = "50";
        stats[7][11] = "50";
        stats[7][12] = "50";
        stats[7][13] = "50";
        stats[7][14] = "50";
        stats[7][15] = "50";
        stats[7][16] = "50";
        stats[7][17] = "50";
        stats[7][18] = "50";
        stats[7][19] = "50";
        stats[7][20] = "50";
        stats[7][21] = "50";
        stats[7][22] = "50";
        stats[7][23] = "50";
        stats[7][24] = "50";
        stats[7][25] = "50";
        stats[7][26] = "50";
        stats[7][27] = "50";
        stats[7][28] = "50";
        stats[7][29] = "50";
        
        
        DefaultTableModel roundRobin_model = new DefaultTableModel(stats, columns);
        jTable1.setModel(roundRobin_model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mainTabbed = new javax.swing.JTabbedPane();
        create_panel = new javax.swing.JPanel();
        createTabbed = new javax.swing.JTabbedPane();
        basicInfo_panel = new javax.swing.JPanel();
        title_txt = new javax.swing.JLabel();
        title_TxtFld = new javax.swing.JTextField();
        displayImage_txt = new javax.swing.JLabel();
        displayImage_img = new javax.swing.JLabel();
        displayImage_button = new javax.swing.JButton();
        continue_button = new javax.swing.JButton();
        participants_txt = new javax.swing.JLabel();
        participants_spinner = new javax.swing.JSpinner();
        maxParticipants_txt = new javax.swing.JLabel();
        participants_scrollPane = new javax.swing.JScrollPane();
        participants_list = new javax.swing.JList<>();
        participants_txtField = new javax.swing.JTextField();
        participants_button = new javax.swing.JButton();
        scoreMetric_txt = new javax.swing.JLabel();
        scoreMetric_panel = new javax.swing.JPanel();
        points_choice = new javax.swing.JRadioButton();
        time_choice = new javax.swing.JRadioButton();
        winORlose_choice = new javax.swing.JRadioButton();
        rating_choice = new javax.swing.JRadioButton();
        knockout_panel = new javax.swing.JPanel();
        knockout_ScrollPanel = new javax.swing.JScrollPane();
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
        R3points0 = new javax.swing.JLabel();
        R3participant1 = new javax.swing.JLabel();
        R3points1 = new javax.swing.JLabel();
        R3participant2 = new javax.swing.JLabel();
        R3points2 = new javax.swing.JLabel();
        R3participant3 = new javax.swing.JLabel();
        R3points3 = new javax.swing.JLabel();
        R3participant4 = new javax.swing.JLabel();
        R3points4 = new javax.swing.JLabel();
        R3participant5 = new javax.swing.JLabel();
        R3points5 = new javax.swing.JLabel();
        R3participant6 = new javax.swing.JLabel();
        R3points6 = new javax.swing.JLabel();
        R3participant7 = new javax.swing.JLabel();
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
        winner_txt = new javax.swing.JLabel();
        manage_panel = new javax.swing.JPanel();
        settings_panel = new javax.swing.JPanel();
        feedback_panel = new javax.swing.JPanel();
        creator_txt = new javax.swing.JLabel();
        myName_txt = new javax.swing.JLabel();
        contact1_txt = new javax.swing.JLabel();
        myEmail_txt = new javax.swing.JLabel();
        contact0_txt = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();
        appLogo_img = new javax.swing.JLabel();
        create_txt = new javax.swing.JLabel();
        manage_txt = new javax.swing.JLabel();
        setting_txt = new javax.swing.JLabel();
        feedback_txt = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel27.setText("jLabel27");

        jLabel33.setText("jLabel33");

        jLabel65.setText("jLabel65");

        jLabel66.setText("jLabel66");

        jToolBar1.setRollover(true);

        jLabel24.setText("jLabel1");

        jLabel25.setText("jLabel1");

        jButton1.setText("jButton1");

        jCheckBox1.setText("jCheckBox1");

        jButton3.setText("jButton3");

        jTable1.setBackground(new java.awt.Color(51, 0, 0));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setName("MainScrean"); // NOI18N

        mainTabbed.setBackground(new java.awt.Color(153, 0, 0));
        mainTabbed.setForeground(new java.awt.Color(255, 102, 102));
        mainTabbed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainTabbed.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        mainTabbed.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mainTabbedPropertyChange(evt);
            }
        });

        create_panel.setBackground(new java.awt.Color(0, 0, 0));

        createTabbed.setBackground(new java.awt.Color(153, 0, 0));
        createTabbed.setForeground(new java.awt.Color(255, 102, 102));
        createTabbed.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        createTabbed.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N

        basicInfo_panel.setBackground(new java.awt.Color(51, 0, 0));

        title_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        title_txt.setText("Title");

        title_TxtFld.setEditable(false);
        title_TxtFld.setBackground(new java.awt.Color(0, 0, 0));
        title_TxtFld.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        title_TxtFld.setForeground(new java.awt.Color(102, 102, 102));
        title_TxtFld.setText("Enter title...");
        title_TxtFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        title_TxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title_TxtFldActionPerformed(evt);
            }
        });

        displayImage_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        displayImage_txt.setText("Display Image");

        displayImage_img.setForeground(new java.awt.Color(153, 153, 153));
        displayImage_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayImage_img.setText("100x100");
        displayImage_img.setToolTipText("");
        displayImage_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        displayImage_img.setMaximumSize(new java.awt.Dimension(100, 100));
        displayImage_img.setPreferredSize(new java.awt.Dimension(100, 100));

        displayImage_button.setBackground(new java.awt.Color(0, 0, 0));
        displayImage_button.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        displayImage_button.setText("Import...");
        displayImage_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        displayImage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImage_buttonActionPerformed(evt);
            }
        });

        continue_button.setBackground(new java.awt.Color(0, 0, 0));
        continue_button.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        continue_button.setText("Continue...");
        continue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_buttonActionPerformed(evt);
            }
        });

        participants_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        participants_txt.setText("Participants:");

        participants_spinner.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        participants_spinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 32, 2));
        participants_spinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        maxParticipants_txt.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        maxParticipants_txt.setForeground(new java.awt.Color(102, 102, 102));
        maxParticipants_txt.setText("Max: 32");

        participants_list.setBackground(new java.awt.Color(0, 0, 0));
        participants_list.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        participants_scrollPane.setViewportView(participants_list);

        participants_txtField.setBackground(new java.awt.Color(0, 0, 0));
        participants_txtField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        participants_txtField.setForeground(new java.awt.Color(102, 102, 102));
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

        scoreMetric_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        scoreMetric_txt.setText("Score metric:");

        scoreMetric_panel.setBackground(new java.awt.Color(0, 0, 0));
        scoreMetric_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        points_choice.setBackground(new java.awt.Color(0, 0, 0));
        points_choice.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        points_choice.setText("Points");
        points_choice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        points_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                points_choiceActionPerformed(evt);
            }
        });

        time_choice.setBackground(new java.awt.Color(0, 0, 0));
        time_choice.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        time_choice.setText("Time");
        time_choice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        time_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_choiceActionPerformed(evt);
            }
        });

        winORlose_choice.setBackground(new java.awt.Color(0, 0, 0));
        winORlose_choice.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        winORlose_choice.setText("Win/Lose");
        winORlose_choice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        winORlose_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winORlose_choiceActionPerformed(evt);
            }
        });

        rating_choice.setBackground(new java.awt.Color(0, 0, 0));
        rating_choice.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        rating_choice.setText("Rating");
        rating_choice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        rating_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rating_choiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scoreMetric_panelLayout = new javax.swing.GroupLayout(scoreMetric_panel);
        scoreMetric_panel.setLayout(scoreMetric_panelLayout);
        scoreMetric_panelLayout.setHorizontalGroup(
            scoreMetric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreMetric_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scoreMetric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(points_choice)
                    .addComponent(time_choice)
                    .addComponent(winORlose_choice)
                    .addComponent(rating_choice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scoreMetric_panelLayout.setVerticalGroup(
            scoreMetric_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreMetric_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(points_choice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time_choice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(winORlose_choice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_choice)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basicInfo_panelLayout = new javax.swing.GroupLayout(basicInfo_panel);
        basicInfo_panel.setLayout(basicInfo_panelLayout);
        basicInfo_panelLayout.setHorizontalGroup(
            basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title_TxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(title_txt)
                    .addGroup(basicInfo_panelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(displayImage_txt))
                    .addGroup(basicInfo_panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayImage_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayImage_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scoreMetric_txt)
                    .addComponent(scoreMetric_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basicInfo_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continue_button))
                    .addGroup(basicInfo_panelLayout.createSequentialGroup()
                        .addComponent(participants_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(participants_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(maxParticipants_txt)
                        .addGap(24, 24, 24)
                        .addComponent(participants_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(participants_button, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(participants_scrollPane))
                .addContainerGap())
        );
        basicInfo_panelLayout.setVerticalGroup(
            basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(participants_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(participants_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxParticipants_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(participants_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(participants_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basicInfo_panelLayout.createSequentialGroup()
                        .addComponent(title_TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(displayImage_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayImage_img, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayImage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scoreMetric_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreMetric_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(participants_scrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continue_button)
                .addContainerGap())
        );

        createTabbed.addTab("Basic Info", basicInfo_panel);

        knockout_panel.setBackground(new java.awt.Color(51, 0, 0));

        knockout_ScrollPanel.setBackground(new java.awt.Color(51, 0, 0));
        knockout_ScrollPanel.setForeground(new java.awt.Color(51, 0, 0));

        knockoutTournament_panel.setBackground(new java.awt.Color(51, 0, 0));

        roundOf32_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roundOf32_txt.setForeground(new java.awt.Color(255, 102, 102));
        roundOf32_txt.setText("Round of 32");

        roundOf32_panel.setBackground(new java.awt.Color(51, 0, 0));
        roundOf32_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundOf32_panel.setForeground(new java.awt.Color(51, 0, 0));

        R1participant0.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant0.setText("null");

        R1participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant1.setForeground(new java.awt.Color(153, 153, 153));
        R1participant1.setText("null");

        R1participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant2.setForeground(new java.awt.Color(153, 153, 153));
        R1participant2.setText("null");

        R1participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant3.setText("null");

        R1participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant4.setForeground(new java.awt.Color(153, 153, 153));
        R1participant4.setText("null");

        R1participant5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant5.setText("null");

        R1participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant6.setForeground(new java.awt.Color(153, 153, 153));
        R1participant6.setText("null");

        R1participant7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant7.setText("null");

        R1participant8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant8.setText("null");

        R1participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant9.setForeground(new java.awt.Color(153, 153, 153));
        R1participant9.setText("null");

        R1participant10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant10.setForeground(new java.awt.Color(153, 153, 153));
        R1participant10.setText("null");

        R1participant11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant11.setText("null");

        R1participant12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant12.setText("null");

        R1participant13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant13.setForeground(new java.awt.Color(153, 153, 153));
        R1participant13.setText("null");

        R1participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant14.setForeground(new java.awt.Color(153, 153, 153));
        R1participant14.setText("null");

        R1participant15.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant15.setText("null");

        R1participant16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant16.setForeground(new java.awt.Color(153, 153, 153));
        R1participant16.setText("null");

        R1participant17.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant17.setText("null");

        R1participant18.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant18.setText("null");

        R1participant19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant19.setForeground(new java.awt.Color(153, 153, 153));
        R1participant19.setText("null");

        R1participant20.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant20.setText("null");

        R1participant21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant21.setForeground(new java.awt.Color(153, 153, 153));
        R1participant21.setText("null");

        R1participant22.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant22.setText("null");

        R1participant23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant23.setForeground(new java.awt.Color(153, 153, 153));
        R1participant23.setText("null");

        R1participant24.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant24.setText("null");

        R1participant25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant25.setForeground(new java.awt.Color(153, 153, 153));
        R1participant25.setText("null");

        R1participant26.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant26.setText("null");

        R1participant27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant27.setForeground(new java.awt.Color(153, 153, 153));
        R1participant27.setText("null");

        R1participant28.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant28.setText("null");

        R1participant29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant29.setForeground(new java.awt.Color(153, 153, 153));
        R1participant29.setText("null");

        R1participant30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant30.setForeground(new java.awt.Color(153, 153, 153));
        R1participant30.setText("null");

        R1participant31.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant31.setText("null");

        R1points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points0.setText("0");

        R1points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points1.setText("0");

        R1points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points2.setText("0");

        R1points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points3.setText("0");

        R1points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points4.setText("0");

        R1points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points5.setText("0");

        R1points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points6.setText("0");

        R1points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points7.setText("0");

        R1points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points8.setText("0");

        R1points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points9.setText("0");

        R1points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points10.setText("0");

        R1points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points11.setText("0");

        R1points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points12.setText("0");

        R1points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points13.setText("0");

        R1points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points14.setText("0");

        R1points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points15.setText("0");

        R1points16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points16.setText("0");

        R1points17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points17.setText("0");

        R1points18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points18.setText("0");

        R1points19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points19.setText("0");

        R1points20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points20.setText("0");

        R1points21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points21.setText("0");

        R1points22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points22.setText("0");

        R1points23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points23.setText("0");

        R1points24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points24.setText("0");

        R1points25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points25.setText("0");

        R1points26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points26.setText("0");

        R1points27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points27.setText("0");

        R1points28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points28.setText("0");

        R1points29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points29.setText("0");

        R1points30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points30.setText("0");

        R1points31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points31.setText("0");

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
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(R1points31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(roundOf32_panelLayout.createSequentialGroup()
                .addComponent(R1participant30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R1points30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundOf32_panelLayout.createSequentialGroup()
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R1participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R1participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R1points1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1points0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(R1participant11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(R1participant27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(R1participant30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1points30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(roundOf32_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1participant31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1points31)))
        );

        roundOf16_panel.setBackground(new java.awt.Color(51, 0, 0));
        roundOf16_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R2participant0.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant0.setText("TBC");

        R2participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant1.setForeground(new java.awt.Color(153, 153, 153));
        R2participant1.setText("TBC");

        R2participant2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant2.setText("TBC");

        R2participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant3.setForeground(new java.awt.Color(153, 153, 153));
        R2participant3.setText("TBC");

        R2participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant4.setForeground(new java.awt.Color(153, 153, 153));
        R2participant4.setText("TBC");

        R2participant5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant5.setText("TBC");

        R2participant6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant6.setText("TBC");

        R2participant7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant7.setForeground(new java.awt.Color(153, 153, 153));
        R2participant7.setText("TBC");

        R2participant8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant8.setForeground(new java.awt.Color(153, 153, 153));
        R2participant8.setText("TBC");

        R2participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant9.setText("TBC");

        R2participant10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant10.setText("TBC");

        R2participant11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant11.setForeground(new java.awt.Color(153, 153, 153));
        R2participant11.setText("TBC");

        R2participant12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant12.setText("TBC");

        R2participant13.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant13.setText("TBC");

        R2participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant14.setForeground(new java.awt.Color(153, 153, 153));
        R2participant14.setText("TBC");

        R2participant15.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant15.setText("TBC");

        R2points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points0.setText("0");

        R2points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points1.setText("0");
        R2points1.setToolTipText("");

        R2points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points2.setText("0");
        R2points2.setToolTipText("");

        R2points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points3.setText("0");
        R2points3.setToolTipText("");

        R2points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points4.setText("0");
        R2points4.setToolTipText("");

        R2points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points5.setText("0");
        R2points5.setToolTipText("");

        R2points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points6.setText("0");
        R2points6.setToolTipText("");

        R2points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points7.setText("0");
        R2points7.setToolTipText("");

        R2points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points8.setText("0");
        R2points8.setToolTipText("");

        R2points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points9.setText("0");
        R2points9.setToolTipText("");

        R2points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points10.setText("0");
        R2points10.setToolTipText("");

        R2points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points11.setText("0");
        R2points11.setToolTipText("");

        R2points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points12.setText("0");
        R2points12.setToolTipText("");

        R2points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points13.setText("0");
        R2points13.setToolTipText("");

        R2points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points14.setText("0");
        R2points14.setToolTipText("");

        R2points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points15.setText("0");
        R2points15.setToolTipText("");

        javax.swing.GroupLayout roundOf16_panelLayout = new javax.swing.GroupLayout(roundOf16_panel);
        roundOf16_panel.setLayout(roundOf16_panelLayout);
        roundOf16_panelLayout.setHorizontalGroup(
            roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        );
        roundOf16_panelLayout.setVerticalGroup(
            roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant0)
                    .addComponent(R2points0))
                .addGap(25, 25, 25)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant1)
                    .addComponent(R2points1))
                .addGap(28, 28, 28)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant2)
                    .addComponent(R2points2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant3)
                    .addComponent(R2points3))
                .addGap(27, 27, 27)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant4)
                    .addComponent(R2points4))
                .addGap(27, 27, 27)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2points5))
                .addGap(27, 27, 27)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant6)
                    .addComponent(R2points6))
                .addGap(26, 26, 26)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant7)
                    .addComponent(R2points7))
                .addGap(29, 29, 29)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant8)
                    .addComponent(R2points8))
                .addGap(27, 27, 27)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant15)
                    .addComponent(R2points9))
                .addGap(26, 26, 26)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant14)
                    .addComponent(R2points10))
                .addGap(25, 25, 25)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant13)
                    .addComponent(R2points11))
                .addGap(27, 27, 27)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant12)
                    .addComponent(R2points12))
                .addGap(28, 28, 28)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant11)
                    .addComponent(R2points13))
                .addGap(28, 28, 28)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant10)
                    .addComponent(R2points14))
                .addGap(25, 25, 25)
                .addGroup(roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2participant9)
                    .addComponent(R2points15))
                .addContainerGap())
        );

        quarterFinals_panel.setBackground(new java.awt.Color(51, 0, 0));
        quarterFinals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R3participant0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant0.setForeground(new java.awt.Color(153, 153, 153));
        R3participant0.setText("TBC");

        R3points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points0.setText("0");

        R3participant1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant1.setText("TBC");

        R3points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points1.setText("0");

        R3participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant2.setForeground(new java.awt.Color(153, 153, 153));
        R3participant2.setText("TBC");

        R3points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points2.setText("0");

        R3participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant3.setText("TBC");

        R3points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points3.setText("0");

        R3participant4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant4.setText("TBC");

        R3points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points4.setText("0");

        R3participant5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant5.setForeground(new java.awt.Color(153, 153, 153));
        R3participant5.setText("TBC");

        R3points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points5.setText("0");

        R3participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant6.setForeground(new java.awt.Color(153, 153, 153));
        R3participant6.setText("TBC");

        R3points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points6.setText("0");

        R3participant7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant7.setText("TBC");

        R3points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points7.setText("0");

        javax.swing.GroupLayout quarterFinals_panelLayout = new javax.swing.GroupLayout(quarterFinals_panel);
        quarterFinals_panel.setLayout(quarterFinals_panelLayout);
        quarterFinals_panelLayout.setHorizontalGroup(
            quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(R3points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R3points1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R3points2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R3points3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quarterFinals_panelLayout.createSequentialGroup()
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R3participant5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R3participant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R3points4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R3points6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addComponent(R3participant7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R3points7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        quarterFinals_panelLayout.setVerticalGroup(
            quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quarterFinals_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant0)
                    .addComponent(R3points0))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant1)
                    .addComponent(R3points1))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3points2))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant3)
                    .addComponent(R3points3))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant4)
                    .addComponent(R3points4))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant5)
                    .addComponent(R3points5))
                .addGap(69, 69, 69)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant6)
                    .addComponent(R3points6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(quarterFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3participant7)
                    .addComponent(R3points7))
                .addGap(32, 32, 32))
        );

        roundOd16_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roundOd16_txt.setForeground(new java.awt.Color(255, 102, 102));
        roundOd16_txt.setText("Round of 16");

        quaterFinals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        quaterFinals_txt.setForeground(new java.awt.Color(255, 102, 102));
        quaterFinals_txt.setText("Quarter-Finals");

        semiFinals_panel.setBackground(new java.awt.Color(51, 0, 0));
        semiFinals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        semiFinals_panel.setForeground(new java.awt.Color(51, 0, 0));

        R4participant0.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R4participant0.setText("TBC");

        R4points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points0.setText("0");

        R4participant1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R4participant1.setForeground(new java.awt.Color(153, 51, 0));
        R4participant1.setText("TBC");

        R4points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points1.setText("0");

        R4participant2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R4participant2.setForeground(new java.awt.Color(153, 51, 0));
        R4participant2.setText("TBC");

        R4points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points2.setText("0");

        R4participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R4participant3.setForeground(new java.awt.Color(255, 255, 255));
        R4participant3.setText("TBC");

        R4points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points3.setText("0");

        javax.swing.GroupLayout semiFinals_panelLayout = new javax.swing.GroupLayout(semiFinals_panel);
        semiFinals_panel.setLayout(semiFinals_panelLayout);
        semiFinals_panelLayout.setHorizontalGroup(
            semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(semiFinals_panelLayout.createSequentialGroup()
                .addComponent(R4participant1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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
                .addGap(71, 71, 71)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant0)
                    .addComponent(R4points0))
                .addGap(153, 153, 153)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant1)
                    .addComponent(R4points1))
                .addGap(154, 154, 154)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant2)
                    .addComponent(R4points2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(semiFinals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4participant3)
                    .addComponent(R4points3))
                .addGap(77, 77, 77))
        );

        finals_panel.setBackground(new java.awt.Color(51, 0, 0));
        finals_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        R5participant0.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R5participant0.setForeground(new java.awt.Color(153, 153, 153));
        R5participant0.setText("TBC");

        R5points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points0.setText("0");

        R5participant1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R5participant1.setForeground(new java.awt.Color(255, 204, 0));
        R5participant1.setText("TBC");

        R5points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points1.setText("0");

        javax.swing.GroupLayout finals_panelLayout = new javax.swing.GroupLayout(finals_panel);
        finals_panel.setLayout(finals_panelLayout);
        finals_panelLayout.setHorizontalGroup(
            finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finals_panelLayout.createSequentialGroup()
                .addComponent(R5participant0, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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
                .addGap(154, 154, 154)
                .addGroup(finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5participant0)
                    .addComponent(R5points0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addGroup(finals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5participant1)
                    .addComponent(R5points1))
                .addGap(163, 163, 163))
        );

        semiFinals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        semiFinals_txt.setForeground(new java.awt.Color(255, 102, 102));
        semiFinals_txt.setText("Semi-Finals");

        finals_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        finals_txt.setForeground(new java.awt.Color(255, 51, 51));
        finals_txt.setText("Finals");

        winners_panel.setBackground(new java.awt.Color(51, 0, 0));
        winners_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        winner.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        winner.setForeground(new java.awt.Color(255, 204, 0));
        winner.setText("TBC");

        javax.swing.GroupLayout winners_panelLayout = new javax.swing.GroupLayout(winners_panel);
        winners_panel.setLayout(winners_panelLayout);
        winners_panelLayout.setHorizontalGroup(
            winners_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        winners_panelLayout.setVerticalGroup(
            winners_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winners_panelLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(winner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        winner_txt.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        winner_txt.setForeground(new java.awt.Color(255, 255, 102));
        winner_txt.setText("Winner");

        javax.swing.GroupLayout knockoutTournament_panelLayout = new javax.swing.GroupLayout(knockoutTournament_panel);
        knockoutTournament_panel.setLayout(knockoutTournament_panelLayout);
        knockoutTournament_panelLayout.setHorizontalGroup(
            knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(roundOf32_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundOf16_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(roundOf32_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundOd16_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(quarterFinals_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(semiFinals_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(quaterFinals_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(semiFinals_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(finals_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(winners_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(knockoutTournament_panelLayout.createSequentialGroup()
                        .addComponent(finals_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(winner_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        knockoutTournament_panelLayout.setVerticalGroup(
            knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, knockoutTournament_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundOf32_txt)
                    .addComponent(roundOd16_txt)
                    .addComponent(quaterFinals_txt)
                    .addComponent(semiFinals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finals_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winner_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(knockoutTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundOf32_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundOf16_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quarterFinals_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semiFinals_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finals_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winners_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        knockout_ScrollPanel.setViewportView(knockoutTournament_panel);

        javax.swing.GroupLayout knockout_panelLayout = new javax.swing.GroupLayout(knockout_panel);
        knockout_panel.setLayout(knockout_panelLayout);
        knockout_panelLayout.setHorizontalGroup(
            knockout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(knockout_ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        knockout_panelLayout.setVerticalGroup(
            knockout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(knockout_ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        createTabbed.addTab("Bracket", knockout_panel);

        javax.swing.GroupLayout create_panelLayout = new javax.swing.GroupLayout(create_panel);
        create_panel.setLayout(create_panelLayout);
        create_panelLayout.setHorizontalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createTabbed)
        );
        create_panelLayout.setVerticalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createTabbed)
        );

        mainTabbed.addTab("CREATE", create_panel);

        manage_panel.setBackground(new java.awt.Color(51, 0, 0));
        manage_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout manage_panelLayout = new javax.swing.GroupLayout(manage_panel);
        manage_panel.setLayout(manage_panelLayout);
        manage_panelLayout.setHorizontalGroup(
            manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        manage_panelLayout.setVerticalGroup(
            manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        mainTabbed.addTab("MANAGE", manage_panel);

        settings_panel.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout settings_panelLayout = new javax.swing.GroupLayout(settings_panel);
        settings_panel.setLayout(settings_panelLayout);
        settings_panelLayout.setHorizontalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        settings_panelLayout.setVerticalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        mainTabbed.addTab("SETTINGS", settings_panel);

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
        myEmail_txt.setText("saien.naidu@reddam.house");

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
                        .addGap(272, 272, 272)
                        .addComponent(myName_txt))
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(myEmail_txt))
                    .addGroup(feedback_panelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(contact1_txt)))
                .addContainerGap(196, Short.MAX_VALUE))
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

        main_panel.setBackground(new java.awt.Color(0, 0, 0));
        main_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        appLogo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/img/inAppLogo.png"))); // NOI18N

        create_txt.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        create_txt.setForeground(new java.awt.Color(255, 102, 102));
        create_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_txt.setText("CREATE:");

        manage_txt.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        manage_txt.setForeground(new java.awt.Color(255, 102, 102));
        manage_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manage_txt.setText("MANAGE:");

        setting_txt.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        setting_txt.setForeground(new java.awt.Color(255, 102, 102));
        setting_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setting_txt.setText("SETTINGS:");

        feedback_txt.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        feedback_txt.setForeground(new java.awt.Color(255, 102, 102));
        feedback_txt.setText("FEEDBACK:");

        exit_button.setBackground(new java.awt.Color(255, 102, 102));
        exit_button.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        exit_button.setText("EXIT");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feedback_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setting_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manage_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(create_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create_txt)
                .addGap(60, 60, 60)
                .addComponent(manage_txt)
                .addGap(60, 60, 60)
                .addComponent(setting_txt)
                .addGap(60, 60, 60)
                .addComponent(feedback_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_button))
        );

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

    private void rating_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rating_choiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rating_choiceActionPerformed

    private void winORlose_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winORlose_choiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winORlose_choiceActionPerformed

    private void time_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_choiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_choiceActionPerformed

    private void points_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_points_choiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_points_choiceActionPerformed

    private void participants_txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participants_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participants_txtFieldActionPerformed

    private void continue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_continue_buttonActionPerformed

    private void displayImage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImage_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayImage_buttonActionPerformed

    private void title_TxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_TxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title_TxtFldActionPerformed

    private void participants_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_participants_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_participants_buttonMouseClicked

    private void participants_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participants_buttonActionPerformed
        // TODO add your handling code here:
        
        String participantName = participants_txtField.getText();
        writeParticipants();
    }//GEN-LAST:event_participants_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(TournaToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TournaToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TournaToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TournaToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TournaToolUI().setVisible(true);
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
    private javax.swing.JLabel appLogo_img;
    private javax.swing.JPanel basicInfo_panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contact0_txt;
    private javax.swing.JLabel contact1_txt;
    private javax.swing.JButton continue_button;
    private javax.swing.JTabbedPane createTabbed;
    private javax.swing.JPanel create_panel;
    private javax.swing.JLabel create_txt;
    private javax.swing.JLabel creator_txt;
    private javax.swing.JButton displayImage_button;
    private javax.swing.JLabel displayImage_img;
    private javax.swing.JLabel displayImage_txt;
    private javax.swing.JButton exit_button;
    private javax.swing.JPanel feedback_panel;
    private javax.swing.JLabel feedback_txt;
    private javax.swing.JPanel finals_panel;
    private javax.swing.JLabel finals_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel knockoutTournament_panel;
    private javax.swing.JScrollPane knockout_ScrollPanel;
    private javax.swing.JPanel knockout_panel;
    private javax.swing.JTabbedPane mainTabbed;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel manage_panel;
    private javax.swing.JLabel manage_txt;
    private javax.swing.JLabel maxParticipants_txt;
    private javax.swing.JLabel myEmail_txt;
    private javax.swing.JLabel myName_txt;
    private javax.swing.JButton participants_button;
    private javax.swing.JList<String> participants_list;
    private javax.swing.JScrollPane participants_scrollPane;
    private javax.swing.JSpinner participants_spinner;
    private javax.swing.JLabel participants_txt;
    private javax.swing.JTextField participants_txtField;
    private javax.swing.JRadioButton points_choice;
    private javax.swing.JPanel quarterFinals_panel;
    private javax.swing.JLabel quaterFinals_txt;
    private javax.swing.JRadioButton rating_choice;
    private javax.swing.JLabel roundOd16_txt;
    private javax.swing.JPanel roundOf16_panel;
    private javax.swing.JPanel roundOf32_panel;
    private javax.swing.JLabel roundOf32_txt;
    private javax.swing.JPanel scoreMetric_panel;
    private javax.swing.JLabel scoreMetric_txt;
    private javax.swing.JPanel semiFinals_panel;
    private javax.swing.JLabel semiFinals_txt;
    private javax.swing.JLabel setting_txt;
    private javax.swing.JPanel settings_panel;
    private javax.swing.JRadioButton time_choice;
    private javax.swing.JTextField title_TxtFld;
    private javax.swing.JLabel title_txt;
    private javax.swing.JRadioButton winORlose_choice;
    private javax.swing.JLabel winner;
    private javax.swing.JLabel winner_txt;
    private javax.swing.JPanel winners_panel;
    // End of variables declaration//GEN-END:variables
}
