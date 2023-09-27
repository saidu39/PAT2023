 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.table.DefaultTableModel;

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
        stages_panel = new javax.swing.JPanel();
        title_txt1 = new javax.swing.JLabel();
        numStages_spinner = new javax.swing.JSpinner();
        continue_button1 = new javax.swing.JButton();
        templates_panel = new javax.swing.JPanel();
        knockout_button = new javax.swing.JButton();
        roundRobin_button = new javax.swing.JButton();
        freeLayout_button = new javax.swing.JButton();
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
        roundRobin_panel = new javax.swing.JPanel();
        roundRobin_scrollPane = new javax.swing.JScrollPane();
        roundRobinTournament_panel = new javax.swing.JPanel();
        roundRobinTournament_scrollPane = new javax.swing.JScrollPane();
        roundRobin_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable19 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTable24 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTable25 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTable26 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTable27 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTable28 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTable29 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTable30 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTable31 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTable32 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTable33 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
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
        title_TxtFld.setBackground(new java.awt.Color(51, 51, 51));
        title_TxtFld.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        title_TxtFld.setForeground(new java.awt.Color(102, 102, 102));
        title_TxtFld.setText("Enter title...");
        title_TxtFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        displayImage_img.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displayImage_img.setMaximumSize(new java.awt.Dimension(100, 100));
        displayImage_img.setPreferredSize(new java.awt.Dimension(100, 100));

        displayImage_button.setBackground(new java.awt.Color(51, 51, 51));
        displayImage_button.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        displayImage_button.setText("Import...");
        displayImage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayImage_buttonActionPerformed(evt);
            }
        });

        continue_button.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        continue_button.setText("Continue...");
        continue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basicInfo_panelLayout = new javax.swing.GroupLayout(basicInfo_panel);
        basicInfo_panel.setLayout(basicInfo_panelLayout);
        basicInfo_panelLayout.setHorizontalGroup(
            basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_txt)
                    .addComponent(displayImage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(title_TxtFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(basicInfo_panelLayout.createSequentialGroup()
                            .addComponent(displayImage_img, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(215, 215, 215))
                        .addGroup(basicInfo_panelLayout.createSequentialGroup()
                            .addComponent(displayImage_txt)
                            .addGap(232, 232, 232))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicInfo_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continue_button)
                .addContainerGap())
        );
        basicInfo_panelLayout.setVerticalGroup(
            basicInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_TxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayImage_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayImage_img, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayImage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(continue_button)
                .addContainerGap())
        );

        createTabbed.addTab("Basic Info", basicInfo_panel);

        stages_panel.setBackground(new java.awt.Color(51, 0, 0));

        title_txt1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        title_txt1.setText("How many stages do you want?");

        numStages_spinner.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        continue_button1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        continue_button1.setText("Continue...");
        continue_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stages_panelLayout = new javax.swing.GroupLayout(stages_panel);
        stages_panel.setLayout(stages_panelLayout);
        stages_panelLayout.setHorizontalGroup(
            stages_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stages_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stages_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numStages_spinner))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stages_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continue_button1)
                .addContainerGap())
        );
        stages_panelLayout.setVerticalGroup(
            stages_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stages_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numStages_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(continue_button1)
                .addContainerGap())
        );

        createTabbed.addTab("Stages", stages_panel);

        templates_panel.setBackground(new java.awt.Color(51, 0, 0));

        knockout_button.setBackground(new java.awt.Color(0, 0, 0));
        knockout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/img/TournaTool ‐ knockout.png"))); // NOI18N
        knockout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knockout_buttonActionPerformed(evt);
            }
        });

        roundRobin_button.setText("Round Robin");
        roundRobin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundRobin_buttonActionPerformed(evt);
            }
        });

        freeLayout_button.setText("Free Layout");
        freeLayout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeLayout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout templates_panelLayout = new javax.swing.GroupLayout(templates_panel);
        templates_panel.setLayout(templates_panelLayout);
        templates_panelLayout.setHorizontalGroup(
            templates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(templates_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(knockout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundRobin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(freeLayout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        templates_panelLayout.setVerticalGroup(
            templates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, templates_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(templates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(knockout_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundRobin_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(freeLayout_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        createTabbed.addTab("Templates", templates_panel);

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
        R1participant0.setText("Adnaan");

        R1participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant1.setForeground(new java.awt.Color(153, 153, 153));
        R1participant1.setText("Blake");

        R1participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant2.setForeground(new java.awt.Color(153, 153, 153));
        R1participant2.setText("Cally");

        R1participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant3.setText("Darren");

        R1participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant4.setForeground(new java.awt.Color(153, 153, 153));
        R1participant4.setText("Eugene");

        R1participant5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant5.setText("Freya");

        R1participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant6.setForeground(new java.awt.Color(153, 153, 153));
        R1participant6.setText("Gerald");

        R1participant7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant7.setText("Harry");

        R1participant8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant8.setText("India");

        R1participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant9.setForeground(new java.awt.Color(153, 153, 153));
        R1participant9.setText("James");

        R1participant10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant10.setForeground(new java.awt.Color(153, 153, 153));
        R1participant10.setText("Kara");

        R1participant11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant11.setText("Lauren");

        R1participant12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant12.setText("Mckaden");

        R1participant13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant13.setForeground(new java.awt.Color(153, 153, 153));
        R1participant13.setText("Noon");

        R1participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant14.setForeground(new java.awt.Color(153, 153, 153));
        R1participant14.setText("Oreo");

        R1participant15.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant15.setText("Petra");

        R1participant16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant16.setForeground(new java.awt.Color(153, 153, 153));
        R1participant16.setText("Quarren");

        R1participant17.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant17.setText("Ryan");

        R1participant18.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant18.setText("Saien");

        R1participant19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant19.setForeground(new java.awt.Color(153, 153, 153));
        R1participant19.setText("Tariq");

        R1participant20.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant20.setText("Uki");

        R1participant21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant21.setForeground(new java.awt.Color(153, 153, 153));
        R1participant21.setText("Verdana");

        R1participant22.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant22.setText("Wanda");

        R1participant23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant23.setForeground(new java.awt.Color(153, 153, 153));
        R1participant23.setText("Xander");

        R1participant24.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant24.setText("Yurav");

        R1participant25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant25.setForeground(new java.awt.Color(153, 153, 153));
        R1participant25.setText("Zandile");

        R1participant26.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant26.setText("Adrian");

        R1participant27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant27.setForeground(new java.awt.Color(153, 153, 153));
        R1participant27.setText("Brian");

        R1participant28.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant28.setText("Cathy");

        R1participant29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant29.setForeground(new java.awt.Color(153, 153, 153));
        R1participant29.setText("David");

        R1participant30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R1participant30.setForeground(new java.awt.Color(153, 153, 153));
        R1participant30.setText("Eurik");

        R1participant31.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R1participant31.setText("Fiona");

        R1points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points0.setText("3");

        R1points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points1.setText("2");

        R1points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points2.setText("1");

        R1points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points3.setText("4");

        R1points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points4.setText("2");

        R1points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points5.setText("2");

        R1points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points6.setText("0");

        R1points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points7.setText("3");

        R1points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points8.setText("2");

        R1points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points9.setText("1");

        R1points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points10.setText("2");

        R1points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points11.setText("3");

        R1points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points12.setText("1");

        R1points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points13.setText("0");

        R1points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points14.setText("2");

        R1points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points15.setText("3");

        R1points16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points16.setText("1");

        R1points17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points17.setText("2");

        R1points18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points18.setText("2");

        R1points19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points19.setText("0");

        R1points20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points20.setText("3");

        R1points21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points21.setText("2");

        R1points22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points22.setText("4");

        R1points23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points23.setText("2");

        R1points24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points24.setText("1");

        R1points25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points25.setText("0");

        R1points26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points26.setText("5");

        R1points27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points27.setText("2");

        R1points28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points28.setText("2");

        R1points29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points29.setText("1");

        R1points30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points30.setText("1");

        R1points31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R1points31.setText("5");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1points31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
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
        R2participant0.setText("Adnaan");

        R2participant1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant1.setForeground(new java.awt.Color(153, 153, 153));
        R2participant1.setText("Darren");

        R2participant2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant2.setText("Freya");

        R2participant3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant3.setForeground(new java.awt.Color(153, 153, 153));
        R2participant3.setText("Harry");

        R2participant4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant4.setForeground(new java.awt.Color(153, 153, 153));
        R2participant4.setText("India");

        R2participant5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant5.setText("Lauren");

        R2participant6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant6.setText("Mckaden");

        R2participant7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant7.setForeground(new java.awt.Color(153, 153, 153));
        R2participant7.setText("Petra");

        R2participant8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant8.setForeground(new java.awt.Color(153, 153, 153));
        R2participant8.setText("Ryan");

        R2participant9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant9.setText("Fiona");

        R2participant10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant10.setText("Cathy");

        R2participant11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant11.setForeground(new java.awt.Color(153, 153, 153));
        R2participant11.setText("Adrian");

        R2participant12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant12.setText("Yurav");

        R2participant13.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant13.setText("Wanda");

        R2participant14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R2participant14.setForeground(new java.awt.Color(153, 153, 153));
        R2participant14.setText("Uki");

        R2participant15.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R2participant15.setText("Saien");

        R2points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points0.setText("3");

        R2points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points1.setText("1");

        R2points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points2.setText("2");

        R2points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points3.setText("0");

        R2points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points4.setText("2");

        R2points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points5.setText("4");

        R2points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points6.setText("3");

        R2points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points7.setText("1");

        R2points8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points8.setText("1");

        R2points9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points9.setText("4");

        R2points10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points10.setText("1");

        R2points11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points11.setText("3");

        R2points12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points12.setText("2");

        R2points13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points13.setText("2");

        R2points14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points14.setText("3");

        R2points15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R2points15.setText("1");

        javax.swing.GroupLayout roundOf16_panelLayout = new javax.swing.GroupLayout(roundOf16_panel);
        roundOf16_panel.setLayout(roundOf16_panelLayout);
        roundOf16_panelLayout.setHorizontalGroup(
            roundOf16_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundOf16_panelLayout.createSequentialGroup()
                .addComponent(R2participant0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R2points0, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        R3participant0.setText("Adnaan");

        R3points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points0.setText("2");

        R3participant1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant1.setText("Freya");

        R3points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points1.setText("3");

        R3participant2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant2.setForeground(new java.awt.Color(153, 153, 153));
        R3participant2.setText("Lauren");

        R3points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points2.setText("1");

        R3participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant3.setText("Mckaden");

        R3points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points3.setText("2");

        R3participant4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant4.setText("Saien");

        R3points4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points4.setText("3");

        R3participant5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant5.setForeground(new java.awt.Color(153, 153, 153));
        R3participant5.setText("Wanda");

        R3points5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points5.setText("2");

        R3participant6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        R3participant6.setForeground(new java.awt.Color(153, 153, 153));
        R3participant6.setText("Yurav");

        R3points6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points6.setText("1");

        R3participant7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R3participant7.setText("Cathy");

        R3points7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R3points7.setText("3");

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
        R4participant0.setText("Freya");

        R4points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points0.setText("2");

        R4participant1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R4participant1.setForeground(new java.awt.Color(153, 51, 0));
        R4participant1.setText("Mckaden");

        R4points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points1.setText("1");

        R4participant2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R4participant2.setForeground(new java.awt.Color(153, 51, 0));
        R4participant2.setText("Saien");

        R4points2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points2.setText("2");

        R4participant3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        R4participant3.setForeground(new java.awt.Color(255, 255, 255));
        R4participant3.setText("Cathy");

        R4points3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R4points3.setText("3");

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
        R5participant0.setText("Freya");

        R5points0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points0.setText("1");

        R5participant1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        R5participant1.setForeground(new java.awt.Color(255, 204, 0));
        R5participant1.setText("Cathy");

        R5points1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        R5points1.setText("2");

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
        winner.setText("Cathy");

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
            .addComponent(knockout_ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        knockout_panelLayout.setVerticalGroup(
            knockout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(knockout_ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        createTabbed.addTab("Knockout", knockout_panel);

        roundRobin_panel.setBackground(new java.awt.Color(51, 0, 0));

        roundRobin_scrollPane.setBackground(new java.awt.Color(51, 0, 0));

        roundRobinTournament_panel.setBackground(new java.awt.Color(51, 0, 0));

        roundRobin_table.setBackground(new java.awt.Color(51, 0, 0));
        roundRobin_table.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        roundRobin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contestant", "Column2", "Column3", "Column4", "Column5", "Column6", "Column7", "Column8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roundRobin_table.setSelectionBackground(new java.awt.Color(51, 0, 0));
        roundRobinTournament_scrollPane.setViewportView(roundRobin_table);
        if (roundRobin_table.getColumnModel().getColumnCount() > 0) {
            roundRobin_table.getColumnModel().getColumn(0).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(0).setPreferredWidth(100);
            roundRobin_table.getColumnModel().getColumn(1).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(1).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(2).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(2).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(3).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(3).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(4).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(4).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(5).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(5).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(6).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(6).setPreferredWidth(50);
            roundRobin_table.getColumnModel().getColumn(7).setResizable(false);
            roundRobin_table.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        javax.swing.GroupLayout roundRobinTournament_panelLayout = new javax.swing.GroupLayout(roundRobinTournament_panel);
        roundRobinTournament_panel.setLayout(roundRobinTournament_panelLayout);
        roundRobinTournament_panelLayout.setHorizontalGroup(
            roundRobinTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundRobinTournament_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        roundRobinTournament_panelLayout.setVerticalGroup(
            roundRobinTournament_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundRobinTournament_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        roundRobin_scrollPane.setViewportView(roundRobinTournament_panel);

        javax.swing.GroupLayout roundRobin_panelLayout = new javax.swing.GroupLayout(roundRobin_panel);
        roundRobin_panel.setLayout(roundRobin_panelLayout);
        roundRobin_panelLayout.setHorizontalGroup(
            roundRobin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundRobin_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        roundRobin_panelLayout.setVerticalGroup(
            roundRobin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundRobin_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        createTabbed.addTab("Freeform", roundRobin_panel);

        jTabbedPane2.setBackground(new java.awt.Color(153, 0, 0));
        jTabbedPane2.setForeground(new java.awt.Color(255, 102, 102));
        jTabbedPane2.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 0));

        jTable2.setBackground(new java.awt.Color(51, 0, 0));
        jTable2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contestant", "Stat 1", "Stat 2", "Stat 3", "Stat 4", "Stat 5", "Stat 6", "Stat 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        jTabbedPane2.addTab("Table", jScrollPane1);

        jScrollPane3.setBackground(new java.awt.Color(51, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jTable3.setBackground(new java.awt.Color(0, 0, 0));
        jTable3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("1.1");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("1.2");

        jTable4.setBackground(new java.awt.Color(0, 0, 0));
        jTable4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Round 1");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("1.3");

        jTable5.setBackground(new java.awt.Color(0, 0, 0));
        jTable5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane6.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("1.4");

        jTable6.setBackground(new java.awt.Color(0, 0, 0));
        jTable6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane7.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("1.5");

        jTable7.setBackground(new java.awt.Color(0, 0, 0));
        jTable7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane8.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("1.6");

        jTable8.setBackground(new java.awt.Color(0, 0, 0));
        jTable8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane9.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("1.7");

        jTable9.setBackground(new java.awt.Color(0, 0, 0));
        jTable9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane10.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable9.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("1.8");

        jTable10.setBackground(new java.awt.Color(0, 0, 0));
        jTable10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane11.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable10.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("1.9");

        jTable11.setBackground(new java.awt.Color(0, 0, 0));
        jTable11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane12.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable11.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable11.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("1.10");

        jTable12.setBackground(new java.awt.Color(0, 0, 0));
        jTable12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane13.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable12.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable12.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable12.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("1.11");

        jTable13.setBackground(new java.awt.Color(0, 0, 0));
        jTable13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane14.setViewportView(jTable13);
        if (jTable13.getColumnModel().getColumnCount() > 0) {
            jTable13.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable13.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable13.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable13.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("1.12");

        jTable14.setBackground(new java.awt.Color(0, 0, 0));
        jTable14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane15.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable14.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable14.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable14.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("1.13");

        jTable15.setBackground(new java.awt.Color(0, 0, 0));
        jTable15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane16.setViewportView(jTable15);
        if (jTable15.getColumnModel().getColumnCount() > 0) {
            jTable15.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable15.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable15.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("1.14");

        jTable16.setBackground(new java.awt.Color(0, 0, 0));
        jTable16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane17.setViewportView(jTable16);
        if (jTable16.getColumnModel().getColumnCount() > 0) {
            jTable16.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable16.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable16.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable16.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("1.15");

        jTable17.setBackground(new java.awt.Color(0, 0, 0));
        jTable17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane18.setViewportView(jTable17);
        if (jTable17.getColumnModel().getColumnCount() > 0) {
            jTable17.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable17.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable17.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setText("2.1");

        jTable19.setBackground(new java.awt.Color(0, 0, 0));
        jTable19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane20.setViewportView(jTable19);
        if (jTable19.getColumnModel().getColumnCount() > 0) {
            jTable19.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable19.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable19.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable19.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("2.2");

        jTable20.setBackground(new java.awt.Color(0, 0, 0));
        jTable20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane21.setViewportView(jTable20);
        if (jTable20.getColumnModel().getColumnCount() > 0) {
            jTable20.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable20.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable20.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable20.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setText("2.3");

        jTable21.setBackground(new java.awt.Color(0, 0, 0));
        jTable21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane22.setViewportView(jTable21);
        if (jTable21.getColumnModel().getColumnCount() > 0) {
            jTable21.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable21.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable21.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable21.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("2.4");

        jTable22.setBackground(new java.awt.Color(0, 0, 0));
        jTable22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane23.setViewportView(jTable22);
        if (jTable22.getColumnModel().getColumnCount() > 0) {
            jTable22.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable22.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable22.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable22.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Round 2");

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setText("2.5");

        jTable23.setBackground(new java.awt.Color(0, 0, 0));
        jTable23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane24.setViewportView(jTable23);
        if (jTable23.getColumnModel().getColumnCount() > 0) {
            jTable23.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable23.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable23.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable23.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("2.6");

        jTable24.setBackground(new java.awt.Color(0, 0, 0));
        jTable24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane25.setViewportView(jTable24);
        if (jTable24.getColumnModel().getColumnCount() > 0) {
            jTable24.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable24.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable24.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable24.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("2.7");

        jTable25.setBackground(new java.awt.Color(0, 0, 0));
        jTable25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane26.setViewportView(jTable25);
        if (jTable25.getColumnModel().getColumnCount() > 0) {
            jTable25.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable25.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable25.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable25.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setText("2.8");

        jTable26.setBackground(new java.awt.Color(0, 0, 0));
        jTable26.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable26.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane27.setViewportView(jTable26);
        if (jTable26.getColumnModel().getColumnCount() > 0) {
            jTable26.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable26.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable26.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable26.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setText("2.9");

        jTable27.setBackground(new java.awt.Color(0, 0, 0));
        jTable27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane28.setViewportView(jTable27);
        if (jTable27.getColumnModel().getColumnCount() > 0) {
            jTable27.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable27.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable27.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable27.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setText("2.10");

        jTable28.setBackground(new java.awt.Color(0, 0, 0));
        jTable28.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane29.setViewportView(jTable28);
        if (jTable28.getColumnModel().getColumnCount() > 0) {
            jTable28.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable28.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable28.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable28.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel32.setText("2.11");

        jTable29.setBackground(new java.awt.Color(0, 0, 0));
        jTable29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable29.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane30.setViewportView(jTable29);
        if (jTable29.getColumnModel().getColumnCount() > 0) {
            jTable29.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable29.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable29.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable29.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel34.setText("2.12");

        jTable30.setBackground(new java.awt.Color(0, 0, 0));
        jTable30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable30.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane31.setViewportView(jTable30);
        if (jTable30.getColumnModel().getColumnCount() > 0) {
            jTable30.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable30.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable30.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable30.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel35.setText("2.13");

        jTable31.setBackground(new java.awt.Color(0, 0, 0));
        jTable31.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable31.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane32.setViewportView(jTable31);
        if (jTable31.getColumnModel().getColumnCount() > 0) {
            jTable31.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable31.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable31.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable31.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel36.setText("2.14");

        jTable32.setBackground(new java.awt.Color(0, 0, 0));
        jTable32.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable32.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane33.setViewportView(jTable32);
        if (jTable32.getColumnModel().getColumnCount() > 0) {
            jTable32.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable32.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable32.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable32.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel37.setText("2.15");

        jTable33.setBackground(new java.awt.Color(0, 0, 0));
        jTable33.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable33.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Contestant A", "Score", "Score", "Contestant B"
            }
        ));
        jScrollPane34.setViewportView(jTable33);
        if (jTable33.getColumnModel().getColumnCount() > 0) {
            jTable33.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable33.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable33.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable33.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 102, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Round 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel26))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(22, 22, 22)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(4334, 4334, 4334))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(401, 401, 401)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 4703, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGap(22, 22, 22)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                                                                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGap(18, 18, 18)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                                                                                            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(834, Short.MAX_VALUE)))
        );

        jScrollPane3.setViewportView(jPanel2);

        jTabbedPane2.addTab("Draw Sheet", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        createTabbed.addTab("Round Robin", jPanel1);

        javax.swing.GroupLayout create_panelLayout = new javax.swing.GroupLayout(create_panel);
        create_panel.setLayout(create_panelLayout);
        create_panelLayout.setHorizontalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createTabbed)
        );
        create_panelLayout.setVerticalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createTabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        mainTabbed.addTab("CREATE", create_panel);

        manage_panel.setBackground(new java.awt.Color(51, 0, 0));
        manage_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout manage_panelLayout = new javax.swing.GroupLayout(manage_panel);
        manage_panel.setLayout(manage_panelLayout);
        manage_panelLayout.setHorizontalGroup(
            manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
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
            .addGap(0, 700, Short.MAX_VALUE)
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
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appLogo_img))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(feedback_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setting_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manage_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(create_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLogo_img)
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

    private void roundRobin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundRobin_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundRobin_buttonActionPerformed

    private void knockout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knockout_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_knockout_buttonActionPerformed

    private void continue_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_continue_button1ActionPerformed

    private void continue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_continue_buttonActionPerformed

    private void displayImage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayImage_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayImage_buttonActionPerformed

    private void title_TxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_TxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title_TxtFldActionPerformed

    private void freeLayout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeLayout_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freeLayout_buttonActionPerformed

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
    private javax.swing.JButton continue_button1;
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
    private javax.swing.JButton freeLayout_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable19;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable22;
    private javax.swing.JTable jTable23;
    private javax.swing.JTable jTable24;
    private javax.swing.JTable jTable25;
    private javax.swing.JTable jTable26;
    private javax.swing.JTable jTable27;
    private javax.swing.JTable jTable28;
    private javax.swing.JTable jTable29;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable30;
    private javax.swing.JTable jTable31;
    private javax.swing.JTable jTable32;
    private javax.swing.JTable jTable33;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel knockoutTournament_panel;
    private javax.swing.JScrollPane knockout_ScrollPanel;
    private javax.swing.JButton knockout_button;
    private javax.swing.JPanel knockout_panel;
    private javax.swing.JTabbedPane mainTabbed;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel manage_panel;
    private javax.swing.JLabel manage_txt;
    private javax.swing.JLabel myEmail_txt;
    private javax.swing.JLabel myName_txt;
    private javax.swing.JSpinner numStages_spinner;
    private javax.swing.JPanel quarterFinals_panel;
    private javax.swing.JLabel quaterFinals_txt;
    private javax.swing.JLabel roundOd16_txt;
    private javax.swing.JPanel roundOf16_panel;
    private javax.swing.JPanel roundOf32_panel;
    private javax.swing.JLabel roundOf32_txt;
    private javax.swing.JPanel roundRobinTournament_panel;
    private javax.swing.JScrollPane roundRobinTournament_scrollPane;
    private javax.swing.JButton roundRobin_button;
    private javax.swing.JPanel roundRobin_panel;
    private javax.swing.JScrollPane roundRobin_scrollPane;
    private javax.swing.JTable roundRobin_table;
    private javax.swing.JPanel semiFinals_panel;
    private javax.swing.JLabel semiFinals_txt;
    private javax.swing.JLabel setting_txt;
    private javax.swing.JPanel settings_panel;
    private javax.swing.JPanel stages_panel;
    private javax.swing.JPanel templates_panel;
    private javax.swing.JTextField title_TxtFld;
    private javax.swing.JLabel title_txt;
    private javax.swing.JLabel title_txt1;
    private javax.swing.JLabel winner;
    private javax.swing.JLabel winner_txt;
    private javax.swing.JPanel winners_panel;
    // End of variables declaration//GEN-END:variables
}
