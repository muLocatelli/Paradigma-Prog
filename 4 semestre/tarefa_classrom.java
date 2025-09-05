public class tarefa_classrom {
    private String nome;
    private int idade;
    private double altura;

   
    public tarefa_classrom(String nome, int idade, double altura) {
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
        tarefa_classrom pessoa = new tarefa_classrom("Ana", 25, 1.68);
        pessoa.exibirInfo();

        pessoa.setNome("Carlos");
        pessoa.setIdade(30);
        pessoa.setAltura(1.75);

        System.out.println("\nDepois da alteração:");
        pessoa.exibirInfo();
    }
}
