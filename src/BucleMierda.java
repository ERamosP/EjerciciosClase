import java.util.Scanner;

public class BucleMierda {

    public static void main(String[] args) {

        long num1, numElevado, natural = 1, resProducto=0;
        double resRaiz, resPotencia;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un numero");
            num1 = sc.nextInt();
        } while (num1 < 1 || num1 > 20);

        do {
            System.out.println("Indique a cuanto desea elevarlo");
            numElevado = sc.nextInt();
        } while (numElevado < 2 || numElevado > 5);

        while (natural <= num1) {

            resRaiz = Math.sqrt(natural);

            resPotencia = Math.pow(natural, numElevado);

            resProducto = natural * num1;

            System.out.println("el resultado de la raiz cuadrada es " + resRaiz + " el de la potencia es " + resPotencia);

            natural++;

        }
        System.out.println("El producto de todos los numeros es " + resProducto);
    }
}