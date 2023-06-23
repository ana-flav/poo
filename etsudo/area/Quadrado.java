package area;

public class Quadrado implements AreaCalculavel {
    private double lado;
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calculaArea() {
        double resultado = getLado()*getLado();
        return resultado;
    }
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
}
