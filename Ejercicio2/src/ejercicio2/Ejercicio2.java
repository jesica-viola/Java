package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese su salario semanal:");
        Scanner entrada = new Scanner(System.in);
        int salarioEntero = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese cantidad de horas trabajadas semanalmente");
        int cantHoras = Integer.parseInt(entrada.nextLine());
        System.out.println("Cantidad de horas semanales= " + cantHoras);
        System.out.println("salario semanal= $" + salarioEntero);
        float salarioXHora = salarioEntero / cantHoras;
        System.out.println("salario por hora = $" + salarioXHora);

    }

}
