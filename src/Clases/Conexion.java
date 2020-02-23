package Clases;

/***
 * @author Christian Barbosa (CJ1)
 */
import java.sql.*;

public class Conexion {

//Local Conection DB    
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/atbr_proyecto", "", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    }

}
