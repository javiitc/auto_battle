package Personajes;

public class Meowl extends Personaje {
    public Meowl(String nombre, int vida, int vidaMax) {
        super("Meowl", 10, 10);
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " sings 'New Soul' (+20 damage).");
        return 20;
    }

    @Override
    public void defensa() {
        System.out.println(getNombre() + " gets clipped....");
    }

}
