package Personajes;

public class CapibaraDeCombate extends Personaje{

    public CapibaraDeCombate(String nombre, int vida, int vidaMax) {
        super("Capibara de Combate", 10, 10);
    }

    @Override
    public int ataque() {
        return 15;
    }

    @Override
    public void defensa() {
        System.out.println();
    }

}
