package DIA15;


public class Caixa<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
    public boolean temConteudo() {
        return conteudo != null;
    }

    public void exibir() {
        System.out.println("Caixa contém: " + conteudo);
    }
}

