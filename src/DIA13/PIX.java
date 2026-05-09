package DIA13;

public class PIX implements PAGAMENTO {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Pix realizado!");
    }
    public void confirmarPagamento() {
        System.out.println("Pagamento via Pix confirmado!");
    }
}