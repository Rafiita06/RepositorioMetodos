package EDOs.RungeKutta;

public class resolver {
    public static void ejecutarRK4(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n=== MÉTODO DE RUNGE-KUTTA 4TO ORDEN (h = " + h + ") ===");
        System.out.println("n\t x_n\t\t y_n (RK4)\t y_exacta\t Error Abs");
        System.out.println("--------------------------------------------------------------------");

        double yExacta = MetodoRungeKutta.solucionExacta(x);
        double error = Math.abs(yExacta - y);
        System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.8f\n", 0, x, y, yExacta, error);

        for (int i = 0; i < nPasos; i++) {
            double k1 = MetodoRungeKutta.evaluarFuncion(x, y);
            double k2 = MetodoRungeKutta.evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k1);
            double k3 = MetodoRungeKutta.evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k2);
            double k4 = MetodoRungeKutta.evaluarFuncion(x + h, y + h * k3);

            y = y + (h / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);
            x = x + h;

            yExacta = MetodoRungeKutta.solucionExacta(x);
            error = Math.abs(yExacta - y);
            System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.8f\n", (i + 1), x, y, yExacta, error);
        }
    }
}
