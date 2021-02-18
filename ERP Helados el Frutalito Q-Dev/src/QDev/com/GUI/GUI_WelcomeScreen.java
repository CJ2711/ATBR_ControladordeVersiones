/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

/**
 *
 * @author Alejandro
 */
public class GUI_WelcomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form GUI_WelcomeScreen
     */
    public GUI_WelcomeScreen() {
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

        jLUser = new javax.swing.JLabel();
        jLWelcome = new javax.swing.JLabel();
        jP_Green_alpha1 = new javax.swing.JPanel();
        jTA_PyM_alpha = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jP_Yellow_alpha2 = new javax.swing.JPanel();
        jL_Inventory_alpha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jP_Cyan_alpha3 = new javax.swing.JPanel();
        jT_Version_alpha = new javax.swing.JTextField();
        jL_Users_alpha = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jL_Background_alpha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLUser.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLUser.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, -1));

        jLWelcome.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLWelcome.setForeground(new java.awt.Color(0, 0, 0));
        jLWelcome.setText("Bienvenido, ");
        jLWelcome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jP_Green_alpha1.setBackground(new java.awt.Color(204, 255, 204));
        jP_Green_alpha1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_Green_alpha1.setForeground(new java.awt.Color(51, 51, 255));
        jP_Green_alpha1.setPreferredSize(new java.awt.Dimension(2, 2));

        jTA_PyM_alpha.setEditable(false);
        jTA_PyM_alpha.setBackground(new java.awt.Color(204, 255, 204));
        jTA_PyM_alpha.setColumns(20);
        jTA_PyM_alpha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTA_PyM_alpha.setForeground(new java.awt.Color(0, 0, 0));
        jTA_PyM_alpha.setLineWrap(true);
        jTA_PyM_alpha.setRows(5);
        jTA_PyM_alpha.setText("    PRODUCTOS \n              Y\nMATERIA PRIMA");
        jTA_PyM_alpha.setAutoscrolls(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("REGISTRAR PRODUCCIÓN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("REGISTRAR MATERIA PRIMA");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jP_Green_alpha1Layout = new javax.swing.GroupLayout(jP_Green_alpha1);
        jP_Green_alpha1.setLayout(jP_Green_alpha1Layout);
        jP_Green_alpha1Layout.setHorizontalGroup(
            jP_Green_alpha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Green_alpha1Layout.createSequentialGroup()
                .addGroup(jP_Green_alpha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Green_alpha1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTA_PyM_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_Green_alpha1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jP_Green_alpha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jP_Green_alpha1Layout.setVerticalGroup(
            jP_Green_alpha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Green_alpha1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTA_PyM_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
        );

        getContentPane().add(jP_Green_alpha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 265, 390));

        jP_Yellow_alpha2.setBackground(new java.awt.Color(255, 255, 204));
        jP_Yellow_alpha2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_Yellow_alpha2.setForeground(new java.awt.Color(51, 51, 255));
        jP_Yellow_alpha2.setPreferredSize(new java.awt.Dimension(259, 390));

        jL_Inventory_alpha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jL_Inventory_alpha.setForeground(new java.awt.Color(0, 0, 0));
        jL_Inventory_alpha.setText("INVENTARIO");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("VER INVENTARIO");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jP_Yellow_alpha2Layout = new javax.swing.GroupLayout(jP_Yellow_alpha2);
        jP_Yellow_alpha2.setLayout(jP_Yellow_alpha2Layout);
        jP_Yellow_alpha2Layout.setHorizontalGroup(
            jP_Yellow_alpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Yellow_alpha2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jP_Yellow_alpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Yellow_alpha2Layout.createSequentialGroup()
                        .addComponent(jL_Inventory_alpha)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Yellow_alpha2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jP_Yellow_alpha2Layout.setVerticalGroup(
            jP_Yellow_alpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Yellow_alpha2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jL_Inventory_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(109, 109, 109))
        );

        getContentPane().add(jP_Yellow_alpha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 90, 265, 390));

        jP_Cyan_alpha3.setBackground(new java.awt.Color(153, 255, 255));
        jP_Cyan_alpha3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_Cyan_alpha3.setForeground(new java.awt.Color(51, 51, 255));

        jT_Version_alpha.setBackground(new java.awt.Color(153, 255, 255));
        jT_Version_alpha.setForeground(new java.awt.Color(0, 0, 0));
        jT_Version_alpha.setText("Pre-alpha. Ver 0.1");
        jT_Version_alpha.setBorder(null);

        jL_Users_alpha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jL_Users_alpha.setForeground(new java.awt.Color(0, 0, 0));
        jL_Users_alpha.setText("USUARIOS");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("GESTIONAR USUARIOS");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jP_Cyan_alpha3Layout = new javax.swing.GroupLayout(jP_Cyan_alpha3);
        jP_Cyan_alpha3.setLayout(jP_Cyan_alpha3Layout);
        jP_Cyan_alpha3Layout.setHorizontalGroup(
            jP_Cyan_alpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Cyan_alpha3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jT_Version_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Cyan_alpha3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jP_Cyan_alpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Cyan_alpha3Layout.createSequentialGroup()
                        .addComponent(jL_Users_alpha)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Cyan_alpha3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(48, 48, 48))))
        );
        jP_Cyan_alpha3Layout.setVerticalGroup(
            jP_Cyan_alpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Cyan_alpha3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jL_Users_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(95, 95, 95)
                .addComponent(jT_Version_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jP_Cyan_alpha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 265, 390));

        jL_Background_alpha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Generic_Frutalito_BG.jpeg"))); // NOI18N
        getContentPane().add(jL_Background_alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 820, 480));

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
            java.util.logging.Logger.getLogger(GUI_WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWelcome;
    private javax.swing.JLabel jL_Background_alpha;
    private javax.swing.JLabel jL_Inventory_alpha;
    private javax.swing.JLabel jL_Users_alpha;
    private javax.swing.JPanel jP_Cyan_alpha3;
    private javax.swing.JPanel jP_Green_alpha1;
    private javax.swing.JPanel jP_Yellow_alpha2;
    private javax.swing.JTextArea jTA_PyM_alpha;
    private javax.swing.JTextField jT_Version_alpha;
    // End of variables declaration//GEN-END:variables
}