package ventanas;

import javax.swing.DropMode;

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
        jList1.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
    }

    //Traer nombre y apellido de la BD relacionados al usuario que ingresa:
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atbr_proyecto?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        mMateriaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MMateria m");
        mMateriaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mMateriaQuery.getResultList();
        jLabel_SaludoProfesor = new javax.swing.JLabel();
        jLabel1_Salida_ElegirCurso = new javax.swing.JLabel();
        jTextField1_nombre_apellido = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_FondoProfesores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_SaludoProfesor.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel_SaludoProfesor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SaludoProfesor.setText("Bienvenido(a) Profesor(a)");
        getContentPane().add(jLabel_SaludoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel1_Salida_ElegirCurso.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1_Salida_ElegirCurso.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_Salida_ElegirCurso.setText("Elija el curso en el cual realizará las acciones:");
        getContentPane().add(jLabel1_Salida_ElegirCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField1_nombre_apellido.setEditable(false);
        jTextField1_nombre_apellido.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1_nombre_apellido.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jTextField1_nombre_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nombre_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_nombre_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MATERIAS");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 160, 40));

        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mMateriaList, jList1, "Materias");
        bindingGroup.addBinding(jListBinding);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jList1MouseExited(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 350, 180));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculo I");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 0));
        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingles I");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Español I");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Deporte Formativo");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 153, 0));
        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fundamentos de Programación");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 153, 0));
        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Introducción a la Tecnología de Información");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 153, 0));
        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teoria General de Sistemas");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 540, 290));

        jLabel_FondoProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProfesores.png"))); // NOI18N
        getContentPane().add(jLabel_FondoProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

//no tocar-------------------------------------------------------------------------------------------------
    private void jTextField1_nombre_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nombre_apellidoActionPerformed

    }//GEN-LAST:event_jTextField1_nombre_apellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jScrollPane1.setVisible(true);
        jList1.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jList1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseExited
        jScrollPane1.setVisible(false);
        jList1.setVisible(false);
    }//GEN-LAST:event_jList1MouseExited

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

    }//GEN-LAST:event_jList1ValueChanged

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        //Calculo I
        if (jList1.getSelectedIndex() == 0) {
            jPanel1.setVisible(true);

            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);

        }
        //Ingles I
        if (jList1.getSelectedIndex() == 1) {
            jPanel2.setVisible(true);

            jPanel1.setVisible(false);

            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
        }
        //Español I
        if (jList1.getSelectedIndex() == 2) {
            jPanel3.setVisible(true);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);

            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
        }
        //Deporte Formativo
        if (jList1.getSelectedIndex() == 3) {
            jPanel4.setVisible(true);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);

            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
        }
        //Fundamentos de Programación
        if (jList1.getSelectedIndex() == 4) {
            jPanel5.setVisible(true);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);

            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
        }
        //Introduccion a la Tecnología de información
        if (jList1.getSelectedIndex() == 5) {
            jPanel6.setVisible(true);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);

            jPanel7.setVisible(false);

        }
        //Teoría General de Sistemas
        if (jList1.getSelectedIndex() == 6) {
            jPanel7.setVisible(true);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        }

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
//fin no tocar----------------------------------------------------------------------------------------------


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Salida_ElegirCurso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_FondoProfesores;
    private javax.swing.JLabel jLabel_SaludoProfesor;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField1_nombre_apellido;
    private java.util.List<BD.MMateria> mMateriaList;
    private javax.persistence.Query mMateriaQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
