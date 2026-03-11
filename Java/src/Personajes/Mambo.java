package Personajes;

public class Mambo extends Personaje {
    public Mambo() {
        super("Mambo", 1, 1);
    }

    @Override
    public int ataque() {
        System.out.println("Mambo le tira un mambo a su oponente");
        return 29;
    }

    @Override
    public void defensa() {
        System.out.println("Mambo se defiende con su Mambo-escudo");
    }


}
