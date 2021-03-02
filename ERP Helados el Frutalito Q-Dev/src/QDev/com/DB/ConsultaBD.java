
package QDev.com.DB;

import QDev.com.Classes.Person;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cricr
 */
public class ConsultaBD {
    
    Conectar cn = new Conectar();
    Statement st; ResultSet rs;
    
    //buscar Usuario
    String buscarUsuarioLogin(Person a) {
        try {
            //Sentencia SQL
            st = (Statement) cn.conect.createStatement();
            rs = st.executeQuery("");
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
