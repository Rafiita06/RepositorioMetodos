package EDOs.RungeKutta;

public class MetodoRungeKutta {
    // EDO: y' = x + y
    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    // Solución analítica exacta: y(x) = 2e^x - x - 1
    public static double solucionExacta(double x) {
        return 2.0 * Math.exp(x) - x - 1.0;
    }
}
