//Ejercicio8 pedir un nro N y mostrr todoss los nros del 1 al N

package Ciclos08;

import javax.swing.JOptionPane;
public class Ejercicio08OptionPane {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));
        int i = 1;
        while( i <= numero) {
            JOptionPane.showMessageDialog(null, i);
            i++;
            
        }
    }
}
