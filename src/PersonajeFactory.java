/**
 * Creador del patrón Factory Method. Las subclases deciden qué personaje crear.
 */
public abstract class PersonajeFactory {
    public abstract Personaje crearPersonaje(String nombre);

    public static PersonajeFactory para(TipoPersonaje tipo) {
        return switch (tipo) {
            case GUERRERO -> new GuerreroFactory();
            case AGIL -> new AgilFactory();
            case TANQUE -> new TanqueFactory();
        };
    }
}
