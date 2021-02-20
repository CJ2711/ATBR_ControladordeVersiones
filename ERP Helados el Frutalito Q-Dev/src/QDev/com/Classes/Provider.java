
package QDev.com.Classes;

/**
 *
 * @author Leandro Rodriguez Vidal 1958205-2711
 */

//Clase Provider
public class Provider {
    
    //Atributos propios
    private String idProvider;
    private String nameProvider;

    /**
     * Constructor Provider
     * @param idProvider
     * @param nameProvider 
     */
    public Provider(String idProvider, String nameProvider) throws Exception {
        this.setIdProvider(idProvider);
        this.setNameProvider(nameProvider);
    }

    //Métodos Get
    public String getIdProvider() {
        return idProvider;
    }
    
    public String getNameProvider() {
        return nameProvider;
    }

    //Métodos Set
    public void setIdProvider(String idProvider) throws Exception {
        idProvider = idProvider.trim();
        //Verificar si el nombre del proveedor no es nulo o no está vacío
        if (!(idProvider != null || "".equals(idProvider))){
            throw new Exception("Debe de ingresar el número de identificación personal o tributaria del proveedor.");
        }
        this.idProvider = idProvider;
    }

    public void setNameProvider(String nameProvider) throws Exception {
        nameProvider = nameProvider.trim();
        //Verificar si el nombre del proveedor no es nulo o no está vacío
        if(!(nameProvider != null || "".equals(nameProvider))){
            throw new Exception("Debe ingresar el nombre del proveedor.");
        }
        this.nameProvider = nameProvider;
    }
    
    
    
}
