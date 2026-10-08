package falsaposision;

public class falsaposision {
    public static double f(double x) {
        return (4 * Math.pow(x, 2)) - (5 * x);
    }

    public static double falsaPosicion(double a, double b, double tol, int maxIter) {
        if (f(a) * f(b) >= 0) {
            System.out.println("El metodo no se puede aplicar en el intervalo dado.");
            return Double.NaN;
        }

        double xr = a;

        // Encabezado de la tabla de ejecucion
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s %-12s %-12s%n",
                "Iter", "a", "b", "xr", "f(a)", "f(b)", "f(xr)", "|f(xr)|");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < maxIter; i++) {
            double fa = f(a);
            double fb = f(b);

            // TODO: Escribe la formula de xr para Falsa Posicion
            xr = b - (fb * (a - b)) / (fa - fb);
            double fxr = f(xr);

            // Imprimir la fila correspondiente a la iteracion actual
            System.out.printf("%-6d %-12.6f %-12.6f %-12.6f %-12.6f %-12.6f %-12.6f %-12.6e%n",
                    (i + 1), a, b, xr, fa, fb, fxr, Math.abs(fxr));

            // TODO: Escribe la condicion de paro
            if (Math.abs(fxr) < tol) {
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("Falsa Posicion convergio en " + (i + 1) + " iteraciones.");
                return xr;
            }

            if (fa * fxr < 0) {
                b = xr;
            } else {
                a = xr;
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        return xr;
    }

    public static void main(String[] args) {
        double raiz = falsaPosicion(1.0, 1.6, 1e-5, 100);
        System.out.println("Raiz aproximada (Falsa Posicion): " + raiz);
    }
}
