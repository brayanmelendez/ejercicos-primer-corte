package Practica;

import javax.swing.JOptionPane;

public class N_Pares {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE CUALQUIER NUMERO"));

        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES PAR");

        } else {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES IMPAR");

        }

    }

}
