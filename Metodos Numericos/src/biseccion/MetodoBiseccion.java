package biseccion;

public class MetodoBiseccion {
    public static double ejecutar( double a, double b, double tol, int maxIter){
        // Validación del Teorema de Bolzano (cambio de signo inicial)
        if (FuncionMatematica.f(a) * FuncionMatematica.f(b) >=0){
            System.out.println("Error: No existe cambio de signo en el intervalo [\" + a + \", \" + b + \"].");
            System.out.println("El Teorema de Bolzano no se cumple.");
            return Double.NaN;
        }
        double xr = a;
        double errorAbs = Math.abs(b - a);

        // Encabezado de la tabla de resultados
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-5s | %-10s | %-10s | %-10s | %-12s | %-12s%n",
                "Iter", "a", "b", "xr (Mid)", "f(xr)", "Error (b-a)/2");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 1; i <= maxIter; i++){
            xr = (a + b) / 2.0;
            double f_xr = FuncionMatematica.f(xr);
            errorAbs = Math.abs(b - a) / 2.0;

            // Imprime los resultados de la iteración actual
            System.out.printf("%-5d | %-10.6f | %-10.6f | %-10.6f | %-12.6e | %-12.6e%n",
                    i, a, b, xr, f_xr, errorAbs);

            // Criterio de paro por tolerancia
            if (Math.abs(f_xr) < tol || errorAbs < tol) {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.printf("Criterio de tolerancia alcanzado en la iteración %d.%n", i);
                return xr;
            }

            // Actualización de los extremos del intervalo
            if (FuncionMatematica.f(a) * f_xr < 0) {
                b = xr; // La raíz está en la mitad izquierda
            } else {
                a = xr; // La raíz está en la mitad derecha
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Se alcanzó el límite máximo de iteraciones.");
        return xr;
    }
}
