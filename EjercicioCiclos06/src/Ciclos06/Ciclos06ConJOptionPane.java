//ejercicio6: Pedir nros hasta que se teclee un 0, mostrar la suma
//de toodos los nros introducidos pero con JOptionPane
package Ciclos06;

import javax.swing.JOptionPane;

public class Ciclos06ConJOptionPane {

    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));
            suma += numero;
        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "La suma de todos los nros ingresados es: " + suma);
    }
}
