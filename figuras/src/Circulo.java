public class Circulo extends Figura{
    private double raio;

    public Circulo (double raio, String cor){
        super(cor);
        this.raio = raio;
      
    }
    public void setRaio(Double raio){
        this.raio = raio;

    }
    public double getRaio(){
        return raio;
    }
    public double area(){
        double area_circulo = (raio*raio)*2.14;
        return area_circulo; 
    }

    public double getDiamentro(){
        double area_circulo = 2*3.14*raio;
        return area_circulo;
    }
    public String toString(){
        return " a cor: " + getCor() + "a area: " + area() + "o diametro: " + getDiamentro() + " o raio: " + getRaio();

    }
}
