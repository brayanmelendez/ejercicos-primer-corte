package Ciclos;

import java.util.Scanner;

public class Ciclo_Do_While {
    public static void main(String[] args) {
     int i = 0;
     
     do{
         System.out.println(i);
         i++;
     }while(i < 5);
     String opcion;
     do {
         System.out.println("ingrese la opcion");
         Scanner sc = new Scanner(System.in);
         opcion = sc.next();
     }while(opcion.equals("brayanmelendez"));
     
    }
}
