package Ordenacao;

public class InsertionSort {

    public static void main(String[] args) {
        int vet[] = new int[] {5, 1, 6, 7, 2, 4, 10, 35, 15};
        int vet2[] = new int[] {1, 14, 18, 2, 4, 5, 9, 20, 19, 3, 8, 11, 16, 15 ,12, 13, 10, 6, 7, 17};
        int vet3[] = new int[] {76, 31, 40, 70, 14, 93, 10, 72, 23, 33, 57, 60, 29, 21, 35, 79, 82, 88, 73, 61, 43, 81, 75, 99, 28, 8, 87, 97, 62, 16};
        int vet4[] = new int[] {116, 45, 138, 146, 13, 68, 143, 95, 32, 149, 15, 94, 9, 131, 84, 73, 56, 22, 59, 98, 60, 72, 124, 144, 6, 101, 25, 41, 109, 65, 63, 53, 137, 24, 26, 57, 77, 105, 126, 16, 112, 43, 88, 121, 119, 139, 14, 129, 91, 147};

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet);

        insertion(vet);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet2);

        insertion(vet2);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet2);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet3);

        insertion(vet3);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet3);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet4);

        insertion(vet4);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet4);
    }

    static void insertion(int vet[]) {
        int j, aux;
        for (int i = 0; i < vet.length; i++) {
            j = i;
            while (j > 0 && vet[j - 1] > vet[j]) {
                aux = vet[j];
                vet[j] = vet[j - 1];
                vet[j - 1] = aux;
                j--;
            }
        }
    }

    static void exibirVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
    }
}
