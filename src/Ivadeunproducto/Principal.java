package Ivadeunproducto;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "COMPRA DE UN PRODUCTO");
        JOptionPane.showMessageDialog(null, "DATOS DEL CLIENTE");

        String nomb = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL CLIENTE");
        String cedu = JOptionPane.showInputDialog(null, "INGRESE LA CEDULA DEL CLIENTE");
        String email = JOptionPane.showInputDialog(null, "INGRESE EL CORREO DEL CLIENTE");
        String tele = JOptionPane.showInputDialog(null, "INGRESE EL TELEFONO DEL CLIENTE");
        String direc = JOptionPane.showInputDialog(null, "INGRESE LA DIRECCION DE CLIENTE");

        Cliente c1 = new Cliente(nomb, cedu, direc, direc, tele);

        JOptionPane.showMessageDialog(null, "DATOS DE LA TIENDA");

        String nt = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DE LA TIENDA");
        String td = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL TIENDERO");
        String dr = JOptionPane.showInputDialog(null, "INGRESE LA DIRECCION DE LA TIENDA");

        Tienda t1 = new Tienda();
        t1.nombretienda = nt;
        t1.tiendero = td;
        t1.direccion = dr;

        JOptionPane.showMessageDialog(null, "DATOS DEL PRODUCTO");
        String np = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL PRODUCTO");
        int pr = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL PRECIO DEL PRODUCTO"));
        String cd = JOptionPane.showInputDialog(null, "INGRESE EL CODIGO DEL PRODUCTO");
        int ct = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA CANTIDAD DEL PRODUCTO"));

        Producto p1 = new Producto();

        p1.nombre = np;
        p1.precio = pr;
        p1.codigo = cd;
        p1.cantidad = ct;
        double total = p1.ValorApagar();
        double IVA = p1.iva;

        JOptionPane.showMessageDialog(null, "EL NOMBREL DEL CLIENTE ES: " + c1.nombre
                + "\n" + "LA CEDULA DEL CLIENTE ES: " + c1.cedula
                + "\n" + "EL CORREO DEL CLIENTE ES: " + c1.correo
                + "\n" + "EL TELEFONO DEL CLIENTE ES: " + c1.telefono
                + "\n" + "LA DIRECCION DEL CLIENTE ES: " + c1.direccion
                + "\n" + "EL NOMBRE DE LA TIENDA ES: " + t1.nombretienda
                + "\n" + "EL NOMBRE DEL TIENDERO ES: " + t1.tiendero
                + "\n" + "LA DIRECCION DE LA TIENDA ES: " + t1.direccion
                + "\n" + "EL NOMBRE DEL PRODUCTO ES: " + p1.nombre
                + "\n" + "EL PRECIO DEL PRODUCTO ES: " + p1.precio
                + "\n" + "EL CODIGO DEL PRODUCTO ES: " + p1.codigo
                + "\n" + "LA CANTIDAD LA PRODUCTO ES: " + p1.cantidad
                + "\n" + String.format(" EL IVA DEL PRODUCTO ES: %,.2f\nEL VALOR A PAGAR ES DE: %,.2f ", IVA, total));
    }

}
