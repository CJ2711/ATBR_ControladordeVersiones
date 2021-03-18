package QDev.com.DB;

import QDev.com.Classes.IceCream;
import QDev.com.Classes.Person;
import QDev.com.Classes.Role;
import QDev.com.Classes.Sale;
import QDev.com.Classes.SaleDetail;
import com.mysql.jdbc.PreparedStatement;
import java.util.List;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
//import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author cricr
 * @author Leandro Rodriguez Vidal 1958205-2711
 */
public class ConsultaBD extends Conectar {

//    Conectar cn = new Conectar();
    PreparedStatement pst = null;
    Connection cnn = conexion();
    ResultSet rs = null;
    Person person;

    public ConsultaBD() {
        person = new Person();
    }

    public boolean loginUser(Person person) {
        String sql = "SELECT * FROM person WHERE nuip = ?"; // AND active = ?";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());

            rs = pst.executeQuery();

            if (rs.next()) {
                if (person.getPassword().equals(rs.getString(6))) {
                    person.setNames(rs.getString(2));
                    person.setSurnames(rs.getString(3));
                    person.setPhone(rs.getString(4));
                    person.setEmail(rs.getString(5));
                    person.setActiveInt(rs.getInt(7));
                    if ("SALESMAN".equals(rs.getString(8))) {
                        person.setRole(Role.SALESMAN);
                    }
                    if ("BUSINESS_ADMIN".equals(rs.getString(8))) {
                        person.setRole(Role.BUSINESS_ADMIN);
                    }
                    this.person = person;
                    System.out.println("Person: " + person);
                    return true;
                } else {
                    return false;
                }
            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //Registrar Usuario
    public boolean registerUser(Person person) {
        String sql = "INSERT INTO person (nuip, names, surnames, phone, email, "
                + "psswrd, active, nameRole) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());
            pst.setString(2, person.getNames());
            pst.setString(3, person.getSurnames());
            pst.setString(4, person.getPhone());
            pst.setString(5, person.getEmail());
            pst.setString(6, person.getPassword());
            pst.setInt(7, person.getActiveInt());
            pst.setInt(8, person.getRole().ordinal());

            pst.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean searchIC(IceCream iceCream) {
        String sql = "SELECT * FROM icecream WHERE idIC = ?";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, iceCream.getIdIceCream());

            rs = pst.executeQuery();

            if (rs.next()) {
                iceCream.setNameIceCream(rs.getString(2));
                return true;
            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registerSaleAndDetail(Sale sale, LinkedList<SaleDetail> saleDetails) {

        if (loginUser(person)) {
            sale.setPerson(person);
        }

        Date date = new Date();
        DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        System.out.println("Date: " + date);
        System.out.println("DF: " + dF.format(date));
        System.out.println("Sale Date: " + sale.getSaleId());

        String sqlS = "INSERT INTO sale (dateHourS, totalPrice, nuipPerson) VALUES (?, ?, ?)";
        String sqlSD = "INSERT INTO saledetail (quantity, totalPrice, dateHourSale, idICream) VALUES (?, ?, ?, ?)";

        try {
            pst = (PreparedStatement) cnn.prepareStatement(sqlS);
            pst.setDate(1, (java.sql.Date) date.from(Instant.now()));
            pst.setInt(2, sale.getTotalPrice());
            pst.setInt(3, (int) person.getNuip());
            pst.execute();
            
            pst = null;

            pst = (PreparedStatement) cnn.prepareStatement(sqlSD);
            for (SaleDetail saleDetail : saleDetails) {
                pst.setInt(1, (int) saleDetail.getQuantity());
                pst.setInt(2, saleDetail.getTotalPrice());
                pst.setString(3, dF.format(date));
                pst.setInt(4, saleDetail.getIceCream().getIdIceCream());
                pst.execute();
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

//    public boolean sumSD(SaleDetail saleDetail) {
//        String sql = "SELECT sum(totalPrice) FROM saledetail"; //Falta Where
//        try {
//            pst = (PreparedStatement) cnn.prepareStatement(sql);
//            
//            rs = pst.executeQuery();
//            
//            if (rs.next()){
//                return true;
//            }
//            
//            return false;
//                
//        } catch (SQLException ex) {
//            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
}
