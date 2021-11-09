import java.util.Scanner;

public class DadosRandom {
    public static void main(String[] args) {
       /*
       2. Simular n tiradas de un dado y contar las veces que aparece cada número.
           Presentar los resultados en forma de porcentajes. Hacer que el algoritmo se repita
           hasta que se desee terminar.
        */

        int dados, seis=0, cinco=0, cuatro=0, tres=0, dos=0, uno=0, totalNum=0;
        float porcentaje6, porcentaje5, porcentaje4, porcentaje3, porcentaje2, porcentaje1 ;
        char respuesta;
        Scanner sc=new Scanner(System.in);


        System.out.println("¿Desea tirar los dados?");
        respuesta=sc.next().charAt(0);

        while(respuesta=='s'){


            dados=(int)(1+Math.random()*6);
            totalNum++;
            System.out.println(dados);
            if(dados==6){
                seis++;
            }if(dados==5){
                cinco++;
            }if(dados==4){
                cuatro++;
            }if(dados==3){
                tres++;
            }if(dados==2){
                dos++;
            }if(dados==1){
                uno++;
            }
            System.out.println("¿Desea tirar los dados?");
            respuesta=sc.next().charAt(0);
        }
        porcentaje6=(seis*100)/totalNum;
        porcentaje5=(cinco*100)/totalNum;
        porcentaje4=(cuatro*100)/totalNum;
        porcentaje3=(tres*100)/totalNum;
        porcentaje2=(dos*100)/totalNum;
        porcentaje1=(uno*100)/totalNum;


        System.out.println("El porcentaje de 6 es " + porcentaje6 + " y las veces que han salido son " + seis);
        System.out.println("El porcentaje de 5 es " + porcentaje5 + " y las veces que han salido son " + cinco);
        System.out.println("El porcentaje de 4 es " + porcentaje4 + " y las veces que han salido son " + cuatro);
        System.out.println("El porcentaje de 3 es " + porcentaje3 + " y las veces que han salido son " + tres);
        System.out.println("El porcentaje de 2 es " + porcentaje2 + " y las veces que han salido son " + dos);
        System.out.println("El porcentaje de 1 es " + porcentaje1 + " y las veces que han salido son " + uno);

    }
}
