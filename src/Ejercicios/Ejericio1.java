package Ejercicios;

import javax.swing.*;

public class Ejericio1 {

    public static void main(String[] args) {

        double V, T, D;

        V = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la velocidad del movil"));
        T = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el tiempo del recorrido del movil"));

        D = V + T;

        JOptionPane.showMessageDialog(null, "la Distancia recorrida por el movil es de: " + D);

    }

}
