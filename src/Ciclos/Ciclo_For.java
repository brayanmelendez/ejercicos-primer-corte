package Ciclos;

public class Ciclo_For {

     
    public static void main(String[] args) {
        String[] array = {"facebook","instagram", "yootube"};
        
        for (int i = 0; i < array.length; i++) {
            
           System.out.println(array[i]);
           
        }
        
        for (String s : array){
         System.out.println(s); 
            
        }
        
    }

}
