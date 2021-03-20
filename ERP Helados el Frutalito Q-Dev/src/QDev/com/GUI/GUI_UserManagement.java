package QDev.com.GUI;

import QDev.com.Classes.Person;
import QDev.com.DB.Conectar;
import QDev.com.DB.ConsultaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cricr
 */
public class GUI_UserManagement extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private Person person;
    DefaultTableModel model;

    public GUI_UserManagement(ConsultaBD cBD/*, Person person*/) {
        initComponents();
        this.cBD = cBD;
        this.person = person;
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        jP_MenuDesplegable.setVisible(false);
        jB_Help.setVisible(false);
        jB_Home.setVisible(false);
        jB_LogOut.setVisible(false);
        btn_closeMenu.setVisible(false);
        loadUsersTable();
    }

    void loadUsersTable() {
        String[] titles = {"NUIP", "NAMES", "SURNAMES", "PHONE", "EMAIL", "PASSWORD", "ACTIVE", "ROL"};
        String[] registries = new String[8];

        String sql = "SELECT * FROM person ORDER BY nuip, nameRole";

        model = new DefaultTableModel(null, titles);

        Conectar c = new Conectar();
        Connection cnn = c.conexion();

        try {
            Statement pst = cnn.createStatement();
            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {
                registries[0] = rs.getString(1);
                registries[1] = rs.getString(2);
                registries[2] = rs.getString(3);
                registries[3] = rs.getString(4);
                registries[4] = rs.getString(5);
                registries[5] = rs.getString(6);
                registries[6] = rs.getString(7);
                registries[7] = rs.getString(8);
                model.addRow(registries);
            }

            jtlb_users.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        btn_closeMenu = new javax.swing.JButton();
        jP_MenuDesplegable = new javax.swing.JPanel();
        jB_Home = new javax.swing.JButton();
        jB_Help = new javax.swing.JButton();
        jB_LogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtlb_users = new javax.swing.JTable();
        btn_Modificar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP-El Frutalito Manejo de Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Eliminar.setBackground(new java.awt.Color(204, 51, 0));
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 200, 40));

        btn_Modificar.setBackground(new java.awt.Color(0, 255, 102));
        btn_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar.setText("Agregar");
        btn_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 200, 40));

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Menu.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.setContentAreaFilled(false);
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.setDisabledIcon(null);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, 50));

        btn_closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-CloseMenu.png"))); // NOI18N
        btn_closeMenu.setBorder(null);
        btn_closeMenu.setContentAreaFilled(false);
        btn_closeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_closeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 40, -1, 50));

        jB_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/IMG_20210303_231601.png"))); // NOI18N
        jB_Home.setText(" Menú Principal");
        jB_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_Home.setPreferredSize(new java.awt.Dimension(180, 45));
        jB_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_HomeActionPerformed(evt);
            }
        });
        jP_MenuDesplegable.add(jB_Home);

        jB_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Help.png"))); // NOI18N
        jB_Help.setText("  Ayuda");
        jB_Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_Help.setPreferredSize(new java.awt.Dimension(180, 45));
        jP_MenuDesplegable.add(jB_Help);

        jB_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image-Logout.png"))); // NOI18N
        jB_LogOut.setText("Cerrar Sesión");
        jB_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB_LogOut.setPreferredSize(new java.awt.Dimension(180, 45));
        jB_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LogOutActionPerformed(evt);
            }
        });
        jP_MenuDesplegable.add(jB_LogOut);

        getContentPane().add(jP_MenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 185, 155));

        jtlb_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtlb_users);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 660, 250));

        btn_Modificar1.setBackground(new java.awt.Color(0, 255, 102));
        btn_Modificar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar1.setText("Modificar");
        btn_Modificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 240, 40));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANEJADOR DE USUARIOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        btn_closeMenu.setVisible(true);
        btn_menu.setVisible(false);
        jP_MenuDesplegable.setVisible(true);
        jB_Help.setVisible(true);
        jB_Home.setVisible(true);
        jB_LogOut.setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void jB_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_HomeActionPerformed
        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_Admin(cBD, person);
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_jB_HomeActionPerformed

    private void jB_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LogOutActionPerformed
        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_Login(cBD, person);
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_jB_LogOutActionPerformed

    private void btn_closeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeMenuActionPerformed
        btn_closeMenu.setVisible(false);
        btn_menu.setVisible(true);
        jP_MenuDesplegable.setVisible(false);
        jB_Help.setVisible(false);
        jB_Home.setVisible(false);
        jB_LogOut.setVisible(false);
    }//GEN-LAST:event_btn_closeMenuActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_UserRegitration(cBD);
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_btn_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Modificar1;
    private javax.swing.JButton btn_closeMenu;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton jB_Help;
    private javax.swing.JButton jB_Home;
    private javax.swing.JButton jB_LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jP_MenuDesplegable;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtlb_users;
    // End of variables declaration//GEN-END:variables
}
