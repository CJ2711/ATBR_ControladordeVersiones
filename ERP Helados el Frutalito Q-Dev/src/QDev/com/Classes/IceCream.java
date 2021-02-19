package QDev.com.Classes;

/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class IceCream {

    //Atributos propios 
    private int idIceCream;
    private String nameIceCream;

    /**
     * Constructor
     *
     * @param idIceCream
     * @param nameIceCream
     */
    public IceCream(int idIceCream, String nameIceCream) throws Exception {

        //Valores Validos 
        //Valores validos para idIceCream 
        if (!(idIceCream >= 100 && idIceCream <= 999)) {
            throw new Exception("El codigo debe tener 3 digitos");
        }

        //Valores validos para nameIceCream
        if (nameIceCream == null || nameIceCream.trim().equals("")) {
            throw new Exception("Debe ingresar el nombre del helado");
        }

        this.idIceCream = idIceCream;
        this.nameIceCream = nameIceCream;
    }

    //Metodos Get
    public int getIdIceCream() {
        return idIceCream;
    }

    public String getNameIceCream() {
        return nameIceCream;
    }

    //Metodos Set
    public void setIdIceCream(int idIceCream) {
        this.idIceCream = idIceCream;
    }

    public void setNameIceCream(String nameIceCream) {
        this.nameIceCream = nameIceCream;
    }

}
