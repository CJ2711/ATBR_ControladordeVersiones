/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cricr
 */
public class Conectar {

    Connection conect = null;

    public Connection conexion() {
        try {
            //Cargar el Driver de MySQL
            Class.forName("org.gtj.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/bdfrutalito", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }
}
