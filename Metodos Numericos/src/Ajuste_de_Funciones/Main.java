package Ajuste_de_Funciones;

public class Main {
    public static void main(String[] args) {
        double[] x = DatosPrueba.obtenerValoresX();
        double[] y = DatosPrueba.obtenerValoresY();

        // Ejecutar calculo de minimos cuadrados
        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        double beta0 = resultados[0];
        double beta1 = resultados[1];

        // Validar metodo de prediccion con un valor nuevo (ej. X = 8.0)
        double xEvaluar = 8.0;
        double yEstimada = RegresionLineal.predecir(beta0, beta1, xEvaluar);

        System.out.println("\n--- VALIDACION DE PREDICCION ---");
        System.out.printf("Para X = %.2f, el valor estimado de Y es: %.4f%n", xEvaluar, yEstimada);
    }
}
