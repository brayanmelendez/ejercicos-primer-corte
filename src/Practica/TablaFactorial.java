package Practica;

import javax.swing.JOptionPane;

public class TablaFactorial {

    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            int f = 1;

            for (int i = 2; i <= n; i++) {
                f *= i;

                //JOptionPane.showMessageDialog(null, "EL FACTORIAL DE: " + n + " ES :" + f);
                System.out.print("EL FACTORIAL DE " + n);
                System.out.println("ES " + f);
            }

        }

    }
}
