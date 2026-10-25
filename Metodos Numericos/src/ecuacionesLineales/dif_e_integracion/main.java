package ecuacionesLineales.dif_e_integracion;

public class main {
    public static void main(String[] args){
        double a = 0.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        //double resultado = TrapecoCompuesto.iteracionConTolerancia(a, b, tolerancia);
        double resultado = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("\nResultado final obtenido: " + resultado);
    }
}
