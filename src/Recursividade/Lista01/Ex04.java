// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Recursividade.Lista01;

import java.util.Scanner;

public class Ex04 {

    // 4 - Fibonacci
    // F(1) = 1
    // F(2) = 1
    // F(n) = F(n-1) + F(n-2), n>=3

    public static void main(String[] args) {
        int value;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos valores da sequência deseja saber: ");
        value = scan.nextInt();

        for (int i = 0; i < value; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    static long fibonacci(int value) {
        if (value < 2)
            return value;
        return fibonacci(value - 1) + fibonacci(value - 2);

    }

}
