package AcostaVSVeyone;

import java.util.Scanner;

public class AcostaVSVeyone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el mes que quieres saber cuanto tiempo jugo Acosta: ");
        String mes = scanner.next();
        //Calculos Clase
        int clasesjuega=60;
        int jugandosinmiedo=clasesjuega-20;
        int jugandosinmiedomes=jugandosinmiedo*20;
        int tiempoextra=jugandosinmiedo+10;
        //Calculo tabulacion
        int tabulapordia=((jugandosinmiedo*60)/15);
        int tiempoentretabulaciones=tabulapordia*10;


        switch (mes){
            case "ENERO", "MARZO","MAYO", "JULIO", "AGOSTO", "OCTUBRE", "DICIEMBRE" -> System.out.println(tabulapordia+"x");
            case "FEBRERO" -> System.out.println(tabulapordia+"d");
            case "ABRIL", "JUNIO", "SEPTIEMBRE", "NOVIEMBRE" -> System.out.println(tabulapordia+"h");

        }
    }
}