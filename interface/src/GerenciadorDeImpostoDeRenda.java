public class GerenciadorDeImpostoDeRenda {
    private double totalImposto;

    public void somarTributo(Tributavel tributo) {
        System.out.println(tributo.calcularTributos());
        this.totalImposto = totalImposto + tributo.calcularTributos();

   
    }

    public String toString() {
        return "Esse é o total de imposto: " + totalImposto;
    }
     public void limparTotalImposto() {
        this.totalImposto = 0;
    }
}