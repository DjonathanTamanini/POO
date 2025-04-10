import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SistemaDeVotacao sistema = new SistemaDeVotacao();

        // Solicitar a quantidade de candidatos
        System.out.println("Digite a quantidade de candidatos:");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Cadastrar os candidatos
        sistema.cadastrarCandidatos(quantidade);

        // Registrar os votos
        System.out.println("\nDigite o número do candidato para votar (ou -1 para encerrar):");

        while (true) {
            int voto = scanner.nextInt();
            if (voto == -1) { // Condição para encerrar a votação
                break;
            }
            sistema.votar(voto);
        }

        // Mostrar resultados finais
        sistema.mostrarResultados();
    }
}
