//Ejercicio7: pedir nros hasta que se introduzca uno negativo y 
//calcular la media (promedio)
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Ingrese un nro: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {// mientras el nro no sea negativo
            suma += numero;
            conteo++;
            System.out.println("Digite otro nro: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo == 0) {
            System.out.println("\nERROR, la division entre 0 no existe!");

        } else {
            promedio = (float) suma / conteo;
            System.out.println("El promedios es: " + promedio);
        }
    }
}
