package Personajes;

public class Dersh extends Personaje {
    public Dersh(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarPersonaje();
    }

    @Override
    public int ataque() {
        return 1;
    }

    @Override
    public void defensa() {
        System.out.println("Dersh se defiende con su Dershiyate");
    }

    public void iniciarPersonaje() {
        Dersh dersh = new Dersh("Dersh", 19, 19);
    }

}
