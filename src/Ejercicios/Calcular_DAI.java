package Ejercicios;

import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.BufferedReader;

public class Calcular_DAI {
    public static void main(String[] args) {
        //Ejercicio
        /*
        Hacer un programa que calcule el valor de DAI(Derecho Arancelario a la importación)
        para un vehiculo del año 2010, utilizando la siguiente formula:
        
        DAI = (Valor Vehiculo en USA - Deprecación - Flete - Seguro) * 0.25
        
        Deprecación = Valor Vehiculo en USA * 0.10
        
        El programa deberá permitir ingresar vía teclado los valores para el valor del
        vehiculo en USA, flete y seguro. Por el momento el porcentaje de la deprecación
        sera constante. Para efectos de prueba puede utilizar los siguientes valores:
        
        Valor USA = 5,000  Deprecación = 10%  Flete = 700   Seguro = 100
        
        Imprimir los valores capturados así como el monto del DAI
        
        */
        
        //Formato para decimales
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        //Declarar variables
        double valorVehiculoUsa, flete, seguro, valorDeprecacion, valorDai;
        
        //Incializar las variables
        valorVehiculoUsa = 0;
        flete = 0;
        seguro = 0;
        
        //Entrada de datos, creación de objeto leer
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)) ;
        
        try{
            System.out.println("Ingrese el valor del Vehiculo en USA:");
            valorVehiculoUsa = Double.parseDouble(leer.readLine());
            System.out.println("Igrese el valor del flete:");
            flete = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el valor del seguro");
            seguro = Double.parseDouble(leer.readLine());
            
            //Calcular deprecación
            valorDeprecacion = calcDeprecacion(valorVehiculoUsa);
            valorDai = calcDai(valorVehiculoUsa, valorDeprecacion, flete, seguro);
            
            //Mostrar datos en pantalla
            System.out.println("El valor del vehiculo en USA es             : " + formato.format(valorVehiculoUsa));
            System.out.println("Deprecación (10%)                           : " + formato.format(valorDeprecacion));
            System.out.println("Flete                                       : " + formato.format(flete));
            System.out.println("Seguro                                      : " + formato.format(seguro));
            System.out.println("Total DAI                                   : " + formato.format(valorDai));
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
    //Creación de metodos 
    //Metodo para calcular el DAI
    private static double calcDai(double valorUSA, double deprecacion, double flete, double seguro){
        double totalDai = (valorUSA - deprecacion - flete - seguro) * 0.25;
        return totalDai;
    }
    //Metodo para calcular Deprecación
    private static double calcDeprecacion(double valorUsa){
        double totalDeprecacion = valorUsa * 0.10;
        return totalDeprecacion;
    }
}
