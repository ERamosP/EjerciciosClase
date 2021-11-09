import java.util.Scanner;

public class CambioMoneda {
    public static void main(String[] args) {
       /*
       14. Realizar un programa que proporcione el cambio de Euros a distintas monedas según
       opción del usuario. El programa debe controlar todas las entradas y ofrecer al usuario la
       posibilidad de repetir o salir.
        */

        final double DOLAR=1.16, YEN=132, LIBRA= 0.85;
        double cantidad, total;
        int moneda=1;
        Scanner sc=new Scanner(System.in);
       do {
           System.out.println("Introduzca la moneda a la que quiera hacer la conversion  1-Dolares | 2- Yenes | 3-Libras");
           moneda = sc.nextInt();

           switch (moneda) {
               case 1:
                   System.out.println("introduzca la cantidad a convertir");
                   cantidad = sc.nextDouble();
                   total = (DOLAR * cantidad) / 1;
                   System.out.println("el cambio a euros de " + cantidad + " es de " + total);

                   break;
               case 2:
                   System.out.println("introduzca la cantidad a convertir");
                   cantidad = sc.nextDouble();
                   total = YEN * cantidad;
                   System.out.println("el cambio a euros de " + cantidad + " es de " + total);
                   break;
               case 3:
                   System.out.println("introduzca la cantidad a convertir");
                   cantidad = sc.nextDouble();
                   total = LIBRA * cantidad;
                   System.out.println("el cambio a euros de " + cantidad + " es de " + total);
                   break;
           }
       }while(moneda>=1 && moneda<=3);
        System.out.println("Dato erroneo");
    }
}
