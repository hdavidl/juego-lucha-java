import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== JUEGO DE LUCHA ===");
            Personaje jugador1 = crearJugador(scanner, 1);
            Personaje jugador2 = crearJugador(scanner, 2);
            new JuegoLucha(jugador1, jugador2).iniciarPelea();
        }
    }

    private static Personaje crearJugador(Scanner scanner, int numero) {
        System.out.printf("\nNombre del jugador %d: ", numero);
        String nombre = scanner.nextLine().trim();

        System.out.println("Elige el tipo: 1) Guerrero  2) Ágil  3) Tanque");
        int opcion = leerOpcion(scanner);
        TipoPersonaje tipo = switch (opcion) {
            case 1 -> TipoPersonaje.GUERRERO;
            case 2 -> TipoPersonaje.AGIL;
            default -> TipoPersonaje.TANQUE;
        };
        Personaje personaje = PersonajeFactory.para(tipo).crearPersonaje(nombre);
        System.out.print("¿Equipar armadura? (s/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("s")) {
            personaje = new Armadura(personaje);
        }
        return personaje;
    }

    private static int leerOpcion(Scanner scanner) {
        while (true) {
            System.out.print("Opción (1-3): ");
            String entrada = scanner.nextLine().trim();
            try {
                int opcion = Integer.parseInt(entrada);
                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                }
            } catch (NumberFormatException ignored) {
                // Se muestra el mismo mensaje para entradas no numéricas.
            }
            System.out.println("Escribe 1, 2 o 3.");
        }
    }
}
