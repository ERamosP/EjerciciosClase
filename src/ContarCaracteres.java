import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {

        int contador=0;
        char caracter;
        boolean asterisco=false;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un caracter");
        caracter=sc.next().charAt(0);

        while(asterisco==false){
        if(caracter != '*') {
            contador=contador+1;

            System.out.println("Introduzca un nuevo caracter, si desea salir pulse *");
            caracter=sc.next().charAt(0);
        }else
            asterisco=true;
        }
        System.out.println(" El numero de caracteres introducidos es " + contador);
    }
}
