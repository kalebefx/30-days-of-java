package DIA05;

import java.util.Scanner;

public class DIA05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String fraseInversa;
        int quantidadeDeVogal = 0;


        System.out.print("Digite sua frase: ");
        frase = sc.nextLine();


        fraseInversa = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInversa = fraseInversa + frase.charAt(i);

        }
        System.out.print("Frase inversa: " + fraseInversa + "\n");

        for (int j = frase.length() - 1; j >= 0; j--) {
            if (frase.charAt(j) == 'a' || frase.charAt(j) == 'e' || frase.charAt(j) == 'i'|| frase.charAt(j) == 'o' || frase.charAt(j) == 'u' ) {
                quantidadeDeVogal++;
            }
        }
        System.out.print("Quantidade de vogal: " + quantidadeDeVogal + "\n");

        if ( frase.equals(fraseInversa)) {
            System.out.println("Ele e Polindromo: SIM");
        } else{
            System.out.println("Ele e Polindromo: NAO");
        }

    }
}
