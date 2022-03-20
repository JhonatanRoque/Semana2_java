package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcularSalarioBrutoVComputadora {
    public static void main(String[] args) {
        //Ejercicio
        /*
        Una empresa de venta de computadoras paga a su personal de ventas un salario
        de $300,00 más una comision de $50,00 por computadora vendida. Diseñar un progama
        para calcular el salario de un vendedor en un determinado mes, conociendo el n° de
        computadoras vendidas. Al sslario devengado se debe de retenet el 10% en concepto
        de renta. Imprimir el nombre del vendedor, el salario devengado y la retención de 
        la renta.
        */
        
        //Declarar variables y objetos
        String nombre;
        double salario=300, nComputadoraV,comision, salarioDevengado, renta, salarioNeto;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //proceso
        try{
            System.out.println("Ingrese el nombre del vendedor: ");
            nombre = leer.readLine();
            System.out.println("Digite la cantidad de computadoras vendidas por " + nombre +" : ");
            nComputadoraV = Double.parseDouble(leer.readLine());
            
            comision = calcComision(nComputadoraV);
            salarioDevengado = calcSalarioDevengado(salario, comision);
            renta = calcRenta(salarioDevengado);
            salarioNeto = calcSalarioNeto(salarioDevengado, renta);
            
            mostrarDatos(nombre, nComputadoraV, comision, salarioDevengado,renta, salarioNeto);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    //Método para calcular la comision (Ncomputadora * comision)
    private static double calcComision(double NVcomputadora){
        double comisionTotal = (NVcomputadora * 50 );
        return comisionTotal;
    }
    //Método para calcular el SalarioDevengado
    private static double calcSalarioDevengado(double salario, double comision){
        double salarioDevengado = (salario + comision);
        return salarioDevengado;
    }
    //Método para calcular renta
    private static double calcRenta(double salarioDevengado){
        double rentaTotal = (salarioDevengado * 0.10);
        return rentaTotal;
    }
    //Método para calcular el salatio neto
    private static double calcSalarioNeto(double salarioDevengado, double renta){
        double salarioNeto = (salarioDevengado - renta);
        return salarioNeto;
    }
    //Método para mostrar datos en pantalla
    private static void mostrarDatos(String nombre, double cantComputadora, double comision, double salarioB, double renta, double salarioN){
        NumberFormat formato = new DecimalFormat("$#,###.##");
        NumberFormat formato1 = new DecimalFormat("#");
        System.out.println("El nombre del vendedor es           : " + nombre);
        System.out.println("Cantidad de computadoras vendidas   : " + formato1.format(cantComputadora));
        System.out.println("Comisiones ($50 dolares por venta)  : " + formato.format(comision));
        System.out.println("Salario bruto                       : " + formato.format(salarioB));
        System.out.println("Renta                               : " + formato.format(renta));
        System.out.println("Salario neto                        : " + formato.format(salarioN));
    }
    
}
