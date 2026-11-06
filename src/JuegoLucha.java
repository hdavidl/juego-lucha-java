public class JuegoLucha {
    private final Personaje jugador1;
    private final Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        if (jugador1 == null || jugador2 == null) {
            throw new IllegalArgumentException("La pelea necesita dos personajes.");
        }
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.printf("\n¡La pelea comienza entre %s y %s!%n\n",
                jugador1.getNombre(), jugador2.getNombre());

        Personaje atacante = jugador1;
        Personaje defensor = jugador2;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.printf("Turno de %s (%d HP).%n", atacante.getNombre(),
                    atacante.getPuntosDeVida());
            atacante.atacar(defensor);
            System.out.printf("A %s le quedan %d HP.%n\n", defensor.getNombre(),
                    defensor.getPuntosDeVida());

            Personaje temporal = atacante;
            atacante = defensor;
            defensor = temporal;
        }

        Personaje ganador = jugador1.estaVivo() ? jugador1 : jugador2;
        System.out.printf("¡%s gana la pelea!%n", ganador.getNombre());
    }
}
