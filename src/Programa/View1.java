/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Ivadeunproducto.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class View1 extends javax.swing.JFrame {

    /**
     * Creates new form View1
     */
    public View1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        direccion_cliente = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        telefono_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correo_cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre_tienda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombre_tendero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direccion_tienda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nombre_producto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precio_producto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cantidad_producto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        codigo_producto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Cliente");

        nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_clienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Direccion");

        telefono.setText("Telefono");

        jLabel3.setText("Cedula");

        jLabel4.setText("Correo");

        jLabel5.setText("Nombre de la Tienda");

        nombre_tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tiendaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre del Tendero");

        nombre_tendero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tenderoActionPerformed(evt);
            }
        });

        jLabel7.setText("Direccion de la Tienda");

        jLabel8.setText("Nombre del Producto");

        nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_productoActionPerformed(evt);
            }
        });

        jLabel9.setText("Precio del Producto");

        jLabel10.setText("Cantidad ");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo del producto");

        codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nombre_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(nombre_tendero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(direccion_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad_producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(telefono)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(direccion_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(cedula_cliente)
                            .addComponent(correo_cliente)
                            .addComponent(nombre_cliente))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigo_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_tendero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telefono)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed

    }//GEN-LAST:event_nombre_clienteActionPerformed

    private void nombre_tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tiendaActionPerformed

    private void nombre_tenderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tenderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tenderoActionPerformed

    private void nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_productoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
        Producto p1 = new Producto();

        p1.setPrecio(Double.parseDouble(precio_producto.getText()));
        p1.setCantidad(Integer.parseInt(cantidad_producto.getText()));
        double total = p1.ValorApagar();
        double IVA = p1.iva;
        JOptionPane.showMessageDialog(null, String.format(
                "EL NOMBREL DEL CLIENTE ES: %s \n"
                + "LA CEDULA DEL CLIENTE ES: %s \n"
                + "EL CORREO DEL CLIENTE ES: %s \n"
                + "EL TELEFONO DEL CLIENTE ES: %s \n"
                + "LA DIRECCION DEL CLIENTE ES: %s \n"
                + "EL NOMBRE DE LA TIENDA ES: %s \n"
                + "EL NOMBRE DEL TENDERO ES: %s  \n"
                + "LA DIRECCION DE LA TIENDA ES:%s \n"
                + "EL NOMBRE DEL PRODUCTO ES:  %s \n"
                + "EL PRECIO DEL PRODUCTO ES:  %,.2f\n"
                + "EL CODIGO DEL PRODUCTO ES:  %s \n"
                + "LA CANTIDAD LA PRODUCTO ES: %s \n"
                + "EL IVA DEL PRODUCTO ES: %,.2f \n"
                + "EL VALOR A PAGAR ES DE: %,.2f ",
                nombre_cliente.getText(),
                cedula_cliente.getText(),
                correo_cliente.getText(),
                telefono_cliente.getText(),
                direccion_cliente.getText(),
                nombre_tienda.getText(),
                nombre_tendero.getText(),
                direccion_tienda.getText(),
                nombre_producto.getText(),
                Double.parseDouble(precio_producto.getText()),
                codigo_producto.getText(),
                cantidad_producto.getText(),
                IVA,
                total
        ));   
       }catch(Exception e){
       JOptionPane.showMessageDialog(null,"hola mundo"+e);
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_productoActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad_producto;
    private javax.swing.JTextField cedula_cliente;
    private javax.swing.JTextField codigo_producto;
    private javax.swing.JTextField correo_cliente;
    private javax.swing.JTextField direccion_cliente;
    private javax.swing.JTextField direccion_tienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField nombre_producto;
    private javax.swing.JTextField nombre_tendero;
    private javax.swing.JTextField nombre_tienda;
    private javax.swing.JTextField precio_producto;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefono_cliente;
    // End of variables declaration//GEN-END:variables
}