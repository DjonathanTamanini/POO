// Classe principal para testar o sistema
public class Loja {
    public static void main(String[] args) {
        System.out.println("--- Detalhes do Livro ---");
        Livro meuLivro = new Livro("A Arte do Insulto", 75.50, "Léo Lins", 240, true); // Chama o construtor Livro para criar objeto meuLivro
        meuLivro.exibirInfo();

        System.out.println("\n--- Detalhes da Camisa ---");
        Camisa minhaCamisa = new Camisa("Camiseta Raul Seixas", 49.99, "Preta", "G", "Algodão");
        minhaCamisa.exibirInfo();

        System.out.println("\n--- Produto genérico ---");
        Produto produtoGenerico = new Produto("Mousepad Ergonômico", 29.90);
        produtoGenerico.exibirInfo();
    }
}