/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import static EVDict4_1.DictApp.dictApp;
import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;
import javax.swing.JOptionPane;

/**
 * @author ADMIN
 */
public class AddForm extends javax.swing.JFrame {
    public AddForm() {
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

        evTypeButton = new javax.swing.JButton();
        veTypeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wordTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaningTextPane = new javax.swing.JTextPane();
        dictLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        evTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/evdict.png"))); // NOI18N
        evTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evTypeButtonActionPerformed(evt);
            }
        });

        veTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/vedict.png"))); // NOI18N
        veTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veTypeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kiểu/Type:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Từ/Word:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nghĩa/Meaning:");

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitButton.setText("Xác nhận/Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(meaningTextPane);

        dictLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(evTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(veTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(dictLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                        .addComponent(wordTextField)
                                        .addComponent(jScrollPane1))
                                .addContainerGap(35, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(veTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(evTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(submitButton)
                                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String word = wordTextField.getText().toLowerCase();
        String meaning = "<html>" + meaningTextPane.getText();
        meaning = meaning.replaceAll("\n", "");

        if (wordTextField.getText().isEmpty() || meaningTextPane.getText().isEmpty()) {
            dictApp.dictApp.check_input = -1;
        } else {
            if (dictApp.state == EV) {
                if (dictApp.dictEV.getWord().contains(wordTextField.getText())) {
                    dictApp.dictApp.check_input = 1;
                } else {
                    dictApp.dictApp.check_input = 0;
                    int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thêm vào?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    if (answer == JOptionPane.YES_OPTION) {
                        dictApp.dictEV.addIntoDict(word, meaning);
                    }
                }
            } else if (dictApp.state == VE) {
                if (dictApp.dictVE.getWord().contains(wordTextField.getText())) {
                    dictApp.dictApp.check_input = 1;
                } else {
                    dictApp.dictApp.check_input = 0;
                    int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thêm vào?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    if (answer == JOptionPane.YES_OPTION) {
                        dictApp.dictVE.addIntoDict(word, meaning);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Đã hoàn thành", "Thông báo", -1);
            setVisible(false);
            dictApp.initDictList();
        }

        if (dictApp.check_input == -1) {
            JOptionPane.showMessageDialog(null, "Ô từ mới đang bị rỗng!!! Vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (dictApp.check_input == 1) {
            JOptionPane.showMessageDialog(null, "Từ bị nhập vào đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void evTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evTypeButtonActionPerformed
        // TODO add your handling code here:
        dictApp.state = EV;
        dictLabel.setText("Anh - Việt");
    }//GEN-LAST:event_evTypeButtonActionPerformed

    private void veTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veTypeButtonActionPerformed
        // TODO add your handling code here:
        dictApp.state = VE;
        dictLabel.setText("Việt - Anh");
    }//GEN-LAST:event_veTypeButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dictLabel;
    private javax.swing.JButton evTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton veTypeButton;
    public javax.swing.JTextField wordTextField;
    // End of variables declaration//GEN-END:variables
}
