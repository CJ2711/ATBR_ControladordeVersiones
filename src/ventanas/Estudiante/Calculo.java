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

public class Calculo extends javax.swing.JFrame {

    /**
     * Creates new form Calculo
     */
    public Calculo() {
        initComponents();
        setTitle("Alertas Tempranas de Rendimiento - [Area Estudiante]");
        this.setLocationRelativeTo(null);
        setResizable(false);

        Label_Nota.setVisible(false);

        Label_Taller_Uno.setVisible(false);
        Label_Taller_Dos.setVisible(false);
        Label_Taller_Tres.setVisible(false);
        
        Label_Quiz_Uno.setVisible(false);
        Label_Quiz_Dos.setVisible(false);
        Label_Quiz_Tres.setVisible(false);
        
        Label_Parcial_Uno.setVisible(false);
        Label_Opcional_Uno.setVisible(false);
        Label_Parcial_Dos.setVisible(false);
        Label_Opcional_Dos.setVisible(false);

        jTextField_Nota_Taller_Uno.setVisible(false);
        jTextField_Nota_Quiz_Uno.setVisible(false);
        jTextField_Nota_Parcial_Uno.setVisible(false);
        jTextField_Nota_Dos.setVisible(false);
        jTextField_Nota_Tres.setVisible(false);
        jTextField_Nota_Opcional_Dos.setVisible(false);

        Button_Observaciones_Taller_Uno.setVisible(false);
        Button_Observaciones_Quiz_Uno.setVisible(false);
        Button_Observaciones_Parcial_Uno.setVisible(false);
        Button_Observaciones_Dos.setVisible(false);
        Button_Observaciones_Tres.setVisible(false);
        Button_Observaciones_Cuatro.setVisible(false);

        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(false);
        
        jScrollPane1.setVisible(false);
//        jScrollPane3.setVisible(false);
        
        textosPantalla();

        setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoProgramaGrande.png"));
        return retvalue;
    }

