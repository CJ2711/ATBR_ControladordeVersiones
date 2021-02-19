package QDev.com.Classes;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class Sale {

    //Atributos Propios 
    private LocalDateTime saleId;
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
    public Sale(LocalDateTime saleId, Person person, LinkedList<SaleDetail> saleDetails) throws Exception {

        //Valores Validos 
        //Valores validos para saleID
        if (saleId == null) {//Si saleId es nulo... entonces..
            throw new Exception("Debe existir una fecha de venta");
        }

        //Valores validos para person
        if (person == null) {//Si persona es igual a nulo entonces....
            throw new Exception("Persona no puede ser nulo");
        }

        this.saleId = saleId;
        this.person = person;
        this.saleDetails = saleDetails;
    }

    //Metodos Get
    public LocalDateTime getSaleId() {
        return saleId;
    }

    public Person getPerson() {
        return person;
    }

    public LinkedList<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    //Matodos Set
    public void setSaleId(LocalDateTime saleId) {
        this.saleId = saleId;
    }

    public void setPerson(Person person) {
        this.person = person;
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

}
