package Tienda;

import Personajes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tienda {

    private static final int numeroSlots = 3;

    private List<Personaje> slotsPersonajes;
    private Random random;

    private List<Personaje> equipoJugadorDemo;

    public Tienda() {
        this.slotsPersonajes = new ArrayList<>();
        this.random = new Random();
        this.equipoJugadorDemo = new ArrayList<>();

        hacerRoll();
    }

    public void hacerRoll() {
        System.out.println("\n================ Rolleando personajes ================");
        slotsPersonajes.clear();

        for (int i = 0; i < numeroSlots; i++) {
            int seleccion = random.nextInt(14);

            Personaje nuevoPersonaje;
            switch (seleccion) {
                case 0: nuevoPersonaje = new Bob(); break;
                case 1: nuevoPersonaje = new CapibaraDeCombate(); break;
                case 2: nuevoPersonaje = new Castor(); break;
                case 3: nuevoPersonaje = new Dersh(); break;
                case 4: nuevoPersonaje = new Jeffrey(); break;
                case 5: nuevoPersonaje = new KokaLoka(); break;
                case 6: nuevoPersonaje = new LeonKennedih(); break;
                case 7: nuevoPersonaje = new Mambo(); break;
                case 8: nuevoPersonaje = new Meowl(); break;
                case 9: nuevoPersonaje = new MiBombo(); break;
                case 10: nuevoPersonaje = new Mordecai(); break;
                case 11: nuevoPersonaje = new Papaleta(); break;
                case 12: nuevoPersonaje = new Patricio(); break;
                case 13: nuevoPersonaje = new bigYahu(); break;
                default: nuevoPersonaje = new Castor(); break;
            }
            slotsPersonajes.add(nuevoPersonaje);
        }
    }

    public void mostrarTienda() {
        System.out.println("\n================ ESTADO DE LA TIENDA ================");
        System.out.println("Personajes en Venta:");
        for (int i = 0; i < slotsPersonajes.size(); i++) {
            Personaje p = slotsPersonajes.get(i);
            if (p != null) {
                System.out.println("[" + i + "] " + p.getNombre() + " (Vida: " + p.getVida() + "/" + p.getVidaMax() + ")");
            } else {
                System.out.println("[" + i + "] [VACÍO]");
            }
        }
        System.out.println("====================================================");
        System.out.println("\nTu Equipo Actual:");
        if (equipoJugadorDemo.isEmpty()) {
            System.out.println("  (El equipo está vacío)");
        } else {
            for (int i = 0; i < equipoJugadorDemo.size(); i++) {
                System.out.println("  - " + equipoJugadorDemo.get(i).getNombre());
            }
        }
        System.out.println("====================================================");
    }

    public void comprarPersonaje(int indiceSlot) {
        if (indiceSlot < 0 || indiceSlot >= slotsPersonajes.size()) {
            System.out.println("Índice de tienda inválido.");
            return;
        }

        Personaje personajeAComprar = slotsPersonajes.get(indiceSlot);

        if (personajeAComprar == null) {
            System.out.println("Ese slot está vacío.");
            return;
        }

        slotsPersonajes.set(indiceSlot, null);
        equipoJugadorDemo.add(personajeAComprar);

        System.out.println("¡Has reclutado a " + personajeAComprar.getNombre());
    }

    public void venderPersonaje(int indiceEquipo) {
        if (indiceEquipo < 0 || indiceEquipo >= equipoJugadorDemo.size()) {
            System.out.println("Índice de equipo inválido.");
            return;
        }

        Personaje personajeVendido = equipoJugadorDemo.get(indiceEquipo);
        System.out.println("\nHas despedido/vendido a " + personajeVendido.getNombre() + ".");

        equipoJugadorDemo.remove(indiceEquipo);
    }

}
