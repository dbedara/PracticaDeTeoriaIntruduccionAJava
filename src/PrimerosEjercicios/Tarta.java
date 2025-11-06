package PrimerosEjercicios;

import java.util.Scanner;

public class Tarta {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
        System.out.println("Dime el numero de manzanas: ");

        int manzanas= scanner.nextInt();
        int moras=manzanas*2;
        float tazas=((moras+manzanas)/2f);

        System.out.println("El numero de moras es "+moras+" el numero de tazas es "+tazas);
        scanner.close();
    }

}
