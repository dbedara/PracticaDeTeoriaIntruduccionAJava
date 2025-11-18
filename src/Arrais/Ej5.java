package Arrais;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numero=new int[5];


        int suma=0;
        float media=0;
        for (int i=0;i<numero.length;i++){
            numero[i]=scanner.nextInt();
            suma=suma+numero[i];
            media=suma/5;
        }
        System.out.println(media);
    }
}
