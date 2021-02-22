
package QDev.com.Classes;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Leandro Rodríguez Vidal 1958205-2711
 */
public class RegistryRM {
    
    //Atributos propios
    private LocalDateTime dateHour;
    //Atributos calculados
    private int finalPrice;
    
    //Relación 1..1
    private Provider provider;
    
    //Relación 1..*
    private LinkedList<RegistryRMDetail> registryRMDetails;

    /**
     * Constructor
     * @param dateHour
     * @param provider
     * @param registryRMDetails 
     */
    public RegistryRM(LocalDateTime dateHour, Provider provider, LinkedList<RegistryRMDetail> registryRMDetails) throws Exception {
        
        //Verificación de valores validos
        
        //Verificar que existqa la fecha de ingreso de la materia prima
        if(!(dateHour != null)){
            throw new Exception("Debe existir una fecha de ingreso de la materia prima");
        }
        
        //Verificar
        if(!(provider != null)){
            throw new Exception("Debe existir un proveedor.");
        }
        
        this.dateHour = dateHour;
        this.finalPrice = 0;
        this.provider = provider;
        this.registryRMDetails = new LinkedList<>();
    }

    //Métodos Get
    public LocalDateTime getDateHour() {
        return dateHour;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public Provider getProvider() {
        return provider;
    }

    public LinkedList<RegistryRMDetail> getRegistryRMDetails() {
        return registryRMDetails;
    }
    
    //Métodos Set
    public void setDateHour(LocalDateTime dateHour) {
        this.dateHour = dateHour;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setRegistryRMDetails(LinkedList<RegistryRMDetail> registryRMDetails) {
        this.registryRMDetails = registryRMDetails;
    }
    
    /**
     * Método: addRegistryRMDetail
     * Propósito: Agregar la información de la materia prima que se va a adquirir
     */
    public void addRegistryRMDetail(RegistryRMDetail registryRMDetail){
        this.finalPrice += registryRMDetail.getTotalPrice();
        this.registryRMDetails.add(registryRMDetail); 
    }
    
    /**
     * Método: removeRegistryRMDetail
     * Propósito: Eliminar la información de la materia prima que se va a adquirir
     */
    public void removeRegistryRMDetail(RegistryRMDetail registryRMDetail){
        this.finalPrice -= registryRMDetail.getTotalPrice();
        this.registryRMDetails.remove(registryRMDetail);
    }
    
}
