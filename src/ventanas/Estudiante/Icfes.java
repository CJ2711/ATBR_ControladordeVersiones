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

public class Icfes extends javax.swing.JFrame {

    /**
     * Creates new form Icfes
     */
    public Icfes() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante]");
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
        Label_Semaforo_CN_Rojo.setVisible(false);
        Label_Semaforo_CN_Amarillo.setVisible(false);
        Label_Semaforo_CN_Verde.setVisible(false);
        Label_Semaforo_CS_Rojo.setVisible(false);
        Label_Semaforo_CS_Amarillo.setVisible(false);
        Label_Semaforo_CS_Verde.setVisible(false);
        Label_Semaforo_Ingles_Rojo.setVisible(false);
        Label_Semaforo_Ingles_Amarillo.setVisible(false);
        Label_Semaforo_Ingles_Verde.setVisible(false);

        resultadosIcfesText(0);
        resultadosIcfesText(1);
        resultadosIcfesText(2);
        resultadosIcfesText(3);

        setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoProgramaGrande.png"));
        return retvalue;
    }

    public void resultadosIcfesText(int numero) {
        if (username.equals("1957601")) {
            Object valorX0Y1 = jTable1.getValueAt(0, 1);
            Object valorX0Y2 = jTable1.getValueAt(0, 2);
            Object valorX0Y3 = jTable1.getValueAt(0, 3);
            Object valorX0Y4 = jTable1.getValueAt(0, 4);
            Object valorX0Y5 = jTable1.getValueAt(0, 5);
            Object valorX0Y6 = jTable1.getValueAt(0, 6);

            int math = Integer.parseInt(valorX0Y1.toString());
            int lc = Integer.parseInt(valorX0Y2.toString());
            int cn = Integer.parseInt(valorX0Y3.toString());
            int cs = Integer.parseInt(valorX0Y4.toString());
            int ingles = Integer.parseInt(valorX0Y6.toString());

            String mathS = valorX0Y1.toString();
            String lcS = valorX0Y2.toString();
            String cnS = valorX0Y3.toString();
            String csS = valorX0Y4.toString();
            String inglesS = valorX0Y5.toString();
            String ptTotalS = valorX0Y6.toString();

            jTextField_Puntaje_Math.setText(mathS);
            jTextField_Puntaje_LC.setText(lcS);
            jTextField_Puntaje_CN.setText(cnS);
            jTextField_Puntaje_SC.setText(csS);
            jTextField_Puntaje_Ingles.setText(inglesS);
            jTextField_Puntaje_Total.setText(ptTotalS);

            //SEMAFORO MATEMÁTICAS
            if ((math >= 0) && (math <= 30)) {
                Label_Semaforo_Math_Rojo.setVisible(true);
            }
            if ((math >= 31) && (math <= 59)) {
                Label_Semaforo_Math_Amarillo.setVisible(true);
            }
            if ((math >= 60) && (math <= 100)) {
                Label_Semaforo_Math_Verde.setVisible(true);
            }

            //SEMAFORO LECTURA CRÍTICA
            if ((lc >= 0) && (lc <= 30)) {
                Label_Semaforo_LC_Rojo.setVisible(true);
            }
            if ((lc >= 31) && (lc <= 59)) {
                Label_Semaforo_LC_Amarillo.setVisible(true);
            }
            if ((lc >= 60) && (lc <= 100)) {;
                Label_Semaforo_LC_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS NATURALES
            if ((cn >= 0) && (cn <= 30)) {
                Label_Semaforo_CN_Rojo.setVisible(true);
            }
            if ((cn >= 31) && (cn <= 59)) {
                Label_Semaforo_CN_Amarillo.setVisible(true);
            }
            if ((cn >= 60) && (cn <= 100)) {
                Label_Semaforo_CN_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS SOCIALES
            if ((cs >= 0) && (cs <= 30)) {
                Label_Semaforo_CS_Rojo.setVisible(true);
            }
            if ((cs >= 31) && (cs <= 59)) {
                Label_Semaforo_CS_Amarillo.setVisible(true);
            }
            if ((cs >= 60) && (cs <= 100)) {
                Label_Semaforo_CS_Verde.setVisible(true);
            }

            //SEMAFORO INGLÉS
            if ((ingles >= 0) && (ingles <= 30)) {
                Label_Semaforo_Ingles_Rojo.setVisible(true);
            }
            if ((ingles >= 31) && (ingles <= 59)) {
                Label_Semaforo_Ingles_Amarillo.setVisible(true);
            }
            if ((ingles >= 60) && (ingles <= 100)) {
                Label_Semaforo_Ingles_Verde.setVisible(true);
            }

        }

        if (username.equals("1958205")) {
            Object valorX1Y1 = jTable1.getValueAt(1, 1);
            Object valorX1Y2 = jTable1.getValueAt(1, 2);
            Object valorX1Y3 = jTable1.getValueAt(1, 3);
            Object valorX1Y4 = jTable1.getValueAt(1, 4);
            Object valorX1Y5 = jTable1.getValueAt(1, 5);
            Object valorX1Y6 = jTable1.getValueAt(1, 6);

            int math = Integer.parseInt(valorX1Y1.toString());
            int lc = Integer.parseInt(valorX1Y2.toString());
            int cn = Integer.parseInt(valorX1Y3.toString());
            int cs = Integer.parseInt(valorX1Y4.toString());
            int ingles = Integer.parseInt(valorX1Y6.toString());

            String mathS = valorX1Y1.toString();
            String lcS = valorX1Y2.toString();
            String cnS = valorX1Y3.toString();
            String csS = valorX1Y4.toString();
            String inglesS = valorX1Y5.toString();
            String ptTotalS = valorX1Y6.toString();

            jTextField_Puntaje_Math.setText(mathS);
            jTextField_Puntaje_LC.setText(lcS);
            jTextField_Puntaje_CN.setText(cnS);
            jTextField_Puntaje_SC.setText(csS);
            jTextField_Puntaje_Ingles.setText(inglesS);
            jTextField_Puntaje_Total.setText(ptTotalS);

            //SEMAFORO MATEMÁTICAS
            if ((math >= 0) && (math <= 30)) {
                Label_Semaforo_Math_Rojo.setVisible(true);
            }
            if ((math >= 31) && (math <= 59)) {
                Label_Semaforo_Math_Amarillo.setVisible(true);
            }
            if ((math >= 60) && (math <= 100)) {
                Label_Semaforo_Math_Verde.setVisible(true);
            }

            //SEMAFORO LECTURA CRÍTICA
            if ((lc >= 0) && (lc <= 30)) {
                Label_Semaforo_LC_Rojo.setVisible(true);
            }
            if ((lc >= 31) && (lc <= 59)) {
                Label_Semaforo_LC_Amarillo.setVisible(true);
            }
            if ((lc >= 60) && (lc <= 100)) {;
                Label_Semaforo_LC_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS NATURALES
            if ((cn >= 0) && (cn <= 30)) {
                Label_Semaforo_CN_Rojo.setVisible(true);
            }
            if ((cn >= 31) && (cn <= 59)) {
                Label_Semaforo_CN_Amarillo.setVisible(true);
            }
            if ((cn >= 60) && (cn <= 100)) {
                Label_Semaforo_CN_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS SOCIALES
            if ((cs >= 0) && (cs <= 30)) {
                Label_Semaforo_CS_Rojo.setVisible(true);
            }
            if ((cs >= 31) && (cs <= 59)) {
                Label_Semaforo_CS_Amarillo.setVisible(true);
            }
            if ((cs >= 60) && (cs <= 100)) {
                Label_Semaforo_CS_Verde.setVisible(true);
            }

            //SEMAFORO INGLÉS
            if ((ingles >= 0) && (ingles <= 30)) {
                Label_Semaforo_Ingles_Rojo.setVisible(true);
            }
            if ((ingles >= 31) && (ingles <= 59)) {
                Label_Semaforo_Ingles_Amarillo.setVisible(true);
            }
            if ((ingles >= 60) && (ingles <= 100)) {
                Label_Semaforo_Ingles_Verde.setVisible(true);
            }

        }

        if (username.equals("1958266")) {
            Object valorX2Y1 = jTable1.getValueAt(2, 1);
            Object valorX2Y2 = jTable1.getValueAt(2, 2);
            Object valorX2Y3 = jTable1.getValueAt(2, 3);
            Object valorX2Y4 = jTable1.getValueAt(2, 4);
            Object valorX2Y5 = jTable1.getValueAt(2, 5);
            Object valorX2Y6 = jTable1.getValueAt(2, 6);

            int math = Integer.parseInt(valorX2Y1.toString());
            int lc = Integer.parseInt(valorX2Y2.toString());
            int cn = Integer.parseInt(valorX2Y3.toString());
            int cs = Integer.parseInt(valorX2Y4.toString());
            int ingles = Integer.parseInt(valorX2Y6.toString());

            String mathS = valorX2Y1.toString();
            String lcS = valorX2Y2.toString();
            String cnS = valorX2Y3.toString();
            String csS = valorX2Y4.toString();
            String inglesS = valorX2Y5.toString();
            String ptTotalS = valorX2Y6.toString();

            jTextField_Puntaje_Math.setText(mathS);
            jTextField_Puntaje_LC.setText(lcS);
            jTextField_Puntaje_CN.setText(cnS);
            jTextField_Puntaje_SC.setText(csS);
            jTextField_Puntaje_Ingles.setText(inglesS);
            jTextField_Puntaje_Total.setText(ptTotalS);

            //SEMAFORO MATEMÁTICAS
            if ((math >= 0) && (math <= 30)) {
                Label_Semaforo_Math_Rojo.setVisible(true);
            }
            if ((math >= 31) && (math <= 59)) {
                Label_Semaforo_Math_Amarillo.setVisible(true);
            }
            if ((math >= 60) && (math <= 100)) {
                Label_Semaforo_Math_Verde.setVisible(true);
            }

            //SEMAFORO LECTURA CRÍTICA
            if ((lc >= 0) && (lc <= 30)) {
                Label_Semaforo_LC_Rojo.setVisible(true);
            }
            if ((lc >= 31) && (lc <= 59)) {
                Label_Semaforo_LC_Amarillo.setVisible(true);
            }
            if ((lc >= 60) && (lc <= 100)) {;
                Label_Semaforo_LC_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS NATURALES
            if ((cn >= 0) && (cn <= 30)) {
                Label_Semaforo_CN_Rojo.setVisible(true);
            }
            if ((cn >= 31) && (cn <= 59)) {
                Label_Semaforo_CN_Amarillo.setVisible(true);
            }
            if ((cn >= 60) && (cn <= 100)) {
                Label_Semaforo_CN_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS SOCIALES
            if ((cs >= 0) && (cs <= 30)) {
                Label_Semaforo_CS_Rojo.setVisible(true);
            }
            if ((cs >= 31) && (cs <= 59)) {
                Label_Semaforo_CS_Amarillo.setVisible(true);
            }
            if ((cs >= 60) && (cs <= 100)) {
                Label_Semaforo_CS_Verde.setVisible(true);
            }

            //SEMAFORO INGLÉS
            if ((ingles >= 0) && (ingles <= 30)) {
                Label_Semaforo_Ingles_Rojo.setVisible(true);
            }
            if ((ingles >= 31) && (ingles <= 59)) {
                Label_Semaforo_Ingles_Amarillo.setVisible(true);
            }
            if ((ingles >= 60) && (ingles <= 100)) {
                Label_Semaforo_Ingles_Verde.setVisible(true);
            }

        }

        if (username.equals("1958283")) {
            Object valorX3Y1 = jTable1.getValueAt(3, 1);
            Object valorX3Y2 = jTable1.getValueAt(3, 2);
            Object valorX3Y3 = jTable1.getValueAt(3, 3);
            Object valorX3Y4 = jTable1.getValueAt(3, 4);
            Object valorX3Y5 = jTable1.getValueAt(3, 5);
            Object valorX3Y6 = jTable1.getValueAt(3, 6);

            int math = Integer.parseInt(valorX3Y1.toString());
            int lc = Integer.parseInt(valorX3Y2.toString());
            int cn = Integer.parseInt(valorX3Y3.toString());
            int cs = Integer.parseInt(valorX3Y4.toString());
            int ingles = Integer.parseInt(valorX3Y6.toString());

            String mathS = valorX3Y1.toString();
            String lcS = valorX3Y2.toString();
            String cnS = valorX3Y3.toString();
            String csS = valorX3Y4.toString();
            String inglesS = valorX3Y5.toString();
            String ptTotalS = valorX3Y6.toString();

            jTextField_Puntaje_Math.setText(mathS);
            jTextField_Puntaje_LC.setText(lcS);
            jTextField_Puntaje_CN.setText(cnS);
            jTextField_Puntaje_SC.setText(csS);
            jTextField_Puntaje_Ingles.setText(inglesS);
            jTextField_Puntaje_Total.setText(ptTotalS);

            //SEMAFORO MATEMÁTICAS
            if ((math >= 0) && (math <= 30)) {
                Label_Semaforo_Math_Rojo.setVisible(true);
            }
            if ((math >= 31) && (math <= 59)) {
                Label_Semaforo_Math_Amarillo.setVisible(true);
            }
            if ((math >= 60) && (math <= 100)) {
                Label_Semaforo_Math_Verde.setVisible(true);
            }

            //SEMAFORO LECTURA CRÍTICA
            if ((lc >= 0) && (lc <= 30)) {
                Label_Semaforo_LC_Rojo.setVisible(true);
            }
            if ((lc >= 31) && (lc <= 59)) {
                Label_Semaforo_LC_Amarillo.setVisible(true);
            }
            if ((lc >= 60) && (lc <= 100)) {;
                Label_Semaforo_LC_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS NATURALES
            if ((cn >= 0) && (cn <= 30)) {
                Label_Semaforo_CN_Rojo.setVisible(true);
            }
            if ((cn >= 31) && (cn <= 59)) {
                Label_Semaforo_CN_Amarillo.setVisible(true);
            }
            if ((cn >= 60) && (cn <= 100)) {
                Label_Semaforo_CN_Verde.setVisible(true);
            }

            //SEMAFORO CIENCIAS SOCIALES
            if ((cs >= 0) && (cs <= 30)) {
                Label_Semaforo_CS_Rojo.setVisible(true);
            }
            if ((cs >= 31) && (cs <= 59)) {
                Label_Semaforo_CS_Amarillo.setVisible(true);
            }
            if ((cs >= 60) && (cs <= 100)) {
                Label_Semaforo_CS_Verde.setVisible(true);
            }

            //SEMAFORO INGLÉS
            if ((ingles >= 0) && (ingles <= 30)) {
                Label_Semaforo_Ingles_Rojo.setVisible(true);
            }
            if ((ingles >= 31) && (ingles <= 59)) {
                Label_Semaforo_Ingles_Amarillo.setVisible(true);
            }
            if ((ingles >= 60) && (ingles <= 100)) {
                Label_Semaforo_Ingles_Verde.setVisible(true);
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
        resultadosicfesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Resultadosicfes r");
        resultadosicfesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultadosicfesQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        Button_Return_Inicio = new javax.swing.JButton();
        Label_Titulo_Icfes = new javax.swing.JLabel();
        Label_Icfes_Math = new javax.swing.JLabel();
        Label_Icfes_LC = new javax.swing.JLabel();
        Label_Icfes_CN = new javax.swing.JLabel();
        Label_Icfes_SC = new javax.swing.JLabel();
        Label_Icfes_Ingles = new javax.swing.JLabel();
        Button_Menu_Opc = new javax.swing.JButton();
        jTextField_Nombre_Apellido_E = new javax.swing.JTextField();
        Label_Foto_Perfil = new javax.swing.JLabel();
        jTextField_Puntaje_Math = new javax.swing.JTextField();
        jTextField_Puntaje_LC = new javax.swing.JTextField();
        jTextField_Puntaje_CN = new javax.swing.JTextField();
        jTextField_Puntaje_SC = new javax.swing.JTextField();
        jTextField_Puntaje_Ingles = new javax.swing.JTextField();
        Label_Semaforo_Math_Rojo = new javax.swing.JLabel();
        Label_Semaforo_Math_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Math_Verde = new javax.swing.JLabel();
        Label_Semaforo_LC_Rojo = new javax.swing.JLabel();
        Label_Semaforo_LC_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_LC_Verde = new javax.swing.JLabel();
        Label_Semaforo_CN_Rojo = new javax.swing.JLabel();
        Label_Semaforo_CN_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_CN_Verde = new javax.swing.JLabel();
        Label_Semaforo_CS_Rojo = new javax.swing.JLabel();
        Label_Semaforo_CS_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_CS_Verde = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Rojo = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Verde = new javax.swing.JLabel();
        Label_Puntaje_Total = new javax.swing.JLabel();
        jTextField_Puntaje_Total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel_FondoIcfes = new javax.swing.JLabel();
        jLabel_FondoIcfes1 = new javax.swing.JLabel();
        Label_Semaforo_Math_Rojo1 = new javax.swing.JLabel();
        Label_Semaforo_Math_Amarillo1 = new javax.swing.JLabel();
        Label_Semaforo_Math_Verde1 = new javax.swing.JLabel();
        Label_Semaforo_LC_Rojo1 = new javax.swing.JLabel();
        Label_Semaforo_LC_Amarillo1 = new javax.swing.JLabel();
        Label_Semaforo_LC_Verde1 = new javax.swing.JLabel();
        Label_Semaforo_CN_Rojo1 = new javax.swing.JLabel();
        Label_Semaforo_CN_Amarillo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProgramaPeq.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        getContentPane().add(Label_Icfes_Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 160, 50));
        Label_Icfes_Math.getAccessibleContext().setAccessibleDescription("");

        Label_Icfes_LC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_LC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_LC.setText("LECTURA CRÍTICA");
        Label_Icfes_LC.setToolTipText("");
        Label_Icfes_LC.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Label_Icfes_LC.setName(""); // NOI18N
        Label_Icfes_LC.setOpaque(true);
        getContentPane().add(Label_Icfes_LC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 200, 50));

        Label_Icfes_CN.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_CN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_CN.setText("CIENCIAS NATURALES");
        Label_Icfes_CN.setOpaque(true);
        getContentPane().add(Label_Icfes_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 230, 50));

        Label_Icfes_SC.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_SC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_SC.setText("SOCIALES / CIUDADANÍA");
        Label_Icfes_SC.setOpaque(true);
        getContentPane().add(Label_Icfes_SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 260, 50));

        Label_Icfes_Ingles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Icfes_Ingles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Icfes_Ingles.setText("INGLÉS");
        Label_Icfes_Ingles.setOpaque(true);
        getContentPane().add(Label_Icfes_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 100, 50));

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

        jTextField_Puntaje_Math.setEditable(false);
        jTextField_Puntaje_Math.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_Math.setFocusable(false);
        jTextField_Puntaje_Math.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Puntaje_MathActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Puntaje_Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 50, 50));

        jTextField_Puntaje_LC.setEditable(false);
        jTextField_Puntaje_LC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_LC.setFocusable(false);
        getContentPane().add(jTextField_Puntaje_LC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 50, 50));

        jTextField_Puntaje_CN.setEditable(false);
        jTextField_Puntaje_CN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_CN.setFocusable(false);
        getContentPane().add(jTextField_Puntaje_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 50, 50));

        jTextField_Puntaje_SC.setEditable(false);
        jTextField_Puntaje_SC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_SC.setFocusable(false);
        getContentPane().add(jTextField_Puntaje_SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 50, 50));

        jTextField_Puntaje_Ingles.setEditable(false);
        jTextField_Puntaje_Ingles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_Ingles.setFocusable(false);
        getContentPane().add(jTextField_Puntaje_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 50, 50));

        Label_Semaforo_Math_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_Math_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_Math_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Math_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_Math_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_Math_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Math_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_LC_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_LC_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_LC_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_LC_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_LC_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_LC_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_LC_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_CN_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_CN_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CN_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        Label_Semaforo_CN_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_CN_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CN_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        Label_Semaforo_CN_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_CN_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CN_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        Label_Semaforo_CS_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_CS_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CS_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        Label_Semaforo_CS_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_CS_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CS_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        Label_Semaforo_CS_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_CS_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_CS_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        Label_Semaforo_Ingles_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_Ingles_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        Label_Semaforo_Ingles_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Ingles_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        Label_Semaforo_Ingles_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_Ingles_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        Label_Puntaje_Total.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Label_Puntaje_Total.setText("PUNTAJE TOTAL:");
        getContentPane().add(Label_Puntaje_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jTextField_Puntaje_Total.setEditable(false);
        jTextField_Puntaje_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Puntaje_Total.setFocusable(false);
        getContentPane().add(jTextField_Puntaje_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 70, 30));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, resultadosicfesList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstudiante}"));
        columnBinding.setColumnName("Id Estudiante");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptMT}"));
        columnBinding.setColumnName("Pt MT");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptLC}"));
        columnBinding.setColumnName("Pt LC");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptCN}"));
        columnBinding.setColumnName("Pt CN");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptCS}"));
        columnBinding.setColumnName("Pt CS");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptIN}"));
        columnBinding.setColumnName("Pt IN");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ptTotal}"));
        columnBinding.setColumnName("Pt Total");
        columnBinding.setColumnClass(Integer.class);
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

        jLabel_FondoIcfes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icfes.png"))); // NOI18N
        getContentPane().add(jLabel_FondoIcfes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Label_Semaforo_Math_Rojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_Math_Rojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_Math_Amarillo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_Math_Amarillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_Math_Verde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_Math_Verde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        Label_Semaforo_LC_Rojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_LC_Rojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_LC_Amarillo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_LC_Amarillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_LC_Verde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_LC_Verde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        Label_Semaforo_CN_Rojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_CN_Rojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        Label_Semaforo_CN_Amarillo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        getContentPane().add(Label_Semaforo_CN_Amarillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

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

    private void jTextField_Puntaje_MathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Puntaje_MathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Puntaje_MathActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Menu_Opc;
    private javax.swing.JButton Button_Return_Inicio;
    private javax.swing.JLabel Label_Foto_Perfil;
    private javax.swing.JLabel Label_Icfes_CN;
    private javax.swing.JLabel Label_Icfes_Ingles;
    private javax.swing.JLabel Label_Icfes_LC;
    private javax.swing.JLabel Label_Icfes_Math;
    private javax.swing.JLabel Label_Icfes_SC;
    private javax.swing.JLabel Label_Puntaje_Total;
    private javax.swing.JLabel Label_Semaforo_CN_Amarillo;
    private javax.swing.JLabel Label_Semaforo_CN_Amarillo1;
    private javax.swing.JLabel Label_Semaforo_CN_Rojo;
    private javax.swing.JLabel Label_Semaforo_CN_Rojo1;
    private javax.swing.JLabel Label_Semaforo_CN_Verde;
    private javax.swing.JLabel Label_Semaforo_CS_Amarillo;
    private javax.swing.JLabel Label_Semaforo_CS_Rojo;
    private javax.swing.JLabel Label_Semaforo_CS_Verde;
    private javax.swing.JLabel Label_Semaforo_Ingles_Amarillo;
    private javax.swing.JLabel Label_Semaforo_Ingles_Rojo;
    private javax.swing.JLabel Label_Semaforo_Ingles_Verde;
    private javax.swing.JLabel Label_Semaforo_LC_Amarillo;
    private javax.swing.JLabel Label_Semaforo_LC_Amarillo1;
    private javax.swing.JLabel Label_Semaforo_LC_Rojo;
    private javax.swing.JLabel Label_Semaforo_LC_Rojo1;
    private javax.swing.JLabel Label_Semaforo_LC_Verde;
    private javax.swing.JLabel Label_Semaforo_LC_Verde1;
    private javax.swing.JLabel Label_Semaforo_Math_Amarillo;
    private javax.swing.JLabel Label_Semaforo_Math_Amarillo1;
    private javax.swing.JLabel Label_Semaforo_Math_Rojo;
    private javax.swing.JLabel Label_Semaforo_Math_Rojo1;
    private javax.swing.JLabel Label_Semaforo_Math_Verde;
    private javax.swing.JLabel Label_Semaforo_Math_Verde1;
    private javax.swing.JLabel Label_Titulo_Icfes;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_FondoIcfes;
    private javax.swing.JLabel jLabel_FondoIcfes1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField_Nombre_Apellido_E;
    public static javax.swing.JTextField jTextField_Puntaje_CN;
    public static javax.swing.JTextField jTextField_Puntaje_Ingles;
    public static javax.swing.JTextField jTextField_Puntaje_LC;
    public static javax.swing.JTextField jTextField_Puntaje_Math;
    public static javax.swing.JTextField jTextField_Puntaje_SC;
    public static javax.swing.JTextField jTextField_Puntaje_Total;
    private java.util.List<ventanas.Estudiante.Resultadosicfes> resultadosicfesList;
    private javax.persistence.Query resultadosicfesQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
