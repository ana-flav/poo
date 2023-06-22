import java.sql.Date;

public class Salgadinho extends Prato {
    private String molho;
    private String recheio;
    private String tipo;
    public Salgadinho(){

    }
    public Salgadinho(String molho, String recheio, String tipo, Date dataValidade, double peso) {
        super(dataValidade, peso);
        this.molho = molho;
        this.recheio = recheio;
        this.tipo = tipo;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

        if(this.tipo.equals("frito")){
            preco = preco + 5;
        }else{
            if(this.tipo.equals("assado")){
                preco = preco + 10;
                
            }
        }
        // Opção de borda
        if(this.recheio.equals("frango")){
            preco = preco + 15;
        }else{
            if(this.recheio.equals("carne")){
                preco = preco + 10;
            }
        }
        super.setPreco(preco);
    }
        
    }



