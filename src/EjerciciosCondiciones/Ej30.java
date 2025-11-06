package EjerciciosCondiciones;

import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Cuantas horas Trabajaste: ");
        int horas=scanner.nextInt();
                if (horas>40){
                    int resta=horas-40;
                    int extras=resta*16;
                    int pnormal=40*12;
                    int total=extras+pnormal;
                    System.out.println("Trabajaste "+horas+"h, de las extras fueron, "+ resta+" te pagaran "+total);
                }else{
                    int pnormal=40*12;
                    System.out.println("Trabajaste "+horas+" te pagaran "+pnormal);
                }
    }
}
