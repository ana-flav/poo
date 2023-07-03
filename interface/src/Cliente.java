import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ContaCorrente cc;
    private SeguroDeVidaa sg;
    private ArrayList<Tributavel> tc= new ArrayList<Tributavel>();

    public ArrayList<Tributavel> getTc() {
        return tc;
    }
    public void setTc(ArrayList<Tributavel> tc) {
        this.tc = tc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ContaCorrente getCc() {
        return cc;
    }
    public void setCc(ContaCorrente cc) {
        this.cc = cc;
        tc.add(cc);
    }
    public SeguroDeVidaa getSg() {
        return sg;
    }
    public void setSg(SeguroDeVidaa sg) {
        this.sg = sg;
         tc.add(sg);
        
    }
    public Cliente(String nome){
        this.nome = nome;
    }
    public Cliente(String nome, ContaCorrente cc, SeguroDeVidaa sg){
        this.nome = nome;
        this.cc = cc;
        this.sg = sg;
        tc.add(cc);
        tc.add(sg);
    }


}
