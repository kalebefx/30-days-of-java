package DIA12;

public class RETANGULO extends FORMA {
    private int largura;
    private int altura;

    public int getLargura() { return largura; }
    public void setLargura(int largura) { this.largura = largura; }
    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public float calcularArea() {
        return largura * altura;
    }
}