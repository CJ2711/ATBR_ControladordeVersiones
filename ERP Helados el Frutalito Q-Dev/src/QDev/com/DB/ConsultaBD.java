
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
        String sql = "SELECT nuip, names, surnames, phone, email, psswrd, active, "
                + "nameRole FROM person WHERE nuip = ?"; //AND active = ?
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());
//            pst.setBoolean(2, person.isActive());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                if(person.getPassword().equals(rs.getString(6))){
                    person.setNames(rs.getString(2));
                    person.setSurnames(rs.getString(3));
                    person.setPhone(rs.getString(4));
                    person.setEmail(rs.getString(5));
                    person.setActive(rs.getBoolean(7));
                    if("SALESMAN".equals(rs.getString(8))){
                        person.setRole(Role.SALESMAN);
                    }
                    if("BUSINESS_ADMIN".equals(rs.getString(8))){
                        person.setRole(Role.BUSINESS_ADMIN);
                    }
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
                + "pssword, active, nameRole) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            pst.setString(9, person.getRole().name());
            
            pst.execute(); 
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Cargar tabla de la interfaz 'GUI_UserManagement'
//    public void loadUsersTable(){
//        String [] registries = new String[8];
//        
//        String sql = "SELECT * FROM person";
//        
//        try {
//            pst = (PreparedStatement) cnn.createStatement();
//            rs = pst.executeQuery(sql);
//            
//            while(rs.next()){
//                registries[0] = rs.getString(1);
//                registries[1] = rs.getString(2);
//                registries[2] = rs.getString(3);
//                registries[3] = rs.getString(4);
//                registries[4] = rs.getString(5);
//                registries[5] = rs.getString(6);
//                registries[6] = rs.getString(7);
//                registries[7] = rs.getString(8);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    
}
