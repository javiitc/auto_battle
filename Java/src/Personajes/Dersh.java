package Personajes;

public class Dersh extends Personaje {
    public Dersh(String nombre, int vida, int vidaMax) {
        super("Dersh", 19, 19);
    }

    @Override
    public int ataque() {
        System.out.println("Dersh ataca con un Dershiyate");
        return 1;
    }

    @Override
    public void defensa() {
        System.out.println("Dersh se defiende con su Dershiyate");
    }

}
