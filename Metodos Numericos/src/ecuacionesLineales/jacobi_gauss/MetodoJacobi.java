package ecuacionesLineales.jacobi_gauss;

public class MetodoJacobi {
    public static double calcularError(double[] xAnt, double[] xAct) {
        double maxError = 0.0;
        for (int i = 0; i < xAnt.length; i++) {
            double errorActual = Math.abs(xAct[i] - xAnt[i]);
            if (errorActual > maxError) {
                maxError = errorActual;
            }
        }
        return maxError;
    }

    public static double[] jacobi(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone();

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone();
            double[] xNuevo = new double[n];

            for (int i = 0; i < n; i++) {
                double suma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * xAnt[j];
                    }
                }
                xNuevo[i] = suma / A[i][i];
            }

            x = xNuevo;

            if (calcularError(xAnt, x) < tol) {
                System.out.println("Jacobi convergió en la iteración: " + (iter + 1));
                return x;
            }
        }
        System.out.println("Jacobi alcanzó el número máximo de iteraciones.");
        return x;
    }
}
