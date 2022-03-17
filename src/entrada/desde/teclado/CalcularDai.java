package entrada.desde.teclado;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalcularDai {
    public static void main(String[] args) {
        /*
        Para importar una máquina de  procesamiento de alimentos, la dirección 
        de aduanas  cobra el 10% de impuesto  sobre  el  valor  de  la  maquinaria 
        menos  el  valor  del  costo  del  flete  para  transportar  la  maquinaria  
        desde  estados unidos a el salvador menos el valor del seguro pagado para 
        asegurar que la maquina ingrese a territorio nacional, porlo general el
        5% del valor dela máquina. La fórmula queda así: DAI = (valor de la
        máquina –flete  –seguro) * 10%. Al valor resultante hay que calcularle
        el valor del IVA que es el 13% del valor del DAI.
        
        Si estamos importandp una maquina que cuesta $10,000, hemos pagado por el 
        flete $500. 
        
        ¿Cuánto es el valor del DAI y del IVA?
        */
        
        //Creamos nuestro objeto leer
        Scanner leer = new Scanner(System.in);
        
        //Creamos nuestro objeto formato
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        double maquinaValor, valorFlete, valorSeguro;
        System.out.println("Valor de la maquina:");
        maquinaValor = leer.nextDouble(); //Captura los datos en el tippo que necesita
        System.out.println("Valor  del flete");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(maquinaValor, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obteenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + formato.format(valorDai) );
        System.out.println("Valor del IVA: " + formato.format(valorConIva));
    }
    
    //Crear el metodo para el calculo del DAI
    public static double obtenerDai (double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
        return dai;
    }
    //Metodo para obtener el valor mas IVA
    public static double obteenerIva(double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
    }
}
