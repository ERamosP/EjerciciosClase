import java.util.Scanner;

public class MultipolsCinco {

    public static void main(String[] args) {

        int num, Suma=0, Cuenta=0, numeros=0, i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num=sc.nextInt();

        if((num<=100) && (num>0)){
            for(i=num; i>= 1; i--){
                if(i % 5 == 0){
                    Suma=Suma+i;
                    Cuenta++;

                }
            }
            System.out.println("Los multiplos de 5 son " + Cuenta +" y la suma de los mismos es " + Suma );
        }else
            System.out.println("El numero no esta dentro de los parametros establecidos");

    }
}
