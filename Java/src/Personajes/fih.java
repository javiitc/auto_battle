package Personajes;

public class fih extends Personaje {
    public fih () {
        super("fih", 4, 4);
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

}
