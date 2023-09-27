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
public class howToTables extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public howToTables() {
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
        previewRoundRobin_table.setModel(roundRobin_model);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        previewRoundRobin_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        previewRoundRobin_table.setBackground(new java.awt.Color(51, 0, 0));
        previewRoundRobin_table.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        previewRoundRobin_table.setModel(new javax.swing.table.DefaultTableModel(
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
                "Contestant", "Stat 1", "Stat 2", "Stat 3", "Stat 4", "Stat 5", "Stat 6", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(previewRoundRobin_table);
        if (previewRoundRobin_table.getColumnModel().getColumnCount() > 0) {
            previewRoundRobin_table.getColumnModel().getColumn(0).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(0).setPreferredWidth(100);
            previewRoundRobin_table.getColumnModel().getColumn(1).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(1).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(2).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(2).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(3).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(3).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(4).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(4).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(5).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(5).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(6).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(6).setPreferredWidth(50);
            previewRoundRobin_table.getColumnModel().getColumn(7).setResizable(false);
            previewRoundRobin_table.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(howToTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(howToTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(howToTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(howToTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new howToTables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable previewRoundRobin_table;
    // End of variables declaration//GEN-END:variables
}
