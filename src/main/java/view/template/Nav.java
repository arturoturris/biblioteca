package view.template;

import java.awt.Color;

public class Nav extends javax.swing.JPanel {
    private int selectedMenu;
    
    public Nav() {
        initComponents();
        changeSelectedMenu(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        menus = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        btnVentas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAlmacen = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 33, 53));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(170, 580));
        setMinimumSize(new java.awt.Dimension(170, 580));
        setPreferredSize(new java.awt.Dimension(170, 580));

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carmina72\\Documents\\NetBeansProjects\\biblioteca\\src\\main\\java\\resources\\book.png")); // NOI18N

        titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Biblioteca BUAP");

        menus.setBackground(new java.awt.Color(255, 102, 51));
        menus.setOpaque(false);
        menus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(73, 197, 147));
        jSeparator3.setForeground(new java.awt.Color(73, 197, 147));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 5));
        menus.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 170, 2));

        btnVentas.setBackground(new java.awt.Color(22, 33, 53));
        btnVentas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVentas.setText("Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setOpaque(true);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        menus.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jSeparator1.setBackground(new java.awt.Color(73, 197, 147));
        jSeparator1.setForeground(new java.awt.Color(73, 197, 147));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        menus.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 2));

        btnAlmacen.setBackground(new java.awt.Color(22, 33, 53));
        btnAlmacen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlmacen.setText("Almacen");
        btnAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlmacen.setOpaque(true);
        btnAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlmacenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlmacenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlmacenMouseExited(evt);
            }
        });
        menus.add(btnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 50));

        jSeparator2.setBackground(new java.awt.Color(73, 197, 147));
        jSeparator2.setForeground(new java.awt.Color(73, 197, 147));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 5));
        menus.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 2));

        nombres.setOpaque(false);
        nombres.setLayout(new java.awt.GridLayout(3, 1, 25, 5));

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Autores");
        nombres.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Luis Arturo Tenorio L??pez");
        nombres.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alan Marcial Mar??n");
        nombres.add(jLabel2);

        menus.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JLabel getVentasButton() {
        return this.btnVentas;
    }
    
    public javax.swing.JLabel getAlmacenButton() {
        return this.btnAlmacen;
    }
    
    private void setUnselectedButtonStyle(javax.swing.JLabel button){
        button.setBackground(Color.decode("#162135"));
    }
    
    private void setSelectedButtonStyle(javax.swing.JLabel button){
        button.setBackground(Color.decode("#49C593"));
    }
    
    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        setSelectedButtonStyle(btnVentas);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        if(selectedMenu != 0)
            setUnselectedButtonStyle(btnVentas);
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        changeSelectedMenu(0);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlmacenMouseClicked
        changeSelectedMenu(1);
    }//GEN-LAST:event_btnAlmacenMouseClicked

    private void btnAlmacenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlmacenMouseEntered
        setSelectedButtonStyle(btnAlmacen);
    }//GEN-LAST:event_btnAlmacenMouseEntered

    private void btnAlmacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlmacenMouseExited
        if(selectedMenu != 1)
            setUnselectedButtonStyle(btnAlmacen);
    }//GEN-LAST:event_btnAlmacenMouseExited

    private void changeSelectedMenu(int menu){
        if(menu == 0){
            setSelectedButtonStyle(btnVentas);
            setUnselectedButtonStyle(btnAlmacen);
        }else{
            setSelectedButtonStyle(btnAlmacen);
            setUnselectedButtonStyle(btnVentas);
        }
        selectedMenu = menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlmacen;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel nombres;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
