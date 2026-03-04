package Personajes;

public class Mambo extends Personaje {
    public Mambo(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarPersonaje();
    }

    @Override
    public int ataque() {
        return 29;
    }

    @Override
    public void defensa() {
        System.out.println("Mambo se defiende con su Mambo-escudo");
    }

    public void iniciarPersonaje() {
        Mambo mambo = new Mambo("Mambo", 1, 1);
    }

}
