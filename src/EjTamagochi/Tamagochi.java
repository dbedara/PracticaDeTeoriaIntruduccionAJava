package EjTamagochi;

import java.util.Random;

public class Tamagochi {
   Random random=new Random();
    private String nombre;
    private int hambre;
    private int estadoFelicidad;



    Tamagochi(String nombre){
       this.nombre=nombre;
        this.hambre =random.nextInt(1,5);
        this.estadoFelicidad=random.nextInt(1,11);
    }
public void Estadofelicidad(){
        if (estadoFelicidad<4){
            System.out.println("esta Triste");
        } else if (estadoFelicidad<7){
            System.out.println("esta ni fu ni fa");
        } else {
            System.out.println("esta Tirando Cohetes");
        }
    }

    public void jugar(){
        int jugar=estadoFelicidad+random.nextInt(1,3);
        jugar=estadoFelicidad;
        System.out.println("Esta: "+estadoFelicidad);
    }

    public void verHambre() {
        if (hambre==0){
            System.out.println("dale algo de comer esta en los huesos");
        }else if (hambre<4){
            System.out.println("necesita comer");
        } else if (hambre<9){
            System.out.println("esta bien, pero puede seguir comiendo un poco");
        } else if (hambre>10) {
            System.out.println("se esta poniendo cebollon para de darle comida");
        } else {
            System.out.println("esta como un bola no le des mas de comer");
        }
    }

    public void darComida(){
        int darComida=hambre+random.nextInt(1,3);
        darComida=hambre;
        System.out.println(nombre+" "+hambre);
    }
}
