# Juego de lucha en Java

Juego por turnos para dos personajes. Cada luchador inicia con 100 puntos de vida; los ataques causan daño aleatorio según su tipo y la pelea termina cuando uno llega a 0.

## Diseño

- `Personaje` es la clase abstracta con los datos y comportamientos comunes.
- `Guerrero`, `Agil` y `Tanque` heredan de `Personaje` y definen su daño.
- `PersonajeFactory` y sus fábricas concretas aplican **Factory Method** para crear cada subtipo (patrón creacional).
- `PersonajeDecorador` y `Armadura` aplican **Decorator**. La armadura envuelve al luchador y reduce en 5 el daño que recibe, sin modificar su clase concreta (patrón estructural).
- `JuegoLucha` controla los turnos y anuncia al ganador.
- `Main` solicita nombres, tipo y si cada luchador usa armadura.



```sh
javac -d out src/*.java
java -cp out Main
```

El diagrama UML está en `diagrama-clases.puml`; ábrelo con PlantUML para generar una imagen.
