package Programa;

import javax.swing.JOptionPane;

public class valorApagar {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Credito");

        String nomb = JOptionPane.showInputDialog(null, "Digite su nombe");
        String cedu = JOptionPane.showInputDialog(null, "Digite su cedula");
        String co = JOptionPane.showInputDialog(null, "Digite su correo");
        String tele = JOptionPane.showInputDialog(null, "Digite su telefono");
        String direc = JOptionPane.showInputDialog(null, "Digite su direccion");

        Cliente p1 = new Cliente();
        p1.nombre = nomb;
        p1.cedula = cedu;
        p1.correo = co;
        p1.telefono = tele;
        p1.direccion = direc;

        String fe = JOptionPane.showInputDialog(null, "Digite la fecha del credito DD-MM-AA");
        int cuo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cuotasn a pagar "));
        float inte = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la tasa de interes que presenta el prestamo"));
        float vc = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el valor del credito prestado"));

        Credito c1 = new Credito();

        c1.fecha = fe;
        c1.cuotas = cuo;
        c1.intereses = inte;
        c1.valorCredito = vc;
        double suma = c1.ValorTotal();

        JOptionPane.showMessageDialog(null, "EL NOMBREL DEL CLIENTE ES: " + p1.nombre
                + "\n" + "LA CEDULA DEL CLIENTE ES: " + p1.cedula
                + "\n" + "EL CORREO DEL CLIENTE ES: " + p1.correo
                + "\n" + "EL TELEFONO DEL CLIENTE ES: " + p1.telefono
                + "\n" + "LA DIRECCION DEL CLIENTE ES: " + p1.direccion
                + "\n" + "EL VALOR A PAGAR JUNTO CON LOS INTERESES ES DE: " + suma);
    }

}
