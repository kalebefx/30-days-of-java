package DIA04;

import java.util.Scanner;
public class DIA04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array;
        float media;
        System.out.println("Digite 5 numeros: ");
        array = new int[5];

        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();
        System.out.println("Numeros digitados: " + array[0] + array[1] + "--" + array[2] + "--" + array[3] +  "--"+ array[4]);
        int maior = array[0];
        int menor = array[0];
        for (int i = 1; i<array.length; i++){
            if( array[i] > maior){
                maior = array[i];
            }

        }
        System.out.print(maior + " ");

        for (int i = 1; i<array.length; i++){
            if( array[i] < menor){
                menor = array[i];

            }
        }
        System.out.print(menor + " ");

        int soma = array[0] + array[1] + array[2] + array[3] + array[4];
        media = (float) soma / array.length;
        System.out.println("Media: " + media);

    }
}
