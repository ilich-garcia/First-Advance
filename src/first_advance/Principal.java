package first_advance;

import eddiiexportar.ExcelExport;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

public class Principal extends javax.swing.JFrame {

    FileManager admin;

    public Principal() {
        initComponents();
        this.pack();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_file = new javax.swing.JFrame();
        jp_file = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtext_nameFile = new javax.swing.JTextField();
        jButton_crear = new javax.swing.JButton();
        jf_field = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_fieldname = new javax.swing.JTextField();
        tf_fieldcontent = new javax.swing.JTextField();
        jb_addfield = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_fields = new javax.swing.JTable();
        jf_record = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jp_add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_fields = new javax.swing.JComboBox<String>();
        jb_addrecord = new javax.swing.JButton();
        jt_tiporegistro = new javax.swing.JTextField();
        cb_registros = new javax.swing.JComboBox();
        jb_crearregistro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jp_modify = new javax.swing.JPanel();
        cb_mregistros = new javax.swing.JComboBox();
        cb_mcampos = new javax.swing.JComboBox();
        jt_mnombre = new javax.swing.JTextField();
        jt_mcontenido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jt_mtiporegistro = new javax.swing.JTextField();
        jp_find = new javax.swing.JPanel();
        jp_list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_records = new javax.swing.JTable();
        jb_deleterecord = new javax.swing.JButton();
        jf_index = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jp_createindex = new javax.swing.JPanel();
        jp_reindexfiles = new javax.swing.JPanel();
        pop_table = new javax.swing.JPopupMenu();
        mi_deletefield = new javax.swing.JMenuItem();
        mi_modifyfield = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_menu = new javax.swing.JMenu();
        jm_file = new javax.swing.JMenu();
        mi_newfile = new javax.swing.JMenuItem();
        mi_savefile = new javax.swing.JMenuItem();
        mi_closefile = new javax.swing.JMenuItem();
        mi_logout = new javax.swing.JMenuItem();
        mi_fields = new javax.swing.JMenuItem();
        mi_records = new javax.swing.JMenuItem();
        mi_index = new javax.swing.JMenuItem();
        jm_standarization = new javax.swing.JMenu();
        mi_exportexcel = new javax.swing.JMenuItem();
        mi_exportxml = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jf_file.setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Archivo");

        jtext_nameFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_nameFileActionPerformed(evt);
            }
        });

        jButton_crear.setText("Crear");
        jButton_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_crearMouseClicked(evt);
            }
        });
        jButton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_fileLayout = new javax.swing.GroupLayout(jp_file);
        jp_file.setLayout(jp_fileLayout);
        jp_fileLayout.setHorizontalGroup(
            jp_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fileLayout.createSequentialGroup()
                .addGroup(jp_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_fileLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jp_fileLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton_crear))
                    .addGroup(jp_fileLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jtext_nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jp_fileLayout.setVerticalGroup(
            jp_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jtext_nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_crear)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_fileLayout = new javax.swing.GroupLayout(jf_file.getContentPane());
        jf_file.getContentPane().setLayout(jf_fileLayout);
        jf_fileLayout.setHorizontalGroup(
            jf_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_fileLayout.setVerticalGroup(
            jf_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Campo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Contenido");

        jb_addfield.setText("Agregar");
        jb_addfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_fieldcontent, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_fieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_addfield)
                .addGap(166, 166, 166))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_fieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_fieldcontent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jb_addfield)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel6);

        jt_fields.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tamaño", "Contenido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_fields.setComponentPopupMenu(pop_table);
        jScrollPane2.setViewportView(jt_fields);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Listar/Eliminar/Modificar", jPanel7);

        javax.swing.GroupLayout jf_fieldLayout = new javax.swing.GroupLayout(jf_field.getContentPane());
        jf_field.getContentPane().setLayout(jf_fieldLayout);
        jf_fieldLayout.setHorizontalGroup(
            jf_fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jf_fieldLayout.setVerticalGroup(
            jf_fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Agregar");

        jLabel6.setText("Campos");

        jb_addrecord.setText("Agregar");
        jb_addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addrecordActionPerformed(evt);
            }
        });

        jt_tiporegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_tiporegistroActionPerformed(evt);
            }
        });

        jb_crearregistro.setText("Crear Registro");
        jb_crearregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearregistroActionPerformed(evt);
            }
        });

        jLabel7.setText("Registros");

        jLabel8.setText("Tipo Registros");

        javax.swing.GroupLayout jp_addLayout = new javax.swing.GroupLayout(jp_add);
        jp_add.setLayout(jp_addLayout);
        jp_addLayout.setHorizontalGroup(
            jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(165, 165, 165))
            .addGroup(jp_addLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_addLayout.createSequentialGroup()
                        .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_addLayout.createSequentialGroup()
                                .addComponent(jb_crearregistro)
                                .addGap(62, 62, 62)
                                .addComponent(jb_addrecord))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_addLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_fields, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 120, Short.MAX_VALUE))
                    .addGroup(jp_addLayout.createSequentialGroup()
                        .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_addLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_registros, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_addLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_tiporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jp_addLayout.setVerticalGroup(
            jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_addLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_tiporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_fields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_addrecord)
                    .addComponent(jb_crearregistro))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar", jp_add);

        cb_mregistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cb_mregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mregistrosActionPerformed(evt);
            }
        });

        cb_mcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mcamposActionPerformed(evt);
            }
        });

        jt_mnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_mnombreActionPerformed(evt);
            }
        });

        jt_mcontenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_mcontenidoActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre");

        jLabel10.setText("Contenido");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Registros");

        jLabel12.setText("Campos");

        jLabel13.setText("Modificar tipo de registro");

        jt_mtiporegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_mtiporegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_modifyLayout = new javax.swing.GroupLayout(jp_modify);
        jp_modify.setLayout(jp_modifyLayout);
        jp_modifyLayout.setHorizontalGroup(
            jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_modifyLayout.createSequentialGroup()
                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_modifyLayout.createSequentialGroup()
                                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel11))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb_mregistros, javax.swing.GroupLayout.Alignment.LEADING, 0, 97, Short.MAX_VALUE)
                                    .addComponent(cb_mcampos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_mnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_mcontenido, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_mtiporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_modifyLayout.setVerticalGroup(
            jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_modifyLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_modifyLayout.createSequentialGroup()
                                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_mnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jt_mtiporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_mcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(11, 11, 11)
                                .addComponent(cb_mregistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(38, 38, 38))
                    .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cb_mcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Modificar", jp_modify);

        javax.swing.GroupLayout jp_findLayout = new javax.swing.GroupLayout(jp_find);
        jp_find.setLayout(jp_findLayout);
        jp_findLayout.setHorizontalGroup(
            jp_findLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jp_findLayout.setVerticalGroup(
            jp_findLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Buscar", jp_find);

        jt_records.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero de campos"
            }
        ));
        jScrollPane1.setViewportView(jt_records);

        jb_deleterecord.setText("Eliminar");
        jb_deleterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleterecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_listLayout = new javax.swing.GroupLayout(jp_list);
        jp_list.setLayout(jp_listLayout);
        jp_listLayout.setHorizontalGroup(
            jp_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jp_listLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jb_deleterecord)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jp_listLayout.setVerticalGroup(
            jp_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jb_deleterecord)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listar", jp_list);

        javax.swing.GroupLayout jf_recordLayout = new javax.swing.GroupLayout(jf_record.getContentPane());
        jf_record.getContentPane().setLayout(jf_recordLayout);
        jf_recordLayout.setHorizontalGroup(
            jf_recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jf_recordLayout.setVerticalGroup(
            jf_recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout jp_createindexLayout = new javax.swing.GroupLayout(jp_createindex);
        jp_createindex.setLayout(jp_createindexLayout);
        jp_createindexLayout.setHorizontalGroup(
            jp_createindexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jp_createindexLayout.setVerticalGroup(
            jp_createindexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Crear Índices", jp_createindex);

        javax.swing.GroupLayout jp_reindexfilesLayout = new javax.swing.GroupLayout(jp_reindexfiles);
        jp_reindexfiles.setLayout(jp_reindexfilesLayout);
        jp_reindexfilesLayout.setHorizontalGroup(
            jp_reindexfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jp_reindexfilesLayout.setVerticalGroup(
            jp_reindexfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Re-Indexar Archivos", jp_reindexfiles);

        javax.swing.GroupLayout jf_indexLayout = new javax.swing.GroupLayout(jf_index.getContentPane());
        jf_index.getContentPane().setLayout(jf_indexLayout);
        jf_indexLayout.setHorizontalGroup(
            jf_indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jf_indexLayout.setVerticalGroup(
            jf_indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        mi_deletefield.setText("Eliminar");
        mi_deletefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_deletefieldActionPerformed(evt);
            }
        });
        pop_table.add(mi_deletefield);

        mi_modifyfield.setText("Modificar");
        mi_modifyfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modifyfieldActionPerformed(evt);
            }
        });
        pop_table.add(mi_modifyfield);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jm_menu.setText("Menú");

        jm_file.setText("Archivo");

        mi_newfile.setText("Nuevo Archivo");
        mi_newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_newfileActionPerformed(evt);
            }
        });
        jm_file.add(mi_newfile);

        mi_savefile.setText("Salvar Archivo");
        mi_savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_savefileActionPerformed(evt);
            }
        });
        jm_file.add(mi_savefile);

        mi_closefile.setText("Cerrar Archivo");
        mi_closefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_closefileActionPerformed(evt);
            }
        });
        jm_file.add(mi_closefile);

        mi_logout.setText("Salir");
        mi_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_logoutActionPerformed(evt);
            }
        });
        jm_file.add(mi_logout);

        jm_menu.add(jm_file);

        mi_fields.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mi_fields.setText("Campos");
        mi_fields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_fieldsActionPerformed(evt);
            }
        });
        jm_menu.add(mi_fields);

        mi_records.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mi_records.setText("Registros");
        mi_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_recordsActionPerformed(evt);
            }
        });
        jm_menu.add(mi_records);

        mi_index.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_index.setText("Índices");
        mi_index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_indexActionPerformed(evt);
            }
        });
        jm_menu.add(mi_index);

        jm_standarization.setText("Estandarización");

        mi_exportexcel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mi_exportexcel.setText("Exportar Excel");
        mi_exportexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_exportexcelActionPerformed(evt);
            }
        });
        jm_standarization.add(mi_exportexcel);

        mi_exportxml.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        mi_exportxml.setText("Exportar XML con Schema");
        mi_exportxml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_exportxmlActionPerformed(evt);
            }
        });
        jm_standarization.add(mi_exportxml);

        jm_menu.add(jm_standarization);

        jMenuBar1.add(jm_menu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_newfileActionPerformed
        jf_file.setVisible(true);
        jf_file.pack(); // Deja el tamaño predeterminado del JFrame.
        jf_file.setLocationRelativeTo(null);
        jf_file.setResizable(false);
    }//GEN-LAST:event_mi_newfileActionPerformed

    private void mi_savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_savefileActionPerformed
        JOptionPane.showMessageDialog(this, "Archivo guardado correctamente");
        try {
            ArrayList<Record> records = new ArrayList<>();
            records.add(new Record());
            records.get(0).getFields().add(new Field("", WIDTH, "Diego"));
            records.get(0).getFields().add(new Field("", WIDTH, "Mendoza"));
            records.get(0).getFields().add(new Field("", WIDTH, "17"));
            records.add(new Record());
            records.get(1).getFields().add(new Field("", WIDTH, "Wilmer"));
            records.get(1).getFields().add(new Field("", WIDTH, "Mendoza"));
            records.get(1).getFields().add(new Field("", WIDTH, "17"));
            records.add(new Record());
            records.get(2).getFields().add(new Field("", WIDTH, "Luis"));
            records.get(2).getFields().add(new Field("", WIDTH, "Turcios"));
            records.get(2).getFields().add(new Field("", WIDTH, "17"));
            admin.setRecords(records);
            admin.saveFile();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mi_savefileActionPerformed

    private void mi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_logoutActionPerformed
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_mi_logoutActionPerformed

    private void mi_fieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_fieldsActionPerformed
        jf_field.setVisible(true);
        jf_field.pack();
        jf_field.setLocationRelativeTo(null);
        jf_field.setResizable(false);
    }//GEN-LAST:event_mi_fieldsActionPerformed

    private void mi_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_recordsActionPerformed
        jf_record.setVisible(true);
        jf_record.pack();
        jf_record.setLocationRelativeTo(null);
        jf_record.setResizable(false);
    }//GEN-LAST:event_mi_recordsActionPerformed

    private void mi_indexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_indexActionPerformed
        jf_index.setVisible(true);
        jf_index.pack();
        jf_index.setLocationRelativeTo(null);
        jf_index.setResizable(false);
    }//GEN-LAST:event_mi_indexActionPerformed

    private void mi_exportexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_exportexcelActionPerformed
        JOptionPane.showMessageDialog(this, "¡Exportado exitosamente a Excel!");
        try {
            admin.exportFile(admin.getFile(), "ExcelExport");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mi_exportexcelActionPerformed

    private void mi_exportxmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_exportxmlActionPerformed
        JOptionPane.showMessageDialog(this, "¡XML exportado exitosamente con Schema!");
    }//GEN-LAST:event_mi_exportxmlActionPerformed

    private void jb_addfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addfieldActionPerformed
        String name, content;

        name = tf_fieldname.getText();
        content = tf_fieldcontent.getText();

        if (name.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(this, "¡Por favor ingrese la información necesaria!");
        } else {
            Field field = new Field(name, content.length(), content);

            fields.add(field);
            JOptionPane.showMessageDialog(this, "¡Campo agregado a la lista exitosamente!");
            tf_fieldname.setText("");
            tf_fieldcontent.setText("");
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_fields.getModel();
            modelo.addElement(field);
        }

        for (int i = 0; i < fields.size(); i++) {
            System.out.println(fields.get(i));
        }
    }//GEN-LAST:event_jb_addfieldActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jt_fields.getModel();
        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < fields.size(); i++) {
            Object[] newrow = new Object[]{fields.get(i).getName(), fields.get(i).getSize(), fields.get(i).getContent()};
            model.addRow(newrow);
            jt_fields.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void mi_deletefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_deletefieldActionPerformed
        DefaultTableModel model = (DefaultTableModel) jt_fields.getModel();

        if (jt_fields.getSelectedRow() >= 0) {
            fields.remove(jt_fields.getSelectedRow());
            model.removeRow(jt_fields.getSelectedRow());

            JOptionPane.showMessageDialog(this, "¡Campo eliminado exitosamente!");
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un campo primero!");
        }
    }//GEN-LAST:event_mi_deletefieldActionPerformed

    private void mi_modifyfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modifyfieldActionPerformed
        DefaultTableModel model = (DefaultTableModel) jt_fields.getModel();

        if (jt_fields.getSelectedRow() >= 0) {
            fields.get(jt_fields.getSelectedRow()).setName((String) model.getValueAt(jt_fields.getSelectedRow(), 0));
            fields.get(jt_fields.getSelectedRow()).setContent((String) model.getValueAt(jt_fields.getSelectedRow(), 2));
            fields.get(jt_fields.getSelectedRow()).setSize(fields.get(jt_fields.getSelectedRow()).getContent().length());

            JOptionPane.showMessageDialog(this, "¡Campo modificado exitosamente!");
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un campo primero!");
        }

        for (int i = 0; i < fields.size(); i++) {
            System.out.println(fields.get(i));
        }
    }//GEN-LAST:event_mi_modifyfieldActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jt_records.getModel();
        int rows = modelo.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        for (int i = 0; i < record.size(); i++) {
            Object[] newrow = new Object[]{record.get(i).getTregistro(), record.get(i).getFields().size()};
            modelo.addRow(newrow);

        }
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jtext_nameFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_nameFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_nameFileActionPerformed

    private void jButton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crearActionPerformed
    }//GEN-LAST:event_jButton_crearActionPerformed

    private void jButton_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_crearMouseClicked
        // TODO add your handling code here:
        System.out.println("Entro");
        try {
            if (jtext_nameFile.getText().equals("")) {
                ArrayList<String> campos = new ArrayList<>();
                campos.add("Nombre");
                campos.add("Apellido");
                campos.add("Edad");
                admin = new FileManager("File.txt");
                admin.crearArchivo(campos);
                System.out.println("Lo creo");

            } else {
                ArrayList<String> campos = new ArrayList<>();
                campos.add("Nombre");
                campos.add("Apellido");
                campos.add("Edad");
                admin = new FileManager(jtext_nameFile.getText() + ".txt");
                admin.crearArchivo(campos);
                System.out.println("Lo creo");

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton_crearMouseClicked

    private void mi_closefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_closefileActionPerformed
        // TODO add your handling code here:
        System.out.println("Archivo Cerrado");

    }//GEN-LAST:event_mi_closefileActionPerformed

    private void jb_crearregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearregistroActionPerformed
        Record registro = new Record(jt_tiporegistro.getText());
        record.add(registro);
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_registros.getModel();
        modelo.addElement(registro);
        JOptionPane.showMessageDialog(this, "¡Registro Creado exitosamente!");
        jt_tiporegistro.setText("");
        DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) cb_mregistros.getModel();
        modelo1.addElement(registro);


    }//GEN-LAST:event_jb_crearregistroActionPerformed

    private void jt_tiporegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_tiporegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_tiporegistroActionPerformed

    private void jb_addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addrecordActionPerformed
        record.get(cb_registros.getSelectedIndex()).AddField(fields.get(cb_fields.getSelectedIndex()));
        JOptionPane.showMessageDialog(this, "¡Campo agregado exitosamente al registro!");
    }//GEN-LAST:event_jb_addrecordActionPerformed

    private void jb_deleterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleterecordActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_records.getModel();
        record.remove(jt_records.getSelectedRow());
        modelo.removeRow(jt_records.getSelectedRow());
    }//GEN-LAST:event_jb_deleterecordActionPerformed

    private void cb_mcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mcamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mcamposActionPerformed

    private void jt_mnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_mnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_mnombreActionPerformed

    private void jt_mcontenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_mcontenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_mcontenidoActionPerformed

    private void cb_mregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mregistrosActionPerformed
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_mcampos.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < record.get(cb_mregistros.getSelectedIndex()).getFields().size(); i++) {

            modelo.addElement(record.get(cb_mregistros.getSelectedIndex()).getFields().get(i));
        }
    }//GEN-LAST:event_cb_mregistrosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String content = jt_mcontenido.getText();
        String name = jt_mnombre.getText();
        if(jt_mcontenido.getText().isEmpty()==false && jt_mnombre.getText().isEmpty()==false){
            record.get(cb_mregistros.getSelectedIndex()).getFields().get(cb_mcampos.getSelectedIndex()).ModificarCampo(name, content.length(), content);
            
        }
        JOptionPane.showMessageDialog(this, "¡Cambio Guardado exitosamente!");
        if (jt_mtiporegistro.getText().isEmpty()==false) {
            record.get(cb_mregistros.getSelectedIndex()).setTregistro(jt_mtiporegistro.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt_mtiporegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_mtiporegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_mtiporegistroActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_fields;
    private javax.swing.JComboBox cb_mcampos;
    private javax.swing.JComboBox cb_mregistros;
    private javax.swing.JComboBox cb_registros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_addfield;
    private javax.swing.JButton jb_addrecord;
    private javax.swing.JButton jb_crearregistro;
    private javax.swing.JButton jb_deleterecord;
    private javax.swing.JFrame jf_field;
    private javax.swing.JFrame jf_file;
    private javax.swing.JFrame jf_index;
    private javax.swing.JFrame jf_record;
    private javax.swing.JMenu jm_file;
    private javax.swing.JMenu jm_menu;
    private javax.swing.JMenu jm_standarization;
    private javax.swing.JPanel jp_add;
    private javax.swing.JPanel jp_createindex;
    private javax.swing.JPanel jp_file;
    private javax.swing.JPanel jp_find;
    private javax.swing.JPanel jp_list;
    private javax.swing.JPanel jp_modify;
    private javax.swing.JPanel jp_reindexfiles;
    private javax.swing.JTable jt_fields;
    private javax.swing.JTextField jt_mcontenido;
    private javax.swing.JTextField jt_mnombre;
    private javax.swing.JTextField jt_mtiporegistro;
    private javax.swing.JTable jt_records;
    private javax.swing.JTextField jt_tiporegistro;
    private javax.swing.JTextField jtext_nameFile;
    private javax.swing.JMenuItem mi_closefile;
    private javax.swing.JMenuItem mi_deletefield;
    private javax.swing.JMenuItem mi_exportexcel;
    private javax.swing.JMenuItem mi_exportxml;
    private javax.swing.JMenuItem mi_fields;
    private javax.swing.JMenuItem mi_index;
    private javax.swing.JMenuItem mi_logout;
    private javax.swing.JMenuItem mi_modifyfield;
    private javax.swing.JMenuItem mi_newfile;
    private javax.swing.JMenuItem mi_records;
    private javax.swing.JMenuItem mi_savefile;
    private javax.swing.JPopupMenu pop_table;
    private javax.swing.JTextField tf_fieldcontent;
    private javax.swing.JTextField tf_fieldname;
    // End of variables declaration//GEN-END:variables
    ArrayList<Field> fields = new ArrayList();
    ArrayList<Record> record = new ArrayList();
}
