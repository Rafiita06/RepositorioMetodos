package Interpolacion;

public class DiferenciasDivididasNewton {
    private static void validarDatos(double[] x, double[] y) {
        if (x == null || y == null || x.length == 0 || y.length == 0) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos ni estar vacios.");
        }
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos x y y deben tener el mismo tamano.");
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    throw new IllegalArgumentException("Nodos de x repetidos: " + x[i]);
                }
            }
        }
    }

    public static double[][] calcularTabla(double[] x, double[] y) {
        validarDatos(x, y);
        int n = x.length;
        double[][] tabla = new double[n][n];

        for (int i = 0; i < n; i++) {
            tabla[i][0] = y[i];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tabla[i][j] = (tabla[i + 1][j - 1] - tabla[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        return tabla;
    }

    public static double evaluarNewton(double[] x, double[][] tabla, double xEval) {
        int n = x.length;
        double resultado = tabla[0][0];
        double producto = 1.0;

        for (int i = 1; i < n; i++) {
            producto *= (xEval - x[i - 1]);
            resultado += tabla[0][i] * producto;
        }
        return resultado;
    }

    public static void imprimirTabla(double[] x, double[][] tabla) {
        int n = x.length;
        System.out.println("=== TABLA DE DIFERENCIAS DIVIDIDAS DE NEWTON ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %8.4f | ", i, x[i]);
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%12.6f ", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
