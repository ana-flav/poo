import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente("maria");
        ContaPoupanca cp = new ContaPoupanca();
        ArrayList<Tributavel> tributos = new ArrayList<Tributavel>();
        ArrayList<Tributavel> tc= new ArrayList<Tributavel>();
        cc.setAgencia(55);
        cc.setNomeBanco("caixa");
        cc.setNumeroConta(5698);

        cp.setAgencia(553);
        cp.setNomeBanco("bb");
        cp.setNumeroConta(569);
        cp.depositar(50);
        cc.depositar(100);
        System.out.println("Saldo inicial: " + cp.getSaldo());
        System.out.println("Saldo inicial: " + cc.getSaldo());

        cp.depositar(50);
        cc.depositar(100);

        System.out.println("Saldo deposito: " + cp.getSaldo());
        System.out.println("Saldo deposito: " + cc.getSaldo());

        SeguroDeVidaa sg = new SeguroDeVidaa("oopa");
        SeguroDeVidaa sg1 = new SeguroDeVidaa("mariaa");
        tributos.add(sg);
        tributos.add(cc);
        tributos.add(sg1);

        GerenciadorDeImpostoDeRenda gc = new GerenciadorDeImpostoDeRenda();
        for (Tributavel t : tributos) {
            gc.somarTributo(t);
            System.out.println(gc);
            gc.limparTotalImposto();
        
        }

        System.out.println("-----USANDO OUTRO METODO----");
        Cliente c = new Cliente("Larissa");
        ContaCorrente cc1 = new ContaCorrente();
        SeguroDeVidaa sg2 = new SeguroDeVidaa();
        c.setCc(cc1);
        c.setSg(sg2);
        cc1.depositar(100);

        for (Tributavel t1: c.getTc()){
            gc.somarTributo(t1);
     
        }

        System.out.println(gc);
        gc.limparTotalImposto();


    }


}
