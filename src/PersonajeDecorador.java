/** Base del patrón estructural Decorator para añadir comportamiento a un personaje. */
public abstract class PersonajeDecorador extends Personaje {
    protected final Personaje personaje;

    protected PersonajeDecorador(Personaje personaje) {
        super(personaje.getNombre());
        this.personaje = personaje;
    }

    @Override public int calcularDano() { return personaje.calcularDano(); }
    @Override public void atacar(Personaje oponente) { personaje.atacar(oponente); }
    @Override public void recibirDano(int dano) { personaje.recibirDano(dano); }
    @Override public boolean estaVivo() { return personaje.estaVivo(); }
    @Override public String getNombre() { return personaje.getNombre(); }
    @Override public int getPuntosDeVida() { return personaje.getPuntosDeVida(); }
}
