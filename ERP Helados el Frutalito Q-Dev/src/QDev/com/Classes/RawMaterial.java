
package QDev.com.Classes;

/**
 *
 * @author Leandro Rodríguez Vidal 1958205-2711
 */
public class RawMaterial {
    
    //Atributos propios
    private int idRM;
    private String nameRM;
    private int priceRM;
//    private short quantity;
    private String description;
    
    //Relación 1..1
    private MesuarementUnit mensuarementUnit;

    /**
     * Constructor RawMaterial
     * @param idRM
     * @param nameRM
     * @param quantity
     * @param description
     * @param mensuarementUnit 
     */
    public RawMaterial(int idRM, String nameRM, short quantity, String description, int priceRM, MesuarementUnit mensuarementUnit) throws Exception {
        
        //Verificación de valores validos
        if(!(mensuarementUnit != null)){
            throw new Exception("Se debe especificar la unidad de medida de la materia prima.");
        }
        
        this.setIdRM(idRM);
        this.setNameRM(nameRM);
//        this.setQuantity(quantity);
        this.setDescription(description);
        this.setPriceRM(priceRM);
        this.mensuarementUnit = mensuarementUnit;
    }

    //Métodos Get
    public int getIdRM() {
        return idRM;
    }

    public String getNameRM() {
        return nameRM;
    }

//    public short getQuantity() {
//        return quantity;
//    }

    public String getDescription() {
        return description;
    }

    public int getPriceRM() {
        return priceRM;
    }

    public MesuarementUnit getMensuarementUnit() {
        return mensuarementUnit;
    }

    //Métodos Set
    public void setIdRM(int idRM) throws Exception {
        //Verificar que el código de la materia prima sea de 3 dígitos
        if(!(idRM == 100 && idRM == 999)){
            throw new Exception("El código del la materia prima debe ser de 3 dígitos.");
        }
        this.idRM = idRM;
    }

    public void setNameRM(String nameRM) throws Exception {
        nameRM = nameRM.trim();
        //Verificar que el nombre de la materia prima no sea nulo o vacío
        if(!(nameRM != null || "".equals(nameRM))){
            throw new Exception("El nombre de la materia prima no puede ser nulo o vacío.");
        }
        this.nameRM = nameRM;
    }

//    public void setQuantity(short quantity) throws Exception {
//        //Verificar que la cantidad de la materia prima sea mayor a 0
//        if(!(quantity >= 1)){
//            throw new Exception("La cantidad de la materia prima debe ser mayor a 0.");
//        }
//        this.quantity = quantity;
//    }

    public void setDescription(String description) throws Exception {
        description = description.trim();
        //Verificar que la descripción de la materia prima no sea nula
        if(!(description != null || "".equals(nameRM))){
            throw new Exception("La descripción de la materia prima no puede ser nula.");
        }
        this.description = description;
    }

    public void setPriceRM(int priceRM) throws Exception {
        //Verificar que el precio de la materia prima sea mayor a 0
        if(!(priceRM >= 0)){
            throw new Exception("El precio de la materia prima debe ser mayor a 0");
        }
        this.priceRM = priceRM;
    }

    public void setMensuarementUnit(MesuarementUnit mensuarementUnit) {
        this.mensuarementUnit = mensuarementUnit;
    }

}
