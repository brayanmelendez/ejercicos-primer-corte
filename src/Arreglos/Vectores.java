package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vectores {

    public static void main(String[] args) {

        /* PARA IMPRIMIR POR CONSOLA DEPENDIENDO DE UN VALOR DETERMINADO 
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR: ");
        Scanner sr = new Scanner(System.in);
        int tamaño = sr.nextInt();
        
        String[] arreglo = new String[tamaño];
        arreglo[0] = "BrayanMelendez";
        arreglo[1] = "HOLA MUNDO";

        for (String s : arreglo) {

            System.out.println(s);*/
        //} 
        System.out.println("ingrese el tamañao del vector");
        Scanner sc = new Scanner(System.in);
        int tamaño = sc.nextInt();

        String[] vector = new String[tamaño];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("INGRESE EL CONTENIDO DE LA POSICICON " + i + ":");
            vector[i]= sc.next();
        }
        
        for (String s : vector){
        
            System.out.println(s);
        }

        /* PARA IMPRIMIR POR VENTADA DE UN VALOR PREDETERMINADO
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null,
                "INGRESE EL TAMAÑAO DEL VECTOR"));
        
        String[] vector = new String[tamano];
        vector[0] = "HOLA MUNDO";
        vector[1] = "HOLA GENTE";
        
        for (String s : vector){
        
            JOptionPane.showMessageDialog(null,s);*/
        //}
        /*int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null,
                "INGRESE EL TAMAÑO DEL VECTOR"));

        String[] vector = new String[tamaño];

        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = JOptionPane.showInputDialog(null, "ingrese los valores para la posicion " + i + ":");
        }

        for (String s : vector) {

            JOptionPane.showMessageDialog(null, s);

        }*/
    }
}
