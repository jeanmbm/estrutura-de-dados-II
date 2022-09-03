package Recursividade.Ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int vet[] = new int[] {5, 1, 6, 7, 2, 4, 10, 35, 15};
        int vet3[] = new int[] {34, 92, 81, 95, 31, 84, 71, 32, 60, 55};

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet);

        bubbleSort(vet);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet3);

        bubbleSort(vet3);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet3);

    }

    static void bubbleSort(int vet[]) {

        int tamanhoVetor = vet.length;
        for (int i = 0; i < tamanhoVetor; i++) {
            for (int j = 0; j < tamanhoVetor - 1 - i; j++) {
                if (vet[j] > vet[j + 1]){
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    static void exibirVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
    }
}
