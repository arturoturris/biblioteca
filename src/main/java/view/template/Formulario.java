package view.template;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Formulario extends javax.swing.JPanel {

    public Formulario() {
        initComponents();
    }

    public javax.swing.JLabel getBtnAceptar(){
        return btnAceptar;
    }
    
    public javax.swing.JLabel getBtnCancelar(){
        return btnCancelar;
    }
    
    public String getContrasena() {
        return String.valueOf(textFieldContrasena.getPassword());
    }

    public String getNombre() {
        return textFieldNombre.getText();
    }
    
    public String getISBN(){
        return textFieldISBN.getText();
    }
    
    public String getUsuario(){
        return textFieldUsuario.getText();
    }
    
    public String getAutor(){
        return textFieldAutor.getText();
    }
    
    public String getEditorial(){
        return textFieldEditorial.getText();
    }
    
    public int getAno(){
        return (int)spnAno.getValue();
    }
    
    public boolean getDescuento(){
        return checkBoxDescuento.isSelected();
    }
    
    public float getPrecio(){
        return (float)spnPrecio.getValue();
    }

    public String getCategoria(){
        return cmbBoxCategoria.getItemAt(cmbBoxCategoria.getSelectedIndex()).toLowerCase();
    }
    
    public void setCheckBoxDescuento(JCheckBox checkBoxDescuento) {
        this.checkBoxDescuento = checkBoxDescuento;
    }

    public void setSpnAno(JSpinner spnAno) {
        this.spnAno = spnAno;
    }

    public void setSpnPrecio(JSpinner spnPrecio) {
        this.spnPrecio = spnPrecio;
    }

    public void setTextFieldAutor(String textFieldAutor) {
        this.textFieldAutor.setText(textFieldAutor);
    }

    public void setTextFieldEditorial(String textFieldEditorial) {
        this.textFieldEditorial.setText(textFieldEditorial);
    }

    public void setTextFieldISBN(String textFieldISBN) {
        this.textFieldISBN.setText(textFieldISBN);
    }

    public void setTextFieldNombre(String textFieldNombre) {
        this.textFieldNombre.setText(textFieldNombre);
    }
    
    public void setComboxBoxCategoria(String categoria){
        int index;
        switch(categoria){
            case "Libros":
                index = 0;
                break;
            case "Comics":
                index = 1;
                break;
            case "Mangas":
                index = 2;
                break;
            case "Articulos":
                index = 3;
                break;
            default:
                index = 3;
                break;
        }
        this.cmbBoxCategoria.setSelectedIndex(index);
    }

    public void setTitulo(String titulo) {
        this.titulo.setText(titulo);
    }
    
    public void desactivarISBN(){
        this.textFieldISBN.setEnabled(false);
    }
    
    public void desactivaCategoria(){
        this.cmbBoxCategoria.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacion = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        contrasena = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textFieldContrasena = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        isbn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textFieldISBN = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        categoria = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbBoxCategoria = new javax.swing.JComboBox<>();
        jSeparator15 = new javax.swing.JSeparator();
        nombre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textFieldAutor = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textFieldEditorial = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        usuario6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        spnAno = new javax.swing.JSpinner();
        jSeparator12 = new javax.swing.JSeparator();
        usuario7 = new javax.swing.JPanel();
        checkBoxDescuento = new javax.swing.JCheckBox();
        usuario8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(73, 197, 147));
        setMaximumSize(new java.awt.Dimension(810, 580));
        setMinimumSize(new java.awt.Dimension(810, 580));
        setPreferredSize(new java.awt.Dimension(810, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion.setOpaque(false);
        informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Crear producto");
        informacion.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 200, 0));

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

        jPanel1.add(usuario);

        contrasena.setOpaque(false);
        contrasena.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        contrasena.add(jLabel4);

        textFieldContrasena.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textFieldContrasena.setForeground(new java.awt.Color(255, 255, 255));
        textFieldContrasena.setBorder(null);
        textFieldContrasena.setOpaque(false);
        contrasena.add(textFieldContrasena);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setPreferredSize(null);
        contrasena.add(jSeparator5);

        jPanel1.add(contrasena);

        informacion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 790, 80));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos del producto");
        informacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 790, 40));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 100, 0));

        isbn.setOpaque(false);
        isbn.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ISBN:");
        isbn.add(jLabel6);

        textFieldISBN.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFieldISBN.setForeground(new java.awt.Color(255, 255, 255));
        textFieldISBN.setBorder(null);
        textFieldISBN.setOpaque(false);
        isbn.add(textFieldISBN);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setPreferredSize(null);
        isbn.add(jSeparator9);

        jPanel2.add(isbn);

        categoria.setBackground(new java.awt.Color(255, 255, 255));
        categoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        categoria.setOpaque(false);
        categoria.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Categoria:");
        categoria.add(jLabel11);

        cmbBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Comics", "Mangas", "Articulos" }));
        categoria.add(cmbBoxCategoria);

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator15.setPreferredSize(null);
        categoria.add(jSeparator15);

        jPanel2.add(categoria);

        nombre.setOpaque(false);
        nombre.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        nombre.add(jLabel7);

        textFieldNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        textFieldNombre.setBorder(null);
        textFieldNombre.setOpaque(false);
        nombre.add(textFieldNombre);

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator13.setPreferredSize(null);
        nombre.add(jSeparator13);

        jPanel2.add(nombre);

        usuario4.setOpaque(false);
        usuario4.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Autor:");
        usuario4.add(jLabel8);

        textFieldAutor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFieldAutor.setForeground(new java.awt.Color(255, 255, 255));
        textFieldAutor.setBorder(null);
        textFieldAutor.setOpaque(false);
        usuario4.add(textFieldAutor);

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator10.setPreferredSize(null);
        usuario4.add(jSeparator10);

        jPanel2.add(usuario4);

        usuario5.setOpaque(false);
        usuario5.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Editorial:");
        usuario5.add(jLabel9);

        textFieldEditorial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFieldEditorial.setForeground(new java.awt.Color(255, 255, 255));
        textFieldEditorial.setBorder(null);
        textFieldEditorial.setOpaque(false);
        usuario5.add(textFieldEditorial);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setPreferredSize(null);
        usuario5.add(jSeparator11);

        jPanel2.add(usuario5);

        usuario6.setOpaque(false);
        usuario6.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Año:");
        usuario6.add(jLabel10);

        spnAno.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        spnAno.setModel(new javax.swing.SpinnerNumberModel(2021, 1900, 2500, 1));
        spnAno.setBorder(null);
        spnAno.setOpaque(false);
        usuario6.add(spnAno);

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator12.setPreferredSize(null);
        usuario6.add(jSeparator12);

        jPanel2.add(usuario6);

        usuario7.setOpaque(false);
        usuario7.setLayout(new java.awt.GridLayout(1, 1));

        checkBoxDescuento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        checkBoxDescuento.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxDescuento.setText("Descuento");
        checkBoxDescuento.setOpaque(false);
        usuario7.add(checkBoxDescuento);

        jPanel2.add(usuario7);

        usuario8.setOpaque(false);
        usuario8.setLayout(new java.awt.GridLayout(3, 1, 10, 0));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio:");
        usuario8.add(jLabel12);

        spnPrecio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.01f, 0.01f, null, 1.5f));
        spnPrecio.setBorder(null);
        spnPrecio.setOpaque(false);
        usuario8.add(spnPrecio);

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator14.setPreferredSize(null);
        usuario8.add(jSeparator14);

        jPanel2.add(usuario8);

        informacion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 790, 260));

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Autenticación");
        informacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 790, 30));

        add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 480));

        botones.setOpaque(false);
        botones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 75, 5));

        btnAceptar.setBackground(new java.awt.Color(22, 33, 53));
        btnAceptar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setOpaque(true);
        btnAceptar.setPreferredSize(new java.awt.Dimension(170, 50));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        botones.add(btnAceptar);

        btnCancelar.setBackground(new java.awt.Color(73, 197, 147));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.setPreferredSize(new java.awt.Dimension(170, 50));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        botones.add(btnCancelar);

        add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 780, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(java.awt.Color.WHITE);
        btnAceptar.setForeground(java.awt.Color.decode("#162135"));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(java.awt.Color.decode("#162135"));
        btnAceptar.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(java.awt.Color.WHITE);
        btnCancelar.setForeground(java.awt.Color.decode("#49C593"));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(java.awt.Color.decode("#49C593"));
        btnCancelar.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnCancelarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JPanel categoria;
    private javax.swing.JCheckBox checkBoxDescuento;
    private javax.swing.JComboBox<String> cmbBoxCategoria;
    private javax.swing.JPanel contrasena;
    private javax.swing.JPanel informacion;
    private javax.swing.JPanel isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel nombre;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JPasswordField textFieldContrasena;
    private javax.swing.JTextField textFieldEditorial;
    private javax.swing.JTextField textFieldISBN;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel usuario;
    private javax.swing.JPanel usuario4;
    private javax.swing.JPanel usuario5;
    private javax.swing.JPanel usuario6;
    private javax.swing.JPanel usuario7;
    private javax.swing.JPanel usuario8;
    // End of variables declaration//GEN-END:variables
}