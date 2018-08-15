/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {
        int n;
        String v;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE 1 A 5"));

        switch (n) {
            case (1):
                v = "A";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
                break;
            case (2):
                v = "E";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
                break;
            case (3):
                v = "I";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
                break;
            case (4):
                v = "O";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
                break;
            case (5):
                v = "O";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
                break;
            default:

                v = "ERROR DE NUMERO";
                JOptionPane.showMessageDialog(null, "LA LETRA ES: " + v);
        }

    }
}
