/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cricr
 */
public class GUI_Vendor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Admin
     */
    public GUI_Vendor() {
        initComponents();

        //Menú desplegable inicia como Invisible.
        jPanel_Menu.setVisible(false);
        jB_Help.setVisible(false);
        jB_LogOut.setVisible(false);
        //Al Igual que el botón de cerrar el menú.
        btn_CloseMenu.setVisible(false);

        //Asignación de los Manejadores de Eventos.
        btn_Menu.addActionListener(new OpenMenu());
        btn_CloseMenu.addActionListener(new CloseMenu());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3_LogoFrutalito = new javax.swing.JLabel();
        jLabel4_Titulo = new javax.swing.JLabel();
        btn_AdministrarUsuarios = new javax.swing.JButton();
        btn_PedidoMateriaPrima = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_CloseMenu = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        jB_Help = new javax.swing.JButton();
        jB_LogOut = new javax.swing.JButton();
        jLabel1_Up = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP-El Frutalito\n");
        setMinimumSize(new java.awt.Dimension(780, 477));
        setPreferredSize(new java.awt.Dimension(780, 477));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3_LogoFrutalito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito01.png"))); // NOI18N
        getContentPane().add(jLabel3_LogoFrutalito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4_Titulo.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel4_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_Titulo.setText("Bienvenido");
        jLabel4_Titulo.setMaximumSize(new java.awt.Dimension(392, 87));
        jLabel4_Titulo.setMinimumSize(new java.awt.Dimension(392, 87));
        jLabel4_Titulo.setPreferredSize(new java.awt.Dimension(392, 87));
        getContentPane().add(jLabel4_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        btn_AdministrarUsuarios.setBackground(new java.awt.Color(153, 255, 153));
        btn_AdministrarUsuarios.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btn_AdministrarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_AdministrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Ventas.png"))); // NOI18N
        btn_AdministrarUsuarios.setText("Administrar Ventas");
        btn_AdministrarUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_AdministrarUsuarios.setBorderPainted(false);
        btn_AdministrarUsuarios.setContentAreaFilled(false);
        btn_AdministrarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_AdministrarUsuarios.setFocusPainted(false);
        btn_AdministrarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AdministrarUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_AdministrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 170));

        btn_PedidoMateriaPrima.setBackground(new java.awt.Color(153, 255, 153));
        btn_PedidoMateriaPrima.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btn_PedidoMateriaPrima.setForeground(new java.awt.Color(255, 255, 255));
        btn_PedidoMateriaPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Produccion.png"))); // NOI18N
        btn_PedidoMateriaPrima.setText("Ver Producción");
        btn_PedidoMateriaPrima.setActionCommand("Venta");
        btn_PedidoMateriaPrima.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_PedidoMateriaPrima.setBorderPainted(false);
        btn_PedidoMateriaPrima.setContentAreaFilled(false);
        btn_PedidoMateriaPrima.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_PedidoMateriaPrima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_PedidoMateriaPrima.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_PedidoMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 200, 170));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setBorder(null);
        btn_Menu.setContentAreaFilled(false);
        getContentPane().add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, 50));

        btn_CloseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-CloseMenu.png"))); // NOI18N
        btn_CloseMenu.setBorder(null);
        btn_CloseMenu.setContentAreaFilled(false);
        getContentPane().add(btn_CloseMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, 50));

        jPanel_Menu.setPreferredSize(new java.awt.Dimension(185, 50));

        jB_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Help.png"))); // NOI18N
        jB_Help.setText("  Ayuda");
        jB_Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_Help.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel_Menu.add(jB_Help);

        jB_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Logout.png"))); // NOI18N
        jB_LogOut.setText("Cerrar Sesión");
        jB_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_LogOut.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel_Menu.add(jB_LogOut);

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 75, 185, 105));

        jLabel1_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel1_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(GUI_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_Vendor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdministrarUsuarios;
    private javax.swing.JButton btn_CloseMenu;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_PedidoMateriaPrima;
    private javax.swing.JButton jB_Help;
    private javax.swing.JButton jB_LogOut;
    private javax.swing.JLabel jLabel1_Up;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_LogoFrutalito;
    private javax.swing.JLabel jLabel4_Titulo;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables

    public class OpenMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            btn_Menu.setVisible(false);
            btn_CloseMenu.setVisible(true);
            jPanel_Menu.setVisible(true);
            jB_Help.setVisible(true);
            jB_LogOut.setVisible(true);
        }
    }

    public class CloseMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            btn_Menu.setVisible(true);
            btn_CloseMenu.setVisible(false);
            jPanel_Menu.setVisible(false);
            jB_Help.setVisible(false);
            jB_LogOut.setVisible(false);
        }
    }

}