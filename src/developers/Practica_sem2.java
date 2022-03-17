package developers;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Practica_sem2 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double var;
        sumar();
        sumar(9, 10, "Francisco");
        
        
        var = raiz_cuadrada(2);
        String var1 = formato.format(var);
        double z = var * 12;
        System.out.println("El resultado es: " + formato.format(z));
        
    }
    
    private static void sumar(){
        int a = 2;
        int b = 20;
        int suma = a+b;
        System.out.println("La suma es: " + suma);
    }
    
    private static void sumar(int x, int y, String nombre){
        int resultado = x + y;
        System.out.println(nombre + " te ganaste un total: " + resultado);
    }
  
    private static double raiz_cuadrada(double x){
        double resultado;
        resultado = Math.sqrt(x);
        return resultado;
    }
    
}
