public abstract class Figura {
    private String cor;

    public Figura(String cor){
        super();
        this.cor = cor; 
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

}
