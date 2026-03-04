package Personajes;

public class MiBombo extends Personaje {
    public MiBombo(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarPersonaje();
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

    public void iniciarPersonaje() {
        MiBombo mibombo = new MiBombo("Mi Bombo", 9, 9);
    }

}
