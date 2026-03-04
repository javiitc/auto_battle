package Personajes;

public class Personaje {
    private int ataque;
    private int defensa;
    private int vida;

    public Personaje(int ataque, int defensa, int vida) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
