package DIA11;

public class PRINCIPAL {
    public static void main(String[] args) {
        CACHORRO cachorro = new CACHORRO();
        cachorro.setNome("Pipoca");
        cachorro.setIdade(11);
        cachorro.exibirInfo();
        cachorro.emitirSom();

        GATO gato = new GATO();
        gato.setNome("Mel");
        gato.setIdade(5);
        gato.exibirInfo();
        gato.emitirSom();
    }
}