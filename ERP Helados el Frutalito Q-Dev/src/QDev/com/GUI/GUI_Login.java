/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

/**
 *
 * @author cricr
 */
public class GUI_Login extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Login
     */
    public GUI_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        tf_Password = new javax.swing.JTextField();
        btn_Ayuda = new javax.swing.JButton();
        btn_Entrar = new javax.swing.JButton();
        btn_Contacto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        tf_Password.setToolTipText("Contraseña");
        getContentPane().add(tf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 30));

        btn_Ayuda.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btn_Ayuda.setText("AYUDA");
        getContentPane().add(btn_Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, -1));

        btn_Entrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_Entrar.setText("Entrar");
        getContentPane().add(btn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        btn_Contacto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btn_Contacto.setText("CONTACTO");
        getContentPane().add(btn_Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Fondo_Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ayuda;
    private javax.swing.JButton btn_Contacto;
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_Password;
    private javax.swing.JTextField tf_User;
    // End of variables declaration//GEN-END:variables
}
