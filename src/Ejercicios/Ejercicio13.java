package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {

        int l1, l2, l3;
        String TT;

        l1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL PRIMER LADO DEL TRIANGULO"));
        l2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL SEGUNDO LADO DEL TRIANGULO"));
        l3 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL TERCER LADO DEL TRIANGULO"));

        if (l1 != l2 && l2 != l3 && l3 != l1) {
            TT = "ESCALENO";
            JOptionPane.showMessageDialog(null, "EL TIPO DE TRIANGULO ES: " + TT);
        } else {
            if (l1 == l2 && l2 == l3) {
                TT = "EQUILATERO";
                JOptionPane.showMessageDialog(null, "EL TIPO DE TRIANGULO ES: " + TT);
            } else {
                TT = "ISOSCELES";
                JOptionPane.showMessageDialog(null, "EL TIPO DE TRIANGULO ES: " + TT);
            }
        }

    }

}
