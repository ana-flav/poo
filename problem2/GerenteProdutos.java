package problem2;

public class GerenteProdutos {

    public static String [] ingredientes(String nome){
        nome.toLowerCase();
        String [] vetor;
        if(nome.equals("bota")){
            vetor = new String[]{"couro", "cola", "borracha"};
            return vetor;
        }else{
            if(nome.equals("sapato")){
                vetor = new String[]{"couro", "cola", "borracha", "linha", "agulha"};
                return vetor;
            }else{
                return null;
            }
        
        }
    
    }

    public static String valorDaCompra(){
       String [] ingredientes;
       ProdutoFabricado pf = new ProdutoFabricado("bota");
        ingredientes = ingredientes(pf.getNome());

        pf.setNumeroIngredientes(ingredientes.length);
        System.out.println(pf.getNumeroIngredientes());
        int j = 0;
        for(String i: ingredientes){

            i.toLowerCase();
            switch(i){
                case "couro":
                    IProduto p = new ProdutosComprados(i, (float) 2.55);
                    pf.setIngredientes(j, p);
                    break;
                case "borracha":
                    IProduto p1 = new ProdutosComprados(i, (float) 1.5);
                    pf.setIngredientes(j, p1);
                    break;
                case "cola":
                    IProduto p2 = new ProdutosComprados(i, (float) 0.5);
                    pf.setIngredientes(j, p2);
                    break;
                case "linha":
                    IProduto p3 = new ProdutosComprados(i, (float) 0.25);
                    pf.setIngredientes(j, p3);
                    break;
                case "agulha":
                    IProduto p4 = new ProdutosComprados(i, (float) 0.25);
                    pf.setIngredientes(j, p4);
                    break;
            }
            j++;
    }

    System.out.println(pf.getCusto());
    return "O nome desse produto é "+pf.getNome()+" o valor total é:"+pf.getCusto();
    }


// TODO: IMPLEMENTAR A PARTE 2 DA QUESTÃO
}
