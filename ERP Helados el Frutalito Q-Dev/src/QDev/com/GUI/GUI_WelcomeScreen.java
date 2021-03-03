/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author KEREN
 */
public class GUI_WelcomeScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_WelcomeScreen
     
     */
    
    

    public GUI_WelcomeScreen() {
        initComponents();
        
        jPanel1_Menu.setVisible(false);
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
        jLabel5_Ventas = new javax.swing.JLabel();
        jLabel1_Produccion = new javax.swing.JLabel();
        jLabel7_MateriaPrima = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JButton();
        jPanel1_Menu = new javax.swing.JPanel();
        btn_GestionarUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_PedidoMateriaPrima = new javax.swing.JButton();
        btn_Venta = new javax.swing.JButton();
        try {
            btn_Produccion =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "QDev/com/GUI.GUI_WelcomeScreen_jButton3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1_Up = new javax.swing.JLabel();
        jLabel2_FondoHelados = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setMaximumSize(new java.awt.Dimension(900, 507));
        setMinimumSize(new java.awt.Dimension(900, 507));
        setPreferredSize(new java.awt.Dimension(900, 507));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3_LogoFrutalito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito01.png"))); // NOI18N
        getContentPane().add(jLabel3_LogoFrutalito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4_Titulo.setFont(new java.awt.Font("Kristen ITC", 0, 72)); // NOI18N
        jLabel4_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_Titulo.setText("Bienvenido");
        jLabel4_Titulo.setMaximumSize(new java.awt.Dimension(392, 87));
        jLabel4_Titulo.setMinimumSize(new java.awt.Dimension(392, 87));
        jLabel4_Titulo.setPreferredSize(new java.awt.Dimension(392, 87));
        getContentPane().add(jLabel4_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel5_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Ventas.png"))); // NOI18N
        getContentPane().add(jLabel5_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 150));

        jLabel1_Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Produccion.png"))); // NOI18N
        jLabel1_Produccion.setMaximumSize(new java.awt.Dimension(161, 138));
        jLabel1_Produccion.setMinimumSize(new java.awt.Dimension(161, 138));
        jLabel1_Produccion.setPreferredSize(new java.awt.Dimension(161, 138));
        getContentPane().add(jLabel1_Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 150, 130));

        jLabel7_MateriaPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_MateriaPrima.png"))); // NOI18N
        jLabel7_MateriaPrima.setMaximumSize(new java.awt.Dimension(161, 138));
        jLabel7_MateriaPrima.setMinimumSize(new java.awt.Dimension(161, 138));
        jLabel7_MateriaPrima.setPreferredSize(new java.awt.Dimension(161, 138));
        getContentPane().add(jLabel7_MateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setBorder(null);
        btn_Menu.setContentAreaFilled(false);
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Menu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, 50));

        jPanel1_Menu.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1_Menu.setPreferredSize(new java.awt.Dimension(207, 92));

        btn_GestionarUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btn_GestionarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_GestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_GestionarUsuarios.png"))); // NOI18N
        btn_GestionarUsuario.setText(" Gestionar Usuario");
        btn_GestionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_GestionarUsuario.setPreferredSize(new java.awt.Dimension(206, 46));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Help.png"))); // NOI18N
        jButton1.setText("Ayuda");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(206, 42));

        javax.swing.GroupLayout jPanel1_MenuLayout = new javax.swing.GroupLayout(jPanel1_Menu);
        jPanel1_Menu.setLayout(jPanel1_MenuLayout);
        jPanel1_MenuLayout.setHorizontalGroup(
            jPanel1_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_MenuLayout.createSequentialGroup()
                .addGroup(jPanel1_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_MenuLayout.createSequentialGroup()
                        .addComponent(btn_GestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1_MenuLayout.setVerticalGroup(
            jPanel1_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_MenuLayout.createSequentialGroup()
                .addComponent(btn_GestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, 90));

        btn_PedidoMateriaPrima.setBackground(new java.awt.Color(153, 255, 153));
        btn_PedidoMateriaPrima.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btn_PedidoMateriaPrima.setText("Pedido Metaria Prima");
        btn_PedidoMateriaPrima.setActionCommand("Venta");
        btn_PedidoMateriaPrima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_PedidoMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 180, 40));

        btn_Venta.setBackground(new java.awt.Color(153, 255, 153));
        btn_Venta.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btn_Venta.setText("Venta");
        btn_Venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 40));
        getContentPane().add(btn_Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, 40));

        jLabel1_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel1_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        jLabel2_FondoHelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel2_FondoHelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 890, 350));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 480));

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GestionarUsuario;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_PedidoMateriaPrima;
    private javax.swing.JButton btn_Produccion;
    private javax.swing.JButton btn_Venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1_Produccion;
    private javax.swing.JLabel jLabel1_Up;
    private javax.swing.JLabel jLabel2_FondoHelados;
    private javax.swing.JLabel jLabel3_LogoFrutalito;
    private javax.swing.JLabel jLabel4_Titulo;
    private javax.swing.JLabel jLabel5_Ventas;
    private javax.swing.JLabel jLabel7_MateriaPrima;
    private javax.swing.JPanel jPanel1_Menu;
    // End of variables declaration//GEN-END:variables

 



}
