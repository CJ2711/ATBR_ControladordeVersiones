
package QDev.com.DB;

import QDev.com.Classes.Person;
import QDev.com.Classes.Role;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cricr
 * @author Leandro Rodriguez Vidal 1958205-2711
 */
public class ConsultaBD extends Conectar{
    
//    Conectar cn = new Conectar();
//    Statement st; ResultSet rs; 
    
    PreparedStatement pst = null;
    Connection cn = conexion();
    
    //Registrar Usuario
    public boolean registerUser (Person person) {
        String sql = "INSERT INTO person (nuip, names, surnames, phone, email, "
                + "pssword, active, codeRole) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = (PreparedStatement) cn.prepareStatement(sql);
            pst.setInt(0, (int) person.getNuip());
            pst.setString(1, person.getNames());
            pst.setString(2, person.getSurnames());
            pst.setString(3, person.getPhone());
            pst.setString(4, person.getSurnames());
            pst.setString(5, person.getEmail());
            pst.setString(6, person.getPassword());
            pst.setBoolean(7, person.isActive());
            pst.setInt(8, person.getRole().ordinal());
            
            pst.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
//    //buscar Usuario
//    public String buscarUsuarioLogin(int nuip, String psswrd, boolean active, Role role) {
//        try {
//            //Sentencia SQL
//            st = (Statement) cn.conect.createStatement();
//            rs = st.executeQuery("SELECT nuip, psswrd, codeRole FROM person WHERE "
//                    + "nuip = " + nuip + " AND  psswrd = '" + psswrd + "'");
//            if (rs.next()) {
//                if (active == true and ()){
//                    
//                }
//            }
//            return usuario;
//        } catch (SQLException ex) {
//            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                
//    }
    
}
