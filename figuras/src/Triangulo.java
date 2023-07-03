public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo (double base, double altura, String cor){
        super(cor);
        this.base=base;
        this.altura = altura;

    }
    public double area(){
        double area_triangulo = 0;
        area_triangulo = (this.base * this.altura)/2;
        return area_triangulo;
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public String toString(){
        return " a cor: " + getCor() + "a area: " + area() + "a altura: " + getAltura() + " a base: " + getBase();
    }

}
