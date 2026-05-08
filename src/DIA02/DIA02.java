package DIA02;

import java.util.Scanner;

public class DIA02 {

    public static void main(String[] args) {
        int n = 0;
        int tabuada;
        int contagem = 0;
        int pares = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n = sc.nextInt();
        System.out.println("TABUADA DE  " + n + "\n");
        for (int i = 1; i <= 10; i++){
            tabuada = n * i;
            System.out.print( n + "x" + i + "=" + tabuada + "\n");
        }

        for (int i = 1; i <= n; i++){
            contagem = contagem + i;

        }
        System.out.println("SOMA TOTAL: " + contagem);

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                pares += 1;
            }
        }
        System.out.println("Quantidade de par: " + pares);
    }
}
