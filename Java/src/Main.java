import Combate.Jugador;
import Personajes.Castor;
import Personajes.Trump;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        Jugador jugador = new Jugador(nombre);
        System.out.println("-------------------------------");
        System.out.println("-- BIENVENIDO AL AUTO BATTLE --");
        System.out.println("-------------------------------");

        System.out.println(" | MENU |");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. Salir");
    }
}
