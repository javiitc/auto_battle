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
        System.out.println("\n=== Haciendo Roll ===");
        slotsPersonajes.clear();

        for (int i = 0; i < numeroSlots; i++) {
            int seleccion = random.nextInt(14);

            Personaje nuevoPersonaje;
            switch (seleccion) {
                case 0: nuevoPersonaje = new Bob("Bob", 17, 17); break;
                case 1: nuevoPersonaje = new CapibaraDeCombate("Capibara", 10, 10); break;
                case 2: nuevoPersonaje = new Castor("Castor", 5, 5); break;
                case 3: nuevoPersonaje = new Dersh("Dersh", 19, 19); break;
                case 4: nuevoPersonaje = new Jeffrey("Jeffrey", 15, 15); break;
                case 5: nuevoPersonaje = new KokaLoka("Koka Loka", 15, 15); break;
                case 6: nuevoPersonaje = new LeonKennedih("Leon", 10, 10); break;
                case 7: nuevoPersonaje = new Mambo("Mambo", 1, 1); break;
                case 8: nuevoPersonaje = new Meowl("Meowl", 10, 10); break;
                case 9: nuevoPersonaje = new MiBombo("Bombo", 9, 9); break;
                case 10: nuevoPersonaje = new Mordecai(); break;
                case 11: nuevoPersonaje = new Papaleta(); break;
                case 12: nuevoPersonaje = new Patricio("Patricio", 15, 15); break;
                case 13: nuevoPersonaje = new bigYahu("BigYahu", 3, 3); break;
                default: nuevoPersonaje = new Castor("Castor Extra", 5, 5); break;
            }
            slotsPersonajes.add(nuevoPersonaje);
        }
    }

}
