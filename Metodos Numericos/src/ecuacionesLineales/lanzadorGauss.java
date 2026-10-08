package ecuacionesLineales;

public class lanzadorGauss {
    public static void main(String[] args) {
        double[][] matriz = defMatrizz.defmatriz();
        gauss.eliminacionGaussiana(matriz);

        double[] soluciones = gauss.sustitucionRegresiva(matriz);
        System.out.println("Soluciones del sistema");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
