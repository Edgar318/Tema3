package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void vectores() {

        int vector[];

        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2] + 4;

        System.out.println(vector[2] + " " + vector[5]);
        for (int i = 0; i <= vector.length - 1; i++) {
            System.out.println(" " + vector[i] + " ");

        }

        String palabras[] = new String[3];
        palabras[0] = "Pepe";
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" " + palabras[i] + " ");
        }
    }

    public void ejercicio1bateria() {
        Random aleatorio = new Random();

        int[] numeros = new int[8];

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) { //bucle para rellenar los vectores

            numeros[i] = aleatorio.nextInt(501);

            suma += numeros[i];

        }
        System.out.println("La suma de los elementos es: " + suma); //Mostrarlos por pantalla

    }

    public void ejercicio2bateria() {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[5];

        System.out.println("Introduce los numeros a invertir: ");

        for (int i = 0; i < numeros.length; i++) { //For para introducir numeros introducidos a mano a los vectores

            numeros[i] = teclado.nextInt();

        }

        for (int i = numeros.length - 1; i >= 0; i--) { //Monstrar los vectores invertidos
            System.out.println(" " + numeros[i] + " ");
        }


    }

    public void ejercicio3bateria() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero[] = new int[25];

        int suma = 0;

        int numin = 0;

        int contador = 0;

        for (int i = 0; i < numero.length; i++) { //bucle para rellenar los vectores

            numero[i] = aleatorio.nextInt(101);

        }
        System.out.println("Dime un numero [0-100]: ");
        numin = teclado.nextInt();

        for (int i = 0; i < numero.length; i++) { //for para comprobar cuantas veces se repite un numero introducido
            if (numin == numero[i]) {
                contador++;
            }
        }
        System.out.println("El numero: " + numin + " se repite " + contador + " veces.");

    }

    public void ejercicio4bateria() {
        Scanner entrada = new Scanner(System.in);
        int enteros[] = {4, 3, 5, 19, 34, 75, 4};
        System.out.println(Arrays.toString(enteros));
        int enteros2[] = new int[enteros.length - 1];

        System.out.println("Dime el que quieres eliminar: ");
        int eliminar = entrada.nextInt();

        for (int i = 0; i < enteros.length - 1; i++) {
            if (i < eliminar) {
                enteros2[i] = enteros[i];
            } else {

                enteros2[i] = enteros[i + 1];

            }

        }
        System.out.println(Arrays.toString(enteros));
        System.out.println(Arrays.toString(enteros2));
    }

    public void ejercicio5bateria() {

        int numeros[] = {3, 5, 2, 1, 4};

        int ultima_posicion = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i >= 0; i--) {

            if (i == 0) {

                numeros[i] = ultima_posicion;

            } else {

                numeros[i] = numeros[i - 1];
            }
        }

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]);

        }


    }

    public void vectores2() {

        String palabras[] = {"Juan", "Pepe", "Manolo", "Maria"};

        for (String i : palabras) {
            System.out.println(i);
        }
        String textovector = Arrays.toString(palabras);
        System.out.println(textovector);
    }

    public void Samurais() {

        Scanner entrada = new Scanner(System.in);

        int numsamurais = 7;
        int totalpotencia = 30;

        int[] equipo1 = new int[numsamurais];
        int[] equipo2 = new int[numsamurais];

        for (int j = 1; j <= 2; j++) {
            int[] equipo;

            if (j == 1) {
                equipo = equipo1;
            } else {
                equipo = equipo2;
            }

            while (true) {
                System.out.println("Introduce la potencia de los samurais para el Equipo " + j + " (7 valores que sumen 30):");
                String input = entrada.nextLine();
                String[] potencias = input.split(" ");

                if (potencias.length != numsamurais) {
                    System.out.println("ERROR: Debes introducir exactamente " + numsamurais + " valores.");
                    continue;
                }

                boolean valido = true;
                int suma = 0;

                for (int i = 0; i < numsamurais; i++) {
                    try {
                        equipo[i] = Integer.parseInt(potencias[i]);
                        suma += equipo[i];
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Todos los valores deben ser números enteros.");
                        valido = false;
                        break;
                    }
                }

                if (!valido) {
                    continue;
                }

                if (suma == totalpotencia) {
                    System.out.println("Equipo " + j + " completado.");
                    break;
                } else {
                    System.out.println("ERROR. La potencia total no suma 30. Inténtalo de nuevo.");
                }
            }
        }

        System.out.println("¡Equipos completados! ¡Empieza la batalla!");

        int bajasequipo1 = 0;
        int bajasequipo2 = 0;

        for (int i = 0; i < numsamurais; i++) {
            System.out.print("Samurai " + (i + 1) + ": ");

            if (equipo1[i] > equipo2[i]) {
                System.out.println("Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                equipo2[i] = 0;
                bajasequipo2++;
            } else if (equipo1[i] < equipo2[i]) {
                System.out.println("Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
                equipo1[i] = 0;
                bajasequipo1++;
            } else {
                System.out.println("Empate. Ambos samuráis mueren.");
                equipo1[i] = 0;
                equipo2[i] = 0;
                bajasequipo1++;
                bajasequipo2++;
            }

            if (bajasequipo1 > numsamurais / 2) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasequipo1 + " bajas.");
                break;
            }
            if (bajasequipo2 > numsamurais / 2) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasequipo2 + " bajas.");
                break;
            }
        }

        if (bajasequipo1 <= numsamurais / 2 && bajasequipo2 <= numsamurais / 2) {
            System.out.println("La batalla ha terminado sin que ningún equipo tenga más de la mitad de bajas.");
        }
    }
    }
}
