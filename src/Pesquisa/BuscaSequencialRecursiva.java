// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Pesquisa;

public class BuscaSequencialRecursiva {
    public static void main(String[] args) {
        int variavelControle = 0;
        int[] vet = new int[] {1, 14, 18, 2, 4, 5, 9, 20, 19, 3, 8, 11, 16, 15 ,12, 13, 10, 6, 7, 17};
        int objetivo = 14;

        int posicao = buscaRecursiva(vet, objetivo, variavelControle);
        exibeResultado(posicao, objetivo);

        objetivo = 50;
        int posicao2 = buscaRecursiva(vet, objetivo, variavelControle);
        exibeResultado(posicao2, objetivo);

        objetivo = 6;
        int posicao3 = buscaRecursiva(vet, objetivo, variavelControle);
        exibeResultado(posicao3, objetivo);

        objetivo = 29;
        int posicao4 = buscaRecursiva(vet, objetivo, variavelControle);
        exibeResultado(posicao4, objetivo);

    }

    static int buscaRecursiva(int[] vet, int objetivo, int variavelControle) {
        if (variavelControle == vet.length)
            return -1;
        if(vet[variavelControle] == objetivo)
            return variavelControle;
        return buscaRecursiva(vet, objetivo, variavelControle + 1);
    }

    static void exibeResultado(int posicao, int objetivo) {
        if (posicao >= 0)
            System.out.println("\nValor " + objetivo + " encontrado na " + (posicao + 1) + "° posição do vetor");
        else
            System.out.println("\nValor " + objetivo + " não encontrado");
    }
}
