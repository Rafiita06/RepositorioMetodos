package EDOs;

public class metodoEuler {
    // EDO: y' = x - y
    public static double evaluarFuncion(double x, double y) {
        return x - y;
    }

    // Solución analítica exacta: y(x) = x - 1 + 2e^(-x)
    public static double solucionExacta(double x) {
        return x - 1.0 + 2.0 * Math.exp(-x);
    }
}
