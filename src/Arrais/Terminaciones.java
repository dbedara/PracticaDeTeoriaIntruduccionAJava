package Arrais;

import java.util.Scanner;

public class Terminaciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantos numeros premios principales sabes: ");

      int  npremios=scanner.nextInt();
        int[] premiosanteriores= new int[npremios];
        int i;
            for (i=0;i<premiosanteriores.length;i++){
                    System.out.println("Dime los numeros que fueron premiados: ");
                    premiosanteriores[i]=scanner.nextInt();
                    while (premiosanteriores[i]<1 || premiosanteriores[i]>10000){
                            System.out.println("Numero erroneo dimelo otra vez");
                            premiosanteriores[i]=scanner.nextInt();
                    }

                    int contadorul=0;
                    for (i=0;i<premiosanteriores.length;i++){
                        double ultimon=premiosanteriores[i] % 10;
                        System.out.println(ultimon);
                    }
                     for (i=0;i<premiosanteriores.length;i++){
                         if (premiosanteriores[i]==premiosanteriores[i+1]){
                             contadorul=contadorul+1;
                         }
                     }

            }

    }
}
