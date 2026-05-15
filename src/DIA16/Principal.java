package DIA16;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Julia");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Amanda");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Alice");
        System.out.println("--- Todos os nomes ---");
        listaDeNomes.forEach(nome -> System.out.println(nome));

        List<String> comA = new ArrayList<>(listaDeNomes);

        System.out.println("--- Começa com A ---");
        comA.removeIf(nome  -> !nome .startsWith("A"));
        comA.forEach(nome  -> System.out.println(nome ));

        List<String> ordenado = new ArrayList<>(listaDeNomes);

        System.out.println("--- Ordem alfabética ---");
        ordenado.sort((a, b) -> a.compareTo(b));
        ordenado.forEach(nome  -> System.out.println(nome ));

        List<String> maiusculo = new ArrayList<>(listaDeNomes);

        System.out.println("--- Em maiúsculo ---");
        maiusculo.forEach(nome  -> System.out.println(nome .toUpperCase()));
    }
}
