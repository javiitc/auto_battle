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
    }
}
