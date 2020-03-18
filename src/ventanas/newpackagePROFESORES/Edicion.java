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
package ventanas.newpackagePROFESORES;

public class Edicion extends javax.swing.JFrame {

    /**
     * Creates new form Edicion
     */
    public Edicion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Area Edicion de Materia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atbr_proyecto?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        mEstudianteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MEstudiante m");
        mEstudianteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mEstudianteQuery.getResultList();
        nombreMateria = new javax.swing.JTextField();
        jTextField1_nombre_apellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Info_Estudiante = new javax.swing.JTable();
        jLabel1_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreMateria.setEditable(false);
        nombreMateria.setBackground(new java.awt.Color(255, 255, 255));
        nombreMateria.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(nombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 30));

        jTextField1_nombre_apellido.setEditable(false);
        jTextField1_nombre_apellido.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1_nombre_apellido.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField1_nombre_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nombre_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_nombre_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 250, 30));

        jTable_Info_Estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Estudiante", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(jTable_Info_Estudiante);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 110));

        jLabel1_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProfesores.png"))); // NOI18N
        getContentPane().add(jLabel1_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMateriaActionPerformed

    private void jTextField1_nombre_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nombre_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nombre_apellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1_Fondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Info_Estudiante;
    public static javax.swing.JTextField jTextField1_nombre_apellido;
    private java.util.List<BD.MEstudiante> mEstudianteList;
    private javax.persistence.Query mEstudianteQuery;
    public static javax.swing.JTextField nombreMateria;
    // End of variables declaration//GEN-END:variables
}
