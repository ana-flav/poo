
public class SistemaIbge {
    public static void  main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + "-"+ e.getNome());
        }
        EstadoBrasileiro ufSelecionada = EstadoBrasileiro.SAO_PAULO;
        System.out.println(ufSelecionada.getCodIbge());

        EstadoBrasileiro ufMaranha = EstadoBrasileiro.MARANHAO;
        System.out.println(ufMaranha.getSiglaMaiusculo());
    }
 
}
