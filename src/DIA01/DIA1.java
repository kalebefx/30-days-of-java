package DIA01;

import java.util.Scanner;

public class DIA1 {
    public static void main(String[] args){
        int n;
        String sinal;
        String tipo;
        String divisivel;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n = scanner.nextInt();

        while ( n == 0){
            System.out.println("Digite sem ser 0: ");
            n = scanner.nextInt();

        }

        if ( n > 0){
            sinal = "Positivo";
        } else {
            sinal = "Negativo";
        }

        if ( (n % 2) == 0){
            tipo = "Par";
        } else {
            tipo = "Impar";
        }

        if ( ((n % 3) == 0) && ((n % 5) == 0)){
            divisivel = "Sim";
        } else {
            divisivel = "Não";
        }

        System.out.println("Digite um número: " + n );
        System.out.println("Par ou ímpar: " + tipo);
        System.out.println("Sinal: " + sinal);
        System.out.println("Divisível por 3 e 5:" + divisivel);

    }
}
