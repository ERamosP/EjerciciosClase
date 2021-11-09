package com.company;

import java.util.Scanner;

class MayorMenor {
    public static void main(String[] args) {

        int num1, num2, mayor, menor,  respuesta, varContador=2,  nuevoNumero;
        float varAcumulador = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca un numero");
        num1 = sc.nextInt();

        System.out.println("Introduzca otro numero");
        num2 = sc.nextInt();


        varAcumulador = num1+num2;

        if (num1 > num2) {
            mayor = num1;
            menor = num2;

        } else {
            mayor = num2;
            menor = num1;
        }

        System.out.println("¿Desea introducir otro numero? 1-si | 2-no");
        respuesta=sc.nextInt();

        while (respuesta==1) {


            System.out.println("Introduzca un numero");
            nuevoNumero = sc.nextInt();


            if (nuevoNumero > mayor) {

                mayor = nuevoNumero;
            } else if (num1 < menor) {

                menor = nuevoNumero;
            }
            System.out.println("¿Desea introducir otro numero? 1-si / 2-no");
            respuesta= sc.nextInt();

            varContador=varContador+1;
            varAcumulador=varAcumulador+nuevoNumero;


        }
        varAcumulador=varAcumulador/varContador;
        System.out.println("El mayor es " + mayor + " el menor es " + menor + " y la media es " + varAcumulador);
        sc.close();
    }
}
