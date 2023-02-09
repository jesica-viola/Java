//Ejercicio 1 leer un nro y mostrar su cuadrado repetir el proceso 
//hasta que se introduzca un nro negativo
package Ciclos01;

import java.util.Scanner;//importar para ingresar dato

public class Ciclos01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //siempre activa el scanner para ingresar el dato del usuario

        int numero, cuadrado;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es:" + cuadrado);
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("El programa a finalizado por número negativo");
    }
}
