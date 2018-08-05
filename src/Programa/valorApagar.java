package Programa;

import javax.swing.JOptionPane;

public class valorApagar {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "BIENVENIDO AL CREDITO APROBADO");

        JOptionPane.showMessageDialog(null, "DATOS DEL CLIENTE");
        String nomb = JOptionPane.showInputDialog(null, "DIGITE EL NOMBRE DEL CLIENTE");
        String cedu = JOptionPane.showInputDialog(null, "DIGITE LA CEDULA DEL CLIENTE");
        String co = JOptionPane.showInputDialog(null, "DIGITE EL CORREO DEL CLIENTE");
        String tele = JOptionPane.showInputDialog(null, "DIGITE EL TELEFONO DEL CLIENTE");
        String direc = JOptionPane.showInputDialog(null, "DIGITE LA DIRECCION DEL CLIENTE");

        Cliente p1 = new Cliente();
        p1.nombre = nomb;
        p1.cedula = cedu;
        p1.correo = co;
        p1.telefono = tele;
        p1.direccion = direc;

        JOptionPane.showMessageDialog(null, "DATOS DEL CREDITO");
        String fe = JOptionPane.showInputDialog(null, "DIGITE LA FECHA DEL CREDITO DD-MM-AA");
        int cuo = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LAS CUOTAS A PAGAR "));
        float inte = Float.parseFloat(JOptionPane.showInputDialog(null, "DIGITE LA TASA QUE PRESENTA EL CREDITO"));
        float vc = Float.parseFloat(JOptionPane.showInputDialog(null, "DIGITE EL VALOR CREDITO"));

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
                + "\n" + "LA FECHA DEL CREDITO ES: " + c1.fecha
                + "\n" + "LAS CUOTAS DEL CREDITO SON: " + c1.cuotas
                + "\n" + "LA TASA DE INTERES QUE PRESENTA EL CREDITO ES: " + c1.intereses+"%"
                + "\n" + "EL VALOR DE CREDIO ES: " + c1.valorCredito
                + "\n" + "EL VALOR A PAGAR JUNTO CON LOS INTERESES ES DE: " + suma);
    }

}
