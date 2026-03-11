package Personajes;
public class Castor extends Personaje {
    public Castor(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        inicializarCastor();
    }

    @Override
    public int ataque() {
        System.out.println("El castor te ataca con sus dientes.");
        return 5;
    }

    @Override
    public void defensa() {
        System.out.println("El castor se esta defendiendo");
    }

    public void inicializarCastor() {
        Castor castor = new Castor("Castor", 5, 5);
    }
}
