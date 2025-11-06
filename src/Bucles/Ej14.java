package Bucles;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int suma=0;
        for (int i=1;i<=15;i++){
            System.out.println("Dime el numero que quieres sumar");
           int n=scanner.nextInt();
           suma=suma+n;
            System.out.println(suma);
        }

    }
}
