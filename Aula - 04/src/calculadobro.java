// Exercício 01

import java.util.Scanner;

public class calculadobro {
    // Método para calcular o dobro do número
    public static int dobrarNumero(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        // Cria o leitor de teclado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Que número você gostaria de saber o dobro?");
        // Todos os caracteres digitados até pressionar ENTER serão capturados
        // e salvos na variavel numero
        int numero = leitor.nextInt();
        // Testando o método
        // int numero = 5;  // Usado quando é um número fixo
        int resultado = calculadobro.dobrarNumero(numero);

        System.out.println("O dobro do número " + numero + " é " + resultado + "!");
    }
}
