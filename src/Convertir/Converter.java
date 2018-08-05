package Convertir;

import javax.swing.JOptionPane;

public class Converter {

    public static void main(String[] args) {
        try {
        convertir();    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ha ocurrido un error inesperado");
        }
        
        
        
    }

    public static void convertir() {
        String valor = JOptionPane.showInputDialog(" 1) Dolar (USD) \n 2) "
                + "Peso (COP) \n 3) Euro (EUR) "
                + "\n Ingrese el valor correspondiente...");
        double dineroIngresado = Double.parseDouble(JOptionPane.showInputDialog("ingrese el dinero"));
        double dolar = 2892;
        double euro = 3346;
        switch (valor) {

            case ("1"):
                JOptionPane.showMessageDialog(null, String.format(
                        "Euro: %,.2f  Peso (COP): %,.2f",
                        ((dineroIngresado * dolar) / euro),
                        (dineroIngresado * dolar)
                ));
                break;
            case ("2"):
                JOptionPane.showMessageDialog(null, String.format(
                        "Euro: %,.2f  Dolar: %,.2f",
                        (dineroIngresado / euro),
                        (dineroIngresado / dolar)
                ));
                break;
            case ("3"):
                JOptionPane.showMessageDialog(null, String.format(
                        "Dolar: %,.2f  Peso (COP): %,.2f",
                        ((dineroIngresado * euro) / dolar),
                        (dineroIngresado * euro)
                ));
                break;

        }
    }
}
