package Ordenacao;

public class MergeSort {

    public static void main(String[] args) {
        int vet[] = new int[] {5, 1, 6, 7, 2, 4, 10, 35, 15};
        int vet2[] = new int[] {1, 14, 18, 2, 4, 5, 9, 20, 19, 3, 8, 11, 16, 15 ,12, 13, 10, 6, 7, 17};
        int vet3[] = new int[] {76, 31, 40, 70, 14, 93, 10, 72, 23, 33, 57, 60, 29, 21, 35, 79, 82, 88, 73, 61, 43, 81, 75, 99, 28, 8, 87, 97, 62, 16};
        int vet4[] = new int[] {116, 45, 138, 146, 13, 68, 143, 95, 32, 149, 15, 94, 9, 131, 84, 73, 56, 22, 59, 98, 60, 72, 124, 144, 6, 101, 25, 41, 109, 65, 63, 53, 137, 24, 26, 57, 77, 105, 126, 16, 112, 43, 88, 121, 119, 139, 14, 129, 91, 147};

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet);

        sort(vet, 0, vet.length - 1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet2);

        sort(vet2, 0, vet2.length -1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet2);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet3);

        sort(vet3, 0, vet3.length -1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet3);

        System.out.println("\n\n--------------------------------------------------------------------\n");

        System.out.print("Vetor antes da ordenação: ");
        exibirVetor(vet4);

        sort(vet4, 0, vet4.length - 1);
        System.out.println("");

        System.out.print("Vetor depois da ordenação: ");
        exibirVetor(vet4);

    }
    
    static void merge(int[] vetor, int inicio, int meio, int fim) {
        int quantidadeVet1 = meio- inicio+ 1;
        int quantidadeVet2 = fim -meio;
        int i = 0, j = 0;
        int k = inicio;

        int[] aux1 = new int [quantidadeVet1];
        int[] aux2 = new int [quantidadeVet2];

        for (int l = 0; l < quantidadeVet1; l++)
            aux1[l] = vetor[inicio + l];

        for (int l = 0; l < quantidadeVet2; l++)
            aux2[l] = vetor[meio + 1+ l];

        while (i < quantidadeVet1 && j < quantidadeVet2) {
            if (aux1[i] <= aux2[j]) {
                vetor[k] = aux1[i];
                i++;
            } else {
                vetor[k] = aux2[j];
                j++;
            }
            k++;
        }
        
        while (i < quantidadeVet1) {
            vetor[k] = aux1[i];
            i++;
            k++;
        }
    
        while (j < quantidadeVet2) {
            vetor[k] = aux2[j];
            k++;
            j++;
        }
    }  
     
    static void sort(int vetor[], int inicio, int fim)
    {
        if (inicio < fim)
        {
            int meio = ( inicio + fim ) / 2;
            sort(vetor, inicio, meio);
            sort(vetor , meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
        
        return;
    }
    
    static void exibirVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
    }

}


// static void merge(int vetor[], int inicio, int meio, int fim)
//    {
//        
//        int[] aux = new int[vetor.length];
//        for (int i = inicio; i <= fim; i++) {
//            aux[i] = vetor[i];
//        }
//        
//        int i = inicio;
//        int j = meio + 1;
//        int k = fim;
//        
//         while (i <= meio && j <= fim) {    
//            if (aux[i] <= aux[j]) {
//                vetor[k] = aux[i];
//                i++;
//            } else {
//                vetor[k] = aux[j];
//                j++;
//            }
//            k++;  
//        }
//
//        while (i <= meio) {
//            vetor[k] = aux[i];
//            k++;
//            i++;
//        }
//
//        while (j <= fim) {
//            vetor[k] = aux[j];
//            k++;
//            j++;
//        }
//
//    }
