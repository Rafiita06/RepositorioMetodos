package EDOs;

public class resolver {
    public static void ejecutarEuler(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n=== MÉTODO DE EULER (h = " + h + ") ===");
        System.out.println("n\t x_n\t\t y_n (Euler)\t y_exacta\t Error Abs");
        System.out.println("--------------------------------------------------------------------");

        double yExacta = metodoEuler.solucionExacta(x);
        double error = Math.abs(yExacta - y);
        System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.6f\n", 0, x, y, yExacta, error);

        for (int i = 0; i < nPasos; i++) {
            double pendiente = metodoEuler.evaluarFuncion(x, y);
            y = y + h * pendiente;
            x = x + h;

            yExacta = metodoEuler.solucionExacta(x);
            error = Math.abs(yExacta - y);
            System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.6f\n", (i + 1), x, y, yExacta, error);
        }
    }
}
