public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo",1),
    RIO_JANEIRO ("RJ", "Rio de Janeiro",2),
    PIAUI ("PI", "Piaui",3),
    MARANHAO ("ma", "Maranhão",4);

    private String nome;
    private String sigla;
    private int CodIbge;

    private EstadoBrasileiro(String sigla, String nome, int CodIbge){
        this.sigla = sigla;
        this.nome = nome;
        this.CodIbge = CodIbge;
    }
    public int getCodIbge(){
        return CodIbge;
    }
  
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    public String getSiglaMaiusculo(){
        return sigla.toUpperCase();
    }
}

