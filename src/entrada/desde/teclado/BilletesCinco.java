package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BilletesCinco {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cantidadDinero;
        try{
            System.out.println("Cantidad");
            cantidadDinero = leer.readLine(); //Lectura tipo string
            String cantidadCinco = BilletesCinco.obtenerBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de billetes de $5.00: " + cantidadCinco);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static String obtenerBilletesDeCinco(String cantDinero){
        double montoDinero = Double.parseDouble(cantDinero); //Convertir a double
        int billetesCinco = (int) montoDinero/5; //Casting de double a int
        String resultado = String.valueOf(billetesCinco); //Casting a string
        return resultado;
    }
}
