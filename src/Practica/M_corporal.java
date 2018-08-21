package Practica;

import javax.swing.JOptionPane;

public class M_corporal {

    public static void main(String[] args) {

        double peso, estatura;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE SU PESO EN (kg)"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE SU ESTATURA EN (m)"));
        double resultado = Math.pow(estatura, 2);

        double IMC = peso / resultado;

        if (IMC < 16) {
            JOptionPane.showMessageDialog(null, "SE ENCUENTA EN CRITERIO DE INGRESO EN HOSPITAL");
        } else {
            if (IMC > 16 && IMC < 17) {
                JOptionPane.showMessageDialog(null, "SE ENCUETRA EN INFRAPESO");
            } else {
                if (IMC > 17 && IMC < 18) {
                    JOptionPane.showMessageDialog(null, "SE ENCUENTRA EN BAJO PESO");
                } else {
                    if (IMC > 18 && IMC < 25) {
                        JOptionPane.showMessageDialog(null, "SE ENCUENTRA EN PESO NORMAL(SALUDABLE)");
                    } else {
                        if (IMC > 25 && IMC < 30) {
                            JOptionPane.showMessageDialog(null, "SE ENCUENTRA EN SOBE PESO (OBESIDAD DE GRADO I)");
                        } else {
                            if (IMC > 10 && IMC < 35) {
                                JOptionPane.showMessageDialog(null, "SE ENCUENTRA EN CRONICO(OBESIDAD DE GRADO II)");
                            } else {
                                if (IMC > 35 && IMC < 40) {
                                    JOptionPane.showMessageDialog(null, "SE ENCEUUUNTRA EN OBESIDAD PREMORDIDA (OBESIDAD EN GRADO III)");
                                } else {
                                    if (IMC > 40) {
                                        JOptionPane.showMessageDialog(null, "SE ENCUENTRA EN OBESIDAD MORBIDA(OBESIDAD EN GRADO IV)");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "ERROR");

                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

    }
}
