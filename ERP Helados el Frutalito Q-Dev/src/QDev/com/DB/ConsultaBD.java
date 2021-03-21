package QDev.com.DB;

import QDev.com.Classes.IceCream;
import QDev.com.Classes.Person;
import QDev.com.Classes.Role;
import QDev.com.Classes.Sale;
import QDev.com.Classes.SaleDetail;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Clase ConsultaBD
public class ConsultaBD extends Conectar {
    
    PreparedStatement pst = null;
    Connection cnn = conexion();
    ResultSet rs = null;
    Person person;

    public ConsultaBD() {
        person = new Person();
    }

    public Person getPerson() {
        return person;
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
                    if ("ADMINISTRADOR".equals(rs.getString(8))) {
                        person.setRole(Role.ADMINISTRADOR);
                    }
                    if ("VENDEDOR".equals(rs.getString(8))) {
                        person.setRole(Role.VENDEDOR);
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
                + "psswrd, nameRole) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = (PreparedStatement) cnn.prepareStatement(sql);
            pst.setInt(1, (int) person.getNuip());
            pst.setString(2, person.getNames());
            pst.setString(3, person.getSurnames());
            pst.setString(4, person.getPhone());
            pst.setString(5, person.getEmail());
            pst.setString(6, person.getPassword());
            pst.setInt(7, person.getRole().ordinal());

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
            pst.setInt(1, iceCream.getIdIC());

            rs = pst.executeQuery();

            if (rs.next()) {
                iceCream.setNameIC(rs.getString(2));
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

        sale.setPerson(person);

        Date date = new Date();
        DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Date: " + date);
        System.out.println("DF: " + dF.format(date));
        System.out.println("Sale Date: " + sale.getDateHourS());

        String sqlS = "INSERT INTO sale (dateHourS, nuipPerson, totalPrice) VALUES (?, ?, ?)";
        String sqlSD = "INSERT INTO saledetail (dateHourSale, idICream, quantity, totalPrice) VALUES (?, ?, ?, ?)";

        try {
            pst = (PreparedStatement) cnn.prepareStatement(sqlS);
            pst.setString(1, dF.format(date));
            pst.setInt(2, (int) sale.getPerson().getNuip());
            pst.setInt(3, sale.getTotalPriceS());
            pst.execute();

            pst = null;

            pst = (PreparedStatement) cnn.prepareStatement(sqlSD);
            for (SaleDetail saleDetail : saleDetails) {
                pst.setString(1, dF.format(date));
                pst.setInt(2, saleDetail.getIceCream().getIdIC());
                pst.setInt(3, saleDetail.getQuantitySD());
                pst.setInt(4, saleDetail.getTotalPriceSD());
                pst.execute();
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
