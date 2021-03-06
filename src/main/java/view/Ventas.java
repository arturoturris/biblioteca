package view;

public class Ventas extends javax.swing.JPanel {

    public Ventas() {
        initComponents();
        String [] tableHeaders = {"ISBN","Nombre"};
        tblProductos.setHeaders(tableHeaders);
    }
    
    public javax.swing.JLabel getBtnConsultar() {
        return btnConsultar;
    }

    public javax.swing.JLabel getBtnBuscar() {
        return btnBuscar;
    }

    public String getUsuario(){
        return textFieldUsuario.getText();
    }
    
    public String getContrasena(){
        return String.valueOf(textFieldContrasena.getPassword());
    }
    
    public String getCategoria(){
        return cmbBoxCategoria.getItemAt(cmbBoxCategoria.getSelectedIndex());
    }

    public void addProductoToTable(java.util.Vector<Object> producto){
        tblProductos.addRow(producto);
    }
    
    public void clearTable(){
        tblProductos.clearTable();
    }
    
    public String getSelectedISBN(){
        return tblProductos.getSelectedRow() == -1 ?
                null :
                (String)tblProductos.getValueAt(tblProductos.getSelectedRow(), 0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuVentas = new javax.swing.JPanel();
        margen = new javax.swing.JPanel();
        datosUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        contrasena = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textFieldContrasena = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        operaciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbBoxCategoria = new javax.swing.JComboBox<>();
        botones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JLabel();
        tblProductos = new view.template.Tabla();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(810, 580));
        setMinimumSize(new java.awt.Dimension(810, 580));
        setPreferredSize(new java.awt.Dimension(810, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuVentas.setBackground(new java.awt.Color(73, 197, 147));
        menuVentas.setMaximumSize(new java.awt.Dimension(170, 580));
        menuVentas.setMinimumSize(new java.awt.Dimension(170, 580));
        menuVentas.setPreferredSize(new java.awt.Dimension(170, 580));

        margen.setMinimumSize(new java.awt.Dimension(160, 440));
        margen.setOpaque(false);
        margen.setPreferredSize(new java.awt.Dimension(160, 580));
        margen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosUsuario.setOpaque(false);
        datosUsuario.setLayout(new java.awt.GridLayout(3, 1));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Autenticaci??n");
        datosUsuario.add(jLabel2);

        usuario.setOpaque(false);
        usuario.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        usuario.add(jLabel1);

        textFieldUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textFieldUsuario.setBorder(null);
        textFieldUsuario.setOpaque(false);
        usuario.add(textFieldUsuario);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setPreferredSize(null);
        usuario.add(jSeparator4);

        datosUsuario.add(usuario);

        contrasena.setOpaque(false);
        contrasena.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contrase??a:");
        contrasena.add(jLabel3);

        textFieldContrasena.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textFieldContrasena.setForeground(new java.awt.Color(255, 255, 255));
        textFieldContrasena.setBorder(null);
        textFieldContrasena.setOpaque(false);
        contrasena.add(textFieldContrasena);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setPreferredSize(null);
        contrasena.add(jSeparator5);

        datosUsuario.add(contrasena);

        margen.add(datosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 210));

        operaciones.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Operaciones");

        categoria.setOpaque(false);
        categoria.setLayout(new java.awt.GridLayout(2, 1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoria:");
        categoria.add(jLabel5);

        cmbBoxCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cmbBoxCategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Mangas", "Comics", "Articulos" }));
        categoria.add(cmbBoxCategoria);

        botones.setOpaque(false);
        botones.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btnBuscar.setBackground(new java.awt.Color(73, 197, 147));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);
        btnBuscar.setPreferredSize(new java.awt.Dimension(170, 50));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        botones.add(btnBuscar);

        btnConsultar.setBackground(new java.awt.Color(73, 197, 147));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConsultar.setText("Consultar Selecci??n");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setOpaque(true);
        btnConsultar.setPreferredSize(new java.awt.Dimension(170, 50));
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
        });
        botones.add(btnConsultar);

        javax.swing.GroupLayout operacionesLayout = new javax.swing.GroupLayout(operaciones);
        operaciones.setLayout(operacionesLayout);
        operacionesLayout.setHorizontalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacionesLayout.createSequentialGroup()
                .addGroup(operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operacionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        operacionesLayout.setVerticalGroup(
            operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operacionesLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        margen.add(operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 290));

        menuVentas.add(margen);

        add(menuVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 172, -1));
        add(tblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 640, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(java.awt.Color.WHITE);
        btnBuscar.setForeground(java.awt.Color.decode("#49C593"));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(java.awt.Color.decode("#49C593"));
        btnBuscar.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseEntered
        btnConsultar.setBackground(java.awt.Color.WHITE);
        btnConsultar.setForeground(java.awt.Color.decode("#49C593"));
    }//GEN-LAST:event_btnConsultarMouseEntered

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        btnConsultar.setBackground(java.awt.Color.decode("#49C593"));
        btnConsultar.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnConsultarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnConsultar;
    private javax.swing.JPanel categoria;
    private javax.swing.JComboBox<String> cmbBoxCategoria;
    private javax.swing.JPanel contrasena;
    private javax.swing.JPanel datosUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel margen;
    private javax.swing.JPanel menuVentas;
    private javax.swing.JPanel operaciones;
    private view.template.Tabla tblProductos;
    private javax.swing.JPasswordField textFieldContrasena;
    private javax.swing.JTextField textFieldUsuario;
    private javax.swing.JPanel usuario;
    // End of variables declaration//GEN-END:variables
}
