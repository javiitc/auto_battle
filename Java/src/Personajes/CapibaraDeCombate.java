package Personajes;

public class CapibaraDeCombate extends Personaje{

    public CapibaraDeCombate(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
    }

    @Override
    public int ataque() {
        return 15;
    }

    @Override
    public void defensa() {
        System.out.println();
    }

    public void iniciarCapibara () {
        CapibaraDeCombate capibaraDeCombate = new CapibaraDeCombate("Capibara de Combate", 10, 10);
    }
}
