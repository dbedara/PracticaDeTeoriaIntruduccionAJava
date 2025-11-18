package Funciones;

import java.util.Scanner;

public class FuncionesUtilies {
    public static void Mayor(int[] vector){
        Scanner scanner=new Scanner(System.in);

       int maxnumero=vector[0];
       for (int i=1;i<vector.length;i++){
           System.out.println("Dime "+ i +"º"+" numero: ");
            vector[i]=scanner.nextInt();
            if (maxnumero<vector[i]){
                maxnumero=vector[i];
            }
        }
        System.out.println("El numero maximo es: "+maxnumero);
       scanner.close();
    }

    public static void main(String[] args) {
        int[] numeros= new int[5];
        Mayor(numeros);
    }
}
