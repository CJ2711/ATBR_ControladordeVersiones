package QDev.com.GUI;

import QDev.com.Classes.IceCream;
import QDev.com.Classes.Person;
import QDev.com.Classes.Sale;
import QDev.com.Classes.SaleDetail;
import QDev.com.DB.ConsultaBD;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class GUI_AdministrarVentas extends javax.swing.JFrame {

    private ConsultaBD cBD;
    private Person p;
    private Sale s;
    IceCream iC;
    Date date = new Date();
    DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    DefaultTableModel model;

    /**
     * Creates new form GUI_AdministrarVentas
     */
    public GUI_AdministrarVentas(ConsultaBD cBD, Person p) {
        this.cBD = cBD;
        this.iC = new IceCream();
        this.p = p;

        try {
            this.s = new Sale(p);
        } catch (Exception ex) {
        }

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.jTable_Ventas.setModel(new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return s.getSaleDetails().size();
            }

            private String[] nameColumn = {"NOMBRE", "CANTIDAD", "PRECIO TOTAL"};

            @Override
            public int getColumnCount() {
                return this.nameColumn.length;
            }

            @Override
            public String getColumnName(int column) {
                return nameColumn[column];
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                SaleDetail sD = s.getSaleDetails().get(rowIndex);
                switch (columnIndex) {
                    case 0:
                        return sD.getIceCream().getNameIC();
                    case 1:
                        return sD.getQuantitySD();
                    case 2:
                        return sD.getTotalPriceSD();
                }
                return null;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jText_CodigoHelado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jText_NombreHelado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSpinner_Cantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Ventas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jText_TotalVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JButton();
        btn_GenerarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP-El Frutalito Administrar Ventas\n");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 25)); // NOI18N
        jLabel1.setText("Venta");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Frutalito-Cali");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Helado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jText_CodigoHelado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jText_CodigoHelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CodigoHeladoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Código");

        jText_NombreHelado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Nombre");

        jSpinner_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad");

        btn_Agregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_CodigoHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jText_NombreHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Agregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_CodigoHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_NombreHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Ventas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Ventas);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Logo_Frutalito_Small.png"))); // NOI18N

        jText_TotalVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Total  $:");

        btn_Cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/image_Btn_Cnacelar.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");

        btn_GenerarVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_GenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QDev/com/ImageSRC/Image_Btn_GestionarVentas.png"))); // NOI18N
        btn_GenerarVenta.setText("Generar Venta");
        btn_GenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8)
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_GenerarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_TotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_TotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_GenerarVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_CodigoHeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CodigoHeladoActionPerformed
        try {
            iC.setIdIC(Integer.parseInt(jText_CodigoHelado.getText()));

            if (cBD.searchIC(iC) == true) {
                jText_NombreHelado.setText(iC.getNameIC());
                jSpinner_Cantidad.setValue(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUI_AdministrarVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jText_CodigoHeladoActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        try {
            int quantity = (int) jSpinner_Cantidad.getValue();

            SaleDetail sD = new SaleDetail(quantity, iC);

            s.addSD(sD);

            jTable_Ventas.updateUI();
            jText_TotalVenta.setText(String.valueOf(s.getTotalPriceS()));

            jText_CodigoHelado.setText("");
            jText_NombreHelado.setText("");
            jSpinner_Cantidad.setValue(Integer.valueOf(1));

            System.out.println("Person GUI: " + p);
            iC = new IceCream();
        } catch (Exception ex) {
            Logger.getLogger(GUI_AdministrarVentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(GUI_AdministrarVentas.this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_GenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarVentaActionPerformed
        System.out.println("Venta: " + s.toString());
        System.out.println("Lista: " + s.getSaleDetails().toString());
        if (cBD.registerSaleAndDetail(s, s.getSaleDetails())) {
            try {
                JOptionPane.showMessageDialog(GUI_AdministrarVentas.this, "La venta fue registrada con éxito.");
                jTable_Ventas.updateUI();
                s = new Sale(p);
            } catch (Exception ex) {
                Logger.getLogger(GUI_AdministrarVentas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(GUI_AdministrarVentas.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(GUI_AdministrarVentas.this, "Error al registrar la compra");
        }
    }//GEN-LAST:event_btn_GenerarVentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_GenerarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JTable jTable_Ventas;
    private javax.swing.JTextField jText_CodigoHelado;
    private javax.swing.JTextField jText_NombreHelado;
    private javax.swing.JTextField jText_TotalVenta;
    // End of variables declaration//GEN-END:variables
}
