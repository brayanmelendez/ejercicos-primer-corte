package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        double LA, LB, LC, LS, AT;

        LA = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL PRIMER LADO DEL TRIANGULO"));
        LB = Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO LADO DEL TRIANGULO"));
        LC = Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL TERCER LADO DEL TRIANGULO"));
        
        LS = (LA+LB+LC)/2;
        AT = Math.sqrt(LS * (LS-LA)*LS-LB)*(LS-LC);
        
        JOptionPane.showMessageDialog(null,"EL AREA TOTAL DEL TRIANGULO ES DE: "+ AT);
    }
}
