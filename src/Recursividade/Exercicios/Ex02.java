package Recursividade.Exercicios;

import java.util.Scanner;

// Defina a função div que recebe como argumentos dois números naturais  m  e  n  e devolve o resultado da divisão inteira de m por n.
// Neste exercício não pode recorrer às operações aritméticas de multiplicação, divisão e resto da divisão inteira.


public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme o divisor: ");
        int value1 = scan.nextInt();

        System.out.print("\nInforme o dividendo: ");
        int value2 = scan.nextInt();

        System.out.println("\nA divisão de " + value1 + " por " + value2 + " é: " + div(value1, value2));

    }

    static int div(int m, int n) {
        if (m < n)
            return 0;
        if (m == n)
            return 1;
        return div(m-n, n);
    }
}