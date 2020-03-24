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

import ventanas.Estudiante.Icfes;
import ventanas.Estudiante.Calculo;
import BD.Conexion;
import ds.desktop.notify.DesktopNotify;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ventanas.Inicio.username;

public class Estudiantes_Area extends javax.swing.JFrame {

    /**
     * Creates new form Estudiantes_Area
     */
    public Estudiantes_Area() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante]");
        this.setLocationRelativeTo(null);
        setResizable(false);

        jScrollPane1.setVisible(false);
        jList1.setVisible(false);
        Label_Semaforo_Calculo_Rojo.setVisible(false);
        Label_Semaforo_Calculo_Amarillo.setVisible(false);
        Label_Semaforo_Calculo_Verde.setVisible(false);

        jScrollPane2.setVisible(false);

        promedioFila();
        setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoProgramaGrande.png"));
        return retvalue;
    }

    public void promedioFila() {

        if (username.equals("1957601")) {
            Object valorX0Y1 = jTable1.getValueAt(0, 1);
            Object valorX0Y2 = jTable1.getValueAt(0, 2);
            Object valorX0Y3 = jTable1.getValueAt(0, 3);

            float vx0y1 = Float.parseFloat(valorX0Y1.toString());
            float vx0y2 = Float.parseFloat(valorX0Y2.toString());
            float vx0y3 = Float.parseFloat(valorX0Y3.toString());

            float defX0Y0 = (vx0y1 + vx0y2 + vx0y3) / 3;

            if ((defX0Y0 >= (float) 0.00) && (defX0Y0 <= (float) 2.99)) {
                Label_Semaforo_Calculo_Rojo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es inferior a 3.
                DesktopNotify.showDesktopMessage("Advertencia Cálculo I:",
                        "Usted podría incurrir en situación de bajo rendimiento, por favor considere la opcion de"
                        + " cancelación en lo posible.",
                        DesktopNotify.ERROR);//Tipo ERROR.
            }
                //Podemos utilizar un formulario Frame o cualquier otro; mostrar un JFrame o JDialog         
                if ((defX0Y0 >= (float) 3.00) && (defX0Y0 <= (float) 3.99)) {
                    Label_Semaforo_Calculo_Amarillo.setVisible(true);
                    // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es superior a 3,
                    // pero inferior a 4.
                    DesktopNotify.showDesktopMessage("Aviso Cálculo I:",
                            "Usted por el momento no podría incurrir en situación de bajo rendimiento, no obstante,"
                            + " descuidos en la materia podrían llevarlo a ello.",
                            DesktopNotify.WARNING);//Tipo WARNING
                }
                if ((defX0Y0 >= (float) 4.00) && (defX0Y0 <= (float) 5.00)) {
                    Label_Semaforo_Calculo_Verde.setVisible(true);
                }

            }
        if (username.equals("1958205")) {
            Object valorX1Y1 = jTable1.getValueAt(1, 1);
            Object valorX1Y2 = jTable1.getValueAt(1, 2);
            Object valorX1Y3 = jTable1.getValueAt(1, 3);

            float vx2y1 = Float.parseFloat(valorX1Y1.toString());
            float vx2y2 = Float.parseFloat(valorX1Y2.toString());
            float vx2y3 = Float.parseFloat(valorX1Y3.toString());

            float defX1Y1 = (vx2y1 + vx2y2 + vx2y3) / 3;

            if ((defX1Y1 >= (float) 0.00) && (defX1Y1 <= (float) 2.99)) {
                Label_Semaforo_Calculo_Rojo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es inferior a 3.
                DesktopNotify.showDesktopMessage("Advertencia Cálculo I:",
                        "Usted podría incurrir en situación de bajo rendimiento, por favor considere la opcion de"
                        + " cancelación en lo posible.",
                        DesktopNotify.ERROR);//Tipo ERROR.
            }
            if ((defX1Y1 >= (float) 3.00) && (defX1Y1 <= (float) 3.99)) {
                Label_Semaforo_Calculo_Amarillo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es superior a 3,
                // pero inferior a 4.
                DesktopNotify.showDesktopMessage("Aviso Cálculo I:",
                        "Usted por el momento no podría incurrir en situación de bajo rendimiento, no obstante,"
                        + " descuidos en la materia podrían llevarlo a ello.",
                        DesktopNotify.WARNING);//Tipo WARNING
            }
            if ((defX1Y1 >= (float) 4.00) && (defX1Y1 <= (float) 5.00)) {
                Label_Semaforo_Calculo_Verde.setVisible(true);
            }

        }

        if (username.equals("1958266")) {
            Object valorX2Y1 = jTable1.getValueAt(2, 1);
            Object valorX2Y2 = jTable1.getValueAt(2, 2);
            Object valorX2Y3 = jTable1.getValueAt(2, 3);

            float vx3y1 = Float.parseFloat(valorX2Y1.toString());
            float vx3y2 = Float.parseFloat(valorX2Y2.toString());
            float vx3y3 = Float.parseFloat(valorX2Y3.toString());

            float defX2Y2 = (vx3y1 + vx3y2 + vx3y3) / 3;

            if ((defX2Y2 >= (float) 0.00) && (defX2Y2 <= (float) 2.99)) {
                Label_Semaforo_Calculo_Rojo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es inferior a 3.
                DesktopNotify.showDesktopMessage("Advertencia Cálculo I:",
                        "Usted podría incurrir en situación de bajo rendimiento, por favor considere la opcion de"
                        + " cancelación en lo posible.",
                        DesktopNotify.ERROR);//Tipo ERROR.
            }
            if ((defX2Y2 >= (float) 3.00) && (defX2Y2 <= (float) 3.99)) {
                Label_Semaforo_Calculo_Amarillo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es superior a 3,
                // pero inferior a 4.
                DesktopNotify.showDesktopMessage("Aviso Cálculo I:",
                        "Usted por el momento no podría incurrir en situación de bajo rendimiento, no obstante,"
                        + " descuidos en la materia podrían llevarlo a ello.",
                        DesktopNotify.WARNING);//Tipo WARNING
            }
            if ((defX2Y2 >= (float) 4.00) && (defX2Y2 <= (float) 5.00)) {
                Label_Semaforo_Calculo_Verde.setVisible(true);
            }

        }

        if (username.equals("1958283")) {
            Object valorX3Y1 = jTable1.getValueAt(3, 1);
            Object valorX3Y2 = jTable1.getValueAt(3, 2);
            Object valorX3Y3 = jTable1.getValueAt(3, 3);

            float vx4y1 = Float.parseFloat(valorX3Y1.toString());
            float vx4y2 = Float.parseFloat(valorX3Y2.toString());
            float vx4y3 = Float.parseFloat(valorX3Y3.toString());

            float defX3Y3 = (vx4y1 + vx4y2 + vx4y3) / 3;

            if ((defX3Y3 >= (float) 0.00) && (defX3Y3 <= (float) 2.99)) {
                Label_Semaforo_Calculo_Rojo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es inferior a 3.
                DesktopNotify.showDesktopMessage("Advertencia Cálculo I:",
                        "Usted podría incurrir en situación de bajo rendimiento, por favor considere la opcion de"
                        + " cancelación en lo posible.",
                        DesktopNotify.ERROR);//Tipo ERROR.
            }
            if ((defX3Y3 >= (float) 3.00) && (defX3Y3 <= (float) 3.99)) {
                Label_Semaforo_Calculo_Amarillo.setVisible(true);
                // Notificación de Escritorio: Muestra la advertencia con base a si la nota del estudiante es superior a 3,
                // pero inferior a 4.
                DesktopNotify.showDesktopMessage("Aviso Cálculo I:",
                        "Usted por el momento no podría incurrir en situación de bajo rendimiento, no obstante,"
                        + " descuidos en la materia podrían llevarlo a ello.",
                        DesktopNotify.WARNING);//Tipo WARNING
            }
            if ((defX3Y3 >= (float) 4.00) && (defX3Y3 <= (float) 5.00)) {
                Label_Semaforo_Calculo_Verde.setVisible(true);
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
        notaseQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Notase n");
        notaseList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : notaseQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Label_Semestre = new javax.swing.JLabel();
        Label_Titulo_Prueba = new javax.swing.JLabel();
        Label_Titulo_Materias = new javax.swing.JLabel();
        Label_Titulo_Notificaciones = new javax.swing.JLabel();
        Button_Icfes = new javax.swing.JButton();
        Button_Diagnostica = new javax.swing.JButton();
        jTextField_Nombre_Apellido_E = new javax.swing.JTextField();
        Button_Menu_Opc = new javax.swing.JButton();
        Label_Foto_Perfil = new javax.swing.JLabel();
        Button_TGS = new javax.swing.JButton();
        Button_FDP = new javax.swing.JButton();
        Button_Ingles = new javax.swing.JButton();
        Button_ITI = new javax.swing.JButton();
        Button_Calculo = new javax.swing.JButton();
        Button_DeporteFormativo = new javax.swing.JButton();
        Button_Espanol = new javax.swing.JButton();
        Label_Semaforo_Calculo_Rojo = new javax.swing.JLabel();
        Label_Semaforo_Calculo_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Calculo_Verde = new javax.swing.JLabel();
        Label_Semaforo_FdP_Verde = new javax.swing.JLabel();
        Label_Semaforo_TGS_Verde = new javax.swing.JLabel();
        Label_Semaforo_ITI_Verde = new javax.swing.JLabel();
        Label_Semaforo_Ingles_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_Espanol_Amarillo = new javax.swing.JLabel();
        Label_Semaforo_DeporteFormativo_Verde = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_FondoEstudiantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 150, 80));

        Label_Semestre.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Semestre.setText("PERIODO 2019 - 2");
        getContentPane().add(Label_Semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 240, -1));

        Label_Titulo_Prueba.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Prueba.setText("PRUEBAS");
        getContentPane().add(Label_Titulo_Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 30));

        Label_Titulo_Materias.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Materias.setText("MATERIAS");
        getContentPane().add(Label_Titulo_Materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 160, -1, 30));

        Label_Titulo_Notificaciones.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Notificaciones.setText("NOTIFICACIONES");
        getContentPane().add(Label_Titulo_Notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, 30));

        Button_Icfes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Icfes.setText("ICFES");
        Button_Icfes.setToolTipText("Prueba ICFES");
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
        Button_Diagnostica.setToolTipText("Prueba Diagnostica");
        Button_Diagnostica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Diagnostica.setOpaque(false);
        getContentPane().add(Button_Diagnostica, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 375, 180, 50));

        jTextField_Nombre_Apellido_E.setEditable(false);
        jTextField_Nombre_Apellido_E.setFocusable(false);
        jTextField_Nombre_Apellido_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Nombre_Apellido_EActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nombre_Apellido_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 200, 30));

        Button_Menu_Opc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DesplegableOpt.png"))); // NOI18N
        Button_Menu_Opc.setContentAreaFilled(false);
        Button_Menu_Opc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Menu_Opc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Menu_OpcMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Menu_Opc, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 30, -1));

        Label_Foto_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoPerfil.png"))); // NOI18N
        getContentPane().add(Label_Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

        Button_TGS.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_TGS.setText("T.G.S");
        Button_TGS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_TGS.setOpaque(false);
        Button_TGS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TGSActionPerformed(evt);
            }
        });
        getContentPane().add(Button_TGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 160, -1));

        Button_FDP.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_FDP.setText("F.D.P");
        Button_FDP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_FDP.setOpaque(false);
        getContentPane().add(Button_FDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 160, -1));

        Button_Ingles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Ingles.setText("INGLÉS I");
        Button_Ingles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Ingles.setOpaque(false);
        getContentPane().add(Button_Ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 160, -1));

        Button_ITI.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_ITI.setText("I.T.I");
        Button_ITI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_ITI.setOpaque(false);
        getContentPane().add(Button_ITI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 160, -1));

        Button_Calculo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Calculo.setText("CÁLCULO I");
        Button_Calculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Calculo.setOpaque(false);
        Button_Calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CalculoActionPerformed(evt);
            }
        });
        Button_Calculo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Button_CalculoPropertyChange(evt);
            }
        });
        getContentPane().add(Button_Calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 160, -1));

        Button_DeporteFormativo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_DeporteFormativo.setText("DEP. FORMA");
        Button_DeporteFormativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_DeporteFormativo.setOpaque(false);
        getContentPane().add(Button_DeporteFormativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 160, -1));

        Button_Espanol.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Espanol.setText("ESPAÑOL");
        Button_Espanol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Espanol.setOpaque(false);
        getContentPane().add(Button_Espanol, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 160, -1));

        Label_Semaforo_Calculo_Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoRojo.png"))); // NOI18N
        Label_Semaforo_Calculo_Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Label_Semaforo_Calculo_Rojo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Label_Semaforo_Calculo_RojoPropertyChange(evt);
            }
        });
        getContentPane().add(Label_Semaforo_Calculo_Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        Label_Semaforo_Calculo_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Calculo_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Calculo_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        Label_Semaforo_Calculo_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_Calculo_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Calculo_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        Label_Semaforo_FdP_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_FdP_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_FdP_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        Label_Semaforo_TGS_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_TGS_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_TGS_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        Label_Semaforo_ITI_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_ITI_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_ITI_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        Label_Semaforo_Ingles_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Ingles_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Ingles_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        Label_Semaforo_Espanol_Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoAmarillo.png"))); // NOI18N
        Label_Semaforo_Espanol_Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_Espanol_Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        Label_Semaforo_DeporteFormativo_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SemaforoVerde.png"))); // NOI18N
        Label_Semaforo_DeporteFormativo_Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Label_Semaforo_DeporteFormativo_Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProgramaPeq.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, notaseList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstudiante}"));
        columnBinding.setColumnName("Id Estudiante");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota1}"));
        columnBinding.setColumnName("Nota1");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota2}"));
        columnBinding.setColumnName("Nota2");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota3}"));
        columnBinding.setColumnName("Nota3");
        columnBinding.setColumnClass(Float.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, 120));

        jLabel_FondoEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioEstudiante.png"))); // NOI18N
        getContentPane().add(jLabel_FondoEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Button_IcfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IcfesActionPerformed
        dispose(); //Desaparecer ventana 'Estudiantes_Area'
        new Icfes().setVisible(true); //Mostrar en pantalla ventana 'Icfes'
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
                Icfes.jTextField_Nombre_Apellido_E.setText(nombreApeE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Button_IcfesActionPerformed

    private void jTextField_Nombre_Apellido_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nombre_Apellido_EActionPerformed

    }//GEN-LAST:event_jTextField_Nombre_Apellido_EActionPerformed

    private void Button_Menu_OpcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Menu_OpcMouseClicked
        jScrollPane1.setVisible(true);
        jList1.setVisible(true);
    }//GEN-LAST:event_Button_Menu_OpcMouseClicked

    private void Button_CalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CalculoActionPerformed
        dispose(); //Desaparecer ventana 'Estudiantes_Area'
        new Calculo().setVisible(true); //Mostrar en pantalla ventana 'Calculo'
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
                Calculo.jTextField_Nombre_Apellido_E.setText(nombreApeE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_CalculoActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (jList1.getSelectedIndex() == 1) {
            dispose();
            new ventanas.Inicio().setVisible(true);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseExited
        jScrollPane1.setVisible(false);
        jList1.setVisible(false);
    }//GEN-LAST:event_jList1MouseExited

    private void Button_CalculoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Button_CalculoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CalculoPropertyChange

    private void Button_TGSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TGSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_TGSActionPerformed

    private void Label_Semaforo_Calculo_RojoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Label_Semaforo_Calculo_RojoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_Semaforo_Calculo_RojoPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Calculo;
    private javax.swing.JButton Button_DeporteFormativo;
    private javax.swing.JButton Button_Diagnostica;
    private javax.swing.JButton Button_Espanol;
    private javax.swing.JButton Button_FDP;
    private javax.swing.JButton Button_ITI;
    private javax.swing.JButton Button_Icfes;
    private javax.swing.JButton Button_Ingles;
    private javax.swing.JButton Button_Menu_Opc;
    private javax.swing.JButton Button_TGS;
    private javax.swing.JLabel Label_Foto_Perfil;
    private javax.swing.JLabel Label_Semaforo_Calculo_Amarillo;
    private javax.swing.JLabel Label_Semaforo_Calculo_Rojo;
    private javax.swing.JLabel Label_Semaforo_Calculo_Verde;
    private javax.swing.JLabel Label_Semaforo_DeporteFormativo_Verde;
    private javax.swing.JLabel Label_Semaforo_Espanol_Amarillo;
    private javax.swing.JLabel Label_Semaforo_FdP_Verde;
    private javax.swing.JLabel Label_Semaforo_ITI_Verde;
    private javax.swing.JLabel Label_Semaforo_Ingles_Amarillo;
    private javax.swing.JLabel Label_Semaforo_TGS_Verde;
    private javax.swing.JLabel Label_Semestre;
    private javax.swing.JLabel Label_Titulo_Materias;
    private javax.swing.JLabel Label_Titulo_Notificaciones;
    private javax.swing.JLabel Label_Titulo_Prueba;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_FondoEstudiantes;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField_Nombre_Apellido_E;
    private java.util.List<ventanas.newpackagePROFESORES.Notase> notaseList;
    private javax.persistence.Query notaseQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
