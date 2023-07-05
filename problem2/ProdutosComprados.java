package problem2;

public class ProdutosComprados implements IProduto{
    private String nome;
    private float custo;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getCusto() {
        return custo;
    }
    public ProdutosComprados(String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }

}
