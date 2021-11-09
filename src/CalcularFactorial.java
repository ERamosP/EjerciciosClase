import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {

        int num, acumulador=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num=sc.nextInt();

        if(num>0){
            for(int i=num; i>=1; i--){
                acumulador=acumulador*i;
            }
        }else if(num<=0){

            System.out.println("error");
        }
        System.out.println("El factorial de " + num + " es " + acumulador );
    }

}
