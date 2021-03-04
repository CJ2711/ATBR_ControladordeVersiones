/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

import QDev.com.DB.Conectar;
import QDev.com.DB.ConsultaBD;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cricr
 */
public class GUI_UserManagement extends javax.swing.JFrame {

    DefaultTableModel model;

    public GUI_UserManagement() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        loadUsersTable();
    }

    void loadUsersTable() {
        String[] titles = {"NUIP", "NAMES", "SURNAMES", "PHONE", "EMAIL", "PASSWORD", "ACTIVE"};
        String[] registries = new String[8];

        String sql = "SELECT * FROM person";

        model = new DefaultTableModel(null, titles);

        Conectar c = new Conectar();
        Connection cnn = c.conexion();

        try {
            PreparedStatement pst = (PreparedStatement) cnn.createStatement();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtlb_users = new javax.swing.JTable();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 660, 250));

        btn_Modificar.setBackground(new java.awt.Color(0, 255, 102));
        btn_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar.setText("Agregar");
        getContentPane().add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 200, 40));

        btn_Eliminar.setBackground(new java.awt.Color(204, 51, 0));
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        getContentPane().add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 200, 40));

        btn_Modificar1.setBackground(new java.awt.Color(0, 255, 102));
        btn_Modificar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar1.setText("Modificar");
        getContentPane().add(btn_Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 240, 40));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANEJADOR DE USUARIOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Up_Welcome.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Welcome.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Modificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtlb_users;
    // End of variables declaration//GEN-END:variables
}
