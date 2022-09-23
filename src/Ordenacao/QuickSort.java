package Ordenacao;

public class QuickSort {

    public static void main(String[] args) {

        int vet[] = new int[] {5, 1, 6, 7, 2, 4, 10, 35, 15};
        int vet2[] = new int[] {1, 14, 18, 2, 4, 5, 9, 20, 19, 3, 8, 11, 16, 15 ,12, 13, 10, 6, 7, 17};
        int vet3[] = new int[] {76, 31, 40, 70, 14, 93, 10, 72, 23, 33, 57, 60, 29, 21, 35, 79, 82, 88, 73, 61, 43, 81, 75, 99, 28, 8, 87, 97, 62, 16};
        int vet4[] = new int[] {116, 45, 138, 146, 13, 68, 143, 95, 32, 149, 15, 94, 9, 131, 84, 73, 56, 22, 59, 98, 60, 72, 124, 144, 6, 101, 25, 41, 109, 65, 63, 53, 137, 24, 26, 57, 77, 105, 126, 16, 112, 43, 88, 121, 119, 139, 14, 129, 91, 147};

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet);

        quickSort(vet, 0, vet.length - 1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet2);

        quickSort(vet2, 0, vet2.length -1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet2);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet3);

        quickSort(vet3, 0, vet3.length -1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet3);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet4);

        quickSort(vet4, 0, vet4.length - 1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet4);

    }

    static int particao(int vet[], int inicio, int fim) {

        int i = inicio;
        int pivo = vet[inicio];

        for (int j = inicio + 1; j <= fim; j++) {
            if (vet[j] <= pivo) {
                i++;
                int aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }

        int aux = vet[inicio];
        vet[inicio] = vet[i];
        vet[i] = aux;

        return i;
    }

    static void quickSort(int vet[], int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particao(vet, inicio, fim);
            quickSort(vet, inicio, indicePivo - 1);
            quickSort(vet, indicePivo + 1, fim);
        }
    }

    static void exibirVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
    }

}

