package biseccion;

public class Main {
    public static void main(String[] args) {
        // 1. Definición de parámetros iniciales
        double a = 1.0;
        double b = 2.0;
        double tolerancia = 1e-5;
        int maxIteraciones = 100;

        System.out.println("=== EJECUCIÓN DEL MÉTODO DE BISECCIÓN FUNCION 2 ===");
        System.out.println("Intervalo inicial: [" + a + ", " + b + "]");
        System.out.println("Tolerancia: " + tolerancia);
        System.out.println("Límite de iteraciones: " + maxIteraciones);
        System.out.println();

        // 2. Llamada al módulo del algoritmo
        double raiz = MetodoBiseccion.ejecutar(a, b, tolerancia, maxIteraciones);

        // 3. Muestra del resultado final
        if (!Double.isNaN(raiz)) {
            System.out.printf("%nResultado final: La raíz aproximada es x = %.6f%n", raiz);
        }
    }
}
