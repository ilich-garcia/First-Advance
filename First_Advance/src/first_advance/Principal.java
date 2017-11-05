package first_advance;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jf_field = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jf_record = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jf_index = new javax.swing.JFrame();
        jf_standarization = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_menu = new javax.swing.JMenu();
        jm_file = new javax.swing.JMenu();
        mi_newfile = new javax.swing.JMenuItem();
        mi_savefile = new javax.swing.JMenuItem();
        mi_closefile = new javax.swing.JMenuItem();
        mi_logout = new javax.swing.JMenuItem();
        jm_field = new javax.swing.JMenu();
        mi_newfield = new javax.swing.JMenuItem();
        mi_listfield = new javax.swing.JMenuItem();
        mi_modifyfield = new javax.swing.JMenuItem();
        mi_deletefield = new javax.swing.JMenuItem();
        jm_record = new javax.swing.JMenu();
        mi_newrecord = new javax.swing.JMenuItem();
        mi_modifyrecord = new javax.swing.JMenuItem();
        mi_searchrecord = new javax.swing.JMenuItem();
        mi_deleterecord = new javax.swing.JMenuItem();
        mi_listrecord = new javax.swing.JMenuItem();
        jm_index = new javax.swing.JMenu();
        mi_newindex = new javax.swing.JMenuItem();
        mi_reindex = new javax.swing.JMenuItem();
        jm_standarization = new javax.swing.JMenu();
        mi_exportexcel = new javax.swing.JMenuItem();
        mi_exportxml = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jf_file.setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Archivo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_fileLayout = new javax.swing.GroupLayout(jf_file.getContentPane());
        jf_file.getContentPane().setLayout(jf_fileLayout);
        jf_fileLayout.setHorizontalGroup(
            jf_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_fileLayout.setVerticalGroup(
            jf_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Campo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Contenido");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_fieldLayout = new javax.swing.GroupLayout(jf_field.getContentPane());
        jf_field.getContentPane().setLayout(jf_fieldLayout);
        jf_fieldLayout.setHorizontalGroup(
            jf_fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_fieldLayout.setVerticalGroup(
            jf_fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Registro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel5)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_recordLayout = new javax.swing.GroupLayout(jf_record.getContentPane());
        jf_record.getContentPane().setLayout(jf_recordLayout);
        jf_recordLayout.setHorizontalGroup(
            jf_recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_recordLayout.setVerticalGroup(
            jf_recordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jf_indexLayout = new javax.swing.GroupLayout(jf_index.getContentPane());
        jf_index.getContentPane().setLayout(jf_indexLayout);
        jf_indexLayout.setHorizontalGroup(
            jf_indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jf_indexLayout.setVerticalGroup(
            jf_indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jf_standarizationLayout = new javax.swing.GroupLayout(jf_standarization.getContentPane());
        jf_standarization.getContentPane().setLayout(jf_standarizationLayout);
        jf_standarizationLayout.setHorizontalGroup(
            jf_standarizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jf_standarizationLayout.setVerticalGroup(
            jf_standarizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
        jm_file.add(mi_closefile);

        mi_logout.setText("Salir");
        mi_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_logoutActionPerformed(evt);
            }
        });
        jm_file.add(mi_logout);

        jm_menu.add(jm_file);

        jm_field.setText("Campos");

        mi_newfield.setText("Crear Campos");
        mi_newfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_newfieldActionPerformed(evt);
            }
        });
        jm_field.add(mi_newfield);

        mi_listfield.setText("Listar Campos");
        jm_field.add(mi_listfield);

        mi_modifyfield.setText("Modificar Campos");
        jm_field.add(mi_modifyfield);

        mi_deletefield.setText("Borrar Campos");
        jm_field.add(mi_deletefield);

        jm_menu.add(jm_field);

        jm_record.setText("Registros");

        mi_newrecord.setText("Introducir Registros");
        jm_record.add(mi_newrecord);

        mi_modifyrecord.setText("Modificar Registros");
        jm_record.add(mi_modifyrecord);

        mi_searchrecord.setText("Buscar Registros");
        jm_record.add(mi_searchrecord);

        mi_deleterecord.setText("Borrar Registros");
        jm_record.add(mi_deleterecord);

        mi_listrecord.setText("Listar Registros");
        jm_record.add(mi_listrecord);

        jm_menu.add(jm_record);

        jm_index.setText("Índices");

        mi_newindex.setText("Crear Índices");
        jm_index.add(mi_newindex);

        mi_reindex.setText("Re-Indexar Archivos");
        jm_index.add(mi_reindex);

        jm_menu.add(jm_index);

        jm_standarization.setText("Estandarización");

        mi_exportexcel.setText("Exportar Excel");
        jm_standarization.add(mi_exportexcel);

        mi_exportxml.setText("Exportar XML con Schema");
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
    }//GEN-LAST:event_mi_savefileActionPerformed

    private void mi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_logoutActionPerformed
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_mi_logoutActionPerformed

    private void mi_newfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_newfieldActionPerformed
        jf_field.setVisible(true);
        jf_field.pack();
        jf_field.setLocationRelativeTo(null);
        jf_field.setResizable(false);
    }//GEN-LAST:event_mi_newfieldActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JFrame jf_field;
    private javax.swing.JFrame jf_file;
    private javax.swing.JFrame jf_index;
    private javax.swing.JFrame jf_record;
    private javax.swing.JFrame jf_standarization;
    private javax.swing.JMenu jm_field;
    private javax.swing.JMenu jm_file;
    private javax.swing.JMenu jm_index;
    private javax.swing.JMenu jm_menu;
    private javax.swing.JMenu jm_record;
    private javax.swing.JMenu jm_standarization;
    private javax.swing.JMenuItem mi_closefile;
    private javax.swing.JMenuItem mi_deletefield;
    private javax.swing.JMenuItem mi_deleterecord;
    private javax.swing.JMenuItem mi_exportexcel;
    private javax.swing.JMenuItem mi_exportxml;
    private javax.swing.JMenuItem mi_listfield;
    private javax.swing.JMenuItem mi_listrecord;
    private javax.swing.JMenuItem mi_logout;
    private javax.swing.JMenuItem mi_modifyfield;
    private javax.swing.JMenuItem mi_modifyrecord;
    private javax.swing.JMenuItem mi_newfield;
    private javax.swing.JMenuItem mi_newfile;
    private javax.swing.JMenuItem mi_newindex;
    private javax.swing.JMenuItem mi_newrecord;
    private javax.swing.JMenuItem mi_reindex;
    private javax.swing.JMenuItem mi_savefile;
    private javax.swing.JMenuItem mi_searchrecord;
    // End of variables declaration//GEN-END:variables
}
