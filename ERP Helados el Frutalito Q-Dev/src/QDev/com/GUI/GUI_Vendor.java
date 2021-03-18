
package QDev.com.GUI;

import QDev.com.Classes.IceCream;
import QDev.com.Classes.Person;
import QDev.com.Classes.SaleDetail;
import QDev.com.DB.ConsultaBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author cricr
 */
public class GUI_Vendor extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private IceCream iC;
    private Person person;
    private SaleDetail sD;
    
    /**
     * Creates new form GUI_Admin
     */
    public GUI_Vendor(Person person) { //Duda si los debo poner aquí también (cBD, person)
        this.person = person;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //Menú desplegable inicia como Invisible.
        jPanel_Menu.setVisible(false);
        jB_Help.setVisible(false);
        jB_LogOut.setVisible(false);
        //Al Igual que el botón de cerrar el menú.
        btn_CloseMenu.setVisible(false);

        //Asignación de los Manejadores de Eventos.
        btn_Menu.addActionListener(new OpenMenu());
        btn_CloseMenu.addActionListener(new CloseMenu());
        jB_LogOut.addActionListener(new LogOut());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3_LogoFrutalito = new javax.swing.JLabel();
        jLabel4_Titulo = new javax.swing.JLabel();
        btn_AdministrarVentas = new javax.swing.JButton();
        btn_Produccion = new javax.swing.JButton();
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
        setResizable(false);
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

        btn_AdministrarVentas.setBackground(new java.awt.Color(153, 255, 153));
        btn_AdministrarVentas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btn_AdministrarVentas.setForeground(new java.awt.Color(255, 255, 255));
        btn_AdministrarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Ventas.png"))); // NOI18N
        btn_AdministrarVentas.setText("Administrar Ventas");
        btn_AdministrarVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_AdministrarVentas.setBorderPainted(false);
        btn_AdministrarVentas.setContentAreaFilled(false);
        btn_AdministrarVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AdministrarVentas.setFocusPainted(false);
        btn_AdministrarVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AdministrarVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_AdministrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdministrarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AdministrarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 170));

        btn_Produccion.setBackground(new java.awt.Color(153, 255, 153));
        btn_Produccion.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btn_Produccion.setForeground(new java.awt.Color(255, 255, 255));
        btn_Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Produccion.png"))); // NOI18N
        btn_Produccion.setText("Ver Producción");
        btn_Produccion.setActionCommand("Venta");
        btn_Produccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Produccion.setBorderPainted(false);
        btn_Produccion.setContentAreaFilled(false);
        btn_Produccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Produccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Produccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProduccionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 200, 170));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_Menu.setBorder(null);
        btn_Menu.setContentAreaFilled(false);
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 50));

        btn_CloseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-CloseMenu.png"))); // NOI18N
        btn_CloseMenu.setBorder(null);
        btn_CloseMenu.setContentAreaFilled(false);
        btn_CloseMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_CloseMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 50));

        jPanel_Menu.setPreferredSize(new java.awt.Dimension(185, 50));

        jB_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Help.png"))); // NOI18N
        jB_Help.setText("  Ayuda");
        jB_Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_Help.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel_Menu.add(jB_Help);

        jB_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Logout.png"))); // NOI18N
        jB_LogOut.setText("Cerrar Sesión");
        jB_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_LogOut.setPreferredSize(new java.awt.Dimension(180, 45));
        jPanel_Menu.add(jB_LogOut);

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 185, 105));

        jLabel1_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel1_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdministrarUsuariosActionPerformed
        JFrame GUI_AdministrarVentas = null;
        if (GUI_AdministrarVentas == null) {
            this.dispose();
            GUI_AdministrarVentas = new GUI_AdministrarVentas(cBD, person);
        }
        GUI_AdministrarVentas.setVisible(true);
    }//GEN-LAST:event_btn_AdministrarUsuariosActionPerformed

    private void btn_ProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProduccionActionPerformed
        JFrame GUI_VerProduccion = null;
        if (GUI_VerProduccion == null) {
            this.dispose();
            GUI_VerProduccion = new GUI_Production();
        }
        GUI_VerProduccion.setVisible(true);
    }//GEN-LAST:event_btn_ProduccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdministrarVentas;
    private javax.swing.JButton btn_CloseMenu;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Produccion;
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

    public class LogOut implements ActionListener {

        //Inicalización Lazy
        private GUI_Login loginGUI = null;

        @Override
        public void actionPerformed(ActionEvent e) {

            //Cierra la ventana actual, siendo esta la de Vendor.
            GUI_Vendor.this.dispose();
            //Y se vuelve a abrir la ventana de Login, esencialmente
            //"cerrando la sesión".
            if (loginGUI == null) {
                loginGUI = new GUI_Login(cBD, person);
            }
            loginGUI.setVisible(true);
        }
    }

}
