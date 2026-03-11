package Personajes;

public class furryDeku extends Personaje {
    public furryDeku(String nombre, int vida, int vidaMax) {
        super(nombre, vida, vidaMax);
        iniciarFurryDeku();
    }

    @Override
    public int ataque() {
        System.out.println("Furry Deku ataca con su poder de transformación en un animal feroz, lanzando un ataque devastador que causa un gran daño a sus enemigos.");
        return 8;
    }

    @Override
    public void defensa() {
        System.out.println("Furry Deku se defiende con su poder de transformación en un animal feroz, aumentando su resistencia y reduciendo el daño recibido.");
    }

    public void iniciarFurryDeku() {
        furryDeku furryDeku = new furryDeku("Furry Deku", 22, 22);
    }
}
