// Subclasse Livro
class Livro extends Produto {
    private String autor;
    private int numeroPaginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int numeroPaginas, boolean capaDura) {
        super(nome, preco); // Chama o construtor da classe base (Produto)
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método exibirInfo() da classe base (Produto)
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Capa Dura: " + (capaDura ? "Sim" : "Não"));
    }
}