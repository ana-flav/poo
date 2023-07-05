package problem2;

import java.util.ArrayList;

public class ProdutoFabricado implements IProdutoFabricado{
    private  String nome;
    private float custo;
    private int numeroIngredientes;
    private IProduto [] ingredientes;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto() {
        float custo = 0;
        for(int h=0; h<this.numeroIngredientes; h++){
            System.out.println(this.getIngrediente(h).getNome());
            System.out.println(this.getIngrediente(h).getCusto());
          
            custo = custo + this.getIngrediente(h).getCusto();
        }
        this.custo = custo;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
        this.ingredientes = new IProduto[numeroIngredientes];
    }

    public void setIngredientes(int numero, IProduto c) {
        this.ingredientes[numero] = c;
    }

    public ProdutoFabricado(String nome) {
        this.nome = nome;
      
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getCusto() {
        setCusto();
        return this.custo;
    }

    @Override
    public int getNumeroIngredientes() {

        return numeroIngredientes;
    }

    @Override
    public IProduto getIngrediente(int numero) {
        return this.ingredientes[numero];
    }
    
}
