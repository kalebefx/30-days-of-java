package DIA10;

public class PESSOA {
    private String nome;
    private int idade;
    private String email;

    public PESSOA() {
        this.nome = "Desconhecido";
        this.idade = 0;
        this.email = "sem email";
    }

    public PESSOA(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.email = "sem email";
    }

    public PESSOA(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void ixibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Email: " + email);
    }
}