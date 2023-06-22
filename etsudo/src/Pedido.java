import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Pedido {
    private String nomeCliente;
    private double taxadeServico;
    private double valorTotal;
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setItensConsumidos(ArrayList<Prato> itensConsumidos) {
        this.itensConsumidos = itensConsumidos;
    }

    ArrayList <Prato> itensConsumidos= new ArrayList<Prato>();
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getTaxadeServico() {
        return taxadeServico;
    }
    public void setTaxadeServico(double taxadeServico) {
        this.taxadeServico = taxadeServico;
    }
    public ArrayList<Prato> getItensConsumidos() {
        return itensConsumidos;
    }
    public void setItensConsumidos(Prato prato, int index) {
       itensConsumidos.add(index, prato);
    }
    public Pedido(){}
    public Pedido(String nomeCliente, double taxadeServico, ArrayList<Prato> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.taxadeServico = taxadeServico;
        this.itensConsumidos = itensConsumidos;
    }

    public void valorTotal(){
        for(Prato p : itensConsumidos){
                System.out.println(""+p.getPreco());
                valorTotal = valorTotal + p.getPreco();
            }
            setValorTotal(valorTotal);
        }
    

  public void imprimirFatura() {
    valorTotal();
    
    int qtd_pizza = 0;
    int qtd_lanche = 0;
    int qtd_salga = 0;
    System.out.println("\n-------------- FATURA ----------\n");
    for (Prato p : itensConsumidos) {
        if (p instanceof Pizza) {
            qtd_pizza++;
            
        } else if (p instanceof Lanche) {
            qtd_lanche++;
        } else if (p instanceof Salgadinho) {
            qtd_salga++;
        }
    }
    System.out.println("Quantidade de pizzas: " + qtd_pizza);
    System.out.println("Quantidade de lanches: " + qtd_lanche);
    System.out.println("Quantidade de salgados: " + qtd_salga);
    System.out.println("Total: "+ getValorTotal());
    System.out.println("Esse é troco "+troco());
}

public double troco(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual foi o valor recebido em dinheiro?");
    double dinheiro = sc.nextDouble();

    double troco = Math.abs(getValorTotal() - dinheiro);
    sc.close();
    return troco;
}
}




