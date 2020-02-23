package ventanas;

/**
 * @author Christian Barbosa (CJ1)
 */
public class Profesores_Area_Edicion_Notas extends javax.swing.JFrame {

    /**
     * Creates new form Profesores_Area_Edicion
     */
    public Profesores_Area_Edicion_Notas() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento [Area Profesor]");
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    
    public String jLabel_Nombre(){
        return "Hola";
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Nombre_Apellido = new javax.swing.JLabel();
        jLabel_SaludoProfesor = new javax.swing.JLabel();
        jLabel_FondoProfesores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nombre_Apellido.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        getContentPane().add(jLabel_Nombre_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 350, 40));

        jLabel_SaludoProfesor.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel_SaludoProfesor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SaludoProfesor.setText("Bienvenido(a) Profesor(a)");
        getContentPane().add(jLabel_SaludoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel_FondoProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProfesores.png"))); // NOI18N
        getContentPane().add(jLabel_FondoProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Profesores_Area_Edicion_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesores_Area_Edicion_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesores_Area_Edicion_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesores_Area_Edicion_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesores_Area_Edicion_Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_FondoProfesores;
    private javax.swing.JLabel jLabel_Nombre_Apellido;
    private javax.swing.JLabel jLabel_SaludoProfesor;
    // End of variables declaration//GEN-END:variables
}
