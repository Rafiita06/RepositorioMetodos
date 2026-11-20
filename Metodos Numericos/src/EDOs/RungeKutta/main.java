package EDOs.RungeKutta;

public class main {
    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1;
        double xFinal = 0.3;

        resolver.ejecutarRK4(x0, y0, h, xFinal);
    }
}
