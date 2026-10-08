package NEWTON;

public class NewtonRaphson {
    public static double f(double x) {
        return (4 * Math.pow(x, 2)) - (5 * x);
    }

    public static double df(double x) {
        return (8 * x) - 5;
    }

    public static double newtonRaphson(double x0, double tol, int maxIter) {
        double x = x0;

        // Encabezado de la tabla de ejecucion
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s%n",
                "Iter", "xi", "f(xi)", "f'(xi)", "x_nuevo", "|x_nuevo - xi|");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < maxIter; i++) {
            double fx = f(x);
            double dfx = df(x);

            if (Math.abs(dfx) < 1e-12) {
                System.out.println("Derivada cercana a cero. El metodo falla.");
                return Double.NaN;
            }

            // TODO: Escribe la formula para calcular la nueva aproximacion (xNuevo)
            double xNuevo = x - (fx / dfx);
            double error = Math.abs(xNuevo - x);

            // Imprimir la fila correspondiente a la iteracion actual
            System.out.printf("%-6d %-12.6f %-12.6f %-12.6f %-12.6f %-12.6e%n",
                    (i + 1), x, fx, dfx, xNuevo, error);

            // TODO: Escribe la condicion de paro
            if (error < tol || Math.abs(f(xNuevo)) < tol) {
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("Newton-Raphson convergio en " + (i + 1) + " iteraciones.");
                return xNuevo;
            }

            x = xNuevo;
        }
        System.out.println("---------------------------------------------------------------------------------");
        return x;
    }

    public static void main(String[] args) {
        double raiz = newtonRaphson(1.0, 1e-5, 100);
        System.out.println("Raiz aproximada (Newton-Raphson): " + raiz);
    }
}
