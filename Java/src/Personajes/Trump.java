package Personajes;

public abstract class Trump extends Personaje {

    public Trump(String nombre, int vida, int vidaMax) {
        super("Trump",20, 20);
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " ha mandado a sus tropas y ha hecho 10 de daño.");
        return 10;
    }

    @Override
    public void defensa() {
        System.out.println("El ICE defendió a " + getNombre());
    }
}
