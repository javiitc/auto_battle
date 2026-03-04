package Personajes;

public abstract class Faraon extends Personaje{

    public Faraon(String nombre, int vida, int vidaMax) {
        super("FaraonLoveShady", 3, 3);
    }

    @Override
    public int ataque() {
        return 7;
    }


}
