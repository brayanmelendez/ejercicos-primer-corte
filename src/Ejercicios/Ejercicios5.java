package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicios5 {

    public static void main(String[] args) {

        double HL, TH, P;

        HL = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE HORAS LABORALES"));
        TH = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRSE LA TARIFA POR HORAS"));

        P = HL * TH;

        JOptionPane.showMessageDialog(null, "LA TARIFA TOTAL ES DE: " + P);

    }
}
