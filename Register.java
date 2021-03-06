/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author seoww
 */
public class Register extends javax.swing.JFrame {

    String[] user = new String[6];

    /**
     * Creates new form Register
     */
    public Register() {
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

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPlaceOfBirth = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        txfPlaceOfBirth = new javax.swing.JTextField();
        txfDateOfBirth = new javax.swing.JTextField();
        lblMusicProfile = new javax.swing.JLabel();
        cbbMusic = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMusic = new javax.swing.JTextArea();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(743, 514));

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPassword.setText("Password:");

        lblPlaceOfBirth.setText("Place Of Birth:");

        lblDateOfBirth.setText("Date Of Birth:");

        txfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsernameActionPerformed(evt);
            }
        });

        txfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPasswordActionPerformed(evt);
            }
        });

        txfPlaceOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPlaceOfBirthActionPerformed(evt);
            }
        });

        txfDateOfBirth.setToolTipText("");
        txfDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDateOfBirthActionPerformed(evt);
            }
        });

        lblMusicProfile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMusicProfile.setText("Music Profile:");

        cbbMusic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opera", "Rock", "Pop", "Jazz", "Techno", "Instrumental", "Metal" }));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txaMusic.setColumns(20);
        txaMusic.setRows(5);
        jScrollPane1.setViewportView(txaMusic);

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDateOfBirth)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword)
                            .addComponent(lblPlaceOfBirth))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfUsername)
                            .addComponent(txfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txfDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txfPlaceOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMusicProfile)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnAdd))
                            .addComponent(jScrollPane1))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblMusicProfile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfPlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaceOfBirth))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDateOfBirth)
                            .addComponent(txfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        lblPassword.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUsernameActionPerformed

    private void txfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPasswordActionPerformed

    private void txfPlaceOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPlaceOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPlaceOfBirthActionPerformed

    private void txfDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDateOfBirthActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        // generate a friend array
        String tmpUsername = txfUsername.getText();
        String tmpPassword = txfPassword.getText();
        String tmpPlaceOfBirth = txfPlaceOfBirth.getText();
        String tmpDateOfBirth = txfDateOfBirth.getText();
        String tmpMusicProfile = txaMusic.getText();
        
        user[0] = tmpUsername;
        user[1] = tmpPassword;
        user[2] = tmpPlaceOfBirth;
        user[3] = tmpDateOfBirth;
        user[4] = tmpMusicProfile;
        user[5] = "reg";

        // try to send it to the social server
        try {
            // Socket socket = new Socket("localhost", 1338);
            SockDef.socialSock = new Socket("localhost", 1338);
            
            SockDef.out = new ObjectOutputStream(SockDef.socialSock.getOutputStream());
            
            SockDef.out.writeObject(user);
            
            SockDef.in = new ObjectInputStream(SockDef.socialSock.getInputStream());

            String resp = SockDef.in.readUTF();
            
            if(resp.equals("fail"))
            {
                JOptionPane.showMessageDialog(this, "Register fail");
                return;
            }
            
            // socket.close();
        } 
        catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // go to ChatClient.java
        ChatClient chatClient = new ChatClient();
        chatClient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String tmp = String.valueOf(cbbMusic.getSelectedItem());
        txaMusic.setText(tmp);
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbbMusic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblMusicProfile;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPlaceOfBirth;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextArea txaMusic;
    private javax.swing.JTextField txfDateOfBirth;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfPlaceOfBirth;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
