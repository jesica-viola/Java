//tienda de libros
package ejercicio01;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreDelLibro = entrada.nextLine();
        //System.out.println("nombre del libro = " + nombreDelLibro);
        System.out.println("Digite el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());//cambia de string a entero
        System.out.println("Ingrese precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreDelLibro+ " " + "ID: "+ idLibro);
        System.out.println("precio del libro: $" + precioLibro);
        System.out.println("El envio del libro gratuito es: "+envioGratuito);
        
        
        
        
        
    }
}
