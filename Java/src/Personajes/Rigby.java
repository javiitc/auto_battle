package Personajes;

public abstract class Rigby extends Personaje{

    public Rigby(String nombre, int vida, int vidaMax) {
        super("Rigby", 3, 3);
    }

    @Override
    public int ataque() {
        return 7;
    }

    @Override
    public void defensa() {
        System.out.println("Inspiró a disney");
    }
}
