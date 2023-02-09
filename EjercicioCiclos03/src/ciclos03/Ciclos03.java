//ejercicio3: leer numeros hasta que se introduzca un 0, indicar si es par o impar
//primero con clase Scanner, luego con JOptionPane
package ciclos03;

import java.util.Scanner;

public class Ciclos03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un nro: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El nro ingresado " + numero + " es PAR");
            } else {
                System.out.println("El nro ingresado " + numero + " es IMPAR");

            }
            System.out.println("Digite otro nro: ");
            numero = Integer.parseInt(entrada.nextLine());

        }
    }
}
