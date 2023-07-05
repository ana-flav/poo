package problem2;

public interface IProdutoFabricado extends IProduto {
    int getNumeroIngredientes();
    IProduto getIngrediente(int numero);
    void setNumeroIngredientes(int length);
}
