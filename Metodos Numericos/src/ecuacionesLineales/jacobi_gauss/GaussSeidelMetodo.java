package ecuacionesLineales.jacobi_gauss;
import static ecuacionesLineales.jacobi_gauss.MetodoJacobi.calcularError;
public class GaussSeidelMetodo {
    public static double[] gaussSeidel(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone();
        // Un solo vector que evoluciona al instante[cite: 2]

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone();
            // Respaldamos el estado anterior para el error[cite: 2]

            for (int i = 0; i < n; i++) {
                double suma = b[i];
                // Arranca con el término independiente b_i[cite: 2]

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        // TODO: Completa el código[cite: 2]
                        suma -= A[i][j] * x[j];
                    }
                }
                // TODO: Completa el código[cite: 2]
                x[i] = suma / A[i][i];
            }

            // TODO: Completa el código[cite: 2]
            if (calcularError(xAnt, x) < tol) {
                System.out.println("Gauss-Seidel convergió en la iteración: " + (iter + 1));
                return x;
            }
        }
        System.out.println("Gauss-Seidel alcanzó el número máximo de iteraciones.");
        return x;
    }
}
