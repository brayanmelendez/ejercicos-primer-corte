
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        double GB,MG,CD;
        
        GB = Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE GB DEL CD"));
        
        MG = GB *1024;
        CD = (MG / 700) + 1;
        
        JOptionPane.showMessageDialog(null,"PARA LA COPIA DE SEGURIDAD SE ES NECESARIO: "+ MG);
        
        
    }
    
}
