// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Pesquisa;

public class BuscaBinariaRecursiva {
    public static void main(String[] args) {
        int[] vet = {6, 9, 13, 14, 15, 16, 22, 24, 25, 26, 32, 41, 43, 45, 53, 56, 57, 59, 60, 63, 65, 68, 72, 73, 77, 84, 88, 91, 94, 95, 98, 101, 105, 109, 112, 116, 119, 121, 124, 126, 129, 131, 137, 138, 139, 143, 144, 146, 147, 149};
        int inicio = 0;
        int fim = vet.length - 1;

        int objetivo = 144;
        int posicao = buscaRecursiva(vet, inicio, fim, objetivo);
        exibeResultado(posicao, objetivo);

        inicio = 0;
        fim = vet.length - 1;
        objetivo = 133;
        posicao = buscaRecursiva(vet, inicio, fim, objetivo);
        exibeResultado(posicao, objetivo);

        inicio = 0;
        fim = vet.length - 1;
        objetivo = 15;
        posicao = buscaRecursiva(vet, inicio, fim, objetivo);
        exibeResultado(posicao, objetivo);

        inicio = 0;
        fim = vet.length - 1;
        objetivo = 23;
        posicao = buscaRecursiva(vet, inicio, fim, objetivo);
        exibeResultado(posicao, objetivo);
    }

    static int buscaRecursiva(int[] vet, int inicio, int fim, int objetivo) {
        int meio = (inicio + fim) / 2;
        int valorMeio = vet[meio];

        if (inicio > fim) {
            return -1;
        } else if (valorMeio == objetivo) {
            return meio;
        } else if (objetivo > valorMeio) {
            inicio = meio + 1;
            return buscaRecursiva(vet, inicio, fim, objetivo);
        } else {
            fim = meio - 1;
            return buscaRecursiva(vet, inicio, fim, objetivo);
        }
    }

    static void exibeResultado(int posicao, int objetivo) {
        if (posicao >= 0)
            System.out.println("\nValor " + objetivo + " encontrado na " + (posicao + 1) + "° posição do vetor");
        else
            System.out.println("\nValor " + objetivo + " não encontrado");
    }
}
