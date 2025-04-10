public class Retangulo {
    // atributos
    // valor inicial 0, false ou null
    double largura;
    double altura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return altura * 2 +  largura * 2;
    }

    public boolean isQuadrado(){
        return altura == largura;
    }

    public void imprimir(){
        System.out.println("----");
        System.out.println("Altura = "+altura);
        System.out.println("Largura = "+largura);
        System.out.println("Area = "+ area());
        System.out.println("Perimetro = "+ perimetro());
        System.out.println("É Quadrado? = "+ isQuadrado());
    }


}
