import java.sql.Date;

public class Lanche extends Prato {
    private String molho;
    private String recheio;
    private String pao;
  
    public Lanche(String molho, String recheio, String pao, Date dataValidade, double peso) {
        super(dataValidade, peso);
        this.molho = molho;
        this.recheio = recheio;
        this.pao = pao;
        calcularPreco();
    }
    public Lanche(){

    }
    public String getMolho() {
        return molho;
    }
    public void setMolho(String molho) {
        this.molho = molho;
    }
    public String getRecheio() {
        return recheio;
    }
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    public String getPao() {
        return pao;
    }
    public void setPao(String pao) {
        this.pao = pao;
    }

    public void calcularPreco(){
        double preco = 0.0;
        // Opção de molhos 
       if(this.molho.equals("tomate")){
        preco = preco + 2.5;
       }else{
        if(this.molho.equals("molho de queijo")){
        preco = preco + 3;
        }
       }

    // Opção de bordas

        if(this.pao.equals("italiano")){
            preco = preco + 5;
        }else{
            if(this.pao.equals("frances")){
                preco = preco + 10;
                
            }
        }
        // Opção de borda
        if(this.recheio.equals("carne de sol com queijo")){
            preco = preco + 15;
        }else{
            if(this.recheio.equals("presunto e queijo")){
                preco = preco + 10;
            }
        }
        super.setPreco(preco);
    }
    }

