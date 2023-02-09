//Ejercici04: pedir nros hasta que se teclee un (-) y mostrar cuantos nros se introdujeron
//ejericicio con JOptionPane
package ciclos04;

import javax.swing.JOptionPane;

public class Ciclos04JOption {

    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));// esto se utiliza cuando se necesita un input
        while (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El nro " + numero + " es positivo (+)");// sino solo se utiliza show message
            conteo++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro nro: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado " + conteo + " nros que no son negativos (-)");

    }
}
