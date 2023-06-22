import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class App_Lanchonete {
    public static void main(String[] args) {
        int index = 0;
        int flag = 0;
        ArrayList <Pizza> pizzas = new ArrayList<Pizza>();
        ArrayList <Salgadinho> salgados = new ArrayList<Salgadinho>();
        ArrayList <Lanche> lanches = new ArrayList<Lanche>();
        Pedido pedido = new Pedido();
        Scanner sc = new Scanner(System.in);

        System.out.println("Você gostaria de fazer um pedido? Aqui esta nosso cardapio.");
        while(flag!=-1){
            
            cardapio();
            System.out.println("Qual tipo de prato vc irá pedir?");
            String tipo = sc.nextLine();
            

            tipo.toLowerCase();
            if(tipo.equals("pizza")){
                System.out.println("Qual é o molho que vc deseja?");
                String molho = sc.nextLine();

                System.out.println("Qual é o recheio que vc deseja?");
                String recheio = sc.nextLine();

                System.out.println("com borda ou sem borda?");
                String borda = sc.nextLine();

                Pizza p = new Pizza(Date.valueOf("2023-06-22"), 1.0, molho, recheio, borda);
                pizzas.add(p);

            }else{
                if(tipo.equals("lanche")){
                    System.out.println("Qual é o molho que vc deseja?");
                    String molho = sc.nextLine();

                    System.out.println("Qual é o recheio que vc deseja?");
                    String recheio = sc.nextLine();

                    System.out.println("pao?");
                    String pao = sc.nextLine();

                    Lanche l = new Lanche(molho, recheio, pao, Date.valueOf("2023-06-22"), 1.0);
                    lanches.add(l);
                }else{
                    if(tipo.equals("salgado")){
                        System.out.println("Qual é o molho que vc deseja?");
                        String molho = sc.nextLine();

                        System.out.println("Qual é o recheio que vc deseja?");
                        String recheio = sc.nextLine();

                        System.out.println("tipo?");
                        String tipoSalgado = sc.nextLine();

                        Salgadinho s = new Salgadinho(molho, recheio, tipoSalgado, Date.valueOf("2023-06-22"), 1.0);
                        salgados.add(s);

                    }else{
                        System.out.println("Não existe esse tipo, certifique de que você escolheu entre pizza, lanche ou salgadinho");
                    }
                }
            }
             System.out.println("vc quer fazer:");
             flag = sc.nextInt();
             sc.nextLine();
             tipo = "";
        }

        for(Pizza p: pizzas){
            System.out.println(""+p.getBorda());
            pedido.setItensConsumidos(p, index);
            System.out.println(""+p.getPreco());
            index++;
        }

        for(Salgadinho s: salgados){
            System.out.println(""+s.getPreco());
            pedido.setItensConsumidos(s, index);
            index++;
        }

        for(Lanche l: lanches){
            pedido.setItensConsumidos(l, index);
            index++;
        }
       pedido.imprimirFatura();
    }



    public static void cardapio(){
        System.out.println("----PIZZA----");
        System.out.println("MOLHO:\n- tomate\n-molho de queijo");
        System.out.println("RECHEIO:\n- carne de sol com queijo\n- presunto e queijo");
        System.out.println("BORDA:\n- com borda\n- sem borda");

        System.out.println("-----SALGADINHO-----");
        System.out.println("MOLHO:\n- tomate\n-molho de queijo");
        System.out.println("RECHEIO:\n- frango\n- carne");
        System.out.println("TIPO:\n- frito\n- assado");

        System.out.println("-----LANCHE-----");
        System.out.println("MOLHO:\n- tomate\n-molho de queijo");
        System.out.println("RECHEIO:\n- frango\n- carne");
        System.out.println("PAO:\n- italiano\n- francês");
    }
}
