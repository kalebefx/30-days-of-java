package DIA12;

public class PRINCIPAL {
    public static void main(String[] args) {
        RETANGULO retangulo = new RETANGULO();
        retangulo.setLargura(20);
        retangulo.setAltura(20);
        retangulo.exibirArea();

        CIRCULO circulo = new CIRCULO();
        circulo.setRaio(5);
        circulo.exibirArea();
    }
}