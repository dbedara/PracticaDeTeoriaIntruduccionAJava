package Funciones;

import java.util.Scanner;

public class FuncionesUtilies {
    public static void Mayor(int[] vector){
        Scanner scanner=new Scanner(System.in);

       int maxnumero=-1;
       for (int i=0;i<vector.length;i++){
            vector[i]=scanner.nextInt();
            if (vector[i]>maxnumero){
                maxnumero=i;
            }
        }
        System.out.println("El numero maximo es: "+vector[maxnumero]);
       scanner.close();

    }
}
