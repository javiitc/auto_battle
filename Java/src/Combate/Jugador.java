package Combate;

import Personajes.Personaje;

import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private ArrayList<Personaje> equipo = new  ArrayList<>();
    private int personajeActual = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarPersonaje (Personaje personaje) {
        if (equipo.size() >= 10) {
            System.out.println("Equipo lleno!");
            return false;
        }
        equipo.add(personaje);
        return true;
    }

    public Personaje obtenerPersonajeActual() {
        return equipo.get(personajeActual);
    }

    public boolean equipoVivo() {
        return personajeActual < equipo.size();
    }

    public void siguientePersonaje() {
        personajeActual++;

        if (equipoVivo()) {
            System.out.println(obtenerPersonajeActual().getNombre() + "continua el combate!");
        } else {
            System.out.println("No quedan personajes para continuar la batalla!");
        }
    }


    public String getNombre() { return nombre;}

    public ArrayList<Personaje> getEquipo() { return equipo;}

    public int getPersonajeActual() { return personajeActual;}
}
