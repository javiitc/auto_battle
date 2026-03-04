package Personajes_DanielCiurana;

public class Esqueleto_Guerrero {

    private String nombre;
    private int vidaMax;
    private int ataque;

    public Esqueleto_Guerrero() {
        this.nombre = "Esqueleto Guerrero";
        this.vidaMax = 6;
        this.ataque = 4;
    }

    public void mostrarStats() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida Máx: " + vidaMax);
        System.out.println("Ataque: " + ataque);
        System.out.println("Total Poder: " + (vidaMax + ataque));
    }
}