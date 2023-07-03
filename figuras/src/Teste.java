public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(15, 15, "rosa");
        Triangulo triangulo = new Triangulo(10, 2, "verde");
        Circulo circulo = new Circulo(2, "azul");
        Retangulo retangulo = new Retangulo(2, 2, "preto");

        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
        
       
    }
}
