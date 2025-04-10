public class Main {

    public static void main(String[] args) {
        // Criei um objeto do tipo retangulo.
        // new -> reserva um espaço na memória para o objeto
        // vai devolver o endereço de memória (referência)
        // Retangulo() -> método especial chamado construtor.
        // construtor padrão, gerado automaticamente.
        Retangulo r1 = new Retangulo();
        r1.imprimir();
        r1.altura = 10;
        r1.largura = 20;
        r1.imprimir();
        r1.altura = 99;
        r1.largura = 23;
        r1.imprimir();
        // Cada objeto tem o seu próprio espaço na memória.
        Retangulo r2 = new Retangulo();
        r2.altura = 34;
        r2.largura = 43;
        r2.imprimir();
        Retangulo r3 = new Retangulo();
        Retangulo r4 = new Retangulo();
    }

}
