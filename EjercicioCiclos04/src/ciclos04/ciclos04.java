//Ejercici04: pedir nros hasta que se teclee un (-) y mostrar cuantos nros se introdujeron
//ejericicio con clase Scanner
package ciclos04;

import java.util.Scanner;

public class ciclos04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un nro: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            System.out.println("El nro es positivo (+)");
            conteo++;
            System.out.println("Digite otro nro: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresado " + conteo + " nros que no son negativos (-)");

    }
}
