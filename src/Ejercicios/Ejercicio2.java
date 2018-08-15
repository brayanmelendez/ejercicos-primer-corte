package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        double n1, n2, n3, p;

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE LA PRIMERA NOTA"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE LA EGUNDA NOTA"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE LA TERCERA NOTA"));

        p = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "EL PROMEDIO ES DE: " + p);

    }
}
