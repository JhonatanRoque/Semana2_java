package developers;

public class Metodos {

    public static void main(String[] args) {
        //Se hace el llamado a cada uno de los metodos creados
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    public static void metodoConVoid(){
        System.out.println("Contenido del metodo con void");
    }
    
    public static int metodoConInt(){
        System.out.println("Contenido del metodo con int");
        return 0;
    }
    
    public static double metodoConDouble(){
        System.out.println("Contenido con el metodo double");
        return 0.0;
    }
    
    public static String metodoConString(){
        System.out.println("Contenido del metodo con string");
        return "";
    }
    
}
