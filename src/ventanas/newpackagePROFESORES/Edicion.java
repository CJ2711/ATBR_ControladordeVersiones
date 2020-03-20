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

import BD.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Edicion extends javax.swing.JFrame {

    /**
     * Creates new form Edicion
     */
    public Edicion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Area Edicion de Materia");
        
        jScrollPane3.setVisible(false);
        jList2.setVisible(false);
        
        jButton2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        
        jScrollPane2.setVisible(false);
        jTable1.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);

        //los paneles independientes para cada uno
        jPanel1KEREN.setVisible(false);
        jPanel1LEANDRO.setVisible(false);
        jPanel1CHRISTIAN.setVisible(false);
        jPanel1ALEJANDRO.setVisible(false);
    }

    /**
     * Metodo : promedioFila (ejecuta una acción en un jTextField) Proposito :
     * Brinda el promedio de la fila en vivo. (al dar enter)
     *
     * @param numero de fila.
     */
    public void promedioFila(int numero) {
        if (numero == 0) {
            Object valorX0Y1 = jTable1.getValueAt(0, 1);
            Object valorX0Y2 = jTable1.getValueAt(0, 2);
            Object valorX0Y3 = jTable1.getValueAt(0, 3);
            
            float vx0y1 = Float.parseFloat(valorX0Y1.toString());
            float vx0y2 = Float.parseFloat(valorX0Y2.toString());
            float vx0y3 = Float.parseFloat(valorX0Y3.toString());
            
            float defX0Y0 = (vx0y1 + vx0y2 + vx0y3) / 3;
            String salidaxy = String.format("%.2f", defX0Y0);
            jTextField1.setText(salidaxy);
        }
        
        if (numero == 1) {
            Object valorX1Y1 = jTable1.getValueAt(1, 1);
            Object valorX1Y2 = jTable1.getValueAt(1, 2);
            Object valorX1Y3 = jTable1.getValueAt(1, 3);
            
            float vx2y1 = Float.parseFloat(valorX1Y1.toString());
            float vx2y2 = Float.parseFloat(valorX1Y2.toString());
            float vx2y3 = Float.parseFloat(valorX1Y3.toString());
            
            float defX1Y1 = (vx2y1 + vx2y2 + vx2y3) / 3;
            String salidaxy = String.format("%.2f", defX1Y1);
            jTextField2.setText(salidaxy);
        }
        
        if (numero == 2) {
            Object valorX2Y1 = jTable1.getValueAt(2, 1);
            Object valorX2Y2 = jTable1.getValueAt(2, 2);
            Object valorX2Y3 = jTable1.getValueAt(2, 3);
            
            float vx3y1 = Float.parseFloat(valorX2Y1.toString());
            float vx3y2 = Float.parseFloat(valorX2Y2.toString());
            float vx3y3 = Float.parseFloat(valorX2Y3.toString());
            
            float defX2Y2 = (vx3y1 + vx3y2 + vx3y3) / 3;
            String salidaxy = String.format("%.2f", defX2Y2);
            jTextField3.setText(salidaxy);
        }
        
        if (numero == 3) {
            Object valorX3Y1 = jTable1.getValueAt(3, 1);
            Object valorX3Y2 = jTable1.getValueAt(3, 2);
            Object valorX3Y3 = jTable1.getValueAt(3, 3);
            
            float vx4y1 = Float.parseFloat(valorX3Y1.toString());
            float vx4y2 = Float.parseFloat(valorX3Y2.toString());
            float vx4y3 = Float.parseFloat(valorX3Y3.toString());
            
            float defX3Y3 = (vx4y1 + vx4y2 + vx4y3) / 3;
            String salidaxy = String.format("%.2f", defX3Y3);
            jTextField4.setText(salidaxy);
        }
        
    }

    /**
     * Metodo para verificar los valores de las entradas en las celdas Que no
     * sean <0 o >5
     */
    public void mensajeDatoInvalido() {
        for (int x = 0; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                Object valor = jTable1.getValueAt(x, y);
                float valorP = Float.parseFloat(valor.toString());
                if (!(valorP >= 0.0 && valorP <= 5)) {
                    JOptionPane.showMessageDialog(null, "El valor no puede ser Menor a 0 ni Mayor a 5 ", "Error", JOptionPane.ERROR_MESSAGE);
                    System.err.println("Valor erroneo");
                    jTable1.setValueAt((float) 0, x, y);
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
        mEstudianteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MEstudiante m");
        mEstudianteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mEstudianteQuery.getResultList();
        mEstudianteQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MEstudiante m");
        mEstudianteQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MEstudiante m");
        mEstudianteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mEstudianteQuery2.getResultList();
        notaseQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Notase n");
        notaseList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : notaseQuery3.getResultList();
        notaseQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Notase n");
        notaseList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : notaseQuery.getResultList();
        nombreMateria = new javax.swing.JTextField();
        jTextField1_nombre_apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1KEREN = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SalirK = new javax.swing.JLabel();
        jPanel1LEANDRO = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        SalirL = new javax.swing.JLabel();
        jPanel1CHRISTIAN = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel1KEREN3 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jText_EV1Keren3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jText_EV2Keren3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jText_EV3Keren3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        SalirC = new javax.swing.JLabel();
        jPanel1ALEJANDRO = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        SalirA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estudiantes Matriculados:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 30));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mEstudianteList1, jList1, "Lista_Estudiantes");
        jListBinding.setSourceNullValue(mEstudianteList);
        bindingGroup.addBinding(jListBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mEstudianteList, org.jdesktop.beansbinding.ObjectProperty.create(), jList1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mEstudianteList1, org.jdesktop.beansbinding.ObjectProperty.create(), jList1, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 400, 100));

        jButton1.setText("Ver/ Editar notas de los estudiantes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 355, 120, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 373, 120, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 391, 120, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 409, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DesplegableBlanco.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));

        jList2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList2.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Opciones", "Cerrar Sesión" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setAutoscrolls(false);
        jList2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList2.setValueIsAdjusting(true);
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jList2MouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 150, 80));

        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTable1.setName("Editor"); // NOI18N

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 110));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Definitiva");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presiona Enter para actualizar la información");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jPanel1KEREN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setEditable(false);
        jTextField5.setFocusable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1KEREN.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jLabel9.setText("Evaluación 1:");
        jPanel1KEREN.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel10.setText("DETALLES");
        jPanel1KEREN.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, -1));

        jLabel11.setText("Evaluación 2:");
        jPanel1KEREN.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel12.setText("Evaluación 3:");
        jPanel1KEREN.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1KEREN.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jPanel1KEREN.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jPanel1KEREN.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel1KEREN.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, -1));

        SalirK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        SalirK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirKMouseClicked(evt);
            }
        });
        jPanel1KEREN.add(SalirK, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        getContentPane().add(jPanel1KEREN, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 340, 530));

        jPanel1LEANDRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setEditable(false);
        jTextField6.setFocusable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1LEANDRO.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jLabel13.setText("Evaluación 1:");
        jPanel1LEANDRO.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel14.setText("DETALLES");
        jPanel1LEANDRO.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, -1));

        jLabel15.setText("Evaluación 2:");
        jPanel1LEANDRO.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel16.setText("Evaluación 3:");
        jPanel1LEANDRO.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1LEANDRO.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane7.setViewportView(jTextArea4);

        jPanel1LEANDRO.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane8.setViewportView(jTextArea5);

        jPanel1LEANDRO.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, -1));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane9.setViewportView(jTextArea6);

        jPanel1LEANDRO.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, -1));

        SalirL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        SalirL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirLMouseClicked(evt);
            }
        });
        jPanel1LEANDRO.add(SalirL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        getContentPane().add(jPanel1LEANDRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 340, 530));

        jPanel1CHRISTIAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField7.setEditable(false);
        jTextField7.setFocusable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1CHRISTIAN.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jLabel17.setText("Evaluación 1:");
        jPanel1CHRISTIAN.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel18.setText("DETALLES");
        jPanel1CHRISTIAN.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, -1));

        jLabel19.setText("Evaluación 2:");
        jPanel1CHRISTIAN.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel20.setText("Evaluación 3:");
        jPanel1CHRISTIAN.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1CHRISTIAN.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jPanel1KEREN3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField8.setEditable(false);
        jTextField8.setFocusable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1KEREN3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jLabel21.setText("Evaluación 1:");
        jPanel1KEREN3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel22.setText("DETALLES");
        jPanel1KEREN3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, -1));

        jText_EV1Keren3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_EV1Keren3ActionPerformed(evt);
            }
        });
        jPanel1KEREN3.add(jText_EV1Keren3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 100));

        jLabel23.setText("Evaluación 2:");
        jPanel1KEREN3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jText_EV2Keren3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_EV2Keren3ActionPerformed(evt);
            }
        });
        jPanel1KEREN3.add(jText_EV2Keren3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 310, 100));

        jLabel24.setText("Evaluación 3:");
        jPanel1KEREN3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jText_EV3Keren3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_EV3Keren3ActionPerformed(evt);
            }
        });
        jPanel1KEREN3.add(jText_EV3Keren3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 310, 100));

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1KEREN3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jPanel1CHRISTIAN.add(jPanel1KEREN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 340, 530));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane10.setViewportView(jTextArea7);

        jPanel1CHRISTIAN.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane11.setViewportView(jTextArea8);

        jPanel1CHRISTIAN.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, -1));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane12.setViewportView(jTextArea9);

        jPanel1CHRISTIAN.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, -1));

        SalirC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        SalirC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirCMouseClicked(evt);
            }
        });
        jPanel1CHRISTIAN.add(SalirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        getContentPane().add(jPanel1CHRISTIAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 340, 530));

        jPanel1ALEJANDRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setEditable(false);
        jTextField9.setFocusable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1ALEJANDRO.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        jLabel25.setText("Evaluación 1:");
        jPanel1ALEJANDRO.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel26.setText("DETALLES");
        jPanel1ALEJANDRO.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, -1));

        jLabel27.setText("Evaluación 2:");
        jPanel1ALEJANDRO.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel28.setText("Evaluación 3:");
        jPanel1ALEJANDRO.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton8.setText("Guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1ALEJANDRO.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane13.setViewportView(jTextArea10);

        jPanel1ALEJANDRO.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, -1));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane14.setViewportView(jTextArea11);

        jPanel1ALEJANDRO.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, -1));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane15.setViewportView(jTextArea12);

        jPanel1ALEJANDRO.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        SalirA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        SalirA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirAMouseClicked(evt);
            }
        });
        jPanel1ALEJANDRO.add(SalirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        getContentPane().add(jPanel1ALEJANDRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 340, 530));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AVISO ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Para aplicar los cambios se debe ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cerrar esta ventana");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        jButton3.setText("Detalles de Evaluaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel1_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProfesores.png"))); // NOI18N
        getContentPane().add(jLabel1_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMateriaActionPerformed

    private void jTextField1_nombre_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nombre_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nombre_apellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jScrollPane2.setVisible(true);
        jTable1.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jButton2.setVisible(true);
        jLabel2.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel6.setVisible(true);
        
        promedioFila(0);
        promedioFila(1);
        promedioFila(2);
        promedioFila(3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        if (jList2.getSelectedIndex() == 1) {
            dispose();
            new ventanas.Inicio().setVisible(true);
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jList2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseExited
        jScrollPane3.setVisible(false);
        jList2.setVisible(false);
    }//GEN-LAST:event_jList2MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jScrollPane3.setVisible(true);
        jList2.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccionado = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            promedioFila(0);
            promedioFila(1);
            promedioFila(2);
            promedioFila(3);
        }
        mensajeDatoInvalido();
        try {
            //Conexion BD
            Connection cn = Conexion.conectar();
            
            Object v01 = jTable1.getValueAt(0, 1);
            Object v02 = jTable1.getValueAt(0, 2);
            Object v03 = jTable1.getValueAt(0, 3);
            float fv01 = Float.parseFloat(v01.toString());
            float fv02 = Float.parseFloat(v02.toString());
            float fv03 = Float.parseFloat(v03.toString());
            
            Object v11 = jTable1.getValueAt(1, 1);
            Object v12 = jTable1.getValueAt(1, 2);
            Object v13 = jTable1.getValueAt(1, 3);
            float fv11 = Float.parseFloat(v11.toString());
            float fv12 = Float.parseFloat(v12.toString());
            float fv13 = Float.parseFloat(v13.toString());
            
            Object v21 = jTable1.getValueAt(2, 1);
            Object v22 = jTable1.getValueAt(2, 2);
            Object v23 = jTable1.getValueAt(2, 3);
            float fv21 = Float.parseFloat(v21.toString());
            float fv22 = Float.parseFloat(v22.toString());
            float fv23 = Float.parseFloat(v23.toString());
            
            Object v31 = jTable1.getValueAt(3, 1);
            Object v32 = jTable1.getValueAt(3, 2);
            Object v33 = jTable1.getValueAt(3, 3);
            float fv31 = Float.parseFloat(v31.toString());
            float fv32 = Float.parseFloat(v32.toString());
            float fv33 = Float.parseFloat(v33.toString());
            
            PreparedStatement pst = cn.prepareStatement(""
                    + " UPDATE notasE SET nota1 = '" + fv01 + "', nota2 = '" + fv02 + "', nota3 = '" + fv03 + "' WHERE notase.idEstudiante = 1957601;");
            PreparedStatement pst1 = cn.prepareStatement(""
                    + " UPDATE notasE SET nota1 = '" + fv11 + "', nota2 = '" + fv12 + "', nota3 = '" + fv13 + "' WHERE notase.idEstudiante = 1958205;");
            PreparedStatement pst2 = cn.prepareStatement(""
                    + " UPDATE notasE SET nota1 = '" + fv21 + "', nota2 = '" + fv22 + "', nota3 = '" + fv23 + "' WHERE notase.idEstudiante = 1958266;");
            PreparedStatement pst3 = cn.prepareStatement(""
                    + " UPDATE notasE SET nota1 = '" + fv31 + "', nota2 = '" + fv32 + "', nota3 = '" + fv33 + "' WHERE notase.idEstudiante = 1958283;");
            int rs = pst.executeUpdate();
            rs = 0;
            rs = pst1.executeUpdate();
            rs = 0;
            rs = pst2.executeUpdate();
            rs = 0;
            rs = pst3.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ERROR SQL : " + e);
        }

    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jList1.getSelectedIndex() == 0) {
            //ABRE
            jPanel1KEREN.setVisible(true);
            jTextField5.setText("Keren Rodas");
            //CIERRA
            jPanel1LEANDRO.setVisible(false);
            jPanel1CHRISTIAN.setVisible(false);
            jPanel1ALEJANDRO.setVisible(false);
        }
        if (jList1.getSelectedIndex() == 1) {
            //ABRE
            jPanel1LEANDRO.setVisible(true);
            jTextField6.setText("Leandro Rodriguez");
            //CIERRA
            jPanel1KEREN.setVisible(false);
            jPanel1CHRISTIAN.setVisible(false);
            jPanel1ALEJANDRO.setVisible(false);
        }
        if (jList1.getSelectedIndex() == 2) {
            //ABRE
            jPanel1CHRISTIAN.setVisible(true);
            jTextField7.setText("Christian Barbosa");
            //CIERRA
            jPanel1KEREN.setVisible(false);
            jPanel1LEANDRO.setVisible(false);
            jPanel1ALEJANDRO.setVisible(false);
        }
        if (jList1.getSelectedIndex() == 3) {
            //ABRE
            jPanel1ALEJANDRO.setVisible(true);
            jTextField9.setText("Alejandro Castro");
            //CIERRA
            jPanel1KEREN.setVisible(false);
            jPanel1LEANDRO.setVisible(false);
            jPanel1CHRISTIAN.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jText_EV1Keren3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_EV1Keren3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_EV1Keren3ActionPerformed

    private void jText_EV2Keren3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_EV2Keren3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_EV2Keren3ActionPerformed

    private void jText_EV3Keren3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_EV3Keren3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_EV3Keren3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void SalirKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirKMouseClicked
        jPanel1KEREN.setVisible(false);
    }//GEN-LAST:event_SalirKMouseClicked

    private void SalirLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirLMouseClicked
        jPanel1LEANDRO.setVisible(false);
    }//GEN-LAST:event_SalirLMouseClicked

    private void SalirCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirCMouseClicked
        jPanel1CHRISTIAN.setVisible(false);
    }//GEN-LAST:event_SalirCMouseClicked

    private void SalirAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirAMouseClicked
        jPanel1ALEJANDRO.setVisible(false);
    }//GEN-LAST:event_SalirAMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SalirA;
    private javax.swing.JLabel SalirC;
    private javax.swing.JLabel SalirK;
    private javax.swing.JLabel SalirL;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1ALEJANDRO;
    private javax.swing.JPanel jPanel1CHRISTIAN;
    private javax.swing.JPanel jPanel1KEREN;
    private javax.swing.JPanel jPanel1KEREN3;
    private javax.swing.JPanel jPanel1LEANDRO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField1_nombre_apellido;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jText_EV1Keren3;
    private javax.swing.JTextField jText_EV2Keren3;
    private javax.swing.JTextField jText_EV3Keren3;
    private java.util.List<BD.MEstudiante> mEstudianteList;
    private java.util.List<BD.MEstudiante> mEstudianteList1;
    private javax.persistence.Query mEstudianteQuery;
    private javax.persistence.Query mEstudianteQuery1;
    private javax.persistence.Query mEstudianteQuery2;
    public static javax.swing.JTextField nombreMateria;
    private java.util.List<ventanas.newpackagePROFESORES.Notase> notaseList;
    private java.util.List<ventanas.newpackagePROFESORES.Notase> notaseList3;
    private javax.persistence.Query notaseQuery;
    private javax.persistence.Query notaseQuery3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
