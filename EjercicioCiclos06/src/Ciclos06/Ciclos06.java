//ejercicio6: Pedir nros hasta que se teclee un 0, mostrar la suma
//de toodos los nros introducidos
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Digite un nro: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        } while (numero != 0);
        System.out.println("\tLa suma de todos los nros ingresados es:" + suma);
    }
}
