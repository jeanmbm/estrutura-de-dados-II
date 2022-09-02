// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

public class Ex06 {

    // 6 - Exponenciação
    // a^0 = 1
    // a^n = a.a^n-1, n>=1

    public static void main(String[] args) {

        int base, expoente, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        base = scan.nextInt();

        System.out.print("Digite o valor do expoente: ");
        expoente = scan.nextInt();

        result = exponenciacao(base, expoente);

        System.out.println("\nO resultado da exponenciação " + base + "^" + expoente + " é: " + result);

    }

    static int exponenciacao(int base, int expoente) {
        if (expoente == 0)
            return 1;
        return base * exponenciacao(base, expoente - 1);
    }
}
