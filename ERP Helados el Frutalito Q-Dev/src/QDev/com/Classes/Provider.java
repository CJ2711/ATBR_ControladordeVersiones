
package QDev.com.Classes;

//Clase Provider
public class Provider {
    
    //Atributos propios
    private String idProv;
    private String nameProv;

    /**
     * Constructor Provider
     * @param idProv
     * @param nameProv 
     */
    public Provider(String idProv, String nameProv) throws Exception {
        this.setIdProv(idProv);
        this.setNameProv(nameProv);
    }

    //Métodos Get
    public String getIdProv() {
        return idProv;
    }
    
    public String getNameProv() {
        return nameProv;
    }

    //Métodos Set
    public void setIdProv(String idProv) throws Exception {
        idProv = idProv.trim();
        //Verificar si el nombre del proveedor no es nulo o no está vacío
        if (!(idProv != null || "".equals(idProv))){
            throw new Exception("Debe de ingresar el número de identificación personal o tributaria del proveedor.");
        }
        this.idProv = idProv;
    }

    public void setNameProv(String nameProv) throws Exception {
        nameProv = nameProv.trim();
        //Verificar si el nombre del proveedor no es nulo o no está vacío
        if(!(nameProv != null || "".equals(nameProv))){
            throw new Exception("Debe ingresar el nombre del proveedor.");
        }
        this.nameProv = nameProv;
    }
    
    
    
}
