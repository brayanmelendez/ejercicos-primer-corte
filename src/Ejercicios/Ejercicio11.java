package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {

        double PL, PM, PMI, PJ, PV, PS, PT, PP;

        PL = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODUCCION DE LOS LUNES"));
        PM = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODCCUCION DE LOS MARTES"));
        PMI = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODUCCION DE LOS MIERCOLES"));
        PJ = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODUCCION DE LOS JUEVES"));
        PV = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODUCCION DE LOS VIERNES"));
        PS = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA PRODUCCION DE LOS SABADO"));

        PT = PL + PM + PMI + PJ + PV + PS;
        PP = PT / 6;

        if (PP >= 100) {
            String MSG = "RECIBIRA INCENTIVO";
            JOptionPane.showMessageDialog(null, MSG);
        } else {
            String MSG = "NO RECIBIRA INCENTIVO";
            JOptionPane.showMessageDialog(null, MSG);
        }

    }
}
