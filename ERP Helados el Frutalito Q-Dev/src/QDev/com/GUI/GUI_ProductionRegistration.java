/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

import QDev.com.DB.ConsultaBD;
import QDev.com.Classes.Person;
import javax.swing.JFrame;

/**
 *
 * @author Alejandro
 */
public class GUI_ProductionRegistration extends javax.swing.JFrame {


    private ConsultaBD cBD;
    Person person;
    /**
     * Creates new form GUI_ProductionRegistration
     */
    public GUI_ProductionRegistration(ConsultaBD cBD/*, Person person*/) {
        initComponents();
        this.cBD = cBD;
        this.person = person;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Bckgrnd = new javax.swing.JPanel();
        jL_Icono = new javax.swing.JLabel();
        jL_Title1 = new javax.swing.JLabel();
        jPanel_Form = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel_ID1 = new javax.swing.JLabel();
        txt_ID1 = new javax.swing.JTextField();
        jLabel_ID2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btn_Registrar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP-El Frutalito Registrar Producción");
        setResizable(false);

        jPanel_Bckgrnd.setBackground(new java.awt.Color(153, 255, 153));

        jL_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito_Small.png"))); // NOI18N

        jL_Title1.setFont(new java.awt.Font("Kristen ITC", 0, 22)); // NOI18N
        jL_Title1.setForeground(new java.awt.Color(0, 0, 0));
        jL_Title1.setText("Registrar Producción");

        jPanel_Form.setBackground(new java.awt.Color(153, 255, 153));
        jPanel_Form.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Helado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel_Form.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_ID.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ID.setText("ID:");

        jLabel_ID1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ID1.setText("Nombre:");

        jLabel_ID2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ID2.setText("Cantidad:");

        javax.swing.GroupLayout jPanel_FormLayout = new javax.swing.GroupLayout(jPanel_Form);
        jPanel_Form.setLayout(jPanel_FormLayout);
        jPanel_FormLayout.setHorizontalGroup(
            jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FormLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ID))
                .addGap(18, 18, 18)
                .addGroup(jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ID1))
                .addGap(18, 18, 18)
                .addGroup(jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ID2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel_FormLayout.setVerticalGroup(
            jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID)
                    .addComponent(jLabel_ID1)
                    .addComponent(jLabel_ID2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel_BckgrndLayout = new javax.swing.GroupLayout(jPanel_Bckgrnd);
        jPanel_Bckgrnd.setLayout(jPanel_BckgrndLayout);
        jPanel_BckgrndLayout.setHorizontalGroup(
            jPanel_BckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BckgrndLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addGap(67, 67, 67)
                .addComponent(btn_Cancelar)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BckgrndLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jL_Icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jL_Title1)
                .addGap(188, 188, 188))
            .addGroup(jPanel_BckgrndLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_BckgrndLayout.setVerticalGroup(
            jPanel_BckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BckgrndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BckgrndLayout.createSequentialGroup()
                        .addComponent(jL_Title1)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_BckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Registrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Bckgrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Bckgrnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

//        ConsultaBD modSQL = new ConsultaBD();
//        
//        JFrame GUI_Inicio = null;
//        if (GUI_Inicio == null) {
//            this.dispose();
//            GUI_Inicio = new GUI_UserManagement();
//        }
//        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        JFrame GUI_Prod = null;
        if (GUI_Prod == null) {
            this.dispose();
            GUI_Prod = new GUI_Production(cBD);
        }
        GUI_Prod.setVisible(true);
    }//GEN-LAST:event_btn_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jL_Icono;
    private javax.swing.JLabel jL_Title1;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_ID1;
    private javax.swing.JLabel jLabel_ID2;
    private javax.swing.JPanel jPanel_Bckgrnd;
    private javax.swing.JPanel jPanel_Form;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_ID1;
    // End of variables declaration//GEN-END:variables
}