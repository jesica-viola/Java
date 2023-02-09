//Ejercicio7: pedir nros hasta que se introduzca uno negativo y 
//calcular la media (promedio)
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07ConOption {

    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
        while (numero >= 0) {// mientras el nro no sea negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro nro: "));
        }
        if (conteo == 0) {
            JOptionPane.showMessageDialog(null, "ERROR, la division entre 0 no existe!");

        } else {
            promedio = (float) suma / conteo;
            JOptionPane.showMessageDialog(null, "El promedios es: " + promedio);
        }
    }
}
