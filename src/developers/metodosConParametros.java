package developers;

public class metodosConParametros {
    public static void main(String[] args) {
        //Llamado de metodos
        System.out.println("Metodo void");
        metodoConParametrosVoid(1, 24.34, "Francisco");
        System.out.println("-------------------------");
        System.out.println("Metodo int");
        metodoConParametrosInt(1);
        System.out.println("-------------------------");
        System.out.println("Metodo double");
        metodoConParametrosDouble(24.34);
        System.out.println("-------------------------");
        System.out.println("Metodo string");
        metodoConParametrosString("Francisco");
                
    }
    
    public static void metodoConParametrosVoid(int valorInt, double valorDouble, String valorString){
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor string: " + valorString);
    }
    
    public static int metodoConParametrosInt(int valorInt){
        System.out.println("El valor int es: " + valorInt);
        return valorInt;
    }
    
    public static double metodoConParametrosDouble(double valorDouble){
        System.out.println("El valor double es: " + valorDouble);
        return valorDouble;
    }
    
    public static String metodoConParametrosString(String valorString){
        System.out.println("El valor de string es: " + valorString);
        return valorString;
    }
}
