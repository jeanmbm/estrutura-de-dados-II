// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

public class Ex02 {

    // 2 - Progressão  Aritmética
    // T(0) = 1
    // T(n) = T(n – 1) + 4, n >= 1

    public static void main(String[] args) {
        int value, result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quntidade de numeros da sequencia deseja saber: ");
        value = scan.nextInt();

        result = progecaoAritmetica(value);

        System.out.println("\nO resultado é: " + result);
    }

    public static int progecaoAritmetica(int value) {
        if (value == 0)
            return 1;
        return progecaoAritmetica(value - 1) + 4;
    }

}
