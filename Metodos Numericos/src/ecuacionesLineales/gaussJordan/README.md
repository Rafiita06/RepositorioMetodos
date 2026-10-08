# Resolución de Sistemas de Ecuaciones Lineales mediante Gauss-Jordan

Este proyecto es una implementación del método de eliminación de **Gauss-Jordan** en Java para resolver sistemas de ecuaciones lineales.

## 🛠️ Lenguaje de Programación

* **Java** (JDK 8 o superior recomendado)

---

## 🚀 Compilación y Ejecución

Sigue estos pasos desde la terminal o línea de comandos para compilar y ejecutar el proyecto desde la carpeta raíz donde se encuentra la carpeta del paquete `ecuacionesLineales`.

### 1. Compilar las clases
Ejecuta el siguiente comando para compilar todos los archivos `.java` dentro del paquete:

```bash
javac ecuacionesLineales/*.java
```

### 2. Ejecutar el programa
Ejecuta la clase principal (`lanzadorGaussJordan`) indicando el nombre completo del paquete:

```bash
java ecuacionesLineales.lanzadorGaussJordan
```

---

## 📊 Ejemplo de Prueba y Salida por Consola

### Sistema de Ecuaciones
El programa resuelve por defecto el siguiente sistema de $3 \times 3$:

$$\begin{aligned}
3.0x_1 - 0.1x_2 - 0.2x_3 &= 7.85 \\
0.1x_1 + 7.0x_2 - 0.3x_3 &= -19.3 \\
0.3x_1 - 0.2x_2 + 10.0x_3 &= 71.4
\end{aligned}$$

### Salida por Consola

Al ejecutar el programa, obtendrás el siguiente resultado:

```text
Soluciones del sistema:
x1 = 3.0000
x2 = -2.5000
x3 = 7.0000
```