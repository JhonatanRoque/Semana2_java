package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio1 {
    /*
     Escriba  un  programa  que  imprima  por  pantalla  cuánto  le  costará  
    comprar  una computadora  a un determinado precio  si sabe que puede c
    onseguir una rebaja del 15%. No  olvidar  que  al  precio  del  artículo  
    se  le  debe  de  agregar  el  IVA.  El  programa  deberá permitir  digitar  
    el  precio  de  la  computadora  y deberá  de  realizar  los  cálculos c
    orrespondientes.
    */
    
    public static void main(String[] args) {
        //Formato para numeros en decimales
        NumberFormat formato = new DecimalFormat("#0.00");
        //Leer datos de teclado en tiempo de ejecuciòn
        Scanner Leer = new Scanner(System.in);
        System.out.println("Digite el precio de la computadora: ");
        double precio = Leer.nextDouble();
        
        double valor_iva = calcIva(precio);
        double valor_rebaja = rebajaCompra(precio);
        double total_compra = precioCompra(precio, valor_iva, valor_rebaja);
        
        System.out.println("La rebaja del 15% es de: $" + formato.format(valor_rebaja));
        System.out.println("El iva de la compra es de: $" + formato.format(valor_iva));
        System.out.println("El precio total del equipo es: $" + formato.format(total_compra));
        
    }
    
    public static double precioCompra(double precio, double iva, double rebaja){
        double total = 0.0;
        total = (precio - rebaja) + iva;
        return total;
    }
    
    public static double calcIva(double precio){
        double iva = 0.0;
        iva = (precio * 0.13);
        return iva;
    }
    
    public static double rebajaCompra(double precio){
        double rebaja = 0.0;
        rebaja = precio * 0.15;
        return rebaja;
    }
}
