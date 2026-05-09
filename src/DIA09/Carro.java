package DIA09;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public float getVelocidade() { return velocidade; }
    public void setVelocidade(float velocidade) { this.velocidade = velocidade; }

    public void acelerar(int quantidade) {
        velocidade = velocidade + quantidade;
    }

    public void frear(int quantidade) {
        velocidade = velocidade - quantidade;
        if (velocidade < 0) velocidade = 0;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + " | Velocidade: " + velocidade);
    }
}