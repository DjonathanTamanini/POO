import java.util.Scanner;

public class Main {
    // main
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = leitor.nextInt();
        if (x > 0){
            System.out.println("X é positivo!");
        }else if(x < 0){
            System.out.println("X é negativo!");
        }else{
            System.out.println("X é zero!");
        }

    }
}