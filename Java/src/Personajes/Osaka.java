package Personajes;

public class Osaka extends Personaje {

    public Osaka (String nombre, int vida, int vidaMax) {
        super("Osaka",8, 8);
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " ha hecho un ataque japones y ha hecho 10 de daño.");
        return 10;
    }

    @Override
    public void defensa() {
        System.out.println(getNombre() + " lanzó un rollito de primavera al rival.");
    }
}
