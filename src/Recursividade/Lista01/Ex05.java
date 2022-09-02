// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

public class Ex05 {

    // 5 - Fatorial
    // 0! = 1
    // n! = n.(n-1)!, n>=1

    public static void main(String[] args) {
        int value, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor para descobrir seu fatorial: ");
        value = scan.nextInt();

        result = fatorial(value);

        System.out.println("\nO fatorial de " + value + " é: " + result);

    }

    static int fatorial(int value) {
        if (value == 0)
            return 1;
        return value * fatorial(value - 1);
    }
}
