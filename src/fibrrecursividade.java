/*

import java.util.Scanner;

public class fibrrecursividade {

    public int fibonacci(int n) {

        if ( n  == 0 ) {
            return 0;

        } else if ( n == 1 ) {
             return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        fibrrecursividade m = new fibrrecursividade ();

        System.out.println("Digite um numero positivo: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Digite um numero positivo: ");
            n = scanner.nextInt();
        }

        int resposta = m.fibonacci(n);
        System.out.println(resposta);

    }
}
*/