package QDev.com.Classes;

//Clase SaleDetail
public class SaleDetail {

    //Atributos propios 
    private int quantitySD;
    //Atributos calculados
    private int totalPriceSD;

    //Relación 1.....1
    private IceCream iceCream;

    /**
     * Constructor
     *
     * @param quantitySD
     * @param iceCream
     */
    public SaleDetail(int quantitySD, IceCream iceCream) throws Exception {

        //Valores Validos 
        //  Valores validos para quantitySD
        if (!(quantitySD >= 1)) {//Si la cantidad no es mayor o igual a 1 entonces...
            throw new Exception("La cantidad debe ser mayor a 0");
        }

        //Valores validos para IceCream 
        if (iceCream == null) {
            throw new Exception("Debe existir al menos un Helado");
        }

        this.quantitySD = quantitySD;
        this.iceCream = iceCream;

        /**
         * Uso del atributo calculado: Calcular el costo total de la venta
         * dependiendo la cantidad de helados que se pida. En este caso los
         * helados tienen un costo fijo de 5000 pesos cada uno, así que se
         * multiplica los 5000 por la cantidad que pidan. Ej: 5000 * 3 = 15000
         */
        totalPriceSD = 5000 * this.quantitySD;

    }

    //Metodos Get
    public int getQuantitySD() {
        return quantitySD;
    }

    public int getTotalPriceSD() {
        return totalPriceSD;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    //Metodos Set
    public void setQuantitySD(int quantitySD) {
        this.quantitySD = quantitySD;
    }

//    public void setTotalPrice(int totalPriceSD) {
//        this.totalPriceSD = totalPriceSD;
//    }
//
//    public void setIceCream(IceCream iceCream) {
//        this.iceCream = iceCream;
//    }

    public void setTotalPriceSD(int totalPriceSD) throws Exception {
        //  Valores validos para quantitySD
        if (!(quantitySD >= 1)) {//Si la cantidad no es mayor o igual a 1 entonces...
            throw new Exception("La cantidad debe ser mayor a 0");
        }
        this.totalPriceSD = totalPriceSD;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String toString() {
        return "SaleDetail{" + "quantity=" + quantitySD + ", totalPrice=" + totalPriceSD + ", iceCream=" + iceCream + '}';
    }
    
}
