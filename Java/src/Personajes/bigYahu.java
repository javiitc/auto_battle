package Personajes;

public class bigYahu extends Personaje {
    public bigYahu(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarBigYahu();
    }

    @Override
    public int ataque() {
        System.out.println("Big Yahu ataca te ataca con sus mochilas explosivas.");
        return 7;
    }

    @Override
    public void defensa() {
        System.out.println("Big Yahu se defiende con su gran tamaño y fuerza, absorbiendo el impacto de los ataques enemigos y reduciendo el daño recibido.");
    }

    public void iniciarBigYahu() {
        bigYahu bigYahu = new bigYahu("Big Yahu", 3, 3);
    }
}
