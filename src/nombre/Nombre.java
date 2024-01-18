package nombre;
import java.util.Scanner;

public class Nombre {

    
    public static void main(String[] args) {
      String nombre;
       Scanner entrada = new Scanner(System.in);        
        System.out.println("Escribe tu nombre");
        nombre=entrada.next();
        System.out.println("Tu nombre es: "+nombre);
    }
    
}
