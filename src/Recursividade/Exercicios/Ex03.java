package Recursividade.Exercicios;

// Faça uma função recursiva que permita somar os elementos de um vetor de inteiros

public class Ex03 {
    public static void main(String[] args) {
        int vet[] = new int[] { 1, 2, 3, 4, 5};
        int i = 0;
        System.out.println(somaElementosVetor(vet, i));

        int vet2[] = new int[] { 9, 6, 15, 20, 11, 48};
        i = 0;
        System.out.println(somaElementosVetor(vet2, i));

        int vet3[] = new int[] { 22, 17, 37, 5, 98, 46, 8};
        i = 0;
        System.out.println(somaElementosVetor(vet3, i));
    }

    static int somaElementosVetor(int vet[], int i) {
        int value = vet[i];
        if (i == vet.length - 1)
            return 0;
        return value + somaElementosVetor(vet, ++i);
    }

}