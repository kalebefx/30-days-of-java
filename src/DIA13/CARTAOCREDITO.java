package DIA13;

public class CARTAOCREDITO implements PAGAMENTO {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " no cartão realizado!");
    }
    public void confirmarPagamento() {
        System.out.println("Pagamento no cartão confirmado!");
    }
}