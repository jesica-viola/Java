//Ejercicio 1 leer un nro y mostrar su cuadrado repetir el proceso 
//hasta que se introduzca un nro negativo
package Ciclos01;

import javax.swing.JOptionPane; //con este se abre una ventanita fuera de consola, pero muestra resultados en consola

public class Ejercicio01 {

    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));//trabaja con String
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es:" + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa a finalizado por número negativo");
    }
}
