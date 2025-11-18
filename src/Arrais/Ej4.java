package Arrais;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
       Random random=new Random();
        int[] numeros= new int[10];
        int contador0=0;
        int contadorpos=0;
        int contadorneg=0;
        for(int i=0;i<numeros.length;i++){
            numeros[i]= random.nextInt(-10, 10);
                 if (numeros[i] >= 1) {
                     contadorpos = contadorpos + 1;
                 } else if (numeros[i] < 0) {
                     contadorneg = contadorneg + 1;
                 } else if (numeros[i] == 0) {
                     contador0 = contador0 + 1;
                 }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Metiste: ");
        System.out.println( "Positivos: "+contadorpos+ "|Negativos: "+contadorneg+"|Ceros: "+contador0);
    }
    }


