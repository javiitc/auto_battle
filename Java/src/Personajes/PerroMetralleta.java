package Personajes;

public class PerroMetralleta extends Personaje {

    public PerroMetralleta(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarPerroMetralleta();
    }

    @Override
    public int ataque() {
        return 10;
    }

    @Override
    public void defensa() {
        System.out.println();
    }

    public void iniciarPerroMetralleta() {
        PerroMetralleta perroMetralleta  = new PerroMetralleta("PerroMetralleta", 8, 8);
    }
}
