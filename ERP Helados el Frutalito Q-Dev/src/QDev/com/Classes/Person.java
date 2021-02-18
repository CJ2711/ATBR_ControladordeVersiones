package QDev.com.Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Keren Rodas Ortiz 1957601-2711
 */
public class Person {

    //Atributos propios 
    private long nuip;
    private String names;
    private String surnames;
    private String phone;
    private String email;
    private String user;
    private String password;
    private boolean active;

    //Relación 1.....1
    private Role role;

    /**
     * Construtctor
     *
     * @param nuip
     * @param names
     * @param surnames
     * @param phone
     * @param email
     * @param user
     * @param password
     * @param active
     * @param role
     */
    public Person(long nuip, String names, String surnames, String phone, String email, String user, String password, boolean active, Role role) throws Exception {

        /**
         * Verificación de valores validos para la identificación (nuip) El
         * Número Único de Idetificación Personal (nuip) Es es de 7, 8 y 10
         * dígitos
         */
        String nuipString = Long.toString(nuip);//Se hace la conversión de Long a String.
        if (!(nuipString.length() == 7 || nuipString.length() == 8 || nuipString.length() == 10)) {
            throw new NumberFormatException("El número de identificación ingresado no es valido.\n"
                    + "El número de identificaación ingresado:" + nuip);
        }

        /**
         * La verificación de los Nombres y Apellidos se encuentra en el método
         * fullNameVerification. Los Nombres no ha de quedar en blanco(nulo o
         * vacío), y no debe contener números.
         */
        fullNameVerification(names);
        fullNameVerification(surnames);

        //Verificación valores validos de Phone 
        if (phone == null || phone.trim().equals("")) {//No puede ser nulo o vacío
            throw new Exception("Ingrese un número de contacto");
        }

        if (!(Pattern.matches("\\d{7}", phone) //Verificación para Teléfonos fijos.
                || Pattern.matches("\\d{10}", phone) //Verificación para Teléfonos Celualres.
                )) {
            throw new Exception("Número de contaco no válido.\n"
                    + "Recuerde que son 7 cifras si es un teléfono fijo, "
                    + "o 10 si es un teléfono movil.\n"
                    + "Usted ingresó: " + phone);
        }
        
        //Verificación de valores validos para email
        if(email == null || email.trim().equals("")){
            throw new Exception("Ingrese el correo");
        }
        if(emailVerification(email)== false){
            throw new Exception ("El valor ingresado no es un correo");
        }
        emailVerification(email);//Método validar el correo 

        //Verificación para el usuario
        if(user == null || user.trim().equals("")){
            throw new Exception ("Ingrese el usuario");
        }
        
        //Verificación para password(contraseña)
        if(password == null || password.trim().equals("")){
            throw new Exception ("Ingrese la contraseña");
        }
        

        //Verificación de valores validos para el rol
        if (role == null || role == Role.SELECCIONE) {
            throw new Exception("Debe seleccionar el rol");
        }

        this.nuip = nuip;
        this.names = names;
        this.surnames = surnames;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    /**
     * Método fullNameVerification(void) Propósito: Realizar la verificación de
     * los valores validos tanto para los nombres como para los apellidos
     *
     * @param fullName
     * @throws Exception
     */
    private void fullNameVerification(String fullName) throws Exception {
        fullName = fullName.trim();
        if (fullName == null || "".equals(fullName)) {
            throw new Exception("El(Los) Nombre(s) o Apellido(s) no deben quedar en blanco.");
        }

        /**
         * Verificación para el Patrón de Caracteres: De la A-Z MAYÚSCULA, de la
         * a-z minúscula, caracteres con tíldes, la Ñ Mayúscula y minúscula,
         * espacios, y los caracteres pueden repetirse 0 o más veces (*).
         */
        if (!Pattern.matches("[A-Za-zÁáÉéÍíÓóÚúÝýÑñ ]*", fullName)) {
            throw new IllegalArgumentException("El(Los) Nombre(s) y Apellido(s) ingresados no deben contener números"
                    + "Ingresó:" + fullName);
        }
    }

    /**
     * Método: emailVerification
     * Poder tener varios caracteres validos 
     * @param email
     * @return 
     */
    public boolean emailVerification(String email) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = patron.matcher(email);
        return matcher.find();
    }

    //Metodos Get
    public long getNuip() {
        return nuip;
    }

    public String getNames() {
        return names;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }


    public Role getRole() {
        return role;
    }

    //Metodos Set
    public void setNuip(long nuip) {
        this.nuip = nuip;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
