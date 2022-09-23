package Ordenacao;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vet =  {5, 1, 6, 7, 2, 4, 10, 35, 15};
        int[] vet3 = {34, 92, 81, 95, 31, 84, 71, 32, 60, 55};

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet);

        selection(vet);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet3);

        selection(vet3);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet3);

    }

//    static void selectiSort(int vet[]) {
//        int menorValor = 0;
//        int maiorValor;
//        int aux;
//
//        for (int i = 0; i < vet.length; i++) {
//            maiorValor = i;
//
//            for (int j = 0; j < vet.length; j++) {
//                menorValor = j;
//                if (vet[i] < vet[menorValor])
//                    menorValor = i;
//                if (vet[i] > vet[maiorValor])
//                    maiorValor = i;
//            }
//
//            aux = vet[menorValor];
//            vet[menorValor] = vet[maiorValor];
//            vet[maiorValor] = aux;
//        }
//    }

    static void selection(int vet[]) {
        int tamanhoVetor = vet.length;
        int aux = 0;

        for (int i = 0; i < tamanhoVetor-1; i++) {
            int menorIndice = i;

            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (vet[j] < vet[menorIndice])
                    menorIndice = j;
            }

            aux = vet[menorIndice];
            vet[menorIndice] = vet[i];
            vet[i] = aux;

        }
    }

    static void exibirVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
    }

}



