package Objetos;

import java.util.Scanner;

public class EjClaseAlumno {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ClaseAlumno alumno1=new ClaseAlumno("Pepe",12,5.7);

        System.out.println("Nombre: "+alumno1.getNombre()+" Edad:"+alumno1.getEdad()+" Nota: "+ alumno1.getNota());
        scanner.close();
    }
}
