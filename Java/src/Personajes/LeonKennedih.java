package Personajes;

public class LeonKennedih extends Personaje {
    public LeonKennedih(String nombre, int vida, int vidaMax) {
        super("Leon Kennedih", 10, 10);
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " aura farms (+10 damage).");
        return 10;
    }

    @Override
    public void defensa() {
        System.out.println(getNombre() + " gets dihstroyed!");
    }


}
