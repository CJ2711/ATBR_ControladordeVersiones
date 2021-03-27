package QDev.com.Classes;

import java.util.LinkedList;

//Clase Sale
public class Sale {

    //Atributos Propios 
    private String dateHourS;
    private int totalPriceS;
    
    //Relación 1... 1
    private Person person;
    
    //Relación 1... *
    private LinkedList<SaleDetail> saleDetails;
    
    /**
     * Constructor
     *
     * @param dateHourS
     * @param person
     * @param saleDetails
     */
    public Sale(String dateHourS, Person person) throws Exception {

        //Valores Validos 
        //Valores validos para saleID
        if (dateHourS == null) {//Si dateHourS es nulo... entonces..
            throw new Exception("Debe existir una fecha de venta");
        }

        //Valores validos para person
        if (person == null) {//Si persona es igual a nulo entonces....
            throw new Exception("Persona no puede ser nulo");
        }

        this.dateHourS = dateHourS;
        this.person = person;
        this.saleDetails = new LinkedList<>();
        this.totalPriceS = 0;
    }

    public Sale(Person person) throws Exception {
        this.saleDetails = new LinkedList<>();
    }
    
    //Metodos Get
    public String getDateHourS() {
        return dateHourS;
    }

    public Person getPerson() {
        return person;
    }

    public int getTotalPriceS() {
        return totalPriceS;
    }

    public LinkedList<SaleDetail> getSaleDetails() {
        return saleDetails;
    }

    //Matodos Set
    public void setDateHourS(String dateHourS) {
        this.dateHourS = dateHourS;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTotalPriceS(int totalPriceS) {
        this.totalPriceS = totalPriceS;
    }

    public void setSaleDetails(LinkedList<SaleDetail> saleDetails) {
        this.saleDetails = saleDetails;
    }

    /**
     * Metodo agregar detalle compra
     *
     * @param saleDetail
     */
    public void addSD(SaleDetail saleDetail) {
        this.totalPriceS += saleDetail.getTotalPriceSD();
        this.saleDetails.add(saleDetail);
    }

    /**
     * Metodo para eliminar detalle compra
     *
     * @param saleDetail
     */
    public void removeSD(SaleDetail saleDetail) {
        
        this.saleDetails.remove(saleDetail);
    }

    @Override
    public String toString() {
        return "Sale{" + "saleId=" + dateHourS + ", totalPrice=" + totalPriceS + ", person=" + person + ", saleDetails=" + saleDetails + '}';
    }
    
}
