// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

    // 3 - Hannoi
    // H(1) = 1
    // H(n) = 2.H(n-1) + 1, n>=2

public class Ex03 {

    public static void main(String[] args) {

        int value, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de peças da torre");
        value = scan.nextInt();

        result = torreHanoi(value);

        System.out.println("\nA quantidade de movimentos para " + value + " peças é: " + result);

    }

    public static int torreHanoi(int value) {
        if(value == 1)
            return 1;
        return 2 * torreHanoi(value - 1) + 1;
    }
}
