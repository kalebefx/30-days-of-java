package DIA03;

import java.util.Scanner;

public class DIA03 {

    public int maiorDeTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public boolean ePrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DIA03 m = new DIA03();

        System.out.println("Digite tres numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("O maior é: " + m.maiorDeTres(n1, n2, n3));

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (m.ePrimo(n)) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        sc.close();
    }
}
