package Personajes;

public class fih extends Personaje {
    public fih (String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        startFih();
    }

    @Override
    public int ataque() {
        System.out.println(getNombre() + " blupblup (+4 damage).");
        return 4;
    }

    @Override
    public void defensa() {
        System.out.println(getNombre() + " dries up!");
    }

    public void startFih() {
        fih fih = new fih("fih", 4, 4);
    }

}
