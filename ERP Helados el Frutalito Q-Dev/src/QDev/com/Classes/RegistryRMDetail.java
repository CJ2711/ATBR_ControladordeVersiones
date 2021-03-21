
package QDev.com.Classes;

//Clase RegistryRMDetail
public class RegistryRMDetail {
    
    //Atributos propios
    private String nameRRMD;
    private int uPriceRRMD;
    private int quantityRRMD;
    //Atributo calculado
    private int totalPriceRRMD;
    
    //Relación 1..1
    private MesuarementUnit mesuarementUnit;

    /**
     * Constructor RegistryRMDetail
     * @param nameRRMD
     * @param uPriceRRMD
     * @param quantityRRMD
     * @param totalPriceRRMD
     * @param mesuarementUnit 
     */
    public RegistryRMDetail(String nameRRMD, int uPriceRRMD, int quantityRRMD, int totalPriceRRMD, MesuarementUnit mesuarementUnit) throws Exception {
        
        //Verificación de valores validos
        if(!(mesuarementUnit != null)){
            throw new Exception("Se debe especificar la unidad de medida.");
        }
        
        this.setNameRRMD(nameRRMD);
        this.uPriceRRMD = uPriceRRMD;
        this.setQuantityRRMD(quantityRRMD);
        totalPriceRRMD = this.uPriceRRMD * this.quantityRRMD;
        this.mesuarementUnit = mesuarementUnit;
    }
    
    //Métodos Get
    public String getNameRRMD() {
        return nameRRMD;
    }

    public int getuPriceRRMD() {
        return uPriceRRMD;
    }

    public int getQuantityRRMD() {
        return quantityRRMD;
    }

    public int getTotalPriceRRMD() {
        return totalPriceRRMD;
    }

    public MesuarementUnit getMesuarementUnit() {    
        return mesuarementUnit;
    }

    //Métodos Set
    public void setNameRRMD(String nameRRMD) throws Exception {
        nameRRMD = nameRRMD.trim();
        //Verificar que el nombre del detalle de la materia prima no sea nulo o vacío
        if(!(nameRRMD != null || "".equals(nameRRMD))){
            throw new Exception("Debe ingresar el nombre del detalle de la materia prima.");
        }
        this.nameRRMD = nameRRMD;
    }

    public void setuPriceRRMD(int uPriceRRMD) throws Exception {
        //Verificar que el precio unitario sea mayor a 0
        if(!(uPriceRRMD >= 1)){
            throw new Exception("El precio unitario debe ser mayor a 0.");
        }
        this.uPriceRRMD = uPriceRRMD;
    }
    
    public void setQuantityRRMD(int quantityRRMD) throws Exception {
        //Verificar que la cantidad de la materia en el detalle del registro sea mayor a 0
        if(!(quantityRRMD >= 1)){
            throw new Exception("La cantidad de la materia prima en el detalle del registro"
                    + "debe ser mayor a 0");
        }
        this.quantityRRMD = quantityRRMD;
    }

    public void setTotalPriceRRMD(int totalPriceRRMD) {
        this.totalPriceRRMD = totalPriceRRMD;
    }
    
    public void setMesuarementUnit(MesuarementUnit mesuarementUnit) {
        this.mesuarementUnit = mesuarementUnit;
    }
    
}
