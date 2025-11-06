package PrimerosEjercicios;

import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Esto es para indicar el maximo que puede tener un valor
        final int GR_SACO_CALIDAD = 250;
        final int GR_SACO_NORMAL = 8000;

        int porcentajeDiarioCalidad = scanner.nextInt();
        int grTotalPiensoDiario = scanner.nextInt();
        int grDiarioCalidad= grTotalPiensoDiario * porcentajeDiarioCalidad /100;
        int grDiarioNormal= grTotalPiensoDiario - grDiarioCalidad;

        int grTotalesCalidad= grDiarioCalidad * 7;
        int grTotalesNormal= grDiarioNormal * 7;

        // Se podria hacer asi tambien pero el resultado sale *.0
        //double sacosNormales= grDiarioNormal/ (double)GR_SACO_NORMAL;
        // sacosNormales = Math.ceil(sacosNormales)
        int sacosNormales= (int) Math.ceil(grTotalesNormal / (double)GR_SACO_NORMAL);
        int sacosCalidad= (int) Math.ceil(grTotalesCalidad / (double)GR_SACO_CALIDAD);
        int normalSobrante= sacosNormales*GR_SACO_NORMAL-grTotalesNormal;

        int calidadSobrante = (sacosCalidad*GR_SACO_CALIDAD) - grTotalesCalidad;
        int grDomingo = grDiarioCalidad + calidadSobrante;

        System.out.println(grDomingo + " " + normalSobrante + " " + sacosNormales);
        scanner.close();
    }

}
