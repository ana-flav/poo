public class Quadrado extends Retangulo {
    public Quadrado (double lado2, double lado1, String cor){
        super(lado1, lado2, cor);
    }
 
    public String toString(){
        return " a cor: " + getCor() + "a area: " + area() + "o lado 1: " + getLado1() + " o lado 2: " + getLado2();

    }
}
