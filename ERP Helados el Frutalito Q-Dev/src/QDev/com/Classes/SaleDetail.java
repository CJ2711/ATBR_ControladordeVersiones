package QDev.com.Classes;

/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class SaleDetail {

    //Atributos propios 
    private int quantity;
    //Atributos calculados
    private int totalPrice;

    //Relación 1.....1
    private IceCream iceCream;

    /**
     * Constructor
     *
     * @param quantity
     * @param iceCream
     */
    public SaleDetail(int quantity, IceCream iceCream) throws Exception {

        //Valores Validos 
//        //  Valores validos para quantity
//        if (!(quantity >= 1)) {//Si la cantidad no es mayor o igual a 1 entonces...
//            throw new Exception("La cantidad debe ser mayor a 0");
//        }

        //Valores validos para IceCream 
        if (iceCream == null) {
            throw new Exception("Debe existir al menos un Helado");
        }

        this.quantity = quantity;
        this.iceCream = iceCream;

        /**
         * Uso del atributo calculado: Calcular el costo total de la venta
         * dependiendo la cantidad de helados que se pida. En este caso los
         * helados tienen un costo fijo de 5000 pesos cada uno, así que se
         * multiplica los 5000 por la cantidad que pidan. Ej: 5000 * 3 = 15000
         */
        totalPrice = 5000 * this.quantity;

    }

    //Metodos Get
    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    //Metodos Set
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public void setTotalPrice(int totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public void setIceCream(IceCream iceCream) {
//        this.iceCream = iceCream;
//    }

    public void setTotalPrice(int totalPrice) throws Exception {
        //  Valores validos para quantity
        if (!(quantity >= 1)) {//Si la cantidad no es mayor o igual a 1 entonces...
            throw new Exception("La cantidad debe ser mayor a 0");
        }
        this.totalPrice = totalPrice;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String toString() {
        return "SaleDetail{" + "quantity=" + quantity + ", totalPrice=" + totalPrice + ", iceCream=" + iceCream + '}';
    }
    
}
