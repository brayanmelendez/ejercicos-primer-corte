package Practica;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog(null, "INGRESE LA OPERACIONES QUE DESEE REALIZAR"
                + "\n" + "s(suma)" + "\n" + "r(resta)" + "\n" + "d(division)" + "\n" + "m(multipliccaion)"
        );

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL PRIMER NUMERO"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL SEGUNDO NUMERO"));
        switch (n) {
            case ("s"):
                int resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA SUMA ES: " + resultado);
                break;
            case ("r"):
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA RESTA ES: " + resultado);
                break;
            case ("d"):

                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA DIVISION ES: " + resultado);
                break;
            case ("m"):

                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA ULTIPLICACION ES: " + resultado);
        }
    }

}
