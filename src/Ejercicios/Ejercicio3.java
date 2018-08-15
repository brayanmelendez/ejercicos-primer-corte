package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        double rc, ri, rb, prc, pri, pf;

        rc = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE RESPUETAS CORRECTA"));
        ri = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE RESPUESTAS INCORRECTAS"));

        prc = rc * 4;
        pri = ri * -1;

        pf = prc + pri;

        JOptionPane.showMessageDialog(null, "EL PUNTAJE FINAL ES DE: " + pf);

    }
}
