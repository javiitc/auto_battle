import Combate.Jugador;
import Personajes.*;
import Combate.SistemaCombate;
import Tienda.EnemigoIA;
import Tienda.Tienda;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        Jugador jugador = new Jugador(nombre);

        jugador.agregarPersonaje(new Mordecai());
        jugador.agregarPersonaje(new Papaleta());
        jugador.agregarPersonaje(new Bob());

        System.out.println("-------------------------------");
        System.out.println("-- BIENVENIDO AL AUTO BATTLE --");
        System.out.println("-------------------------------");
        System.out.println("Equipo inicial: Mordecai, Papaleta, Bob");
        System.out.println("Monedas: " + jugador.getMonedas());

        boolean jugando = true;

        while (jugando) {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("Monedas: " + jugador.getMonedas());
            System.out.println("Personajes en equipo: " + jugador.getEquipo().size());
            System.out.println("1. Iniciar combate");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    Tienda tiendaIA = new Tienda();
                    EnemigoIA enemigo = new EnemigoIA();
                    enemigo.comprarDeTienda(tiendaIA);
                    enemigo.seleccionarEquipoCombate();

                    String[] nombresIA = {"Friday", "JARVIS", "Ultron"};
                    Jugador ia = new Jugador(nombresIA[new Random().nextInt(nombresIA.length)]);
                    for (Personaje p : enemigo.getEquipoCombate()) {
                        ia.agregarPersonaje(p);
                    }

                    new SistemaCombate().iniciarCombate(jugador, ia);

                    if (jugador.equipoVivo()) {
                        System.out.println("\n¡Has ganado! Recibes 3 monedas.");
                        jugador.añadirMonedas(3);
                    } else {
                        System.out.println("\nHas perdido... Recibes 5 monedas de consolación.");
                        jugador.añadirMonedas(5);
                    }
                    System.out.println("Monedas actuales: " + jugador.getMonedas());

                    jugador.restaurarEquipo();

                    Tienda tiendaPost = new Tienda();
                    tiendaPost.mostrarTienda();

                    boolean enTienda = true;
                    while (enTienda) {
                        System.out.print("Elige slot para comprar (o -1 para continuar): ");
                        int slot = Integer.parseInt(sc.nextLine());
                        if (slot == -1) {
                            enTienda = false;
                        } else if (slot >= 0 && slot < tiendaPost.getSlotsPersonajes().size()
                                && tiendaPost.getSlotsPersonajes().get(slot) != null) {
                            Personaje comprado = tiendaPost.getSlotsPersonajes().get(slot);
                            jugador.agregarPersonaje(comprado);
                            tiendaPost.comprarPersonaje(slot);
                            System.out.println("¡" + comprado.getNombre() + " se unió a tu equipo!");
                            tiendaPost.mostrarTienda();
                        } else {
                            System.out.println("Slot inválido o vacío.");
                        }
                    }
                    break;

                case 2:
                    jugando = false;
                    System.out.println("¡Hasta la próxima, " + jugador.getNombre() + "!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        /**
         * Errores a resolver:
         * La vida es negativa en los turnos
         * Conectar Tienda con Jugador
         * Este Main es de prueba, modificar lo necesario para que sea funcional (que se elijan jugadores al principio de todo)
         */
        sc.close();
    }
}
