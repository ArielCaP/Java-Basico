# Juego: Adivina el Número (Java) 🎲

El programa genera un número secreto al azar entre 1 y 100, y el usuario debe adivinarlo. Después de cada intento, se le indica si el número fue muy alto o muy bajo, hasta que acierte.

## 🎯 ¿Qué hace?

1. Genera un número aleatorio entre 1 y 100
2. El usuario intenta adivinarlo
3. Le indica si su intento fue "muy alto" o "muy bajo"
4. Al acertar, muestra cuántos intentos usó

## 📚 Lo que aprendí

- Clase `Random` de Java para generar números al azar (equivalente a `random` en Python)
- `rand.nextInt(100) + 1` para generar un rango específico (1 a 100)
- Bucle `while (true)` y `break` en sintaxis de Java
- Corrección del problema de configuración regional (`Locale`) para lectura de decimales

## 🚀 Cómo ejecutarlo

```
java Main.java
```