    public void textosPantalla(){
        if(username.equals("1957601")){
            //Notas
            Object valorX0Y1N = jTable1.getValueAt(0, 1);
            Object valorX0Y2N = jTable1.getValueAt(0, 2);
            Object valorX0Y3N = jTable1.getValueAt(0, 3);
            
            String tallerUnoSN = valorX0Y1N.toString();
            String quizUnoSN = valorX0Y2N.toString();
            String parcialUnoSN = valorX0Y3N.toString();
            
            jTextField_Nota_Taller_Uno.setText(tallerUnoSN);
            jTextField_Nota_Quiz_Uno.setText(quizUnoSN);
            jTextField_Nota_Parcial_Uno.setText(parcialUnoSN);
            
            //Observaciones
            Object valorX0Y1O = jTable2.getValueAt(0, 1);
            Object valorX0Y2O = jTable2.getValueAt(0, 2);
            Object valorX0Y3O = jTable2.getValueAt(0, 3);
            
            String tallerUnoSO = valorX0Y1O.toString();
            String quizUnoSO = valorX0Y2O.toString();
            String parcialUnoSO = valorX0Y3O.toString();
            
            jTextField_Observaciones_Taller.setText(tallerUnoSO);
            jTextField_Observaciones_Quiz.setText(quizUnoSO);
            jTextField_Observaciones_Parcial.setText(parcialUnoSO);
        }
        
        if(username.equals("1958205")){
            //Notas
            Object valorX1Y1N = jTable1.getValueAt(1, 1);
            Object valorX1Y2N = jTable1.getValueAt(1, 2);
            Object valorX1Y3N = jTable1.getValueAt(1, 3);
            
            String tallerUnoSN = valorX1Y1N.toString();
            String quizUnoSN = valorX1Y2N.toString();
            String parcialUnoSN = valorX1Y3N.toString();
            
            jTextField_Nota_Taller_Uno.setText(tallerUnoSN);
            jTextField_Nota_Quiz_Uno.setText(quizUnoSN);
            jTextField_Nota_Parcial_Uno.setText(parcialUnoSN);
            
            //Observaciones
            Object valorX1Y1O = jTable2.getValueAt(1, 1);
            Object valorX1Y2O = jTable2.getValueAt(1, 2);
            Object valorX1Y3O = jTable2.getValueAt(1, 3);
            
            String tallerUnoSO = valorX1Y1O.toString();
            String quizUnoSO = valorX1Y2O.toString();
            String parcialUnoSO = valorX1Y3O.toString();
            
            jTextField_Observaciones_Taller.setText(tallerUnoSO);
            jTextField_Observaciones_Quiz.setText(quizUnoSO);
            jTextField_Observaciones_Parcial.setText(parcialUnoSO);
        }
        
        if(username.equals("1958266")){
            //Notas
            Object valorX2Y1N = jTable1.getValueAt(2, 1);
            Object valorX2Y2N = jTable1.getValueAt(2, 2);
            Object valorX2Y3N = jTable1.getValueAt(2, 3);
            
            String tallerUnoSN = valorX2Y1N.toString();
            String quizUnoSN = valorX2Y2N.toString();
            String parcialUnoSN = valorX2Y3N.toString();
            
            jTextField_Nota_Taller_Uno.setText(tallerUnoSN);
            jTextField_Nota_Quiz_Uno.setText(quizUnoSN);
            jTextField_Nota_Parcial_Uno.setText(parcialUnoSN);
            
            //Observaciones
            Object valorX2Y1O = jTable2.getValueAt(2, 1);
            Object valorX2Y2O = jTable2.getValueAt(2, 2);
            Object valorX2Y3O = jTable2.getValueAt(2, 3);
            
            String tallerUnoSO = valorX2Y1O.toString();
            String quizUnoSO = valorX2Y2O.toString();
            String parcialUnoSO = valorX2Y3O.toString();
            
            jTextField_Observaciones_Taller.setText(tallerUnoSO);
            jTextField_Observaciones_Quiz.setText(quizUnoSO);
            jTextField_Observaciones_Parcial.setText(parcialUnoSO);
        }
        
        if(username.equals("1958283")){
            //Notas
            Object valorX3Y1N = jTable1.getValueAt(3, 1);
            Object valorX3Y2N = jTable1.getValueAt(3, 2);
            Object valorX3Y3N = jTable1.getValueAt(3, 3);
            
            String tallerUnoSN = valorX3Y1N.toString();
            String quizUnoSN = valorX3Y2N.toString();
            String parcialUnoSN = valorX3Y3N.toString();
            
            jTextField_Nota_Taller_Uno.setText(tallerUnoSN);
            jTextField_Nota_Quiz_Uno.setText(quizUnoSN);
            jTextField_Nota_Parcial_Uno.setText(parcialUnoSN);
            
            //Observaciones
            Object valorX3Y1O = jTable2.getValueAt(3, 1);
            Object valorX3Y2O = jTable2.getValueAt(3, 2);
            Object valorX3Y3O = jTable2.getValueAt(3, 3);
            
            String tallerUnoSO = valorX3Y1O.toString();
            String quizUnoSO = valorX3Y2O.toString();
            String parcialUnoSO = valorX3Y3O.toString();
            
            jTextField_Observaciones_Taller.setText(tallerUnoSO);
            jTextField_Observaciones_Quiz.setText(quizUnoSO);
            jTextField_Observaciones_Parcial.setText(parcialUnoSO);
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
        tabladetalleQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tabladetalle t");
        tabladetalleList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tabladetalleQuery.getResultList();
        Label_Logo = new javax.swing.JLabel();
        Label_Foto_Perfil = new javax.swing.JLabel();
        jTextField_Nombre_Apellido_E = new javax.swing.JTextField();
        Button_Menu_Opc = new javax.swing.JButton();
        Button_Return_Inicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Label_Titulo_Calculo = new javax.swing.JLabel();
        Button_Talleres = new javax.swing.JButton();
        Button_Quizes = new javax.swing.JButton();
        Button_Parciales = new javax.swing.JButton();
        Label_Separador_X_Uno = new javax.swing.JLabel();
        Label_Separador_X_Dos = new javax.swing.JLabel();
        Label_Separador_Y_Uno = new javax.swing.JLabel();
        Label_Separador_Y_Dos = new javax.swing.JLabel();
        Label_Separador_Y_Tres = new javax.swing.JLabel();
        Label_Taller_Uno = new javax.swing.JLabel();
        Label_Taller_Dos = new javax.swing.JLabel();
        Label_Taller_Tres = new javax.swing.JLabel();
        Label_Quiz_Uno = new javax.swing.JLabel();
        Label_Quiz_Dos = new javax.swing.JLabel();
        Label_Quiz_Tres = new javax.swing.JLabel();
        Label_Parcial_Uno = new javax.swing.JLabel();
        Label_Opcional_Dos = new javax.swing.JLabel();
        Label_Parcial_Dos = new javax.swing.JLabel();
        Label_Opcional_Uno = new javax.swing.JLabel();
        Label_Nota = new javax.swing.JLabel();
        jTextField_Nota_Taller_Uno = new javax.swing.JTextField();
        jTextField_Nota_Quiz_Uno = new javax.swing.JTextField();
        jTextField_Nota_Parcial_Uno = new javax.swing.JTextField();
        jTextField_Nota_Dos = new javax.swing.JTextField();
        jTextField_Nota_Tres = new javax.swing.JTextField();
        jTextField_Nota_Opcional_Dos = new javax.swing.JTextField();
        Button_Observaciones_Taller_Uno = new javax.swing.JButton();
        Button_Observaciones_Quiz_Uno = new javax.swing.JButton();
        Button_Observaciones_Parcial_Uno = new javax.swing.JButton();
        Button_Observaciones_Dos = new javax.swing.JButton();
        Button_Observaciones_Tres = new javax.swing.JButton();
        Button_Observaciones_Cuatro = new javax.swing.JButton();
        jTextField_Observaciones_Taller = new javax.swing.JTextField();
        jTextField_Observaciones_Quiz = new javax.swing.JTextField();
        jTextField_Observaciones_Parcial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_FondoCalculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProgramaPeq.png"))); // NOI18N
        getContentPane().add(Label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Label_Foto_Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoPerfil.png"))); // NOI18N
        getContentPane().add(Label_Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));

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

        Label_Titulo_Calculo.setFont(new java.awt.Font("Segoe Print", 3, 22)); // NOI18N
        Label_Titulo_Calculo.setText("CÁLCULO I");
        getContentPane().add(Label_Titulo_Calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 140, -1));

        Button_Talleres.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Talleres.setText("TALLERES");
        Button_Talleres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Talleres.setFocusPainted(false);
        Button_Talleres.setOpaque(false);
        Button_Talleres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TalleresActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Talleres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        Button_Quizes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Quizes.setText("QUIZES");
        Button_Quizes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Quizes.setFocusPainted(false);
        Button_Quizes.setOpaque(false);
        Button_Quizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_QuizesActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Quizes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        Button_Parciales.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Button_Parciales.setText("PARCIALES");
        Button_Parciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Parciales.setFocusPainted(false);
        Button_Parciales.setOpaque(false);
        Button_Parciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ParcialesActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Parciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        Label_Separador_X_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SeparadorH.png"))); // NOI18N
        getContentPane().add(Label_Separador_X_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 180, -1));

