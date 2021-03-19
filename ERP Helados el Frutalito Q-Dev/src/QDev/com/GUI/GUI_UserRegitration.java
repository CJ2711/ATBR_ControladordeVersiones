package QDev.com.GUI;

import QDev.com.Classes.Person;
import QDev.com.Classes.Role;
import QDev.com.DB.ConsultaBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KEREN
 */
public class GUI_UserRegitration extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private Person person;
    private Person person1;

    /**
     * Creates new form GUI_UserRegi
     */
    public GUI_UserRegitration(Person person) {
        initComponents();
        this.person = person;
        this.cBD = new ConsultaBD();
        this.person1 = new Person();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Fondo = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jL_Icono = new javax.swing.JLabel();
        jP_Formulario2 = new javax.swing.JPanel();
        jL_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jL_Password = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        jL_Rol = new javax.swing.JLabel();
        jCB_Rol = new JComboBox<>(Role.values());
        jL_Title = new javax.swing.JLabel();
        jP_Formulario1 = new javax.swing.JPanel();
        jL_Nuip = new javax.swing.JLabel();
        txt_Nuip = new javax.swing.JTextField();
        jL_Name = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jL_Surname = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jL_Phone = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP-El Frutalito Registro de Usuarios\n");

        jP_Fondo.setBackground(new java.awt.Color(153, 255, 153));

        btn_Registrar.setBackground(new java.awt.Color(0, 255, 102));
        btn_Registrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Cancelar.setBackground(new java.awt.Color(204, 51, 0));
        btn_Cancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jL_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito01.png"))); // NOI18N

        jP_Formulario2.setBackground(new java.awt.Color(153, 255, 153));
        jP_Formulario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jL_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Email.setText("Email:");

        jL_Password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Password.setText("Contraseña:");

        jL_Rol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Rol.setText("Rol:");

        javax.swing.GroupLayout jP_Formulario2Layout = new javax.swing.GroupLayout(jP_Formulario2);
        jP_Formulario2.setLayout(jP_Formulario2Layout);
        jP_Formulario2Layout.setHorizontalGroup(
            jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Formulario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Formulario2Layout.createSequentialGroup()
                        .addComponent(jL_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Email))
                    .addGroup(jP_Formulario2Layout.createSequentialGroup()
                        .addComponent(jL_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(jP_Formulario2Layout.createSequentialGroup()
                        .addComponent(jL_Rol)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_Rol, 0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_Formulario2Layout.setVerticalGroup(
            jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Formulario2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Email)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Password))
                .addGap(18, 18, 18)
                .addGroup(jP_Formulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Rol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jL_Title.setFont(new java.awt.Font("Kristen ITC", 0, 25)); // NOI18N
        jL_Title.setText("Registrar Usuario");

        jP_Formulario1.setBackground(new java.awt.Color(153, 255, 153));
        jP_Formulario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jL_Nuip.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Nuip.setText("Nuip:");

        jL_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Name.setText("Nombre:");

        jL_Surname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Surname.setText("Apellido:");

        jL_Phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_Phone.setText("Telefono:");

        javax.swing.GroupLayout jP_Formulario1Layout = new javax.swing.GroupLayout(jP_Formulario1);
        jP_Formulario1.setLayout(jP_Formulario1Layout);
        jP_Formulario1Layout.setHorizontalGroup(
            jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Formulario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Formulario1Layout.createSequentialGroup()
                        .addComponent(jL_Nuip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nuip))
                    .addGroup(jP_Formulario1Layout.createSequentialGroup()
                        .addComponent(jL_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre))
                    .addGroup(jP_Formulario1Layout.createSequentialGroup()
                        .addComponent(jL_Surname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Apellido))
                    .addGroup(jP_Formulario1Layout.createSequentialGroup()
                        .addComponent(jL_Phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_Formulario1Layout.setVerticalGroup(
            jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Formulario1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Nuip)
                    .addComponent(txt_Nuip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Name)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Surname)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jP_Formulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Phone)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_FondoLayout = new javax.swing.GroupLayout(jP_Fondo);
        jP_Fondo.setLayout(jP_FondoLayout);
        jP_FondoLayout.setHorizontalGroup(
            jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jL_Title)
                .addGap(97, 97, 97))
            .addGroup(jP_FondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_FondoLayout.createSequentialGroup()
                        .addComponent(btn_Registrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancelar))
                    .addGroup(jP_FondoLayout.createSequentialGroup()
                        .addComponent(jP_Formulario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jP_Formulario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_FondoLayout.setVerticalGroup(
            jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FondoLayout.createSequentialGroup()
                .addGroup(jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_FondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jL_Icono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_Formulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_Formulario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jP_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

        try {
            long nuip = Long.parseLong(txt_Nuip.getText());

            person1.setNuip(nuip);
            person1.setNames(txt_Nombre.getText());
            person1.setSurnames(txt_Apellido.getText());
            person1.setPhone(txt_Telefono.getText());
            person1.setEmail(txt_Email.getText());
            person1.setPassword(txt_Password.getText());
            person1.setActiveInt(1);
            person1.setRole((Role) jCB_Rol.getSelectedItem());

            if (cBD.registerUser(person1)) {
                JOptionPane.showMessageDialog(rootPane, "El Usuario ha sido registrado con éxito");
                LimpiezaFormulario();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al registrar.");
            }

            JFrame GUI_Inicio = null;
            if (GUI_Inicio == null) {
                this.dispose();
                GUI_Inicio = new GUI_UserManagement(person);
            }
            GUI_Inicio.setVisible(true);
        } catch (NumberFormatException ex) {
            Logger.getLogger(GUI_UserRegitration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(GUI_UserRegitration.this, "Error al registrar.");
        } catch (Exception ex) {
            Logger.getLogger(GUI_UserRegitration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(GUI_UserRegitration.this, ex.getMessage());
        }

    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void LimpiezaFormulario() {
        txt_Nuip.setText("");
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
        txt_Email.setText("");
        txt_Password.setText("");
        jCB_Rol.setSelectedIndex(-1);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<Role> jCB_Rol;
    private javax.swing.JLabel jL_Email;
    private javax.swing.JLabel jL_Icono;
    private javax.swing.JLabel jL_Name;
    private javax.swing.JLabel jL_Nuip;
    private javax.swing.JLabel jL_Password;
    private javax.swing.JLabel jL_Phone;
    private javax.swing.JLabel jL_Rol;
    private javax.swing.JLabel jL_Surname;
    private javax.swing.JLabel jL_Title;
    private javax.swing.JPanel jP_Fondo;
    private javax.swing.JPanel jP_Formulario1;
    private javax.swing.JPanel jP_Formulario2;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nuip;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
