package DIA10;

public class PRINCIPAL {
    public static void main(String[] args) {
        PESSOA pessoa = new PESSOA();
        PESSOA pessoa2 = new PESSOA("Kalebe");
        PESSOA pessoa3 = new PESSOA("Kalebe", 19, "kalebefx@gmail.com");
        pessoa.ixibirInfo();
        pessoa2.ixibirInfo();
        pessoa3.ixibirInfo();
    }
}