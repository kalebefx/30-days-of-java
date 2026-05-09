package DIA09;

public class PRINCIPAL {
    public static void main(String[] args) {
        Carro Carro1 = new Carro();
        Carro1.setMarca("Toyota");
        Carro1.setModelo("Corolla");
        Carro1.setAno(2000);
        Carro1.setVelocidade(100);
        Carro1.acelerar(40);
        Carro1.frear(20);
        Carro1.exibirInfo();

        Carro Carro2 = new Carro();
        Carro2.setMarca("Mercedes");
        Carro2.setModelo("C180");
        Carro2.setAno(1990);
        Carro2.setVelocidade(120);
        Carro2.acelerar(30);
        Carro2.frear(10);
        Carro2.exibirInfo();
    }
}