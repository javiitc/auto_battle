package Personajes;

public class CarlosKirk extends Personaje {

    public CarlosKirk(String nombre, int vida, int vidaMax) {
        super("CarlosKirk", 10, 10);
    }

    @Override
    public int ataque() {
        return 5;
    }

    @Override
    public void defensa() {
        System.out.println("Esquiva el ataque y la bala");

    }
}
