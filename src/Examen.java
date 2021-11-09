import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        //entrada variables
        int ejercicio=1;
        char respuesta='s';
        Scanner sc=new Scanner(System.in);
        //fin entrada variables

        // entrada bucle
        do { //Entrada datos
            System.out.println("¿Desea elegir un programa?");
            respuesta=sc.next().charAt(0);
            System.out.println("Que ejercicio desea realizar entre las sigueintes opciones? 1- Dibujar figura geométrica" +
                    " 2- Calcular si un número es ambicioso 3- Jugar a los dados ");
            ejercicio=sc.nextInt();

            //fin entrada datos

            switch (ejercicio){
                case 1:
                    int lado, lado2;
                    char caracter;

                    //entrada datos
                    System.out.println("introduzca el lado ");
                    lado= sc.nextInt();
                    lado2=lado;
                    System.out.println("¿Que caracter quiere introducir?");
                    caracter=sc.next().charAt(0);
                    //fin entrada datos

                    //entrada bucle ejercicio 1
                    for(int i=1;i<=lado;i++){

                        for (int j=1; j<=lado2;j++){
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    System.out.println(" ");
                    //fin entrada bucle ejercicio 1
                    break;
                case 2:
                    System.out.println("En contruccion");
                    break;
                case 3:
                    System.out.println("En construccion");
                    /*
                    //Entrada datos ejercicio 3
        int numeroRondas, dado1 = 0, dado2 = 0, puntosRonda = 0, puntosFinal = 0, totalDados = 0, doble = 0;
        char respuesta = 's';
        Scanner sc = new Scanner(System.in);
        //Fin entrada datos ejercicio 3

        //inicio buble
        System.out.println("¿Cuantas rondas quiere hacer?");
        numeroRondas = sc.nextInt();
        for (int i = 1; i <= numeroRondas; i++) {

            while (!(dado1 == 6 && dado2 == 6) || (dado1 == 5 && dado2 == 5) || (dado1 == 4 && dado2 == 4) ||(dado1 == 3 && dado2 == 3)
                    && (dado1 == 2 && dado2 == 2) || (dado1 == 1 && dado2 == 1)) {

                dado1 = (int) (1 + Math.random() * 6);
                dado2 = (int) (1 + Math.random() * 6);
                totalDados = dado1 + dado2;
                puntosRonda = puntosRonda + totalDados;


                if (dado1==6 && dado2==6){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }else
                if (dado1==5 && dado2==5){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }else
                if (dado1==4 && dado2==4){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }else
                if (dado1==3 && dado2==3){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }else
                if (dado1==2 && dado2==2){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }else
                if (dado1==1 && dado2==1){
                    System.out.println("tira otra vez");
                    dado1 = (int) (1 + Math.random() * 6);
                    dado2 = (int) (1 + Math.random() * 6);
                    totalDados=dado1+dado2;
                    puntosRonda=puntosRonda+totalDados;
                    doble++;
                }

                }
            }

            //fin bucle
            //salida resultado
            puntosFinal = puntosRonda + totalDados;
            System.out.println(dado1);
            System.out.println(dado2);
            System.out.println(totalDados);
            System.out.println(puntosRonda);
            System.out.println(puntosFinal);
            //fin salida resultado
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    System.out.println("¿Desea volver a elegir un programa?");
                    respuesta=sc.next().charAt(0);*/
            }

        }while (respuesta=='s');
        System.out.println("Ha sido un placer");





        sc.close();

    }

}