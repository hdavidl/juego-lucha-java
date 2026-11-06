/** Luchador ágil: golpes menos fuertes, con daño entre 10 y 30. */
public class Agil extends Personaje {
    public Agil(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularDano() {
        return danoAleatorio(10, 30);
    }
}
