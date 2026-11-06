/** Luchador equilibrado: causa entre 15 y 25 puntos de daño. */
public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularDano() {
        return danoAleatorio(15, 25);
    }
}
