
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
    PreparedStatement pst = null;
    Connection cnn = conexion();
    ResultSet rs = null;
    
    public boolean loginUser(Person person){
        String sql = "SELECT nuip, psswrd, active, codeRole FROM person WHERE nuip = ? AND active = ?";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());
            pst.setBoolean(3, person.isActive());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                if(person.getPassword().equals(rs.getString(2))){
                    person.setRole((Role) rs.getObject(4));
                    return true;
                } else {
                    return false;
                }
            }
            
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Registrar Usuario
    public boolean registerUser (Person person) {
        String sql = "INSERT INTO person (nuip, names, surnames, phone, email, "
                + "pssword, active, codeRole) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());
            pst.setString(2, person.getNames());
            pst.setString(3, person.getSurnames());
            pst.setString(4, person.getPhone());
            pst.setString(5, person.getSurnames());
            pst.setString(6, person.getEmail());
            pst.setString(7, person.getPassword());
            pst.setBoolean(8, person.isActive());
            pst.setInt(9, person.getRole().ordinal());
            
            pst.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }        
//    }
    
}
