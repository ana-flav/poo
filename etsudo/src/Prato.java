import java.sql.Date;
abstract class Prato {
    private Date dataValidade;
    private double preco;
    private double peso;

    public Prato(Date dataValidade, double peso) {
        this.dataValidade = dataValidade;
        this.peso = peso;
    }
    public Prato(){}

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    abstract void calcularPreco();

    public String toString(){
        return "a data de validade do prato é:"+dataValidade+"seu preço é "+preco+"e seu peso é"+peso;

}


}
