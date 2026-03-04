package Personajes;

public abstract class Piccolo extends Personaje{

    public Piccolo(String nombre, int vida, int vidaMax) {
        super("Piccolo", 20, 20);
    }

    @Override
    public int ataque() {
        return 5;
    }
    @Override
    public void defensa(){
        System.out.println("Farmea aura");
    }


}
