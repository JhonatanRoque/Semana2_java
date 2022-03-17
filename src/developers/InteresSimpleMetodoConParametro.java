package developers;

public class InteresSimpleMetodoConParametro {
    public static void main(String[] args) {
        /*
        Miriam pidio un prestamo de $1500 a 9 meses plazo a una tasa de interes
        del 8%.¿Cuánto pagara miriam en interes por el préstamo? 
        */
        
        
        //Declaramos variables
        double cantidadPrestada, tiempo, tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75; //9 meses equivale a 9/12 años = 3/4 o 0,75
        tasaDeInteres = 0.08;
        //Envio de parametros al metodo
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: " + valorInteresSimple);
        
    }
    
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres){
        double interesSimple;
        interesSimple = cantidadPrestada * tiempo * tasaDeInteres;
        return interesSimple;
    }
}
