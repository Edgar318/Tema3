package org.example;

import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void vectores() {

        int vector[];

        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2]+4;

        System.out.println( vector[2] + " " + vector[5]);
        for(int i= 0;i<=vector.length-1;i++){
            System.out.println(" " + vector[i] + " ");

        }

        String palabras[] = new String[3];
        palabras [0] ="Pepe";
        for(int i=0;i< palabras.length;i++) {
            System.out.print(" " + palabras[i] + " ");
        }
    }

    public void ejercicio1bateria(){
        Random aleatorio = new Random();

        int[] numeros = new int[8];

        int suma=0;

        for (int i = 0;i< numeros.length;i++){ //bucle para rellenar los vectores

            numeros[i] = aleatorio.nextInt(501);

            suma+=numeros[i];

        }
            System.out.println("La suma de los elementos es: " + suma); //Mostrarlos por pantalla

    }

    public void ejercicio2bateria(){
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[5];

        System.out.println("Introduce los numeros a invertir: ");

        for (int i = 0; i < numeros.length;i++) { //For para introducir numeros introducidos a mano a los vectores

            numeros[i] = teclado.nextInt();

        }

        for(int i =numeros.length-1 ;i>=0; i--){ //Monstrar los vectores invertidos
            System.out.println(" " + numeros[i] + " ");
        }


    }

    public void ejercicio3bateria(){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero[]= new int[25];

        int suma = 0;

       int numin;

        for (int i = 0;i< numero.length;i++){ //bucle para rellenar los vectores

            numero[i] = aleatorio.nextInt(101);

            suma+=numero[i];

        }
        System.out.println("Dime un numero: ");
        numin = teclado.nextInt();
        


    }

}
