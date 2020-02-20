/*
*   PROYECTO : ALERTAS TEMPRANAS DE BAJO RENDIMIENTO
*   Institucion: Universidad del Valle Sede Palmira
*   Autores:
*           Christian Joel Barbosa Bolaños 1958266-2711
*           Alejandro Castro Romero        1958283-2711
*           Keren Rodas Ortíz              1957601-2711
*           Leandro Rodriguez Vidal        1958205-2711
*
 */
package ventanas;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public static String username = "";
    public static String password = "";

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento Login");
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_Usuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Ingresar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel_FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in_Usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        in_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(in_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, -1));

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Button_Ingresar.setBackground(new java.awt.Color(204, 204, 204));
        Button_Ingresar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Button_Ingresar.setText("Ingresar");
        Button_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordar Usuario");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel_FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        getContentPane().add(jLabel_FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_UsuarioActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void Button_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IngresarActionPerformed
        username = in_Usuario.getText().trim();
        password = jPasswordField1.getText().trim();

        if (((username == null) || (username.trim().equals("")) || (password == null) || (password.trim().equals("")))) {
            JOptionPane.showMessageDialog(null, "'Usuario' y 'Contraseña' deben tener información");
        }
        
        if (!("01234567P".equals(username) || "01234567p".equals(username) || "1950000E".equals(username) || "1950000e".equals(username))) {
            JOptionPane.showMessageDialog(null, "Datos invalidos");
        }
        
        if("01234567P".equals(username) || "01234567p".equals(username)){
            dispose();
            new Profesores_Area_Edicion_Notas().setVisible(true);
        }

        if ("1950000E".equals(username) || "1950000e".equals(username)) {
            dispose();
            new Estudiantes_Area().setVisible(true);
        }


    }//GEN-LAST:event_Button_IngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Ingresar;
    private javax.swing.JTextField in_Usuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_FondoLogin;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
