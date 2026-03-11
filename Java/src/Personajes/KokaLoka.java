package Personajes;

public class KokaLoka extends Personaje{

    public KokaLoka(String nombre, int vida, int vidaMax) {
        super("Koka Loka", 15, 15);
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
