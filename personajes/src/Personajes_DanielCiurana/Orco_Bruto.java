package Personajes_DanielCiurana;

public class Orco_Bruto {

    private String nombre;
    private int vidaMax;
    private int ataque;

    public Orco_Bruto() {
        this.nombre = "Orco Bruto";
        this.vidaMax = 12;
        this.ataque = 8;
    }

    public void mostrarStats() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida Máx: " + vidaMax);
        System.out.println("Ataque: " + ataque);
        System.out.println("Total Poder: " + (vidaMax + ataque));
    }
}