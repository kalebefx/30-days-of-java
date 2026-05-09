package DIA12;

public class CIRCULO extends FORMA {
    private int raio;

    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }

    public float calcularArea() {
        return (float)(Math.PI * raio * raio);
    }
}