public class Mago extends Personagem {
    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma bola de fogo!");
    }
}
