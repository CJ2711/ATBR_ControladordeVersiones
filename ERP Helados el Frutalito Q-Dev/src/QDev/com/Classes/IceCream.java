package QDev.com.Classes;

//Clase IceCream
public class IceCream {

    //Atributos propios 
    private int idIC;
    private String nameIC;

    /**
     * Constructor vacío
     */
    public IceCream() {
    }

    /**
     * Constructor
     *
     * @param idIceCream
     * @param nameIceCream
     */
    public IceCream(int idIceCream, String nameIceCream) throws Exception {

        //Valores Validos 
        //Valores validos para idIC 
//        if (!(idIC >= 100 && idIC <= 999)) {
//            throw new Exception("El codigo debe tener 3 digitos");
//        }

//        //Valores validos para nameIC
//        if (nameIC == null || nameIC.trim().equals("")) {
//            throw new Exception("Debe ingresar el nombre del helado");
//        }

        this.idIC = idIceCream;
//        this.nameIC = nameIC;
//          this.setIdIceCream(idIC);
          this.setNameIC(nameIceCream);
    }

    //Metodos Get
    public int getIdIC() {
        return idIC;
    }

    public String getNameIC() {
        return nameIC;
    }

//    //Metodos Set
//    public void setIdIceCream(int idIC) {
//        this.idIC = idIC;
//    }
//
//    public void setNameIceCream(String nameIC) {
//        this.nameIC = nameIC;
//    }
    //Metodos Set
    public void setIdIC(int idIC) throws Exception {
        //Valores validos para idIC 
//        if (!(idIC >= 100 && idIC <= 999)) {
//            throw new Exception("El codigo debe tener 3 digitos");
//        }
        this.idIC = idIC;
    }

    public void setNameIC(String nameIC) throws Exception {
        //Valores validos para nameIC
        if (nameIC == null || nameIC.trim().equals("")) {
            throw new Exception("Debe ingresar el nombre del helado");
        }
        this.nameIC = nameIC;
    }

    @Override
    public String toString() {
        return "IceCream{" + "idIceCream=" + idIC + ", nameIceCream=" + nameIC + '}';
    }

}
