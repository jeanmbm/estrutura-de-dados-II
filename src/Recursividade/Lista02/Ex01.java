package Recursividade.Lista02;

public class Ex01 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("O resultado da multiplicação 4 x 5 é: " + multiplicacao(4, 5));
        System.out.println("O resultado da multiplicação 9 x 17 é: " + multiplicacao(9, 17));

        System.out.println("\nO resto da divisão 10 ÷ 3 é: " + restoDivisao(10, 3));
        System.out.println("O resto da divisão 72 ÷ 0 é: " + restoDivisao(72, 0));

        System.out.print("\nA sequencia inversa de 9 é: ");
        sequenciaInversa(9);
        System.out.print("\nA sequencia inversa de 32 é: ");
        sequenciaInversa(32);

        System.out.print("\n\nOs 10 próximos numeros após o 9 é: ");
        mostraPoximosDezValores(9, count);
        count = 0;
        System.out.print("\nOs 10 próximos numeros após o 48 é: ");
        mostraPoximosDezValores(48, count);

        System.out.println("\n\nA soma dos valores pares de 0 a 10 é: " + somaParesAteN(10));
        System.out.println("A soma dos valores pares de 0 a 60 é: " + somaParesAteN(60));

    }

    static int multiplicacao(int x, int y) {
        if(x == 0)
            return 0;
        return y + multiplicacao(--x, y);
    }

    static int restoDivisao(int x, int y) {
        if(x == y)
            return 1;
        if(y > x)
            return x;
        if(y == 0) {
            System.out.println("     ↓ Não é possível dividir por 0");
            return 0;
        }
        return restoDivisao(x-y, y);
    }

    static int sequenciaInversa(int value) {
        if (value == 0)
            return 0;
        System.out.print(value + ", ");
        return sequenciaInversa(--value);
    }

    static int mostraPoximosDezValores(int value, int count) {
        if(count == 11)
            return 0;
        System.out.print(value + ", ");
        return mostraPoximosDezValores(++value, count + 1);
    }

    static int somaParesAteN(int value) {
        if(value == 0)
            return 0;
        if (value % 2 != 0)
            return somaParesAteN(--value);
        return value + somaParesAteN(--value);

    }
}