        Label_Separador_X_Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SeparadorH.png"))); // NOI18N
        getContentPane().add(Label_Separador_X_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, -1));

        Label_Separador_Y_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SeparadorV.png"))); // NOI18N
        getContentPane().add(Label_Separador_Y_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 130));

        Label_Separador_Y_Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SeparadorV.png"))); // NOI18N
        getContentPane().add(Label_Separador_Y_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 20, 100));

        Label_Separador_Y_Tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SeparadorV.png"))); // NOI18N
        getContentPane().add(Label_Separador_Y_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, 110));

        Label_Taller_Uno.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Taller_Uno.setText("TALLER 01");
        getContentPane().add(Label_Taller_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        Label_Taller_Dos.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Taller_Dos.setText("TALLER 02");
        getContentPane().add(Label_Taller_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 130, 30));

        Label_Taller_Tres.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Taller_Tres.setText("TALLER 03");
        getContentPane().add(Label_Taller_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        Label_Quiz_Uno.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Quiz_Uno.setText("QUIZ 01");
        getContentPane().add(Label_Quiz_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, 30));

        Label_Quiz_Dos.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Quiz_Dos.setText("QUIZ 02");
        getContentPane().add(Label_Quiz_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 30));

        Label_Quiz_Tres.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Quiz_Tres.setText("QUIZ 03");
        getContentPane().add(Label_Quiz_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 30));

        Label_Parcial_Uno.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Parcial_Uno.setText("PARCIAL 01");
        getContentPane().add(Label_Parcial_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        Label_Opcional_Dos.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Opcional_Dos.setText("OPCIONAL 02");
        getContentPane().add(Label_Opcional_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 160, 30));

        Label_Parcial_Dos.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Parcial_Dos.setText("PARCIAL 02");
        getContentPane().add(Label_Parcial_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        Label_Opcional_Uno.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Opcional_Uno.setText("OPCIONAL 01");
        getContentPane().add(Label_Opcional_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, 30));

        Label_Nota.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        Label_Nota.setText("NOTA");
        getContentPane().add(Label_Nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jTextField_Nota_Taller_Uno.setEditable(false);
        jTextField_Nota_Taller_Uno.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Nota_Taller_Uno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_Nota_Taller_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 60, 30));

        jTextField_Nota_Quiz_Uno.setEditable(false);
        jTextField_Nota_Quiz_Uno.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Nota_Quiz_Uno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_Nota_Quiz_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 60, 30));

        jTextField_Nota_Parcial_Uno.setEditable(false);
        jTextField_Nota_Parcial_Uno.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Nota_Parcial_Uno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_Nota_Parcial_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 60, 30));

        jTextField_Nota_Dos.setEditable(false);
        jTextField_Nota_Dos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_Nota_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 60, 30));

        jTextField_Nota_Tres.setEditable(false);
        jTextField_Nota_Tres.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_Nota_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 60, 30));

        jTextField_Nota_Opcional_Dos.setEditable(false);
        jTextField_Nota_Opcional_Dos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_Nota_Opcional_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 60, 30));

        Button_Observaciones_Taller_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Taller_Uno.setContentAreaFilled(false);
        Button_Observaciones_Taller_Uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Observaciones_Taller_Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Observaciones_Taller_UnoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Observaciones_Taller_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 20, 30));

        Button_Observaciones_Quiz_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Quiz_Uno.setContentAreaFilled(false);
        Button_Observaciones_Quiz_Uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Observaciones_Quiz_Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Observaciones_Quiz_UnoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Observaciones_Quiz_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 20, 30));

        Button_Observaciones_Parcial_Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Parcial_Uno.setContentAreaFilled(false);
        Button_Observaciones_Parcial_Uno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Observaciones_Parcial_Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Observaciones_Parcial_UnoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Observaciones_Parcial_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 20, 30));

        Button_Observaciones_Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Dos.setContentAreaFilled(false);
        Button_Observaciones_Dos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Button_Observaciones_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 20, 30));

        Button_Observaciones_Tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Tres.setContentAreaFilled(false);
        Button_Observaciones_Tres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Button_Observaciones_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 20, 30));

        Button_Observaciones_Cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Observaciones.png"))); // NOI18N
        Button_Observaciones_Cuatro.setContentAreaFilled(false);
        getContentPane().add(Button_Observaciones_Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 20, 30));

        jTextField_Observaciones_Taller.setEditable(false);
        jTextField_Observaciones_Taller.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Observaciones_Taller.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Observaciones_Taller.setFocusable(false);
        getContentPane().add(jTextField_Observaciones_Taller, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 300, 320));

        jTextField_Observaciones_Quiz.setEditable(false);
        jTextField_Observaciones_Quiz.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Observaciones_Quiz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_Observaciones_Quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 300, 320));

        jTextField_Observaciones_Parcial.setEditable(false);
        jTextField_Observaciones_Parcial.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Observaciones_Parcial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_Observaciones_Parcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 300, 320));

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

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 120));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tabladetalleList, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstudiante}"));
        columnBinding.setColumnName("Id Estudiante");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${detalle1}"));
        columnBinding.setColumnName("Detalle1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${detalle2}"));
        columnBinding.setColumnName("Detalle2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${detalle3}"));
        columnBinding.setColumnName("Detalle3");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 120));

        jLabel_FondoCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calculo.png"))); // NOI18N
        getContentPane().add(jLabel_FondoCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Menu_OpcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Menu_OpcMouseClicked
        jScrollPane2.setVisible(true);
        jList1.setVisible(true);
    }//GEN-LAST:event_Button_Menu_OpcMouseClicked

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

    private void jTextField_Nombre_Apellido_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Nombre_Apellido_EActionPerformed

    }//GEN-LAST:event_jTextField_Nombre_Apellido_EActionPerformed

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

    private void Button_TalleresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TalleresActionPerformed
        Label_Separador_Y_Uno.setVisible(false);
        Label_Separador_Y_Dos.setVisible(true);
        Label_Separador_Y_Tres.setVisible(true);
        
        Label_Nota.setVisible(true);
        
        Label_Taller_Uno.setVisible(true);
        Label_Taller_Dos.setVisible(true);
        Label_Taller_Tres.setVisible(true);

        jTextField_Nota_Taller_Uno.setVisible(true);
        jTextField_Nota_Dos.setVisible(true);
        jTextField_Nota_Tres.setVisible(true);

        Button_Observaciones_Taller_Uno.setVisible(true);
        Button_Observaciones_Dos.setVisible(true);
        Button_Observaciones_Tres.setVisible(true);
        
        Label_Quiz_Uno.setVisible(false);
        Label_Quiz_Dos.setVisible(false);
        Label_Quiz_Tres.setVisible(false);
        
        Label_Parcial_Uno.setVisible(false);
        Label_Opcional_Uno.setVisible(false);
        Label_Parcial_Dos.setVisible(false);
        Label_Opcional_Dos.setVisible(false);

        jTextField_Nota_Quiz_Uno.setVisible(false);
        jTextField_Nota_Parcial_Uno.setVisible(false);
        jTextField_Nota_Opcional_Dos.setVisible(false);

        Button_Observaciones_Cuatro.setVisible(false);

        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(false);
    }//GEN-LAST:event_Button_TalleresActionPerformed

    private void Button_QuizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_QuizesActionPerformed
        Label_Separador_Y_Uno.setVisible(true);
        Label_Separador_Y_Dos.setVisible(false);
        Label_Separador_Y_Tres.setVisible(true);
        
        Label_Nota.setVisible(true);
        
        Label_Quiz_Uno.setVisible(true);
        Label_Quiz_Dos.setVisible(true);
        Label_Quiz_Tres.setVisible(true);

        jTextField_Nota_Quiz_Uno.setVisible(true);
        jTextField_Nota_Dos.setVisible(true);
        jTextField_Nota_Tres.setVisible(true);

        Button_Observaciones_Taller_Uno.setVisible(true);
        Button_Observaciones_Dos.setVisible(true);
        Button_Observaciones_Tres.setVisible(true);
        
        Label_Taller_Uno.setVisible(false);
        Label_Taller_Dos.setVisible(false);
        Label_Taller_Tres.setVisible(false);
        
        Label_Parcial_Uno.setVisible(false);
        Label_Opcional_Uno.setVisible(false);
        Label_Parcial_Dos.setVisible(false);
        Label_Opcional_Dos.setVisible(false);

        jTextField_Nota_Taller_Uno.setVisible(false);
        jTextField_Nota_Parcial_Uno.setVisible(false);
        jTextField_Nota_Opcional_Dos.setVisible(false);
        
        Button_Observaciones_Cuatro.setVisible(false);

        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(false);
    }//GEN-LAST:event_Button_QuizesActionPerformed

    private void Button_ParcialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ParcialesActionPerformed
        Label_Separador_Y_Uno.setVisible(true);
        Label_Separador_Y_Dos.setVisible(true);
        Label_Separador_Y_Tres.setVisible(false);
        
        Label_Nota.setVisible(true);
        
        Label_Parcial_Uno.setVisible(true);
        Label_Parcial_Dos.setVisible(true);
        Label_Opcional_Uno.setVisible(true);
        Label_Opcional_Dos.setVisible(true);

        jTextField_Nota_Parcial_Uno.setVisible(true);
        jTextField_Nota_Dos.setVisible(true);
        jTextField_Nota_Tres.setVisible(true);
        jTextField_Nota_Opcional_Dos.setVisible(true);

        Button_Observaciones_Taller_Uno.setVisible(true);
        Button_Observaciones_Dos.setVisible(true);
        Button_Observaciones_Tres.setVisible(true);
        Button_Observaciones_Cuatro.setVisible(true);
        
        Label_Taller_Uno.setVisible(false);
        Label_Taller_Dos.setVisible(false);
        Label_Taller_Tres.setVisible(false);
        
        Label_Quiz_Uno.setVisible(false);
        Label_Quiz_Dos.setVisible(false);
        Label_Quiz_Tres.setVisible(false);

        jTextField_Nota_Taller_Uno.setVisible(false);
        jTextField_Nota_Quiz_Uno.setVisible(false);

        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(false);
    }//GEN-LAST:event_Button_ParcialesActionPerformed

    private void Button_Observaciones_Taller_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Observaciones_Taller_UnoActionPerformed
        jTextField_Observaciones_Taller.setVisible(true);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(false);
    }//GEN-LAST:event_Button_Observaciones_Taller_UnoActionPerformed

    private void Button_Observaciones_Quiz_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Observaciones_Quiz_UnoActionPerformed
        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(true);
        jTextField_Observaciones_Parcial.setVisible(false);
    }//GEN-LAST:event_Button_Observaciones_Quiz_UnoActionPerformed

    private void Button_Observaciones_Parcial_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Observaciones_Parcial_UnoActionPerformed
        jTextField_Observaciones_Taller.setVisible(false);
        jTextField_Observaciones_Quiz.setVisible(false);
        jTextField_Observaciones_Parcial.setVisible(true);
    }//GEN-LAST:event_Button_Observaciones_Parcial_UnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Menu_Opc;
    private javax.swing.JButton Button_Observaciones_Cuatro;
    private javax.swing.JButton Button_Observaciones_Dos;
    private javax.swing.JButton Button_Observaciones_Parcial_Uno;
    private javax.swing.JButton Button_Observaciones_Quiz_Uno;
    private javax.swing.JButton Button_Observaciones_Taller_Uno;
    private javax.swing.JButton Button_Observaciones_Tres;
    private javax.swing.JButton Button_Parciales;
    private javax.swing.JButton Button_Quizes;
    private javax.swing.JButton Button_Return_Inicio;
    private javax.swing.JButton Button_Talleres;
    private javax.swing.JLabel Label_Foto_Perfil;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_Nota;
    private javax.swing.JLabel Label_Opcional_Dos;
    private javax.swing.JLabel Label_Opcional_Uno;
    private javax.swing.JLabel Label_Parcial_Dos;
    private javax.swing.JLabel Label_Parcial_Uno;
    private javax.swing.JLabel Label_Quiz_Dos;
    private javax.swing.JLabel Label_Quiz_Tres;
    private javax.swing.JLabel Label_Quiz_Uno;
    private javax.swing.JLabel Label_Separador_X_Dos;
    private javax.swing.JLabel Label_Separador_X_Uno;
    private javax.swing.JLabel Label_Separador_Y_Dos;
    private javax.swing.JLabel Label_Separador_Y_Tres;
    private javax.swing.JLabel Label_Separador_Y_Uno;
    private javax.swing.JLabel Label_Taller_Dos;
    private javax.swing.JLabel Label_Taller_Tres;
    private javax.swing.JLabel Label_Taller_Uno;
    private javax.swing.JLabel Label_Titulo_Calculo;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel_FondoCalculo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTextField_Nombre_Apellido_E;
    private javax.swing.JTextField jTextField_Nota_Dos;
    private javax.swing.JTextField jTextField_Nota_Opcional_Dos;
    private javax.swing.JTextField jTextField_Nota_Parcial_Uno;
    private javax.swing.JTextField jTextField_Nota_Quiz_Uno;
    public static javax.swing.JTextField jTextField_Nota_Taller_Uno;
    private javax.swing.JTextField jTextField_Nota_Tres;
    private javax.swing.JTextField jTextField_Observaciones_Parcial;
    private javax.swing.JTextField jTextField_Observaciones_Quiz;
    private javax.swing.JTextField jTextField_Observaciones_Taller;
    private java.util.List<ventanas.newpackagePROFESORES.Notase> notaseList;
    private javax.persistence.Query notaseQuery;
    private java.util.List<ventanas.Estudiante.Tabladetalle> tabladetalleList;
    private javax.persistence.Query tabladetalleQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
