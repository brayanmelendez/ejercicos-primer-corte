package Practica;

import javax.swing.JOptionPane;

public class S_Trabajador {

    public static void main(String[] args) {

        int ht = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LAS HORAS TRABAJADAS"));

        if (ht > 40) {
            int he = ht - 40;
            int the = he * 20;
            int thr = (ht - he) * 16;
            int sm = the + thr;
            JOptionPane.showMessageDialog(null, "EL SALARIO TOTAL ES DE: " + sm);
        } else {
            int sm = ht * 16;
            JOptionPane.showMessageDialog(null, "EL SALARIO TOTAL ES DE: " + sm);

        }

    }

}
