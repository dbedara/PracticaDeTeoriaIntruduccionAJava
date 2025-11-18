package EjTamagochi;

public class Tamagochi {
    private String Nombre="Boby";
    private int Hambre;
    private int Estadofelicidad;
    private int Peso;

    Tamagochi(int Hambre, String Estadofelicidad, String Peso){
        this.Hambre=5;
        this.Estadofelicidad=5;
        this.Peso=5;
    }
    public String estadoTamagochi(String Estadofelicidad){
        if (Hambre<5){
        estadoTamagochi("Triste");
        } else if (Hambre>5){
            estadoTamagochi("Contento");
        } else {
            estadoTamagochi("Normal");
        }
    }
    public String pesoTamagochi(String Peso){

    switch  (Hambre){
        case 1:
        case 2:
        case 3:
        case 4:
            estadoTamagochi("Triste");
        case 1:
        }
    }
}
