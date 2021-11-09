import java.util.Scanner;

public class ElegirPrograma {
    public static void main(String[] args) {
        /*
        . Diseñar un programa que realice los ejercicios 6, 7 y 8 según elija el usuario, usar “en
construcción” para las distintas opciones.
         */

        int  respuesta;
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Que ejercicio desea realizar?");
        respuesta=sc.nextInt();
        switch (respuesta) {
            case 6 ->  System.out.println("En construccion");

            case 7 ->  System.out.println("En construccion");

            case 8 ->  System.out.println("En construccion");

            default -> System.out.println("El ejercicio no esta entre las opciones");
        }
    }
}
