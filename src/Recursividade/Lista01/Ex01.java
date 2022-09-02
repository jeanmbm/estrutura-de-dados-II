// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

public class Ex01 {

    // 1 - Progressão Geometrica
    // T(0) = 1
    // T(n) = 2.T(n-1)

    public static void main(String[] args) {

        int value, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quntidade de numeros da sequencia deseja saber: ");
        value = scan.nextInt();

        result = progecaoGeometrica(value);

        System.out.println("\nO resultado é: " + result);
    }

    public static int progecaoGeometrica(int value) {
        if (value == 1)
            return 1;
        return 2 * progecaoGeometrica(value - 1);
    }

}
