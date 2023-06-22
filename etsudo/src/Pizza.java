import java.sql.Date;

public class Pizza extends Prato {
    private String molho;
    private String recheio;
    private String borda;
  


    public Pizza(Date dataValidade, double peso, String molho, String recheio, String borda) {
        super(dataValidade, peso);
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
        calcularPreco();
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
    public String getBorda() {
        return borda;
    }
    public void setBorda(String borda) {
        this.borda = borda;
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

        if(this.borda.equals("sem borda")){
            preco = preco + 5;
        }else{
            if(this.borda.equals("com borda")){
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


    // public String toString(){

    // }
}
