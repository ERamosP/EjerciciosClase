import java.util.Scanner;

public class SuspensoAprobado {
    public static void main(String[] args) {
       /*
       12. Realizar un algoritmo que permita introducir la nota de una asignatura por teclado y se
       escriba en letras de la siguiente manera:
       SUSPENSO si es menor que 5
       APROBADO mayor o igual que 5 y menor o igual que 7
       NOTABLE entre 7 y 9 no incluido
       SOBRESALIENTE entre 9 y 10, ambos incluidos
        Restricción: la nota debe estar entre 1 y 10, ambos incluidos.
        */

        double nota;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Introduzca la nota obtenida");
            nota = sc.nextDouble();
        if (nota>=1 && nota<=10){
            if (nota < 5 ) {
                System.out.println("Suspenso");
            }
            if (nota >= 5 && nota <= 7) {
                System.out.println("Aprobado");
            }
            if (nota >= 7 && nota < 9) {
                System.out.println("Notable");
            }
            if (nota >= 9) {
                System.out.println("Sobresaliente");
            }
        }
        } while (nota >= 0 && nota <= 10);

            System.out.println("Dato erroneo");
    }
}