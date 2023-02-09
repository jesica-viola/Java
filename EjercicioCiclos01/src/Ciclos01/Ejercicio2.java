//Ejerccio2: Leer un nro e indicar si es + o -. El proceso se repetira hasta
//que se introduzca un 0 (este es con clase Scanner)
package Ciclos01;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El nro " + numero + " es positivo");
            } else {
                System.out.println("El nro " + numero + " es negativo");
            }
            System.out.println("Digite otro número");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+" finaliza el programa");
        
    }
}
