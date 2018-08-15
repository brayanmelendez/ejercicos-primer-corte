package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        int E1, E2, DE;

        E1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA EDAD EL PRIMER HERMANO"));
        E2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA EDAD DEL SEGUNDO HERMANO"));

        if (E1 > E2) {
            DE = E1 - E2;
            JOptionPane.showMessageDialog(null, "EL PRIMER HERMANO ES MAYOR POR: " + DE);
        } else {
            DE = E2 - E1;
            JOptionPane.showMessageDialog(null, "EL SEGUNDO HERMANO ES MAYOR POR: " + DE);

        }

    }
}
