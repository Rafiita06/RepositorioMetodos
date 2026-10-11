package ecuacionesLineales.JACOBI;

public class MetodoJacobi {
    public static double[] resolver(double[][] A, double[] b, double[] x0, double tol, int maxiter){
        int n = b.length;
        double[] x =x0.clone();
        double[] xNuevo = new double[n];

        for(int k = 0; k < maxiter; k++){
            for (int i = 0; i < n; i++){
                double suma = 0.0;

                for(int j = 0; j < n; j++){
                    if(j != i){
                        suma += A [i][j] * x[j];
                    }
                }

                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            if(calcularError(x, xNuevo) < tol){
                return xNuevo;
            }
            x = xNuevo.clone();
        }

        return xNuevo;
    }

    public static double calcularError(double[] xAnt, double[] xNuevo){
        double max = 0.0;
        for(int i=0; i<xAnt.length; i++){
            max = Math.max(max, Math.abs(xNuevo[i] - xAnt[i]));
        }
        return max;
    }
}
