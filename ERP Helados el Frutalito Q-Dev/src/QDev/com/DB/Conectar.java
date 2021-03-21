
package QDev.com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Clase Conectar
public class Conectar {

    Connection conect = null;

    public Connection conexion() {
        try {
            //Cargar el Driver de MySQL
            //Class.forName("org.gtj.mm.mysql.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/frutalitodb", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }
    
}
