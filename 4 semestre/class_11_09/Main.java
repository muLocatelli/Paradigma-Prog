public class Main {
    public static void main(String[] args) {
        // Objeto do tipo Personagem (pai)
        Personagem p = new Personagem("Aventureiro", 100);

        // Objetos do tipo Guerreiro e Mago (filhos)
        Guerreiro g = new Guerreiro("Arthas", 120);
        Mago m = new Mago("Merlin", 80);

        // Chamadas dos métodos
        System.out.println("Chamadas do método atacar():");
        p.atacar();  // método do pai
        g.atacar();  // método sobrescrito no filho
        m.atacar();  // método sobrescrito no filho
    }
}
