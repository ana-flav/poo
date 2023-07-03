
public class ContaCorrente extends Conta implements Tributavel{
    private String nome;
    

    public String getNome() {
        return nome;
    }



    public ContaCorrente(String nome) {
        this.nome = nome;
    }


    public ContaCorrente() {
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public double calcularTributos() {
      double impostos;
      impostos = super.getSaldo()*0.01;
      return impostos;
    }


    
}


