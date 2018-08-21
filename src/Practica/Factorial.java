package Practica;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {

        int n, f;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero para hacer el factoria"));
        f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;

            JOptionPane.showMessageDialog(null, "EL FACTORIAL DE " + n + "ES: " + f);
        }

    }
}
