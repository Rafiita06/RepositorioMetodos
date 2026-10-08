package ecuacionesLineales.gaussJordan;

public class gaussJordan {
    public static void eliminacionGaussJordan(double[][] matriz){
        int n = matriz.length;

        for (int i = 0; i < n; i++){
            double pivote = matriz[i][i];
            for (int j = 0; j <= n; j++){
                matriz[i][j] /= pivote;
            }

            for (int j = 0; j < n; j++){
                if (i != j) {
                    double factor = matriz[j][i];
                    for (int k = 0; k <= n; k++) {
                        matriz[j][k] -= factor * matriz[i][k];
                    }
                }
            }
        }
    }
    public static double[] obtenerSoluciones(double[][] matriz){
        int n = matriz.length;
        double[] x = new double[n];
        for (int i = 0; i < n; i++){
            x[i] = matriz[i][n];
        }
        return x;
    }
}
