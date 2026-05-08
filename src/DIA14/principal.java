package DIA14;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite o de 1 a 7: ");
        numero = input.nextInt();
        diaDaSemana.diaSemana[] dias = diaDaSemana.diaSemana.values(); // aqui!
        diaDaSemana.diaSemana diaEscolhido = dias[numero - 1];
        System.out.println("Dia: " + diaEscolhido);
        System.out.println("Tipo: " + diaEscolhido.getTipo());



    }
}
