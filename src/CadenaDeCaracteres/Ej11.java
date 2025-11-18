package CadenaDeCaracteres;

import java.util.Scanner;
import java.util.SortedMap;

public class Ej11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre=scanner.next();
        int[] vector=new int[nombre.length()];

        //Guarda el caracter en el vector el nombre
            for (int i=0;i<vector.length;i++){
               vector[i]=nombre.charAt(i);
               System.out.print(nombre.charAt(i)+ " ");
            }
        //Salto de linea
        System.out.println();
        //Cantidad de caracteres en el vector
        int contador=0;
            for (int h=0;h<vector.length;h++){
                vector[h]=nombre.charAt(h);
                if (vector[h]=='a'){
                    contador=contador+1;
                }else if (vector[h]=='e'){
                    contador=contador+1;
                }else if(vector[h]=='i'){
                    contador=contador+1;
                }else if(vector[h]=='o'){
                    contador=contador+1;
                }else if(vector[h]=='u'){
                    contador=contador+1;
                }
            }
        System.out.println(contador);

        //Guardo el caracter al reves en el vector
            for (int j=vector.length-1;j>=0;j--) {
                vector[j] = nombre.charAt(j);
                System.out.print(nombre.charAt(j)+ " ");
            }

        scanner.close();
    }
}
