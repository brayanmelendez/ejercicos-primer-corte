package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int n1, n2, n3, NM;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL PRIMER NUMERO"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL SEGUNDO NUMERO"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL TERCER NUMERO"));

        if (n1 > n2 & n1 > n3) {
            NM = n1;
            JOptionPane.showMessageDialog(null, "EL NUMERO MAYOR ES: " + NM);

        } else {
            if (n2 > n3) {
                NM = n2;
                JOptionPane.showMessageDialog(null, "EL NUMERO MAYOR ES: " + NM);
            } else {
                NM = n3;
                JOptionPane.showMessageDialog(null, "EL NUMERO MAYOR ES: " + NM);
            }
        }

    }
}
