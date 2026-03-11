package Personajes;

public class Morf extends Personaje {

    public Morf(String nombre, int vida, int vidaMax) {
        super("Morf",5, 5);
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " ha atacado y ha hecho 5 de daño.");
        return 5;
    }

    @Override
    public void defensa() {
        System.out.println(getNombre() + " ha drogado al rival");
    }
}
