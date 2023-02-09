//Ejerccio2: Leer un nro e indicar si es + o -. El proceso se repetira hasta
//que se introduzca un 0 (este archivo no tiene clase Scanner solo JOptionPane)
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio2ConJOPTION {

    public static void main(String[] args) {

        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El nro " + numero + " es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El nro " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        //System.out.println("El numero " + numero + " finaliza el programa"); se puede hacer asi
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa"); //o asi para que te salga el cartelito (ventana emergente)
        
    }
}
