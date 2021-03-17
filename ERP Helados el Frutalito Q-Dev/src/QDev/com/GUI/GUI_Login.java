package QDev.com.GUI;

import QDev.com.Classes.Person;
import QDev.com.DB.ConsultaBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cricr
 * @author Leandro Rodriguez Vidal 1958205-2711
 */
public class GUI_Login extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private Person person;
    
    /**
     * Creates new form GUI_Login
     */
    public GUI_Login(ConsultaBD cBD, Person person) {
        this.cBD = cBD;
        this.person = person;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        psswrdField = new javax.swing.JPasswordField();
        btn_Ayuda = new javax.swing.JButton();
        btn_Entrar = new javax.swing.JButton();
        btn_Contacto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP-El Frutalito");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿ha olvidado su contraseña?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio de Sesión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        tf_User.setToolTipText("Usuario");
        getContentPane().add(tf_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 210, 30));
        getContentPane().add(psswrdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 30));

        btn_Ayuda.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btn_Ayuda.setText("AYUDA");
        btn_Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, -1));

        btn_Entrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        btn_Contacto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btn_Contacto.setText("CONTACTO");
        btn_Contacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        JFrame GUI_Inicio = null;

        //Busqueda del usuario
        String psswrd = new String(psswrdField.getPassword());

        if (!tf_User.getText().equals("") && !psswrdField.equals("")) {

            try {
                person.setNuip(Integer.parseInt(tf_User.getText()));
                person.setPassword(psswrd);
                
                if (cBD.loginUser(person) == true) {
                    if (person.getActiveInt()== 1) {
                        this.dispose();
                        if (person.getRole().ordinal() == 1) {
                            if (GUI_Inicio == null) {
                                GUI_Inicio = new GUI_Vendor(person);
                            }
                            GUI_Inicio.setVisible(true);
                        }
                        if (person.getRole().ordinal() == 2) {
                            if (GUI_Inicio == null) {
                                GUI_Inicio = new GUI_Admin();
                            }
                            GUI_Inicio.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no activo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario (Número de identificación)"
                            + " y/o contraseña incorrectos. Verifique los datos ingresados.");
                }
//                person = null;
//                person = new Person();
            } catch (Exception ex) {
                Logger.getLogger(GUI_Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el usuario y/o contraseña");
        }
    }//GEN-LAST:event_btn_EntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ayuda;
    private javax.swing.JButton btn_Contacto;
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField psswrdField;
    private javax.swing.JTextField tf_User;
    // End of variables declaration//GEN-END:variables
}
