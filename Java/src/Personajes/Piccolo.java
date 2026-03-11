package Personajes;

public class Piccolo extends Personaje{

    public Piccolo() {
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
