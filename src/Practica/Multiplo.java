package Practica;

import javax.swing.JOptionPane;

public class Multiplo {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE CUALQUIES NUMERO"));

        if (n % 10 == 0) {

            JOptionPane.showMessageDialog(null, n + " ES MULTIPLO DE 10");

        } else {
            JOptionPane.showMessageDialog(null, n + " NO ES MULTIPLO DE 10");

        }

    }
}
