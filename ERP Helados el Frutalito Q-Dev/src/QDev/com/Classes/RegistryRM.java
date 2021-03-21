
package QDev.com.Classes;

import java.util.LinkedList;

//Clase RegistryRM
public class RegistryRM {
    
    //Atributos propios
    private String dateHourRRM;
    //Atributos calculados
    private int finalPriceRRM;
    
    //Relación 1..1
    private Provider provider;
    
    //Relación 1..*
    private LinkedList<RegistryRMDetail> registryRMDetails;

    /**
     * Constructor
     * @param dateHourRRM
     * @param provider
     */
    public RegistryRM(String dateHourRRM, Provider provider) throws Exception {
        
        //Verificación de valores validos
        
        //Verificar que existqa la fecha de ingreso de la materia prima
        if(!(dateHourRRM != null)){
            throw new Exception("Debe existir una fecha de ingreso de la materia prima");
        }
        
        //Verificar
        if(!(provider != null)){
            throw new Exception("Debe existir un proveedor.");
        }
        
        this.dateHourRRM = dateHourRRM;
        this.finalPriceRRM = 0;
        this.provider = provider;
        this.registryRMDetails = new LinkedList<>();
    }

    //Métodos Get
    public String getDateHourRRM() {
        return dateHourRRM;
    }

    public int getFinalPriceRRM() {
        return finalPriceRRM;
    }

    public Provider getProvider() {
        return provider;
    }

    public LinkedList<RegistryRMDetail> getRegistryRMDetails() {
        return registryRMDetails;
    }
    
    //Métodos Set
    public void setDateHourRRM(String dateHourRRM) {
        this.dateHourRRM = dateHourRRM;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setRegistryRMDetails(LinkedList<RegistryRMDetail> registryRMDetails) {
        this.registryRMDetails = registryRMDetails;
    }
    
    /**
     * Método: addRRMD
     * Propósito: Agregar la información de la materia prima que se va a adquirir
     */
    public void addRRMD(RegistryRMDetail registryRMDetail){
        this.finalPriceRRM += registryRMDetail.getTotalPriceRRMD();
        this.registryRMDetails.add(registryRMDetail); 
    }
    
    /**
     * Método: removeRegistryRMDetail
     * Propósito: Eliminar la información de la materia prima que se va a adquirir
     */
    public void removeRRMD(RegistryRMDetail registryRMDetail){
        this.finalPriceRRM -= registryRMDetail.getTotalPriceRRMD();
        this.registryRMDetails.remove(registryRMDetail);
    }
    
}
