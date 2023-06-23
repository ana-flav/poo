package area;

public class Circulo implements AreaCalculavel{
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
       double resultado = Math.pow(getRaio(), 2)*3.14;
       return resultado;
    }
    
}
