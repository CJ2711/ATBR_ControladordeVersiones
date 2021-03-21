
package QDev.com.Classes;

//Clase Production
public class Production {
    
    //Atributos propios 
    private String dateHourProd;
    private int quantityProd;
   
    
    //Relación 1...1
    private Person person;
    private IceCream iceCream;

    /**
     * Constructor
     * @param dateHourProd
     * @param quantityProd
     * @param person
     * @param iceCream 
     */
    public Production(String dateHourProd, int quantityProd, Person person, IceCream iceCream) throws Exception {
        
        //Valores Validos
        
        //Valores validos para dateHourProd
        if(dateHourProd == null){
            throw new Exception("Debe existir una fecha de produccion");
        }
        
        //Valores validos para cantidad 
        if(!(quantityProd >= 1)){//Si la canridad no es mayor o igual a 1 entonces ....
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
        
        this.dateHourProd = dateHourProd;
        this.quantityProd = quantityProd;
        this.person = person;
        this.iceCream = iceCream;
    }

    //Metodos Get
    public String getDateHourProd() {
        return dateHourProd;
    }

    public int getQuantityProd() {
        return quantityProd;
    }

    public Person getPerson() {
        return person;
    }

    public IceCream getIceCream() {
        return iceCream;
    }
    
    
    //Metodos Set
    public void setDateHourProd(String dateHourProd) {
        this.dateHourProd = dateHourProd;
    }

    public void setQuantityProd(int quantityProd) {
        this.quantityProd = quantityProd;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
    
}
