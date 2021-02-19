
package QDev.com.Classes;

import java.util.Date;



/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class Production {
    
    //Atributos propios 
    private Date date;
    private int quantityProduction;
   
    
    //Relación 1...1
    private Person person;
    private IceCream iceCream;

    /**
     * Constructor
     * @param date
     * @param quantityProduction
     * @param person
     * @param iceCream 
     */
    public Production(Date date, int quantityProduction, Person person, IceCream iceCream) throws Exception {
        
        //Valores Validos
        
        //Valores validos para date
        if(date == null){
            throw new Exception("Debe existir una fecha de produccion");
        }
        
        //Valores validos para cantidad 
        if(!(quantityProduction >= 1)){//Si la canridad no es mayor o igual a 1 entonces ....
            throw new Exception("La cantidad debe ser mayor o igual a 1");
        }
        
        //Valores validos para person
        if(person == null){
            throw new Exception("Debe existir una persona para produccion");
        }
        
        //Valores validos para iceCream
        if(iceCream == null){
            throw new Exception("Deben existir Helados en la produccion");
        }
        
        this.date = date;
        this.quantityProduction = quantityProduction;
        this.person = person;
        this.iceCream = iceCream;
    }

    //Metodos Get
    public Date getDate() {
        return date;
    }

    public int getQuantityProduction() {
        return quantityProduction;
    }

    public Person getPerson() {
        return person;
    }

    public IceCream getIceCream() {
        return iceCream;
    }
    
    
    //Metodos Set
    public void setDate(Date date) {
        this.date = date;
    }

    public void setQuantityProduction(int quantityProduction) {
        this.quantityProduction = quantityProduction;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
    
}
