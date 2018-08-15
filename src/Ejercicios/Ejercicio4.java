
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main (String[]args){
    
    double PG,PE,PP,PPG,PPE,PT;
    
    PG =Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE PARTIDO GANADOS"));
    PE = Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE PARTIDOS EMPATADOS"));
    PP = Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE PARTIDOS PERDIDO"));
    
    PPG = PG * 3;
    PPE = PE *1;
    PT = PPG+PPE;
    
    JOptionPane.showMessageDialog(null,"EL PUNTAJE TOTAL DE LOS PARTIDOS ES DE: "+PT);
    
    }
}
