// 
package Operaciones;

public class Aritmetica {

    // atributos de la clase
    int a;
    int b;

    //el contructor es un metodo especial
    public Aritmetica() { // contructor 1 vacio
        System.out.println("Se esta ejecutando este constructor numero uno");
    }

    //estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b) {//constructor2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor nro 2");
    }

    // metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        //int resultado = a+b;
        return a + b;

    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; // el argumento a se asgna al atributo this.a
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno(); //ambos brindan el mismo resultado
    }
}
