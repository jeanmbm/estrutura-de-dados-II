// JEAN MOREIRA BORGES DE MORAIS - 20201043021

package Pesquisa;

public class BuscaSequencial {
    public static void main(String[] args) {
        int[] vet = new int[] {1, 14, 18, 2, 4, 5, 9, 20, 19, 3, 8, 11, 16, 15 ,12, 13, 10, 6, 7, 17};

        int objetivo = 4;
        busca(vet, objetivo);

        objetivo = 22;
        busca(vet, objetivo);

        objetivo = 13;
        busca(vet, objetivo);

        objetivo = 35;
        busca(vet, objetivo);
    }

    static void busca(int[] vet, int objetivo) {
        int count;

        for(count = 0; count < vet.length; count++) {
            if (vet[count] == objetivo) {
                System.out.println("\nValor " + objetivo + " encontrado na " + (count + 1) + "° posição do vetor");
                break;
            }
        }

        if(count >= vet.length)
            System.out.println("\nValor " + objetivo + " não encontrado");
    }
}
