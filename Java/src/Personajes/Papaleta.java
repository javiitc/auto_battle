package Personajes;

public class Papaleta extends Personaje {
    public Papaleta() {

        super("Papaleta", 14, 14);
    }

    @Override
    public int ataque() {
        return 16;
    }

    @Override
    public void defensa() {
        System.out.println("Se cubre con los brazos");
    }
}
