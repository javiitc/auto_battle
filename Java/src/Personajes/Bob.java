package Personajes;
public class Bob extends Personaje {
    public Bob(String nombre, int vida, int vidaMax) {
        super("Bob", 17, 17);
    }

    @Override
    public int ataque() {
        System.out.println("Bob te ataca con su espátula.");
        return 13;
    }

    @Override
    public void defensa() {
        System.out.println("Bob se esta defendiendo");
    }

}
