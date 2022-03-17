package entrada.desde.teclado;

import java.io.BufferedReader; //Importar las clases para la lectura de datos desde teclado
import java.io.InputStreamReader; //Son tipos de string, habra que convertir los datos

public class Calculadora {
    public static void main(String[] args) {
        double cantidad1=0, cantidad2=0; //Declaramos e inicializamos las variables
        //Crear el objeto leer de las clases correspondientes para obtener los datos
        BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));
        try { //Se utiliza el manejador de errores de lo contrario genera error
            System.out.println("Digite la cantidad 1: ");
            //Hace la lectura desde el teclado y lo convierte a double
            cantidad1 = Double.parseDouble(Leer.readLine());
            System.out.println("Digite la cantidad 2: ");
            cantidad2 = Double.parseDouble(Leer.readLine());
            
            System.out.println("El resultado de la suma es              : " + sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es             : " + restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicaciòn es    : " + multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la division es          : " + dividir(cantidad1, cantidad2));
            
        }
        catch (Exception e){ //Captura del error
            System.out.println(e.getMessage());
        }
        
    }
    
    public static double sumar(double cant1, double cant2){
        double suma = cant1 + cant2;
        return suma;
    }
    
     public static double restar(double cant1, double cant2){
        double resta = cant1 - cant2;
        return resta;
    }
    
      public static double multiplicar(double cant1, double cant2){
        double multiplicacion = cant1 * cant2;
        return multiplicacion;
    }
      
       public static double dividir(double cant1, double cant2){
        double division = cant1 / cant2;
        return division;
    }
}
