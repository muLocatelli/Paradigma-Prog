public class tarefa2 {
     public static void main(String[] args) {
    
        String[] nomes = {"Murilin", "Murilo", "Locatelli", "Loloca"};

        System.out.println("Antes do loop:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i] + " [LINDAO]";
        }
        System.out.println("\ncomo eu sou pós loop:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
