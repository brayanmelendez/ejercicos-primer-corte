package ABP;

import javax.swing.JOptionPane;

public class Parqueadero {

    public static void main(String[] args) {

        String nombre;
        int codigo;
        String Id;
        int cupos_disponible;

        nombre = JOptionPane.showInputDialog(null, "INGRESE SU NOMBRE POR FAVOR");
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE SU CODIGO POR FAVOR"));
        Id = JOptionPane.showInputDialog(null, "INGRESE SU IDENTIDICACION POR FAVOR");

    }

}
