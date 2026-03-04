package Personajes;

public class KokaLoka extends Personaje{

    public KokaLoka(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        inicarKokaLoka();
    }

    @Override
    public int ataque() {
        return 15;
    }

    @Override
    public void defensa() {
        System.out.println();
    }

    public void inicarKokaLoka () {
        KokaLoka kokaLoka = new KokaLoka("Koka Loka", 15, 15);
    }


}
