package QDev.com.Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class Sale {

    //Atributos Propios 
    private String saleId;
    private int totalPrice;
    
    //Relación 1... 1
    private Person person;
    
    //Relación 1... *
    private LinkedList<SaleDetail> saleDetails;
    
    /**
     * Constructor
     *
     * @param saleId
     * @param person
     * @param saleDetails
     */
    public Sale(String saleId, Person person) throws Exception {

        //Valores Validos 
        //Valores validos para saleID
        if (saleId == null) {//Si saleId es nulo... entonces..
            throw new Exception("Debe existir una fecha de venta");
        }

        //Valores validos para person
        if (person == null) {//Si persona es igual a nulo entonces....
            throw new Exception("Persona no puede ser nulo");
        }

        this.saleId = Date.from(Instant.now()).toString();
        this.person = person;
        this.saleDetails = new LinkedList<>();
        this.totalPrice = 0;
    }

    public Sale(Person person) throws Exception {
//        this(Date.from(Instant.now()), person);
        this.saleDetails = new LinkedList<>();
    }
    
    //Metodos Get
    public String getSaleId() {
        return saleId;
    }

    public Person getPerson() {
        return person;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public LinkedList<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    //Matodos Set
    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSaleDetails(LinkedList<SaleDetail> saleDetails) {
        this.saleDetails = saleDetails;
    }

    /**
     * Metodo agregar detalle compra
     *
     * @param saleDetail
     */
    public void addSaleDetail(SaleDetail saleDetail) {
        this.totalPrice += saleDetail.getTotalPrice();
        this.saleDetails.add(saleDetail);
    }

    /**
     * Metodo para eliminar detalle compra
     *
     * @param saleDetail
     */
    public void removeSaleDetail(SaleDetail saleDetail) {
        
        this.saleDetails.remove(saleDetail);
    }

    @Override
    public String toString() {
        return "Sale{" + "saleId=" + saleId + ", totalPrice=" + totalPrice + ", person=" + person + ", saleDetails=" + saleDetails + '}';
    }
    
}
