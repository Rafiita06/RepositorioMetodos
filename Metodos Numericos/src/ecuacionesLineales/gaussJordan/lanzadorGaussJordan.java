package ecuacionesLineales.gaussJordan;

public class lanzadorGaussJordan {
    public static void main (String[] args){
        double[][] matriz = defMatrizz.defmatriz();
        gaussJordan.eliminacionGaussJordan(matriz);
        double[] soluciones = gaussJordan.obtenerSoluciones(matriz);
        System.out.println("Soluciones del sistema");
        for (int i = 0; i < soluciones.length; i++){
            System.out.printf("x%d = %.4f%n", (i + 1), soluciones[i]);
        }
    }
}
