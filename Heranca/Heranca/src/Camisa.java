// Subclasse Camisa
class Camisa extends Produto {
    private String cor;
    private String tamanho;
    private String material;

    public Camisa(String nome, double preco, String cor, String tamanho, String material) {
        super(nome, preco); // Chama o construtor da classe base (Produto)
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método exibirInfo() da classe base (Produto)
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}