package EDOs;

public class main {
    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double xFinal = 0.3;

        double[] pasosH = {0.1, 0.05, 0.01};
        for (double h : pasosH) {
            resolver.ejecutarEuler(x0, y0, h, xFinal);
        }
    }
}
