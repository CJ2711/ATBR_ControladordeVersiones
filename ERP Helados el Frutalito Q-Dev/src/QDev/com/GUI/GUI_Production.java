package QDev.com.GUI;

import QDev.com.Classes.Person;
import QDev.com.DB.ConsultaBD;
import javax.swing.JFrame;

/**
 *
 * @author Alejandro
 */
public class GUI_Production extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private Person person;

    /**
     * Creates new form GUI_Production
     */
    public GUI_Production() {
        initComponents();
        this.setLocationRelativeTo(null);
        //El Menú desplegable inicia como invisble.
        jPanel_Menu.setVisible(false);
        btn_home.setVisible(false);
        btn_Help.setVisible(false);
        btn_LogOut.setVisible(false);
        //Al igual que el botón para ocultarlo después.
        btn_closeMenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Title = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JButton();
        btn_closeMenu = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_Help = new javax.swing.JButton();
        btn_LogOut = new javax.swing.JButton();
        jLabel_Background1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Registrar = new javax.swing.JButton();
        jLabel_Background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP-El Frutalito Producción");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Title.setFont(new java.awt.Font("Kristen ITC", 3, 22)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setText("REGISTRO PRODUCCIÓN HELADOS");
        getContentPane().add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setAutoscrolls(true);
        btn_Menu.setBorder(null);
        btn_Menu.setContentAreaFilled(false);
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 40, -1, 50));

        btn_closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-CloseMenu.png"))); // NOI18N
        btn_closeMenu.setBorder(null);
        btn_closeMenu.setContentAreaFilled(false);
        btn_closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_closeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 40, -1, 50));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/IMG_20210303_231601.png"))); // NOI18N
        btn_home.setText(" Menú Principal");
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_home.setPreferredSize(new java.awt.Dimension(180, 45));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel_Menu.add(btn_home);

        btn_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Help.png"))); // NOI18N
        btn_Help.setText(" Ayuda");
        btn_Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Help.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel_Menu.add(btn_Help);

        btn_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Logout.png"))); // NOI18N
        btn_LogOut.setText(" Cerrar Sesión");
        btn_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_LogOut.setPreferredSize(new java.awt.Dimension(180, 45));
        btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutActionPerformed(evt);
            }
        });
        jPanel_Menu.add(btn_LogOut);

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 80, 185, 155));

        jLabel_Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel_Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Helado", "Nombre Helado", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 560, 240));

        btn_Registrar.setBackground(new java.awt.Color(0, 255, 102));
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("Registrar Producción");
        btn_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, 40));

        jLabel_Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel_Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        //¿Falta funcionalidad aquí o se queda así?

        JFrame GUI_Registro = null;
        if (GUI_Registro == null) {
            this.dispose();
            GUI_Registro = new GUI_ProductionRegistration();
            jTable1.updateUI();
        }
        GUI_Registro.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_Admin();
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        btn_Menu.setVisible(false);
        btn_closeMenu.setVisible(true);
        jPanel_Menu.setVisible(true);
        btn_home.setVisible(true);
        btn_Help.setVisible(true);
        btn_LogOut.setVisible(true);
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_closeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeMenuActionPerformed
        btn_Menu.setVisible(true);
        btn_closeMenu.setVisible(false);
        jPanel_Menu.setVisible(false);
        btn_home.setVisible(false);
        btn_Help.setVisible(false);
        btn_LogOut.setVisible(false);
    }//GEN-LAST:event_btn_closeMenuActionPerformed

    private void btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutActionPerformed
        //¿Esto no afecta la funcionalidad del programa?
        //En sentido de que, ¿no afecta la info que se use de la clase Persona?

        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_Login(cBD, person);
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_btn_LogOutActionPerformed

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
//            java.util.logging.Logger.getLogger(GUI_Production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_Production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_Production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_Production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_Production().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Help;
    private javax.swing.JButton btn_LogOut;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_closeMenu;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel jLabel_Background1;
    private javax.swing.JLabel jLabel_Background2;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
