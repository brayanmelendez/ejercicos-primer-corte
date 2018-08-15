package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {

        int AA, AN, E;

        AN = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL AÑO DE NACIMIENTO"));
        AA = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL AÑO ACTUAL"));

        E = AA - AN;

        if (E > 17) {
            JOptionPane.showMessageDialog(null, "DEBE SOLICITAR SU CUIL");
        } else {
            JOptionPane.showMessageDialog(null, "NO DEBE SOLICITARA SU CUIL AUN");

        }

    }

}
