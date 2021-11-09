package principal;

import java.util.Scanner;

public class Pag16 {

    public static void main(String[] args) {

        int num, par=0, negativo=0, respuesta;

        Scanner sc=new Scanner(System.in);

        System.out.println("¿Desea introducir un numero? 1-SI | 2-NO" );

         respuesta = sc.nextInt();

            while(respuesta==1){
                System.out.println("Introduzca un numero" );
                num=sc.nextInt();
                if(num % 2==0){
                    par=par+1;
                }
                else if(num<0){
                    negativo=negativo+1;

                }
                System.out.println("¿Desea introducir un numero? 1-SI| 2-NO" );
                respuesta = sc.nextInt();
            }
        System.out.println("los numeros pares son "+ par + " y los numeros negativos son " + negativo );

    }
}
