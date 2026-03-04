package Personajes;

public class Meowl extends Personaje {
    public Meowl(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        startMeowl();
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

    public void startMeowl() {
        Meowl meowl = new Meowl("Meowl", 10, 10);
    }

}
