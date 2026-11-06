/** Luchador resistente: causa entre 10 y 20 puntos de daño. */
public class Tanque extends Personaje {
    public Tanque(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularDano() {
        return danoAleatorio(10, 20);
    }
}
