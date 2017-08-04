/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libraries.My_func;
import models.Bean_dinarpal_nfc;
import models.M_dinarpal_nfc;
import models.M_members;
import nfc2.tagscan;

/**
 *
 * @author umarmukhtar
 */
public class Utama extends javax.swing.JFrame {
    
    private static int global_me_id = 0;
    private static String global_nfccode = "-";

    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_papar = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nfccode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DinarPal's Debit Gram Panel");

        txt_papar.setEditable(false);
        txt_papar.setColumns(20);
        txt_papar.setRows(5);
        jScrollPane1.setViewportView(txt_papar);

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Erase Card");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Erase User");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("<html><center>DinarPal's Debit Gram<br />Management Panel</center></html>");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Tap the NFC card and<br />click on \"Check Card\" button</center></html>");

        txt_nfccode.setEditable(false);
        txt_nfccode.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txt_nfccode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Check Card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("<html><center>Enter Username and click<br />on \"Check User\" button</center></html>");

        txt_username.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton4.setText("Check User");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_nfccode, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_username)
                    .addComponent(txt_nfccode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setText("Log Out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Utama.scanCard();
    }//GEN-LAST:event_jButton1ActionPerformed

    private static void scanCard() {
        String nfccode = tagscan.read();
        
        Utama.global_nfccode = nfccode;
        
        if (Utama.global_nfccode.equals("") || Utama.global_nfccode == "" || Utama.global_nfccode == null) {
            JOptionPane.showMessageDialog(null, "No card!", "NFC Registration", JOptionPane.ERROR_MESSAGE);
            return;
        }  

        M_dinarpal_nfc dn = new M_dinarpal_nfc();
        ArrayList<String> data = dn.getData_basedNfcCode(global_nfccode);

        if (data.size() > 0) {

            int me_id = 0;
            try {
                me_id = Integer.parseInt(data.get(0));
            } catch (Exception e) {
            }
            global_me_id = me_id;
            
            int accountActivationStatus = 1;
            try {
                accountActivationStatus = Integer.parseInt(data.get(7));
            } catch (Exception e) {
                accountActivationStatus = 1;
            }
            String accActStats = "n/a";
            switch (accountActivationStatus) {
                case 1:
                    accActStats = "E-mail Not Verifed!";
                    break;
                case 2:
                    accActStats = "Account Not Verified!";
                    break;
                case 3:
                    accActStats = "Account Full Verifed";
                    break;
            }

            String strpapar = "Username: " + data.get(1) + "\n"
                    + "First Name: " + data.get(2) + "\n"
                    + "Last Name: " + data.get(3) + "\n"
                    + "Phone No.: " + data.get(4) + "\n"
                    + "E-mail Address: " + data.get(5) + "\n"
                    + "Account Status: " + accActStats + "\n";
            txt_papar.setText(strpapar);
            
            M_dinarpal_nfc dn1 = new M_dinarpal_nfc();
            Bean_dinarpal_nfc bdn = dn1.getData_basedMeId(global_me_id);
            
            strpapar += "Card Code: " + bdn.getDn_nfccode();
            txt_papar.setText(strpapar);

        } else {
            txt_papar.setText("");
        }

        txt_nfccode.setText(nfccode);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Utama.scanCard();
        Utama.searchUser();
        
        String nfccode = txt_nfccode.getText();
        Utama.global_nfccode = nfccode;
        
        if (Utama.global_me_id == 0) {
            JOptionPane.showMessageDialog(null, "No user!", "NFC Registration", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Utama.global_nfccode.equals("") || Utama.global_nfccode == "" || Utama.global_nfccode == null) {
            JOptionPane.showMessageDialog(null, "No card!", "NFC Registration", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String dn_pin = JOptionPane.showInputDialog(null, "Insert the Pin Code", "Setup Pin Code", JOptionPane.INFORMATION_MESSAGE);
        
        M_dinarpal_nfc m_dn = new M_dinarpal_nfc();
        Bean_dinarpal_nfc bdn = new Bean_dinarpal_nfc();
        bdn.setDn_datetime(My_func.getCurrentDatetime_sql());
        bdn.setDn_nfccode(Utama.global_nfccode);
        bdn.setMe_id(Utama.global_me_id);
        bdn.setDn_status(1);
        bdn.setDn_pin(dn_pin);
        
        boolean isAdd = m_dn.addData(bdn);
        
        if (isAdd) {
            JOptionPane.showMessageDialog(null, "Register Success ...", "NFC Registration", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed!", "NFC Registration", JOptionPane.ERROR_MESSAGE);
        }
        
        Utama.scanCard();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_jButton3ActionPerformed

    private static void clearField() {
        txt_nfccode.setText("");
        txt_papar.setText("");
        txt_username.setText("");
        global_me_id = 0;
        global_nfccode = "-";
    }
    
    private static void searchUser() {
        String user = txt_username.getText();

        M_members mm = new M_members();
        ArrayList<String> data = mm.getData(user);

        if (data.size() > 0) {

            int me_id = 0;
            try {
                me_id = Integer.parseInt(data.get(0));
            } catch (Exception e) {
            }
            global_me_id = me_id;
            
            int accountActivationStatus = 1;
            try {
                accountActivationStatus = Integer.parseInt(data.get(36));
            } catch (Exception e) {
                accountActivationStatus = 1;
            }
            String accActStats = "n/a";
            switch (accountActivationStatus) {
                case 1:
                    accActStats = "E-mail Not Verifed!";
                    break;
                case 2:
                    accActStats = "Account Not Verified!";
                    break;
                case 3:
                    accActStats = "Account Full Verifed";
                    break;
            }

            String strpapar = "Username: " + data.get(4) + "\n"
                    + "First Name: " + data.get(2) + "\n"
                    + "Last Name: " + data.get(3) + "\n"
                    + "Phone No.: " + data.get(21) + "\n"
                    + "E-mail Address: " + data.get(33) + "\n"
                    + "Account Status: " + accActStats + "\n";
            txt_papar.setText(strpapar);
            
            M_dinarpal_nfc dn = new M_dinarpal_nfc();
            Bean_dinarpal_nfc bdn = dn.getData_basedMeId(global_me_id);
            
            strpapar += "Card Code: " + bdn.getDn_nfccode();
            txt_papar.setText(strpapar);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid user!", "User Search", JOptionPane.ERROR_MESSAGE);
            txt_papar.setText("");
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Utama.searchUser();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String nfccode = Utama.global_nfccode;
        
        int q = JOptionPane.showConfirmDialog(null, "Are you really sure to erase it?", "NFC Panel", JOptionPane.OK_CANCEL_OPTION);
        if (q == JOptionPane.OK_OPTION) {
            
            M_dinarpal_nfc dn = new M_dinarpal_nfc();
            boolean isDelete = dn.isDelete_nfcCode(nfccode);

            if (isDelete) {
                JOptionPane.showMessageDialog(null, "Card has been erased ..", "NFC Panel", JOptionPane.INFORMATION_MESSAGE);
                Utama.clearField();
                Utama.scanCard();
            } else {
                JOptionPane.showMessageDialog(null, "Card cannot be erased!", "NFC Panel", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int me_id = Utama.global_me_id;
        
        int q = JOptionPane.showConfirmDialog(null, "Are you really sure to erase it?", "NFC Panel", JOptionPane.OK_CANCEL_OPTION);
        if (q == JOptionPane.OK_OPTION) {
        
            M_dinarpal_nfc dn = new M_dinarpal_nfc();
            boolean isDelete = dn.isDelete_meId(me_id);

            if (isDelete) {
                JOptionPane.showMessageDialog(null, "Card has been erased ..", "NFC Panel", JOptionPane.INFORMATION_MESSAGE);
                String user = txt_username.getText();
                Utama.clearField();
                txt_username.setText(user);
                Utama.searchUser();
            } else {
                JOptionPane.showMessageDialog(null, "Card cannot be erased!", "NFC Panel", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Utama().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField txt_nfccode;
    public static javax.swing.JTextArea txt_papar;
    public static javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}