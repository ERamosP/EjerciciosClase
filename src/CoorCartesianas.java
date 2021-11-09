package principal;

import java.util.Scanner;

public class CoorCartesianas {

    public static void main(String[] args) {

        double x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valos de x");

        x = sc.nextDouble();

        System.out.println("Introduzca el valos de y");

        y = sc.nextDouble();

        if (x > 0) {
            if (y > 0) {
                System.out.println("El punto se encuentra en el primer cuadrante");
            } else {
                System.out.println("El punto se encuentra en el cuarto cuadrante");
            }

        } else if (x < 0) {
            if (y > 0) {

                System.out.println("El punto se encuentra en el segundo cuadrante");
            } else if (y < 0) {
                System.out.println("El punto se encuentra en el tercer cuadrante");
            }
        } else if (y == 0) {

            System.out.println("El punto es el origen de las coordenadas");

        } else if (x == 0 && y != 0) {


            System.out.println("El punto esta en el eje de ordenadas");

        }
        if (y == 0 && x != 0) {


            System.out.println("El punto esta en el eje de abcisas");


        }
        sc.close();
    }
}
