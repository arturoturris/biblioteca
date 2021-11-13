package view.template;

import model.Detalles;

public class Producto extends javax.swing.JPanel {
    public Producto(Detalles detalles) {
        initComponents();
        txtNombre.setText(detalles.getNombre());
        txtISBN.setText(detalles.getIsbn());
        txtAutor.setText(detalles.getAutor());
        txtFecha.setText(Integer.toString(detalles.getFecha()));
        txtEditorial.setText(detalles.getEditorial());
        txtDescuento.setText(detalles.isDescuento() ? "Sí" : "No");
        txtPrecio.setText(Float.toString(detalles.getPrecio()));
        //this.revalidate();
        //this.repaint();
    }

    public javax.swing.JLabel getBtnAtras(){
        return btnAtras;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        titulo = new javax.swing.JPanel();
        txtNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        isbn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JLabel();
        autor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JLabel();
        fecha = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        editorial = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JLabel();
        descuento = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JLabel();
        precio = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(73, 197, 147));
        setMaximumSize(new java.awt.Dimension(810, 580));
        setMinimumSize(new java.awt.Dimension(810, 580));
        setPreferredSize(new java.awt.Dimension(810, 590));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(194, 580));

        btnAtras.setBackground(new java.awt.Color(73, 197, 147));
        btnAtras.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtras.setText("Atras");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setOpaque(true);
        btnAtras.setPreferredSize(new java.awt.Dimension(170, 50));
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );

        add(jPanel1);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carmina72\\Documents\\NetBeansProjects\\biblioteca\\src\\main\\java\\resources\\product.png")); // NOI18N
        add(jLabel4);

        info.setOpaque(false);
        info.setPreferredSize(new java.awt.Dimension(350, 500));
        info.setLayout(new java.awt.GridLayout(7, 1));

        titulo.setOpaque(false);
        titulo.setLayout(new java.awt.GridLayout(2, 1));

        txtNombre.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Libro 1");
        titulo.add(txtNombre);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        titulo.add(jSeparator1);

        info.add(titulo);

        isbn.setOpaque(false);
        isbn.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ISBN:");
        isbn.add(jLabel2);

        txtISBN.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtISBN.setForeground(new java.awt.Color(255, 255, 255));
        txtISBN.setText("LIB001");
        isbn.add(txtISBN);

        info.add(isbn);

        autor.setOpaque(false);
        autor.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Autor:");
        autor.add(jLabel5);

        txtAutor.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setText("Autor X");
        autor.add(txtAutor);

        info.add(autor);

        fecha.setOpaque(false);
        fecha.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha:");
        fecha.add(jLabel7);

        txtFecha.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("2021");
        fecha.add(txtFecha);

        info.add(fecha);

        editorial.setOpaque(false);
        editorial.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Editorial:");
        editorial.add(jLabel9);

        txtEditorial.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtEditorial.setForeground(new java.awt.Color(255, 255, 255));
        txtEditorial.setText("Editorial X");
        editorial.add(txtEditorial);

        info.add(editorial);

        descuento.setOpaque(false);
        descuento.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Descuento:");
        descuento.add(jLabel11);

        txtDescuento.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento.setText("No");
        descuento.add(txtDescuento);

        info.add(descuento);

        precio.setOpaque(false);
        precio.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Precio:");
        precio.add(jLabel13);

        txtPrecio.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("$99.90");
        precio.add(txtPrecio);

        info.add(precio);

        add(info);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseExited
        btnAtras.setBackground(java.awt.Color.decode("#49C593"));
        btnAtras.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_btnAtrasMouseExited

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered
        btnAtras.setBackground(java.awt.Color.WHITE);
        btnAtras.setForeground(java.awt.Color.decode("#49C593"));
    }//GEN-LAST:event_btnAtrasMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel autor;
    private javax.swing.JLabel btnAtras;
    private javax.swing.JPanel descuento;
    private javax.swing.JPanel editorial;
    private javax.swing.JPanel fecha;
    private javax.swing.JPanel info;
    private javax.swing.JPanel isbn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel precio;
    private javax.swing.JPanel titulo;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JLabel txtDescuento;
    private javax.swing.JLabel txtEditorial;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtISBN;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
}
