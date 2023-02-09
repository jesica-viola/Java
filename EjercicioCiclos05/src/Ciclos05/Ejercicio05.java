//ejercicio5: Realizar un juego para adivinar un nro. Para ello generar un nro aleatorio entre 0-100
//y luego ir pidiendo nros indicando si es mayor o menor segun corresponda respecto a N
//el proceso termina cuando el usuario acierta y mostramos el nro de intentos hechos
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void main(String[] args) {
        int numeroIngresado, numeroAdivinar, conteo = 0;
        numeroAdivinar = (int) (Math.random() * 100); //esto genera un nro aleatorio
        JOptionPane.showMessageDialog(null, ".:Juego adivina el nro entre 0-100:.");
        do {
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro que cree q sera: "));
            if (numeroIngresado < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "Digite un nro mayor: ");
            } else if (numeroIngresado > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "Digite un nro menor: ");
            } else {
                JOptionPane.showMessageDialog(null, "| FELICIDADES, has acertado en el nro!! |");
            }
            conteo++;
        } while (numeroIngresado != numeroAdivinar);
        JOptionPane.showMessageDialog(null, "Adivinaste el nro en " + conteo + " intentos");
    }
}
