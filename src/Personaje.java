import java.util.concurrent.ThreadLocalRandom;

/** Modelo base de un luchador. */
public abstract class Personaje {
    private final String nombre;
    private int puntosDeVida;

    protected Personaje(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    /** Cada subtipo define cuánto daño puede causar. */
    public abstract int calcularDano();

    public void atacar(Personaje oponente) {
        int dano = calcularDano();
        oponente.recibirDano(dano);
        System.out.printf("%s ataca a %s y causa %d de daño.%n", nombre,
                oponente.getNombre(), dano);
    }

    public void recibirDano(int dano) {
        puntosDeVida = Math.max(0, puntosDeVida - dano);
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    protected int danoAleatorio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
