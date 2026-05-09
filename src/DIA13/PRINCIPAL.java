package DIA13;

public class PRINCIPAL {
    public static void main(String[] args) {
        CARTAOCREDITO cartaocredito = new CARTAOCREDITO();
        cartaocredito.realizarPagamento(150.00);
        cartaocredito.confirmarPagamento();

        PIX pix = new PIX();
        pix.realizarPagamento(150.00);
        pix.confirmarPagamento();
    }
}