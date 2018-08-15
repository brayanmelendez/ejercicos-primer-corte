package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        double AA, AB, OB, OA, D;

        AA = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA ADCISA A"));
        AB = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA ADCISA B"));
        OA = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA ORDENADA A"));
        OB = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA ORDENADA B"));

        double p1;
        double p2;

        p1 = Math.pow((AB - AA), 2);
        p2 = Math.pow((OB - OA), 2);
        D = Math.sqrt(p1 + p2);

        JOptionPane.showMessageDialog(null, "LA DISTANCIA ES: " + D);

    }

}
