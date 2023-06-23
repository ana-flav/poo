package area;

public class Retangulo implements AreaCalculavel{
    private double base;
    private double altura;
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calculaArea() {
       double resultado = getAltura()*getBase();
       return resultado;
    }
    
}
