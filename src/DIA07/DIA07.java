package DIA07;

import java.util.Scanner;
import java.util.HashMap;


public class DIA07 {

    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner input = new Scanner(System.in);

        agenda.put("Kalebe", "62991160210");
        agenda.put("Julia", "62993460450");
        agenda.put("Gustavo", "62998960222");
        agenda.put("Paulo", "62997167290");

        System.out.println("Agenda de Contatos: " + agenda);
        System.out.println("-----------------------------");
        System.out.println("Digite o nome para buscar: ");
        String nome = input.nextLine();

            if(agenda.containsKey(nome)){
                System.out.println("Telefone: " + agenda.get(nome));
            } else {
                System.out.println("Nome não encontrado: " + nome);;
            }
    }
}
