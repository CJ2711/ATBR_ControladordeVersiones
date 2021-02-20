
package QDev.com.Classes;

/**
 *
 * @author Leandro Rodríguez Vidal 1958205-2711
 */
public class RegistryRMDetail {
    
    //Atributos propios
    private int quantity;
    //Atributo calculado
    private int totalPrice;

    //Relación 1..1
    private RawMaterial rawMaterial;

    /**
     * Constructor RegistryRMDetail
     * @param quantity
     * @param totalPrice
     * @param rawMaterial 
     */
    public RegistryRMDetail(int quantity, int totalPrice, RawMaterial rawMaterial) throws Exception {
        
        //Verificación de valores validos
        if(!(rawMaterial != null)){
            throw new Exception("Se debe especificar la materia prima.");
        }
        
        this.setQuantity(quantity);
        totalPrice = rawMaterial.getPriceRM() * quantity;
        this.rawMaterial = rawMaterial;
    }

    //Métodos Get
    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }
    
    //Métodos Set
    public void setQuantity(int quantity) throws Exception {
        //Verificar que la cantidad de la materia en el detalle del registro sea mayor a 0
        if(!(quantity >= 1)){
            throw new Exception("La cantidad de la materia prima en el detalle del registro"
                    + "debe ser mayor a 0");
        }
        this.quantity = quantity;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }
    
    
}
