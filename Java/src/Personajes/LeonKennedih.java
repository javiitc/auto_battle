package Personajes;

public class LeonKennedih extends Personaje {
    public LeonKennedih(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
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

    public void startLeon() {
        LeonKennedih leonKennedih = new LeonKennedih("Leon Kennedih", 10, 10);
    }

}
