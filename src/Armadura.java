/** Decorador concreto: reduce el daño recibido en 5 puntos (mínimo 0). */
public class Armadura extends PersonajeDecorador {
    private static final int REDUCCION_DANO = 5;

    public Armadura(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void recibirDano(int dano) {
        int danoReducido = Math.max(0, dano - REDUCCION_DANO);
        System.out.printf("La armadura de %s reduce el daño de %d a %d.%n",
                getNombre(), dano, danoReducido);
        personaje.recibirDano(danoReducido);
    }
}
