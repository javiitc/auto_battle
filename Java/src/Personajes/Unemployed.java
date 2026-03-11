package Personajes;

public abstract class Unemployed extends Personaje{

    public Unemployed(String nombre, int vida, int vidaMax) {
        super("Unemployed", 15, 15);
    }

    @Override
    public int ataque() {
        return 10;
    }
    @Override
public void defensa(){
        System.out.println("No cotiza el ataque");
    }


}
