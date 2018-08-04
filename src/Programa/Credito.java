package Programa;

public class Credito {

    public String fecha;
    public int cuotas;
    public float intereses;
    public float valorCredito;

    public double ValorTotal() {

        double suma = 0;
        double in = intereses / 100;
        double valor = valorCredito;
        double cu = cuotas;
        double interesMensual;
        double total;
        interesMensual = valor * in;
        total = interesMensual * cu;
        suma = total + valor;
        return suma;
        
    }

}
