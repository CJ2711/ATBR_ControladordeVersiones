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

import javax.swing.JButton;
import javax.swing.JPanel;

public class Estudiantes_Area extends javax.swing.JFrame {

    /**
     * Creates new form Estudiantes_Area
     */
    public Estudiantes_Area() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante]");
        this.setLocationRelativeTo(null);
        setResizable(false);
        Panel_Options.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo_Prueba = new javax.swing.JLabel();
        Label_Titulo_Materias = new javax.swing.JLabel();
        Label_Titulo_Notificaciones = new javax.swing.JLabel();
        Button_Icfes = new javax.swing.JButton();
        Button_Diagnostica = new javax.swing.JButton();
        jTextField_Nombre_Apellido_E = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Label_Foto_Perfil = new javax.swing.JLabel();
        Panel_Options = new javax.swing.JPanel();
        Button_Opciones = new javax.swing.JButton();
        Button_Cerrar_Sesion = new javax.swing.JButton();
        Button_TGS = new javax.swing.JButton();
        Button_FDP = new javax.swing.JButton();
        Button_Ingles = new javax.swing.JButton();
        Button_ITI = new javax.swing.JButton();
        Button_Calculo = new javax.swing.JButton();
        Button_DeporteFormativo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_FondoEstudiantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo_Prueba.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Prueba.setText("PRUEBAS");
        getContentPane().add(Label_Titulo_Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 30));

        Label_Titulo_Materias.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Materias.setText("MATERIAS");
        getContentPane().add(Label_Titulo_Materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 30));

        Label_Titulo_Notificaciones.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Notificaciones.setText("NOTIFICACIONES");
        getContentPane().add(Label_Titulo_Notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, 30));

        Button_Icfes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Icfes.setText("ICFES");
        Button_Icfes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Icfes.setOpaque(false);
        Button_Icfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IcfesActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Icfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, 50));

        Button_Diagnostica.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Diagnostica.setText("DIAGNOSTICA");
        Button_Diagnostica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Diagnostica.setOpaque(false);
        getContentPane().add(Button_Diagnostica, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, 50));

        jTextField_Nombre_Apellido_E.setEditable(false);
        jTextField_Nombre_Apellido_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nombre_Apellido_EActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nombre_Apellido_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 200, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DesplegableOpt.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 30, -1));

        Label_Foto_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoPerfil.png"))); // NOI18N
        getContentPane().add(Label_Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

        Panel_Options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_OptionsMouseExited(evt);
            }
        });

        Button_Opciones.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        Button_Opciones.setText("OPCIONES");
        Button_Opciones.setOpaque(false);
        Panel_Options.add(Button_Opciones);

        Button_Cerrar_Sesion.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        Button_Cerrar_Sesion.setText("CERRAR SESIÓN");
        Button_Cerrar_Sesion.setOpaque(false);
        Panel_Options.add(Button_Cerrar_Sesion);

        getContentPane().add(Panel_Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 130, 70));

        Button_TGS.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_TGS.setText("T.G.S");
        Button_TGS.setOpaque(false);
        getContentPane().add(Button_TGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 160, -1));

        Button_FDP.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_FDP.setText("F.D.P");
        Button_FDP.setOpaque(false);
        getContentPane().add(Button_FDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 160, -1));

        Button_Ingles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Ingles.setText("INGLÉS I");
        Button_Ingles.setOpaque(false);
        getContentPane().add(Button_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 160, -1));

        Button_ITI.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_ITI.setText("I.T.I");
        Button_ITI.setOpaque(false);
        getContentPane().add(Button_ITI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 160, -1));

        Button_Calculo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Calculo.setText("CÁLCULO I");
        Button_Calculo.setOpaque(false);
        Button_Calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CalculoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 160, -1));

        Button_DeporteFormativo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_DeporteFormativo.setText("DEP. FORMA");
        Button_DeporteFormativo.setOpaque(false);
        getContentPane().add(Button_DeporteFormativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 160, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setText("ESPAÑOL");
        jButton2.setOpaque(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 160, -1));

        jLabel_FondoEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioEstudiante.png"))); // NOI18N
        getContentPane().add(jLabel_FondoEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_IcfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IcfesActionPerformed
        dispose(); //Desaparecer ventana 'Estudiantes_Area'
        new Icfes().setVisible(true); //Mostrar en pantalla ventana 'Icfes'
    }//GEN-LAST:event_Button_IcfesActionPerformed

    private void jTextField_Nombre_Apellido_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nombre_Apellido_EActionPerformed

    }//GEN-LAST:event_jTextField_Nombre_Apellido_EActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Panel_Options.setVisible(true); //Mostrar en pantalla el panel de las opciones
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void Panel_OptionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_OptionsMouseExited
        Panel_Options.setVisible(false); //Desaparecer el panel de las opciones
    }//GEN-LAST:event_Panel_OptionsMouseExited

    private void Button_CalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CalculoActionPerformed
        dispose(); //Desaparecer ventana 'Estudiantes_Area'
        new Calculo().setVisible(true); //Mostrar en pantalla ventana 'Calculo'
    }//GEN-LAST:event_Button_CalculoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Estudiantes_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes_Area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Calculo;
    private javax.swing.JButton Button_Cerrar_Sesion;
    private javax.swing.JButton Button_DeporteFormativo;
    private javax.swing.JButton Button_Diagnostica;
    private javax.swing.JButton Button_FDP;
    private javax.swing.JButton Button_ITI;
    private javax.swing.JButton Button_Icfes;
    private javax.swing.JButton Button_Ingles;
    private javax.swing.JButton Button_Opciones;
    private javax.swing.JButton Button_TGS;
    private javax.swing.JLabel Label_Foto_Perfil;
    private javax.swing.JLabel Label_Titulo_Materias;
    private javax.swing.JLabel Label_Titulo_Notificaciones;
    private javax.swing.JLabel Label_Titulo_Prueba;
    private javax.swing.JPanel Panel_Options;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel_FondoEstudiantes;
    public static javax.swing.JTextField jTextField_Nombre_Apellido_E;
    // End of variables declaration//GEN-END:variables
}
