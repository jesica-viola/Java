//ejercicio5: Realizar un juego para adivinar un nro. Para ello generar un nro aleatorio entre 0-100
//y luego ir pidiendo nros indicando si es mayor o menor segun corresponda respecto a N
//el proceso termina cuando el usuario acierta y mostramos el nro de intentos hechos
package Ciclos05;

import java.util.Scanner;

public class Ejercicio05Ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroIngresado, numeroAdivinar, conteo = 0;
        numeroAdivinar = (int) (Math.random() * 100); //esto genera un nro aleatorio
        System.out.println("\t.:Juego adivina el nro entre 0-100:.");
        do {

            System.out.println("Ingrese el nro que cree q sera: ");
            numeroIngresado = Integer.parseInt(entrada.nextLine());
            if (numeroIngresado < numeroAdivinar) {
                System.out.println("Digite un nro mayor: ");
            } else if (numeroIngresado > numeroAdivinar) {
                System.out.println("Digite un nro menor: ");
            } else {
                System.out.println("\t| FELICIDADES, has acertado en el nro!! |");
            }
            conteo++;
        } while (numeroIngresado != numeroAdivinar);
        System.out.println("Adivinaste el nro en " + conteo + " intentos");
    }
}
