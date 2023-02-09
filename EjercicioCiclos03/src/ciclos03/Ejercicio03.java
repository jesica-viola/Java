//ejercicio03 de ciclos pero con JOPtionPane
package ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El nro ingresado " + numero + " es PAR");
            } else {
                JOptionPane.showMessageDialog(null, "El nro ingresado " + numero + " es IMPAR");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro nro: "));

        }
        JOptionPane.showMessageDialog(null, "El nro ingresado "+numero+" finaliza el programa");
    }
}
