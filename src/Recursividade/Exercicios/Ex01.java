package Recursividade.Exercicios;

import java.util.Scanner;

// Defina a função somaNaturais que recebe como argumento um número natural n e devolve a soma de todos os números naturais até  n

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite um valor do conjunto dos numeros naturais: ");
        int value = scan.nextInt();

        System.out.println("\nA soma dos numeros naturais até " + value + " é: " + somaNaturais(value));

    }

    static int somaNaturais(int n) {
        if (n == 0)
            return 0;
        return somaNaturais(n - 1) + n;
    }

}