package Bucles;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        System.out.println("Dime hasta que numero quieres el contador: ");
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
