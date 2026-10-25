# Práctica: Implementación de Simpson 1/3 Compuesto y Análisis Comparativo

**Materia:** Métodos Numéricos (SCC-1017)  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)  
**Ingeniería en Sistemas Computacionales**  

## Descripción del Proyecto
Este proyecto implementa en Java la Regla de Simpson 1/3 Compuesta con evaluación iterativa basada en tolerancia, complementando los métodos de integración numérica y permitiendo contrastar su eficiencia frente al Método del Trapecio Compuesto.

## Instrucciones de Compilación y Ejecución

### Desde la Terminal (Línea de Comandos)
1. Clone el repositorio y sitúese en la raíz del proyecto.
2. Compile las clases del paquete:
   javac src/dif_e_Integracion/*.java
3. Ejecute el programa principal:
   java -cp src dif_e_Integracion.Main

### Desde un Entorno de Desarrollo (IDE - IntelliJ, Eclipse, NetBeans)
1. Abra el IDE e importe el proyecto como directorio raíz Java.
2. Verifique que la carpeta `src` esté marcada como fuente de código (*Sources Root*).
3. Ejecute la clase `Main.java`.

## Ejemplo de Salida en Consola
=== COMPARACIÓN DE MÉTODOS DE INTEGRACIÓN ===
Función evaluada: f(x) = e^x en el intervalo [0, 1]
Tolerancia configurada: 1.0E-6

[Método del Trapecio Compuesto]
- Resultado de la Integral: 1.71828218
- Subintervalos necesarios (n): 2048

[Regla de Simpson 1/3 Compuesta]
- Resultado de la Integral: 1.71828183
- Subintervalos necesarios (n): 8
