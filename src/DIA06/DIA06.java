package DIA06;

import java.util.ArrayList;
import java.util.Scanner;

public class DIA06 {

    public static void main(String[] args){
        String nomeEscolhido;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes  = new ArrayList();
        nomes.add("Kalebe");
        nomes.add("Djane");
        nomes.add("Joel");
        nomes.add("Jeniffer");
        nomes.add("Jesus");

        System.out.print("Essa Lista tem " + nomes.size() + " nomes\n");
        System.out.print("Nomes da lista: " + nomes + "\n");

        System.out.print("Digite o nome que voçê quer remover:  \n");
        nomeEscolhido = sc.nextLine();


        boolean remover = false;

        for (int i = 0; i < nomes.size(); i++){

            if (nomeEscolhido.equals(nomes.get(i))) {
                nomes.remove(i);
                remover = true;
                System.out.println("Removido com sucesso!");
                break;
            }

        }
        if (remover){
            System.out.print("Nome removido com sucesso: ");
            System.out.println("Lista atualizada: " + nomes);

        } else {
            System.out.println("Nome não existente!");
        }
    }
}
