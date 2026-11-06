public class TanqueFactory extends PersonajeFactory {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Tanque(nombre);
    }
}
