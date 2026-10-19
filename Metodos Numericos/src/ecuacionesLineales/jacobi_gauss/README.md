# Práctica de Programación: Métodos Iterativos (Jacobi y Gauss-Seidel)

**Asignatura:** Métodos Numéricos (Grupo A)  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)  

---

## 📋 Descripción del Proyecto

Este repositorio contiene la implementación modular en Java de dos de los métodos iterativos más utilizados para la resolución de sistemas de ecuaciones lineales: **Jacobi** y **Gauss-Seidel**.

El proyecto está diseñado bajo una arquitectura limpia y modular que separa:
1. **Definición del Sistema:** Declaración de matrices de coeficientes y vectores independientes.
2. **Lógica de los Métodos:** Clases independientes en paquetes dedicados para los algoritmos iterativos.
3. **Ejecución:** Clase principal (`Main`) encargada de la inicialización y despliegue de resultados.

---

## 📐 Sistema de Ecuaciones Resuelto

El programa resuelve el siguiente sistema de ecuaciones lineales de $3 \times 3$:

$$
\begin{cases}
5x + y + z = 7 \\
x + 4y + z = 6 \\
x + 2y + 5z = 8
\end{cases}
$$

* **Vector Inicial:** $X^{(0)} = [0, 0, 0]^T$
* **Tolerancia de Error ($\epsilon$):** $0.0001$
* **Solución Teórica:** $x = 1, y = 1, z = 1$

---

## 📂 Estructura del Proyecto

```text
src/
└── Ecuaciones_lineales/
    ├── JACOBI/
    │   └── MetodoJacobi.java       # Implementación del método de Jacobi y cálculo de error
    ├── Gauss_Seidel/
    │   └── GaussSeidelMetodo.java  # Implementación del método de Gauss-Seidel
    └── Main.java                   # Punto de entrada y definición de matrices
```

---

## 🚀 Ejecución

Para compilar y ejecutar el proyecto localmente desde la consola de comandos:

```bash
# Compilar las clases
javac -d bin src/Ecuaciones_lineales/*.java src/Ecuaciones_lineales/*/*.java

# Ejecutar el programa
java -cp bin Main
```

---

## 📊 Resultados Obtenidos

```text
=== RESOLUCIÓN POR MÉTODO DE JACOBI ===
Jacobi convergió en la iteración: 7
Solución Jacobi: 
[ 1.00003  1.00001  1.00001 ]

=== RESOLUCIÓN POR MÉTODO DE GAUSS-SEIDEL ===
Gauss-Seidel convergió en la iteración: 5
Solución Gauss-Seidel: 
[ 1.00000  1.00000  1.00000 ]
```

---

## 🔍 Conclusión Comparativa

* **Jacobi:** Alcanzó la convergencia en **7 iteraciones**.
* **Gauss-Seidel:** Alcanzó la convergencia en **5 iteraciones**.

**Análisis:**  
El método de Gauss-Seidel demuestra mayor rapidez de convergencia que el método de Jacobi debido a que actualiza e introduce los nuevos componentes del vector solución inmediatamente dentro de la misma iteración, acelerando la propagación de valores en cada paso.