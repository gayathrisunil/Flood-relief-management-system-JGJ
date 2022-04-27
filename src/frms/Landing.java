package frms;
public class Landing extends javax.swing.JFrame {

    public Landing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        need_help = new javax.swing.JButton();
        cool_ppl = new javax.swing.JButton();
        bade_aadmi = new javax.swing.JButton();
        missing_person = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Flood Relief Management System");

        jLabel2.setText("Choose user type");

        need_help.setText("I require help / assistance");
        need_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                need_helpActionPerformed(evt);
            }
        });

        cool_ppl.setText("I want to donate");
        cool_ppl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cool_pplActionPerformed(evt);
            }
        });

        bade_aadmi.setText("Government authority sign in");
        bade_aadmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bade_aadmiActionPerformed(evt);
            }
        });

        missing_person.setText("Register missing person");
        missing_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missing_personActionPerformed(evt);
            }
        });

        jButton1.setText("Register as NGO or update Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Emergency Call");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(missing_person)
                        .addComponent(bade_aadmi)
                        .addComponent(cool_ppl)
                        .addComponent(need_help)
                        .addComponent(jLabel2)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(need_help)
                .addGap(18, 18, 18)
                .addComponent(cool_ppl)
                .addGap(18, 18, 18)
                .addComponent(bade_aadmi)
                .addGap(18, 18, 18)
                .addComponent(missing_person)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void missing_personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missing_personActionPerformed
        //missing person
        Factory.init_type(4);
        
    }//GEN-LAST:event_missing_personActionPerformed

    private void cool_pplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cool_pplActionPerformed

        Factory.init_type(2);
    }//GEN-LAST:event_cool_pplActionPerformed

    private void need_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_need_helpActionPerformed

        Factory.init_type(1);
        
    }//GEN-LAST:event_need_helpActionPerformed

    private void bade_aadmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bade_aadmiActionPerformed

        //govt authority
        Factory.init_type(3);
    }//GEN-LAST:event_bade_aadmiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Factory.init_type(5);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Factory.init_type(6);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Landing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bade_aadmi;
    private javax.swing.JButton cool_ppl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton missing_person;
    private javax.swing.JButton need_help;
    // End of variables declaration//GEN-END:variables
}
