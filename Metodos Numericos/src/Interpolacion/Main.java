package Interpolacion;

public class Main {
    public static void main(String[] args) {
        // Conjunto de nodos propio (ejemplo: aproximación de f(x) = ln(x) o datos experimentales)
        double[] x = {1.0, 2.0, 3.5, 5.0};
        double[] y = {0.0, 0.693147, 1.252763, 1.609438};
        double xEval = 2.5;

        System.out.println("Punto a evaluar: x = " + xEval + "\n");

        // 1. Ejecución Método de Newton
        double[][] tablaNewton = DiferenciasDivididasNewton.calcularTabla(x, y);
        DiferenciasDivididasNewton.imprimirTabla(x, tablaNewton);
        double resNewton = DiferenciasDivididasNewton.evaluarNewton(x, tablaNewton, xEval);
        System.out.printf("\nResultado Interpolación de Newton:   %.10f\n", resNewton);

        // 2. Ejecución Método de Lagrange
        double resLagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);
        System.out.printf("Resultado Interpolación de Lagrange: %.10f\n", resLagrange);

        // 3. Diferencia absoluta
        System.out.printf("Diferencia absoluta |Newton - Lagrange|: %.2e\n", Math.abs(resNewton - resLagrange));
    }
}
