/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Francisco
 */
public class Icfes extends javax.swing.JFrame {

    /** 
     * Creates new form Icfes
     */
    public Icfes() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante]");
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

        Button_Return_Inicio = new javax.swing.JButton();
        Label_Titulo_Icfes = new javax.swing.JLabel();
        Label_Icfes_Math = new javax.swing.JLabel();
        Label_Icfes_LC = new javax.swing.JLabel();
        Label_Icfes_CN = new javax.swing.JLabel();
        Label_Icfes_SC = new javax.swing.JLabel();
        Label_Icfes_Ingles = new javax.swing.JLabel();
        jLabel_FondoIcfes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Return_Inicio.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Button_Return_Inicio.setText("INICIO");
        Button_Return_Inicio.setToolTipText("Volver a Inicio");
        Button_Return_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Return_Inicio.setOpaque(false);
        Button_Return_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Return_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Return_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 40));

        Label_Titulo_Icfes.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Icfes.setText("PRUEBA: ICFES");
        getContentPane().add(Label_Titulo_Icfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        Label_Icfes_Math.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_Math.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_Math.setText("MATEMÁTICAS");
        Label_Icfes_Math.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label_Icfes_Math.setOpaque(true);
        getContentPane().add(Label_Icfes_Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, 50));
        Label_Icfes_Math.getAccessibleContext().setAccessibleDescription("");

        Label_Icfes_LC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_LC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_LC.setText("LECTURA CRÍTICA");
        Label_Icfes_LC.setToolTipText("");
        Label_Icfes_LC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Label_Icfes_LC.setName(""); // NOI18N
        Label_Icfes_LC.setOpaque(true);
        getContentPane().add(Label_Icfes_LC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 50));

        Label_Icfes_CN.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_CN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_CN.setText("CIENCIAS NATURALES");
        Label_Icfes_CN.setOpaque(true);
        getContentPane().add(Label_Icfes_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 230, 50));

        Label_Icfes_SC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_SC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_SC.setText("SOCIALES / CIUDADANÍA");
        Label_Icfes_SC.setOpaque(true);
        getContentPane().add(Label_Icfes_SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 260, 50));

        Label_Icfes_Ingles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_Ingles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_Ingles.setText("INGLÉS");
        Label_Icfes_Ingles.setOpaque(true);
        getContentPane().add(Label_Icfes_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 50));

        jLabel_FondoIcfes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icfes.png"))); // NOI18N
        getContentPane().add(jLabel_FondoIcfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Return_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Return_InicioActionPerformed
        dispose();
        new Estudiantes_Area().setVisible(true);
    }//GEN-LAST:event_Button_Return_InicioActionPerformed

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
            java.util.logging.Logger.getLogger(Icfes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Icfes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Icfes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Icfes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Icfes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Return_Inicio;
    private javax.swing.JLabel Label_Icfes_CN;
    private javax.swing.JLabel Label_Icfes_Ingles;
    private javax.swing.JLabel Label_Icfes_LC;
    private javax.swing.JLabel Label_Icfes_Math;
    private javax.swing.JLabel Label_Icfes_SC;
    private javax.swing.JLabel Label_Titulo_Icfes;
    private javax.swing.JLabel jLabel_FondoIcfes;
    // End of variables declaration//GEN-END:variables
}