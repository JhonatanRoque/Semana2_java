package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcularSalarioVendedor {
    public static void main(String[] args) {
        //Ejercicio
        /*
        Una agencia de autos paga a su personal de ventas un salario de $800,00
        más una comisison de $170,00 por auto vendido más un 5% del valor de venta.
        Diseñar un programa para calcular el salario de un vendedor en un determinado
        mes, conociendo el n° de automoviles vendidos y el total del moonto de ventas
        Imprimir el nombre del vendedor y el salario devengado por este.
        */
        NumberFormat formato = new DecimalFormat("$#,###.##");
        NumberFormat formato1 = new DecimalFormat("#");
        //Declararción de variables y objetos
        String nombre;
        double nAutosVendidos, salario, precioAuto, valorVenta, totalVentas, valorComision=0, valorVentasT=0, comisionVentas=0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //Proceso
        try{
            System.out.println("Ingrese el nombre del vendedor: ");
            nombre = leer.readLine();
            System.out.println("Cuantas ventas realizo el vendedor:");
            nAutosVendidos = Double.parseDouble(leer.readLine());
            for(int i = 1; i <= nAutosVendidos; i++){
                System.out.println("Ingrese el precio del Auto de la venta [ " + i + " ]:" );
                precioAuto = Double.parseDouble(leer.readLine());
                valorVenta = calcValorDeVenta(precioAuto);
                System.out.println("El valor de venta (precioDeAuto + 170 (comision de venta)) del auto es de: " + formato.format(valorVenta));
                comisionVentas = comisionVentas + 170;
                valorVentasT = valorVentasT + valorVenta;
                valorComision = valorComision + calcComision(valorVenta);
            }
            
            totalVentas = calcTotalVentas(valorVentasT, valorComision);
            salario = calcSalarioNeto(800, valorComision, nAutosVendidos);
            System.out.println("Nombre del vendedor        : " + nombre);
            System.out.println("El total de ventas es de   : " + formato1.format(nAutosVendidos));
            System.out.println("Comisiones 5%              : " + formato.format(valorComision));
            System.out.println("Comisiones de auto vendido : " + formato.format(comisionVentas));
            System.out.println("El total de ventas es      : " + formato.format(totalVentas));
            System.out.println("Salario                    : " + formato.format(salario));
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    //Métodos
    //Metodo para calcular la comision 5% del valor de venta
    private static double calcComision (double valorVenta){
        double comision = (valorVenta * 0.05);
        return comision;
    }
    //Método para calcular el valor de venta
    private static double calcValorDeVenta(double precioAuto){
        double valorVenta = (precioAuto + 170);
        return valorVenta;
    }
    //Método para calcular el total de las ventas
    private static double calcTotalVentas(double comisionTotal, double valorVentasTotales){
        double totalVentas = (comisionTotal + valorVentasTotales);
        return totalVentas;
    }
    //Método para calcular el salarioNeto del vendedor
    private static double calcSalarioNeto(double salario, double comisiones, double cantVentas){
        double salarioN = (salario + comisiones + (cantVentas * 170));
        return salarioN;
    }
}
