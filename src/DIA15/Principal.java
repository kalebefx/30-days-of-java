package DIA15;

public class Principal {

    public static void main(String[] args){
        Caixa<String> caixa1 = new Caixa<>();
        Caixa<Integer> caixa2 = new Caixa<>();
        Caixa<Double> caixa3 = new Caixa<>();

        caixa1.guardar("Kalebe");
        caixa1.exibir();

        caixa2.guardar(19);
        caixa2.exibir();

        caixa3.guardar(99.90);
        caixa3.exibir();

    }





}
