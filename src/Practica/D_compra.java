package Practica;

import javax.swing.JOptionPane;

public class D_compra {

    public static void main(String[] args) {

        double compra, descuento, total;

        compra = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL MONTO DE COMPRA"));

        descuento = compra * 0.20;
        total = descuento - compra;

        if (compra > 300) {

            JOptionPane.showMessageDialog(null, "EL DESCUENTO ES DE: " + descuento
                    + "\n" + "EL VALOR TOTAL  ES DE: " + total);

        } else {
            JOptionPane.showMessageDialog(null, "VALOR A PAGRA SIN DESCUENTO, SU TOTAL ES DE: " + compra);
        }

    }
}
