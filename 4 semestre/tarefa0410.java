// ===============================================
// Atividade de Paradigmas 04/10 - Vetores e Ordenação
// Jogadores do VCT Americas 
// ===============================================

public class tarefa0410 {
    public static void main(String[] args) {
        // ========================
        // Vetores 
        // ========================

        String[] loud = {"pANcada", "dgzin", "cauanzin", "tuyz", "v1nny"};

        String[] furia = {"heat", "basic", "Palla", "Urango", "tuyz"};

        String[] mibr = {"artzin", "xenom", "cortezia", "aspas", "Verno"};

        System.out.println("=== LOUD - Bubble Sort ===");
        System.out.println("Antes da ordenação:");
        imprimirVetor(loud); 
        bubbleSort(loud);    
        System.out.println("Depois da ordenação:");
        imprimirVetor(loud); 
        System.out.println();


        System.out.println("=== FURIA - Insertion Sort ===");
        System.out.println("Antes da ordenação:");
        imprimirVetor(furia);
        insertionSort(furia);
        System.out.println("Depois da ordenação:");
        imprimirVetor(furia);
        System.out.println();


        System.out.println("=== MIBR - Selection Sort ===");
        System.out.println("Antes da ordenação:");
        imprimirVetor(mibr);
        selectionSort(mibr);
        System.out.println("Depois da ordenação:");
        imprimirVetor(mibr);
        System.out.println();
    }

    public static void imprimirVetor(String[] vetor) {
        for (String nome : vetor) {
            System.out.print(nome + "  ");
        }
        System.out.println("\n");
    }

    
    public static void bubbleSort(String[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[j + 1]) > 0) {
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }


    public static void insertionSort(String[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            String chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j].compareToIgnoreCase(chave) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }


    public static void selectionSort(String[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndice = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[menorIndice]) < 0) {
                    menorIndice = j;
                }
            }

            String temp = vetor[i];
            vetor[i] = vetor[menorIndice];
            vetor[menorIndice] = temp;
        }
    }
}
