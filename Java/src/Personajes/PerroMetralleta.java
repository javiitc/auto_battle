package Personajes;

public class PerroMetralleta extends Personaje {

    public PerroMetralleta() {
        super("PerroMetralleta", 8, 8);
    }

    @Override
    public int ataque() {
        return 10;
    }

    @Override
    public void defensa() {
        System.out.println("Ha usado su AK-47 para protegerse");
    }

}
