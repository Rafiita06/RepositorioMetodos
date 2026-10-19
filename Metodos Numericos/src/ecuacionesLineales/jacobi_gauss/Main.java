package ecuacionesLineales.jacobi_gauss;

import ecuacionesLineales.jacobi_gauss.MetodoJacobi;
import ecuacionesLineales.jacobi_gauss.GaussSeidelMetodo;

public class Main {
    public static void main(String[] args) {
        // Definición del Sistema de Ecuaciones Lineales:
        // 5x +  y +  z = 7
        //   x + 4y +  z = 6
        //   x + 2y + 5z = 8
        double[][] A = {
                {5.0, 1.0, 1.0},
                {1.0, 4.0, 1.0},
                {1.0, 2.0, 5.0}
        };

        double[] b = {7.0, 6.0, 8.0};

        // Vector inicial X^(0) = [0, 0, 0]^T[cite: 2]
        double[] xInicial = {0.0, 0.0, 0.0};

        // Tolerancia y número máximo de iteraciones
        double tol = 0.0001;
        int maxIter = 100;

        System.out.println("=== RESOLUCIÓN POR MÉTODO DE JACOBI ===");
        double[] resultadoJacobi = MetodoJacobi.jacobi(A, b, xInicial, tol, maxIter);
        System.out.println("Solución Jacobi: ");
        printVector(resultadoJacobi);

        System.out.println("\n=== RESOLUCIÓN POR MÉTODO DE GAUSS-SEIDEL ===");
        double[] resultadoGS = GaussSeidelMetodo.gaussSeidel(A, b, xInicial, tol, maxIter);
        System.out.println("Solución Gauss-Seidel: ");
        printVector(resultadoGS);
    }

    private static void printVector(double[] vec) {
        System.out.print("[ ");
        for (double val : vec) {
            System.out.printf("%.5f ", val);
        }
        System.out.println("]");
    }
}
