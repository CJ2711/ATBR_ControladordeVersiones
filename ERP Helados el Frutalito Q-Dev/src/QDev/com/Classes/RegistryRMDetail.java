
package QDev.com.Classes;

/**
 *
 * @author Leandro Rodríguez Vidal 1958205-2711
 */
public class RegistryRMDetail {
    
    //Atributos propios
    private String name;
    private int uPrice;
    private int quantity;
    //Atributo calculado
    private int totalPrice;
    
    //Relación 1..1
    private MesuarementUnit mesuarementUnit;

    /**
     * Constructor RegistryRMDetail
     * @param name
     * @param uPrice
     * @param quantity
     * @param totalPrice
     * @param mesuarementUnit 
     */
    public RegistryRMDetail(String name, int uPrice, int quantity, int totalPrice, MesuarementUnit mesuarementUnit) throws Exception {
        
        //Verificación de valores validos
        if(!(mesuarementUnit != null)){
            throw new Exception("Se debe especificar la unidad de medida.");
        }
        
        this.setName(name);
        this.uPrice = uPrice;
        this.setQuantity(quantity);
        totalPrice = uPrice * quantity;
        this.mesuarementUnit = mesuarementUnit;
    }
    
    //Métodos Get
    public String getName() {
        return name;
    }

    public int getuPrice() {
        return uPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public MesuarementUnit getMesuarementUnit() {    
        return mesuarementUnit;
    }

    //Métodos Set
    public void setName(String name) throws Exception {
        name = name.trim();
        //Verificar que el nombre del detalle de la materia prima no sea nulo o vacío
        if(!(name != null || "".equals(name))){
            throw new Exception("Debe ingresar el nombre del detalle de la materia prima.");
        }
        this.name = name;
    }

    public void setuPrice(int uPrice) throws Exception {
        //Verificar que el precio unitario sea mayor a 0
        if(!(uPrice >= 1)){
            throw new Exception("El precio unitario debe ser mayor a 0.");
        }
        this.uPrice = uPrice;
    }
    
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
    
    public void setMesuarementUnit(MesuarementUnit mesuarementUnit) {
        this.mesuarementUnit = mesuarementUnit;
    }
    
}
