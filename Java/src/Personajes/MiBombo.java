package Personajes;

public class MiBombo extends Personaje {
    public MiBombo() {
        super("Mi Bombo", 9, 9);
    }

    @Override
    public int ataque() {
        System.out.println("Mi Bombo ataca con un Bombo-ataque");
        return 1;
    }

    @Override
    public void defensa() {
        System.out.println("Mi Bombo se defiende con su escudo de bombo");
    }

}
