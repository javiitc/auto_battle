package Personajes;

public class CapibaraDeCombate extends Personaje{

    public CapibaraDeCombate() {
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
