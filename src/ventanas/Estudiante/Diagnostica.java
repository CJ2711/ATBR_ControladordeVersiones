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
package ventanas.Estudiante;

import BD.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.Estudiantes_Area;
import ventanas.Inicio;
import static ventanas.Inicio.username;

public class Diagnostica extends javax.swing.JFrame {

    /**
     * Creates new form Icfes
     */
    public Diagnostica() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante - Resultados: Pruebas Diagnósticas]");
        this.setLocationRelativeTo(null);
        setResizable(false);

        jScrollPane2.setVisible(false);
        jList1.setVisible(false);

        Label_Semaforo_Math_Rojo.setVisible(false);
        Label_Semaforo_Math_Amarillo.setVisible(false);
        Label_Semaforo_Math_Verde.setVisible(false);

        Label_Semaforo_LC_Rojo.setVisible(false);
        Label_Semaforo_LC_Amarillo.setVisible(false);
        Label_Semaforo_LC_Verde.setVisible(false);

        Label_Semaforo_Ingles_Rojo.setVisible(false);
        Label_Semaforo_Ingles_Amarillo.setVisible(false);
        Label_Semaforo_Ingles_Verde.setVisible(false);

        jScrollPane1.setVisible(false);

        resultadosDiagText();
        setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoProgramaGrande.png"));
        return retvalue;
    }

    public void resultadosDiagText() {
        switch (username) {
            case "1957601": {
                Object valorX0Y1 = jTable1.getValueAt(0, 1);
                Object valorX0Y2 = jTable1.getValueAt(0, 2);
                Object valorX0Y3 = jTable1.getValueAt(0, 3);

                float mathDiag = Float.parseFloat(valorX0Y1.toString());
                float lectCritDiag = Float.parseFloat(valorX0Y2.toString());
                float inglesDiag = Float.parseFloat(valorX0Y3.toString());

                String mathD = valorX0Y1.toString();
                String lectcritD = valorX0Y2.toString();
                String inglesD = valorX0Y3.toString();

                jTextField_Resultado_MathD.setText(mathD);
                jTextField_Resultado_LectCritD.setText(lectcritD);
                jTextField_Resultado_InglesD.setText(inglesD);

                //Semáforo Diagnóstica Matemáticas.
                if ((mathDiag >= (float) 0.0 && mathDiag <= (float) 2.99)) {
                    Label_Semaforo_Math_Rojo.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if ((mathDiag >= (float) 3.0 && mathDiag <= (float) 3.99)) {
                    Label_Semaforo_Math_Amarillo.setVisible(true);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if (mathDiag >= (float) 4.0) {
                    Label_Semaforo_Math_Verde.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                }

                //Semáforo Diagnóstica Lectura Crítica
                if ((lectCritDiag >= (float) 0.0 && lectCritDiag <= (float) 2.99)) {
                    Label_Semaforo_LC_Rojo.setVisible(true);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                    Label_Semaforo_LC_Verde.setVisible(false);
                }
                if ((lectCritDiag >= (float) 3.0 && lectCritDiag <= (float) 3.99)) {
                    Label_Semaforo_LC_Amarillo.setVisible(true);
                    Label_Semaforo_LC_Verde.setVisible(false);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                }
                if (lectCritDiag >= (float) 4.0) {
                    Label_Semaforo_LC_Verde.setVisible(true);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                }

                //Semáforo Diagnóstica Inglés
                if ((inglesDiag >= (float) 0.0 && inglesDiag <= (float) 2.99)) {
                    Label_Semaforo_Ingles_Rojo.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                }
                if ((inglesDiag >= (float) 3.0 && inglesDiag <= (float) 3.99)) {
                    Label_Semaforo_Ingles_Amarillo.setVisible(true);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
                if (inglesDiag >= (float) 4.0) {
                    Label_Semaforo_Ingles_Verde.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
            }

            case "1958205": {
                Object valorX1Y1 = jTable1.getValueAt(1, 1);
                Object valorX1Y2 = jTable1.getValueAt(1, 2);
                Object valorX1Y3 = jTable1.getValueAt(1, 3);

                float mathDiag = Float.parseFloat(valorX1Y1.toString());
                float lectCritDiag = Float.parseFloat(valorX1Y2.toString());
                float inglesDiag = Float.parseFloat(valorX1Y3.toString());

                String mathD = valorX1Y1.toString();
                String lectcritD = valorX1Y2.toString();
                String inglesD = valorX1Y3.toString();

                jTextField_Resultado_MathD.setText(mathD);
                jTextField_Resultado_LectCritD.setText(lectcritD);
                jTextField_Resultado_InglesD.setText(inglesD);

                //Semáforo Diagnóstica Matemáticas.
                if ((mathDiag >= (float) 0.0 && mathDiag <= (float) 2.99)) {
                    Label_Semaforo_Math_Rojo.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if ((mathDiag >= (float) 3.0 && mathDiag <= (float) 3.99)) {
                    Label_Semaforo_Math_Amarillo.setVisible(true);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if (mathDiag >= (float) 4.0) {
                    Label_Semaforo_Math_Verde.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                }

                //Semáforo Diagnóstica Lectura Crítica
                if ((lectCritDiag >= (float) 0.0 && lectCritDiag <= (float) 2.99)) {
                    Label_Semaforo_LC_Rojo.setVisible(true);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                    Label_Semaforo_LC_Verde.setVisible(false);
                }
                if ((lectCritDiag >= (float) 3.0 && lectCritDiag <= (float) 3.99)) {
                    Label_Semaforo_LC_Amarillo.setVisible(true);
                    Label_Semaforo_LC_Verde.setVisible(false);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                }
                if (lectCritDiag >= (float) 4.0) {
                    Label_Semaforo_LC_Verde.setVisible(true);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                }

                //Semáforo Diagnóstica Inglés
                if ((inglesDiag >= (float) 0.0 && inglesDiag <= (float) 2.99)) {
                    Label_Semaforo_Ingles_Rojo.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                }
                if ((inglesDiag >= (float) 3.0 && inglesDiag <= (float) 3.99)) {
                    Label_Semaforo_Ingles_Amarillo.setVisible(true);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
                if (inglesDiag >= (float) 4.0) {
                    Label_Semaforo_Ingles_Verde.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
            }

            case "1958266": {
                Object valorX2Y1 = jTable1.getValueAt(2, 1);
                Object valorX2Y2 = jTable1.getValueAt(2, 2);
                Object valorX2Y3 = jTable1.getValueAt(2, 3);

                float mathDiag = Float.parseFloat(valorX2Y1.toString());
                float lectCritDiag = Float.parseFloat(valorX2Y2.toString());
                float inglesDiag = Float.parseFloat(valorX2Y3.toString());

                String mathD = valorX2Y1.toString();
                String lectcritD = valorX2Y2.toString();
                String inglesD = valorX2Y3.toString();

                jTextField_Resultado_MathD.setText(mathD);
                jTextField_Resultado_LectCritD.setText(lectcritD);
                jTextField_Resultado_InglesD.setText(inglesD);
                //Semáforo Diagnóstica Matemáticas.
                if ((mathDiag >= (float) 0.0 && mathDiag <= (float) 2.99)) {
                    Label_Semaforo_Math_Rojo.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if ((mathDiag >= (float) 3.0 && mathDiag <= (float) 3.99)) {
                    Label_Semaforo_Math_Amarillo.setVisible(true);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if (mathDiag >= (float) 4.0) {
                    Label_Semaforo_Math_Verde.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                }

                //Semáforo Diagnóstica Lectura Crítica
                if ((lectCritDiag >= (float) 0.0 && lectCritDiag <= (float) 2.99)) {
                    Label_Semaforo_LC_Rojo.setVisible(true);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                    Label_Semaforo_LC_Verde.setVisible(false);
                }
                if ((lectCritDiag >= (float) 3.0 && lectCritDiag <= (float) 3.99)) {
                    Label_Semaforo_LC_Amarillo.setVisible(true);
                    Label_Semaforo_LC_Verde.setVisible(false);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                }
                if (lectCritDiag >= (float) 4.0) {
                    Label_Semaforo_LC_Verde.setVisible(true);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                }

                //Semáforo Diagnóstica Inglés
                if ((inglesDiag >= (float) 0.0 && inglesDiag <= (float) 2.99)) {
                    Label_Semaforo_Ingles_Rojo.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                }
                if ((inglesDiag >= (float) 3.0 && inglesDiag <= (float) 3.99)) {
                    Label_Semaforo_Ingles_Amarillo.setVisible(true);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
                if (inglesDiag >= (float) 4.0) {
                    Label_Semaforo_Ingles_Verde.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
            }

            case "1958283": {
                Object valorX3Y1 = jTable1.getValueAt(3, 1);
                Object valorX3Y2 = jTable1.getValueAt(3, 2);
                Object valorX3Y3 = jTable1.getValueAt(3, 3);

                float mathDiag = Float.parseFloat(valorX3Y1.toString());
                float lectCritDiag = Float.parseFloat(valorX3Y2.toString());
                float inglesDiag = Float.parseFloat(valorX3Y3.toString());

                String mathD = valorX3Y1.toString();
                String lectcritD = valorX3Y2.toString();
                String inglesD = valorX3Y3.toString();

                jTextField_Resultado_MathD.setText(mathD);
                jTextField_Resultado_LectCritD.setText(lectcritD);
                jTextField_Resultado_InglesD.setText(inglesD);

                //Semáforo Diagnóstica Matemáticas.
                if ((mathDiag >= (float) 0.0 && mathDiag <= (float) 2.99)) {
                    Label_Semaforo_Math_Rojo.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if ((mathDiag >= (float) 3.0 && mathDiag <= (float) 3.99)) {
                    Label_Semaforo_Math_Amarillo.setVisible(true);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                    Label_Semaforo_Math_Verde.setVisible(false);
                }
                if (mathDiag >= (float) 4.0) {
                    Label_Semaforo_Math_Verde.setVisible(true);
                    Label_Semaforo_Math_Amarillo.setVisible(false);
                    Label_Semaforo_Math_Rojo.setVisible(false);
                }

                //Semáforo Diagnóstica Lectura Crítica
                if ((lectCritDiag >= (float) 0.0 && lectCritDiag <= (float) 2.99)) {
                    Label_Semaforo_LC_Rojo.setVisible(true);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                    Label_Semaforo_LC_Verde.setVisible(false);
                }
                if ((lectCritDiag >= (float) 3.0 && lectCritDiag <= (float) 3.99)) {
                    Label_Semaforo_LC_Amarillo.setVisible(true);
                    Label_Semaforo_LC_Verde.setVisible(false);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                }
                if (lectCritDiag >= (float) 4.0) {
                    Label_Semaforo_LC_Verde.setVisible(true);
                    Label_Semaforo_LC_Rojo.setVisible(false);
                    Label_Semaforo_LC_Amarillo.setVisible(false);
                }

                //Semáforo Diagnóstica Inglés
                if ((inglesDiag >= (float) 0.0 && inglesDiag <= (float) 2.99)) {
                    Label_Semaforo_Ingles_Rojo.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                }
                if ((inglesDiag >= (float) 3.0 && inglesDiag <= (float) 3.99)) {
                    Label_Semaforo_Ingles_Amarillo.setVisible(true);
                    Label_Semaforo_Ingles_Verde.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
                if (inglesDiag >= (float) 4.0) {
                    Label_Semaforo_Ingles_Verde.setVisible(true);
                    Label_Semaforo_Ingles_Amarillo.setVisible(false);
                    Label_Semaforo_Ingles_Rojo.setVisible(false);
                }
            }

        }
    }

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
        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mysql?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        notasdiagQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Notasdiag n");
        notasdiagList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : notasdiagQuery.getResultList();
        Label_Logo = new javax.swing.JLabel();
        Button_Return_Inicio = new javax.swing.JButton();
        Label_Titulo_Diagnostica = new javax.swing.JLabel();
        Label_Diagnostica_Math = new javax.swing.JLabel();
        Label_Diagnostica_LC = new javax.swing.JLabel();
        Label_Diagnostica_Ingles = new javax.swing.JLabel();
        Button_Menu_Opc = new javax.swing.JButton();
        jTextField_Nombre_Apellido_E = new javax.swing.JTextField();
        Label_Foto_Perfil = new javax.swing.JLabel();
        jTextField_Resultado_MathD = new javax.swing.JTextField();
        jTextField_Resultado_LectCritD = new javax.swing.JTextField();
        jTextField_Resultado_InglesD = new javax.swing.JTextField();
        Label_Semaforo_Math_Rojo = new javax.swing.JLabel();
        Label_Semaforo_Math_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Math_Verde = new javax.swing.JLabel();
        Label_Semaforo_LC_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_LC_Verde = new javax.swing.JLabel();
        Label_Semaforo_LC_Rojo = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Verde = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Rojo = new javax.swing.JLabel();
        Label_Puntaje_Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel_FondoIcfes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProgramaPeq.png"))); // NOI18N
        getContentPane().add(Label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        Label_Titulo_Diagnostica.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Diagnostica.setText("PRUEBA: DIAGNOSTICA");
        getContentPane().add(Label_Titulo_Diagnostica, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        Label_Diagnostica_Math.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Diagnostica_Math.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Diagnostica_Math.setText("MATEMÁTICAS");
        Label_Diagnostica_Math.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label_Diagnostica_Math.setOpaque(true);
        getContentPane().add(Label_Diagnostica_Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 160, 50));
        Label_Diagnostica_Math.getAccessibleContext().setAccessibleDescription("");

        Label_Diagnostica_LC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Diagnostica_LC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Diagnostica_LC.setText("LECTURA CRÍTICA");
        Label_Diagnostica_LC.setToolTipText("");
        Label_Diagnostica_LC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Label_Diagnostica_LC.setName(""); // NOI18N
        Label_Diagnostica_LC.setOpaque(true);
        getContentPane().add(Label_Diagnostica_LC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 200, 50));

        Label_Diagnostica_Ingles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Diagnostica_Ingles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Diagnostica_Ingles.setText("INGLÉS");
        Label_Diagnostica_Ingles.setOpaque(true);
        getContentPane().add(Label_Diagnostica_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 130, 50));

        Button_Menu_Opc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DesplegableOpt.png"))); // NOI18N
        Button_Menu_Opc.setContentAreaFilled(false);
        Button_Menu_Opc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Menu_Opc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Menu_OpcMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Menu_Opc, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 30, -1));

        jTextField_Nombre_Apellido_E.setEditable(false);
        jTextField_Nombre_Apellido_E.setFocusable(false);
        jTextField_Nombre_Apellido_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nombre_Apellido_EActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nombre_Apellido_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 200, 30));

        Label_Foto_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoPerfil.png"))); // NOI18N
        getContentPane().add(Label_Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

        jTextField_Resultado_MathD.setEditable(false);
        jTextField_Resultado_MathD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Resultado_MathD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Resultado_MathD.setFocusable(false);
        jTextField_Resultado_MathD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Resultado_MathDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Resultado_MathD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 50, 40));

        jTextField_Resultado_LectCritD.setEditable(false);
        jTextField_Resultado_LectCritD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Resultado_LectCritD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Resultado_LectCritD.setFocusable(false);
        jTextField_Resultado_LectCritD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Resultado_LectCritDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Resultado_LectCritD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 50, 40));

        jTextField_Resultado_InglesD.setEditable(false);
        jTextField_Resultado_InglesD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Resultado_InglesD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Resultado_InglesD.setFocusable(false);
        jTextField_Resultado_InglesD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Resultado_InglesDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Resultado_InglesD, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 50, 40));

        Label_Semaforo_Math_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_Math_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        Label_Semaforo_Math_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Math_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        Label_Semaforo_Math_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_Math_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        Label_Semaforo_LC_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_LC_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        Label_Semaforo_LC_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_LC_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        Label_Semaforo_LC_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_LC_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        Label_Semaforo_Ingles_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_Ingles_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        Label_Semaforo_Ingles_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Ingles_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        Label_Semaforo_Ingles_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_Ingles_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        Label_Puntaje_Total.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Puntaje_Total.setText("Resultados de la prueba diagnóstica realizada  el 26/04/2019");
        getContentPane().add(Label_Puntaje_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, 30));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, notasdiagList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstudiante}"));
        columnBinding.setColumnName("Id Estudiante");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${notaD1}"));
        columnBinding.setColumnName("Nota D1");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${notaD2}"));
        columnBinding.setColumnName("Nota D2");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${notaD3}"));
        columnBinding.setColumnName("Nota D3");
        columnBinding.setColumnClass(Float.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, 100));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Opciones", "Cerrar Sesión" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setAutoscrolls(false);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.setValueIsAdjusting(true);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jList1MouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 150, 80));

        jLabel_FondoIcfes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icfes.png"))); // NOI18N
        getContentPane().add(jLabel_FondoIcfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Return_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Return_InicioActionPerformed
        dispose(); //Desaparecer ventana 'Icfes'
        new Estudiantes_Area().setVisible(true); //Mostrar en pantalla ventana 'Inicio'

        try {
            //Conexion BD
            Connection cnnn = Conexion.conectar();
            /*sentencia SQL para buscar en la tabla 'Usuario' el 'rol' que * tiene el usuario y su contraseña.
             */
            PreparedStatement pss = cnnn.prepareStatement(
                    "SELECT nombre, apellido FROM `m_estudiante` WHERE idEstudiante='" + username + "'");
            //Ejecutar la Sentencia SQL con el Objeto ResultSet:
            ResultSet rsss = pss.executeQuery();
            if (rsss.next()) {
                String nombre = rsss.getNString("nombre");
                String apellido = rsss.getNString("apellido");
                String nombreApeE = nombre + " " + apellido;
                Estudiantes_Area.jTextField_Nombre_Apellido_E.setText(nombreApeE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Button_Return_InicioActionPerformed

    private void Button_Menu_OpcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Menu_OpcMouseClicked
        jScrollPane2.setVisible(true);
        jList1.setVisible(true);
    }//GEN-LAST:event_Button_Menu_OpcMouseClicked

    private void jTextField_Nombre_Apellido_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nombre_Apellido_EActionPerformed

    }//GEN-LAST:event_jTextField_Nombre_Apellido_EActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (jList1.getSelectedIndex() == 1) {
            dispose();
            new ventanas.Inicio().setVisible(true);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseExited
        jList1.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_jList1MouseExited

    private void jTextField_Resultado_MathDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Resultado_MathDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Resultado_MathDActionPerformed

    private void jTextField_Resultado_LectCritDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Resultado_LectCritDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Resultado_LectCritDActionPerformed

    private void jTextField_Resultado_InglesDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Resultado_InglesDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Resultado_InglesDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Menu_Opc;
    private javax.swing.JButton Button_Return_Inicio;
    private javax.swing.JLabel Label_Diagnostica_Ingles;
    private javax.swing.JLabel Label_Diagnostica_LC;
    private javax.swing.JLabel Label_Diagnostica_Math;
    private javax.swing.JLabel Label_Foto_Perfil;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_Puntaje_Total;
    private javax.swing.JLabel Label_Semaforo_Ingles_Amarillo;
    private javax.swing.JLabel Label_Semaforo_Ingles_Rojo;
    private javax.swing.JLabel Label_Semaforo_Ingles_Verde;
    private javax.swing.JLabel Label_Semaforo_LC_Amarillo;
    private javax.swing.JLabel Label_Semaforo_LC_Rojo;
    private javax.swing.JLabel Label_Semaforo_LC_Verde;
    private javax.swing.JLabel Label_Semaforo_Math_Amarillo;
    private javax.swing.JLabel Label_Semaforo_Math_Rojo;
    private javax.swing.JLabel Label_Semaforo_Math_Verde;
    private javax.swing.JLabel Label_Titulo_Diagnostica;
    private javax.persistence.EntityManager entityManager;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JLabel jLabel_FondoIcfes;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField_Nombre_Apellido_E;
    public static javax.swing.JTextField jTextField_Resultado_InglesD;
    public static javax.swing.JTextField jTextField_Resultado_LectCritD;
    public static javax.swing.JTextField jTextField_Resultado_MathD;
    private java.util.List<ventanas.Estudiante.Notasdiag> notasdiagList;
    private javax.persistence.Query notasdiagQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
