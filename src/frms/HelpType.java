package frms;

import javax.swing.JOptionPane;

public class HelpType extends javax.swing.JFrame {
    
    public HelpType() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        evacuate_help = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mobno = new javax.swing.JTextField();
        resource_help = new javax.swing.JButton();
        medical_help = new javax.swing.JButton();
        money_help = new javax.swing.JButton();
        entermobile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose service required");

        evacuate_help.setText("Evacuation");
        evacuate_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evacuate_helpActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Mobile No.");

        mobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnoActionPerformed(evt);
            }
        });

        resource_help.setText("Resources");
        resource_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resource_helpActionPerformed(evt);
            }
        });

        medical_help.setText("Medical Assistance");
        medical_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medical_helpActionPerformed(evt);
            }
        });

        money_help.setText("Money");
        money_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                money_helpActionPerformed(evt);
            }
        });

        entermobile.setText("Register");
        entermobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entermobileActionPerformed(evt);
            }
        });

        jLabel3.setText("Assistance during flood");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(money_help)
                                    .addComponent(medical_help)
                                    .addComponent(resource_help))
                                .addGap(213, 213, 213))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(evacuate_help)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(entermobile)))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entermobile))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(evacuate_help)
                .addGap(18, 18, 18)
                .addComponent(resource_help)
                .addGap(18, 18, 18)
                .addComponent(medical_help)
                .addGap(18, 18, 18)
                .addComponent(money_help)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnoActionPerformed

    private void entermobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entermobileActionPerformed
        // TODO add your handling code here:
        String reg_num = mobno.getText();
        String aadhar_num = "";
        
        // call to db class
        DB dbobj = new DB();
        String returned = dbobj.get_from_db("reg_for_req","mob_no",reg_num);
        if(returned.equals(reg_num)){
            JOptionPane.showMessageDialog(null, "Already registered this number" , "", JOptionPane.INFORMATION_MESSAGE);
        
        }
        else {
          JOptionPane.showMessageDialog(null, "Registered " + reg_num + " into db" , "Success", JOptionPane.INFORMATION_MESSAGE);  
        }
        dbobj.insert_into_db_reg(reg_num, aadhar_num);
        
    }//GEN-LAST:event_entermobileActionPerformed

    private void evacuate_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evacuate_helpActionPerformed
        
        ServiceInit.page_init(1);
    }//GEN-LAST:event_evacuate_helpActionPerformed

    private void resource_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resource_helpActionPerformed
        
        ServiceInit.page_init(2);
    }//GEN-LAST:event_resource_helpActionPerformed

    private void medical_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medical_helpActionPerformed
        ServiceInit.page_init(3);
    }//GEN-LAST:event_medical_helpActionPerformed

    private void money_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_money_helpActionPerformed
        ServiceInit.page_init(4);   
    }//GEN-LAST:event_money_helpActionPerformed

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
            java.util.logging.Logger.getLogger(HelpType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entermobile;
    private javax.swing.JButton evacuate_help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton medical_help;
    private javax.swing.JTextField mobno;
    private javax.swing.JButton money_help;
    private javax.swing.JButton resource_help;
    // End of variables declaration//GEN-END:variables
}
