package Objetos;

public class ClaseAlumno {
    private String nombre;
    private int edad;
    private double nota;

    ClaseAlumno (String nombre,int edad, double nota){
        this.nombre=nombre;
        this.edad=edad;
        this.nota=nota;
    }
    public String getNombre(){
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    public int getEdad(){
        return edad;
    }
}
