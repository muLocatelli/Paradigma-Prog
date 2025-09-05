public public class tarefa_classrom {
    private String nome;
    private int idade;
    private double altura;

    public tarefaclassrom(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    
    public static void main(String[] args) {
        tarefaclassrom p1 = new tarefaclassrom("Murilo L", 20, 1.98);

    
        p1.exibirInfo();

    
        p1.setNome("Locatelli");
        p1.setIdade(19);
        p1.setAltura(1.75);

        System.out.println("\nDepois das alterações:");
        p1.exibirInfo();
    }
}
 {
    
}
