package Bucles;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=5;i++){
            int n=scanner.nextInt();
            if (n%3==0) {
                System.out.println("Es multiplo " + n + " de 3");
            }else{
                System.out.println(n+" no es multiplo de 3");
            }
        }
    }
}
