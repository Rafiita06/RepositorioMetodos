package ecuacionesLineales.dif_e_integracion;

public class SimpsonCompuesto {
    private static double calcularSimpson(double a, double b, int n){
        TrapecoCompuesto.calcularH(a, b, n);
        double h = (b - a) / n;

        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++){
            double xk = a + k * h;

            if (k % 2 == 1){
                sumaImpares += TrapecoCompuesto.funcion(xk);
            } else {
                sumaPares += TrapecoCompuesto.funcion(xk);
            }
        }
        double sumaTotal = TrapecoCompuesto.funcion(a)
                + 4.0 * sumaImpares
                + 2.0 * sumaPares
                + TrapecoCompuesto.funcion(b);
        return (h / 3.0) * sumaTotal;
    }

    public static double integrarConTolerancia(double a, double b, double tolerancia){
        int n = 2;
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        while (errorAbsoluto > tolerancia){
            n *= 2;
            double integralNueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);
        }
        return integralAnterior;
    }
}
