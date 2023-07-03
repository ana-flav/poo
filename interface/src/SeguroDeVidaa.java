public class SeguroDeVidaa implements Tributavel{
    
    private String nome;
    public SeguroDeVidaa(String nome){
        this.nome = nome;
    }
    public SeguroDeVidaa() {
    }
    @Override
    public double calcularTributos() {
        return 42.0;
    
    }
}