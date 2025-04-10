import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeVotacao {
    ArrayList<Candidato> candidatos = new ArrayList<>();
    int votosNulos;

    /**
     * Método para cadastrar os candidatos.
     * @param quantidade Quantidade de candidatos.
     */
    void cadastrarCandidatos(int quantidade) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nDigite o nome do candidato " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o número do candidato " + (i + 1) + ":");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Candidato novo = new Candidato(nome, numero);
            candidatos.add(novo);
        }

        votosNulos = 0; // Inicializa os votos nulos
    }

    /**
     * Método para registrar um voto.
     * @param numero Número do candidato votado.
     */
    void votar(int numero) {
        boolean encontrou = false;

        for (Candidato c : candidatos) {
            if (c.numero == numero) {
                c.votos++;
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            votosNulos++;
        }
    }

    /**
     * Método para mostrar o resultado da votação.
     */
    void mostrarResultados() {
        System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");

        // Mostra votos de cada candidato
        for (Candidato c : candidatos) {
            System.out.println(c.nome + " (" + c.numero + "): " + c.votos + " votos");
        }

        // Mostra votos nulos
        System.out.println("Votos nulos: " + votosNulos);

        // Descobre o vencedor
        Candidato vencedor = candidatos.get(0);
        for (Candidato c : candidatos) {
            if (c.votos > vencedor.votos) {
                vencedor = c;
            }
        }
        System.out.println("\nVENCEDOR: " + vencedor.nome + " com " + vencedor.votos + " votos!");
    }
}
