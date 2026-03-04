package Personajes;

public class Mordecai extends Personaje{

    public Mordecai() {
        super("Mordecai", 7, 7);

    }
    @Override
    public int ataque() {
        return 13;
    }

    @Override
    public void defensa() {
        System.out.println("Pega un salto y esquiva los ataques");
    }

}
