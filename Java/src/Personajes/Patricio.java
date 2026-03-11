package Personajes;
public class Patricio extends Personaje {
    public Patricio(String nombre, int vida, int vidaMax) {
        super("Patricio", 15, 15);
    }

    @Override
    public int ataque() {
        System.out.println("Patricio te ha atacado.");
        return 5;
    }

    @Override
    public void defensa() {
        System.out.println("Patricio se esta defendiendo");
    }
}
