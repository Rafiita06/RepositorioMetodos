package puntofijo;

public class MetodoPuntoFijo {

    public static void ejecutar(double x0, double epsilon, int maxIter) {
        double xActual = x0;
        double xAnterior;
        double errorPorcentual = 100.0; // Inicialización para asegurar el ingreso al bucle
        int iteracion = 0;


        System.out.println("Iteración |      x_actual      |   Error PorcentuaL (|x_act - x_ant|)");
        System.out.println("-------------------------------------------------------------------");

        while (errorPorcentual > epsilon && iteracion < maxIter) {
            xAnterior = xActual;

            // Llamada modular a la función g(x) de la otra clase
            xActual = Evaluador.g(xAnterior);
            iteracion++;

            // Calculo del Error Porcentual
            errorPorcentual = Math.abs((xActual - xAnterior) / xActual) * 100.00;

            /*// Cálculo directo del Error Absoluto (sin porcentaje)
            errorAbsoluto = Math.abs(xActual - xAnterior);*/

            System.out.printf("   %2d     |   %.8f   |   %.8f%n", iteracion, xActual, errorPorcentual);
        }
        System.out.println("---------------------------------------------------------------");
        if (errorPorcentual <= epsilon) {
            System.out.println("-> Convergencia alcanzada en la iteración " + iteracion);
            System.out.printf("-> Raíz aproximada: %.8f%n", xActual);
        } else {
            System.out.println("-> Se alcanzó el límite máximo de iteraciones sin lograr la tolerancia.");
        }
    }
}






