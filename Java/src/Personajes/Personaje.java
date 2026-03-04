package Personajes;

public class Personaje {
    private String nombre;
    private int ataque;
    private int defensa;
    private int vida;
    private int vidaMax;

    public Personaje(int ataque, int defensa, String nombre, int vida, int vidaMax) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMax = vidaMax;
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

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }
    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
}
