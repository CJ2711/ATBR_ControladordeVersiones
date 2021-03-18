/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QDev.com.GUI;

import javax.swing.JFrame;

/**
 *
 * @author Alejandro
 */
public class GUI_RawMaterial extends javax.swing.JFrame {

    /**
     * Creates new form GUI_RawMaterial
     */
    public GUI_RawMaterial() {
        initComponents();
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

        jPanel_bckgrnd = new javax.swing.JPanel();
        jL_logo = new javax.swing.JLabel();
        jL_title = new javax.swing.JLabel();
        jP_Form = new javax.swing.JPanel();
        jL_Name = new javax.swing.JLabel();
        jL_Price = new javax.swing.JLabel();
        jL_Quantity = new javax.swing.JLabel();
        jL_MUnit = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_Price = new javax.swing.JTextField();
        spn_Quantity = new javax.swing.JSpinner();
        cbb_MUnit = new javax.swing.JComboBox<>();
        btn_Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RawMaterial = new javax.swing.JTable();
        btn_Register = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP-El Frutalito Pedido de Materia Prima");
        setResizable(false);

        jPanel_bckgrnd.setBackground(new java.awt.Color(153, 255, 153));

        jL_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito_Small.png"))); // NOI18N

        jL_title.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jL_title.setForeground(new java.awt.Color(0, 0, 0));
        jL_title.setText("Pedido Materia Prima");

        jP_Form.setBackground(new java.awt.Color(153, 255, 153));
        jP_Form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jL_Name.setForeground(new java.awt.Color(0, 0, 0));
        jL_Name.setText("Nombre:");

        jL_Price.setForeground(new java.awt.Color(0, 0, 0));
        jL_Price.setText("Precio Unit.:");

        jL_Quantity.setForeground(new java.awt.Color(0, 0, 0));
        jL_Quantity.setText("Cantidad:");

        jL_MUnit.setForeground(new java.awt.Color(0, 0, 0));
        jL_MUnit.setText("Unidad Medida:");

        javax.swing.GroupLayout jP_FormLayout = new javax.swing.GroupLayout(jP_Form);
        jP_Form.setLayout(jP_FormLayout);
        jP_FormLayout.setHorizontalGroup(
            jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FormLayout.createSequentialGroup()
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_FormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jL_Name)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_FormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Price))
                .addGap(18, 18, 18)
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spn_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Quantity))
                .addGap(18, 18, 18)
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbb_MUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_MUnit))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jP_FormLayout.setVerticalGroup(
            jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Name)
                    .addComponent(jL_Price)
                    .addComponent(jL_Quantity)
                    .addComponent(jL_MUnit))
                .addGap(3, 3, 3)
                .addGroup(jP_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_MUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_Add.setBackground(new java.awt.Color(0, 255, 102));
        btn_Add.setText("Agregar");

        tbl_RawMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio Unit", "Cantidad", "Unidad Medida", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(tbl_RawMaterial);

        btn_Register.setBackground(new java.awt.Color(0, 255, 102));
        btn_Register.setText("Pedir Materia Prima");

        btn_Cancel.setBackground(new java.awt.Color(204, 51, 0));
        btn_Cancel.setText("Cancelar");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bckgrndLayout = new javax.swing.GroupLayout(jPanel_bckgrnd);
        jPanel_bckgrnd.setLayout(jPanel_bckgrndLayout);
        jPanel_bckgrndLayout.setHorizontalGroup(
            jPanel_bckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bckgrndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_bckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jP_Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bckgrndLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Add))
                    .addGroup(jPanel_bckgrndLayout.createSequentialGroup()
                        .addComponent(jL_logo)
                        .addGap(83, 83, 83)
                        .addComponent(jL_title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_bckgrndLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btn_Register)
                .addGap(53, 53, 53)
                .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_bckgrndLayout.setVerticalGroup(
            jPanel_bckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bckgrndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_bckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_logo)
                    .addComponent(jL_title, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jP_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Add)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_bckgrndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Register)
                    .addComponent(btn_Cancel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bckgrnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bckgrnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        JFrame GUI_Inicio = null;
        if (GUI_Inicio == null) {
            this.dispose();
            GUI_Inicio = new GUI_Admin();
        }
        GUI_Inicio.setVisible(true);
    }//GEN-LAST:event_btn_CancelActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI_RawMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_RawMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_RawMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_RawMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_RawMaterial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Register;
    private javax.swing.JComboBox<String> cbb_MUnit;
    private javax.swing.JLabel jL_MUnit;
    private javax.swing.JLabel jL_Name;
    private javax.swing.JLabel jL_Price;
    private javax.swing.JLabel jL_Quantity;
    private javax.swing.JLabel jL_logo;
    private javax.swing.JLabel jL_title;
    private javax.swing.JPanel jP_Form;
    private javax.swing.JPanel jPanel_bckgrnd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_Quantity;
    private javax.swing.JTable tbl_RawMaterial;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Price;
    // End of variables declaration//GEN-END:variables
}
