public class Main {
public static void main ( String args []) {
        Retangulo r = new Retangulo () ;
        r.altura = 10; // alteracao do valor do atributo
        r.largura = 50;
        System.out.println("Altura = "+r.altura);
        System.out.println("Largura = "+r.largura);
        // executar uma acao do objeto
        System.out.println("Area = "+r.obterArea());
        System.out.println("Perímetro = "+r.perimetro());
        }
}
