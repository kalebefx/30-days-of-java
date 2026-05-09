package DIA11;

public class ANIMAL {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String emitirSom() {
        return "Som genérico";
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Som: " + emitirSom());
    }
}