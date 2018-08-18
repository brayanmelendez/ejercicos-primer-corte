package Ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class M_while {

    public static void main(String[] args) {

        String nombre = "";

        while (!nombre.equals("brayan")) {
            System.out.println("no eres brayan");
            Scanner input = new Scanner(System.in);
            nombre = input.next();
        }

        System.out.println("hola brayan");

    }
}
