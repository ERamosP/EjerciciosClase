package principal;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class VasoBolita {
    public static void main(String[] args) {
        /*
        7. Diseña un algoritmo para simular el juego de ¿dónde está la bolita? (trile), famoso
        timo practicado por los llamados trileros .En nuestro caso el ordenador será un
        honrado trilero que no engañará al usuario que juegue con él.
         */
        int bola, vaso, contador=0;
        Scanner sc = new Scanner(System.in);
        char respuesta;

        System.out.println("¿Desea jugar?");
        respuesta = sc.next().charAt(0);

       while  (respuesta == 's') {
                contador=1;
                System.out.println("elija un vaso 1, 2 ó 3");
                vaso=sc.nextInt();
                while(vaso>3 || vaso<1){
                    System.out.println("No tenemos tantos vasos");
                    System.out.println("elija un vaso 1, 2 ó 3");
                    vaso=sc.nextInt();
                    }
                bola=(int)(1+Math.random()*3);
                if(vaso==bola){
                System.out.println("Enhorabuena, ha conseguido adivinar donde esta la bola");

                }else{
                    contador++;
                 System.out.println("¡FALLO!");
                }

                System.out.println("¿Desea jugar otra vez?");
                respuesta = sc.next().charAt(0);


            }if (contador>=3){
            System.out.println("Te he dejao to pelao,  ¡¡¡¡¡¡¡VETE A CASA!!!!!");
        }else if (contador>0 && contador<3)        {
            System.out.println("Me has dejao tiritando, no he conseguido salir de mi caja de carton");
        }if (contador==0){
            System.out.println("Eres un rancio");
        }

    }
}
