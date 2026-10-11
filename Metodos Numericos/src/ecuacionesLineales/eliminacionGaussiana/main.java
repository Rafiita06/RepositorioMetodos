package ecuacionesLineales.eliminacionGaussiana;

import ecuacionesLineales.JACOBI.Defmatrix;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        double[][] sistema = defMatriz.obtenerMatriz();
        System.out.println("=== MATRIZ AUMENTADA INICIAL ===");
        defMatriz.imprimirMatriz(sistema);

        GaussJordan.resolver(sistema);

        System.out.println("\n=== MATRIZ IDENTIDAD Y RESULTADO ===");
        defMatriz.imprimirMatriz(sistema);

        System.out.println("\n=== VECTRO DE SOLUCIONES DIRECTAS ===");
        for(int i = 0; i < sistema.length; i++){
            System.out.printf("X%d = %.4f\n", (i + 1), sistema[i][sistema.length]);
        }
    }
}
