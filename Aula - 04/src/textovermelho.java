// Exercício 02

public class textovermelho {
    public static void corVermelha(String texto) {
        System.out.println("\033[31m" + texto + "\033[0m");
    }

    public static void main(String[] args) {
        String mensagem = "Teste!";
        textovermelho.corVermelha(mensagem);
    }
}
