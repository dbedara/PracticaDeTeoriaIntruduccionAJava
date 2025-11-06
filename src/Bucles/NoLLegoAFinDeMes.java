package Bucles;

import java.util.Scanner;

public class NoLLegoAFinDeMes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime los movimientos de la cuenta: (0=Salir)");
        int mov;
        int suma=0;
        System.out.println("Dime el saldo de la cuenta");
        mov=scanner.nextInt();
        do{
           if (mov>=-10000 && mov<=10000) {
                suma = suma + mov;
                System.out.println("Dime Movimientos los movimientos de la cuenta: ");
                mov = scanner.nextInt();
            }else{
               System.out.println(mov+" no esta en el rango, el rago es -10000 y 10000");
               mov = scanner.nextInt();
           }
        }while(mov!=0);
        if (suma<0){
            System.out.println("No llegas a final de mes te faltan "+suma);
        }else{
            System.out.println("Llegas a final de mes te sobra "+suma);
        }
        scanner.close();
    }
}
