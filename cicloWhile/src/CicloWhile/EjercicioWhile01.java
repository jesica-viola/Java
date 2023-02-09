package CicloWhile;

public class EjercicioWhile01 {

    //while: se ejecuta mientras siga siendo verdadera la condicion hasta que sea falso (ahi se termina)
    //ciclo MIENTRAS-HACER
    public static void main(String[] args) {
        var conteo = 0; //inferencia de tipos
        while (conteo <= 7) {
            System.out.println("conteo = " + conteo);
            conteo++; // aumenta en 1 la variable
        }
        System.out.println(" ");//meti un espacio
        var contador = 1; //inicio en 1 asi no muestra el 0
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 7);
        System.out.println(" ");//agrego otra linea

        //PALABRAS CLAVES BREAK Y CONTINUE con labels o etiquetas
        for (var contando = 1; contando < 7; contando++) {
            if (contando % 2 != 0) { // != diferente a 0
                System.out.println("contando = " + contando);
                break;// rompe el ciclo cuando encuentra la 1er condicion
            }

        }
        inicio:
        for (var contando = 1; contando < 7; contando++) {
            if (contando % 2 == 0) { // igual a 0 osea pares
                continue inicio; //vamos a la siguiente iteracion

            }
            System.out.println("contando = " + contando);
        }

    }
}
