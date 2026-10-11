package ecuacionesLineales.JACOBI;

public class MainJacobi {
    public static void main(String[] args){
        double[][] A = Defmatrix.obtenerMatrizA();
        double[] b = Defmatrix.obtenerVectorB();
        double[] x0 = Defmatrix.obtenerVectorX0();

        double tol = 1e-5;
        int maxiter = 100;

        double[] solucion = MetodoJacobi.resolver(A,b, x0, tol, maxiter);

        System.out.print("Solución aproximada: [ ");
        for(double val : solucion){
            System.out.printf("%.5f ", val);
        }
        System.out.println("]");
    }
}