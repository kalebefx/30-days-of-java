package DIA12;

public abstract class FORMA {
    public abstract float calcularArea();

    public void exibirArea() {
        System.out.println("Area: " + calcularArea());
    }
}