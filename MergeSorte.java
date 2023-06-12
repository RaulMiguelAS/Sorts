public class MergeSort {

    // função principal que ordena vetor[inicio....fim] usando
    // merge()
    public void mergeSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            
            // Achando o ponto do meio, evitando overflown do java.
            int pontoMeio = inicio + (fim - inicio) / 2;

            // Ordenando as duas metades
            mergeSort(vetor, inicio, pontoMeio);
            mergeSort(vetor, pontoMeio + 1, fim);

            // Faz o merge dos arrays ordenados
            merge(vetor, inicio, pontoMeio, fim);

        }

    }

    // Faz o merge de dois sub-arrays do vetor[]
    // O primeiro sub-array vai do inicio ate o ponto medio
    // O segundo vai do meio + 1 ate o fim
    private void merge(int[] array, int inicio, int pontoMeio, int fim) {

        // Define o tamanho de dois sub-arrays a serem unidos
        int leftSize = pontoMeio - inicio + 1;
        int rigthSize = fim - pontoMeio;

        // Cria os arrays auxiliares
        int[] subLeft = new int[leftSize];
        int[] subRigth = new int[rigthSize];

        // Copia os dados nos arrays auxiliares
        for (int i = 0; i < leftSize; ++i) {
            subLeft[i] = array[inicio + i];

        }

        for (int j = 0; j < rigthSize; ++j) {
            subRigth[j] = array[pontoMeio + 1 + j];

        }

        // Faz o merge dos arrays temporarios

        // indices iniciais dos dois sub-arrays
        int topLeft = 0;
        int topRigth = 0;

        // indice inical do subarray unificado
        int k = inicio;
        while (topLeft < leftSize && topRigth < rigthSize) {

            if (subLeft[topLeft] <= subRigth[topRigth]) {
                array[k] = subLeft[topLeft];
                topLeft++;

            } else {
                array[k] = subRigth[topRigth];
                topRigth++;

            }
            k++;
        }

        // se houver, cópia os elementos restantes do sub-array da esquerda
        while (topLeft < leftSize) {
            array[k] = subLeft[topLeft];
            topLeft++;
            k++;

        }

        // se houver, cópia os elementos restantes do sub-array da direita
        while (topRigth < rigthSize) {
            array[k] = subRigth[topRigth];
            topRigth++;
            k++;

        }
        System.out.println("Estado atual do array:");
        printArray(array);
    }

    //Funcao auxiliar para imprimir o array
    public void printArray(int[] vetor) {

        System.out.print("[");
        for (int i = 0; i < vetor.length; ++i) {

            if (i == vetor.length - 1) {
                System.out.print(vetor[i]);

            } 
            else {
                System.out.print(vetor[i] + ", ");
            }

        }
        System.out.print("]");
        System.out.println();
    }

}
