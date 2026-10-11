package ecuacionesLineales.eliminacionGaussiana;

public class GaussJordan {
    public static void eliminacionGaussiana(double[][] matriz){
        int n = matriz.length;

        for(int i = 0; i < n; i++){
            double pivote = matriz[i][i];

            for(int k = i + 1; k < n; k++){
                double factor = matriz[k][i] / pivote;
                for(int j =i; j <= n; j++){
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    }

    public static void resolver(double[][] matriz){
        int n = matriz.length;

        eliminacionGaussiana(matriz);

        for(int i = n - 1; i >= 0; i--){
            double pivote = matriz[i][i];

            for(int j = 0; j<= n; j++){
                matriz[i][j] /= pivote;
            }
            for(int k = i - 1; k >= 0; k--){
                double factor = matriz[k][i];
                for(int j = 0; j <= n; j++){
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    }
}
