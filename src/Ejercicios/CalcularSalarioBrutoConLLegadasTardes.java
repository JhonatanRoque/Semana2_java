package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class CalcularSalarioBrutoConLLegadasTardes {
    public static void main(String[] args) {
        //Ejercicio
        /*
        Escriba un programa para calcular el salario bruto de un empleado. Para calcular
        el salario del empleado debemos de hacer los descuentos por llegadas tardías así
        como la retención de la renta que es el 10% del salario menos del descuento
        por llegada tardía. Debe de crear una fórmula para determinar el salario por minuto
        y calcular el monto por las llegadas tardías y descontarlo al salario, luego de descontar
        el monto de la renta. El programa deberá permitir ingresar el nombre del empleado, el 
        salario mensual. EL programa deberá de imprimir el nombre del empleado, el descuento por 
        llegadas tardías, la retención de la renta y finalmente el salario bruto.
        */
        
        //Declaración de variables y objetos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        NumberFormat formato = new DecimalFormat("$#,###.##");
        double salarioMensual, salarioDiario, salarioxMinuto, renta, descLlegadaTardeTotal, salarioNeto;
        String nombre;
        
        //Proceso
        try{
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = leer.readLine();
            System.out.println("Digite el salario mensual de : " + nombre);
            salarioMensual = Double.parseDouble(leer.readLine());
            
            salarioDiario = calcSalarioDiario(salarioMensual);
            salarioxMinuto = calcSalarioXMinuto(salarioDiario);
            renta = calcRenta(salarioMensual);
            descLlegadaTardeTotal = calcDescLlegadatardia(salarioxMinuto);
            salarioNeto = calcSalarioNeto(salarioMensual, renta, descLlegadaTardeTotal);
            
            System.out.println("El empleado                           : " + nombre);
            System.out.println("Sueldo mensual                        : " + formato.format(salarioMensual));
            System.out.println("Descuento renta                       : " + formato.format(renta));
            System.out.println("Descuento llegada tarde               : " + formato.format(descLlegadaTardeTotal));
            System.out.println("Salario Neto                          : " + formato.format(salarioNeto));
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    //Métodos
    //Método para calcular el salario por minuto
    private static double calcSalarioXMinuto(double salarioDiario){
        double salarioMinuto = salarioDiario / 480; //1 hora = 60 minutos, 8 horas laborales = 480 minutos
        return salarioMinuto;
    }
    //Metodo para conocer el salario Diario
    private static double calcSalarioDiario(double salarioMensual){
        double salarioDiario = (salarioMensual / 26); //Suponemos que el empleado tiene que laborar 26 dias al mes
        return salarioDiario;
    }
    //Método para calcular la renta
    private static double calcRenta(double salario){
        double renta = (salario * 0.10);
        return renta;
    }
    //Método para calcular la retención por llegada tardia
    private static double calcDescLlegadatardia(double salarioxMinuto){
        double descuentos;
        double diasTarde;
        double minutosTarde;
        double minutosTardeT=0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        NumberFormat formato = new DecimalFormat("$#,###.##");
        try{
            System.out.println("Digite la cantidad de días que llego tarde el empleado: ");
            diasTarde = Double.parseDouble(leer.readLine());
            for(int i = 1; i <= diasTarde; i++){
                System.out.println("Digite la cantidad de minutos tarde para el dia [ " + i + " ] que llego tarde el empleado:");
                minutosTarde = Double.parseDouble(leer.readLine());
                
                minutosTardeT = minutosTardeT + minutosTarde;
                
            }
             descuentos = minutosTardeT * salarioxMinuto;
             System.out.println("La cantidad de minutos tarde llegado es de  : " + minutosTardeT);
             System.out.println("El total de descuentos por llegada tarde es : " + formato.format(descuentos));
             return descuentos;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
     
    }
       //Método para calcular salario neto
        private static double calcSalarioNeto(double salarioMensual, double renta, double descuentosLlegadaTarde){
            double salarioNeto = (salarioMensual - renta) - descuentosLlegadaTarde;
            return salarioNeto;
        }
}
