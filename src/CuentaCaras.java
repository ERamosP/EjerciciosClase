import java.util.Scanner;

public class CuentaCaras {
    public static void main(String[] args) {
       /*
       3. Lanzar al aire dos monedas y contar cuántas veces salen 2 caras, 2 cruces y una
           cruz y una cara.
        */

        int moneda1, moneda2, cara = 0, cruz = 0, cara2 = 0, cruz2 = 0;
        char respuesta;
        Scanner sc = new Scanner(System.in);



            System.out.println("¿Desea tirar los dados?");
            respuesta = sc.next().charAt(0);
        while (respuesta=='s')  {

            moneda1 = (int) (1 + Math.random() * 2);
            moneda2 = (int) (1 + Math.random() * 2);
            System.out.print(moneda1+ " , ");
            System.out.println(moneda2);
            if ((moneda1>1) && (moneda2>1)){
                cara2 ++;
            }else if ((moneda1>1) && (moneda2==1)){
                cara++;
                cruz++;
            }else if ((moneda1==1) && (moneda2>1)){
                cara++;
                cruz++;
            }
            else{
                cruz2 ++;
            }
            System.out.println("¿Desea tirar los dados?");
            respuesta = sc.next().charAt(0);

        }

        System.out.println("Cara ha salido "+ cara +" veces, cruz ha salido "+ cruz + " veces, dos caras " + cara2 +
                " veces y dos cruces " + cruz2);
        sc.close();
    }
}

