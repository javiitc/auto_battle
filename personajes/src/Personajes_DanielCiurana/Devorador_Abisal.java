package Personajes_DanielCiurana;

public class Devorador_Abisal {

    private String nombre;
    private int vidaMax;
    private int ataque;

    public Devorador_Abisal() {
        this.nombre = "Devorador Abisal";
        this.vidaMax = 18;
        this.ataque = 12;
    }

    public void mostrarStats() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida Máx: " + vidaMax);
        System.out.println("Ataque: " + ataque);
        System.out.println("Total Poder: " + (vidaMax + ataque));
    }
}