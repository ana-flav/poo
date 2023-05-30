public class Equipamento {
    private int valor [];
    
    private int numeroEquipamento;

    public Equipamento(int numeroEquipamento){
        this.valor = new int[numeroEquipamento];
        this.numeroEquipamento = numeroEquipamento;
    }

    public int getValor(int numero) {
        return valor[numero];
    }

    public void setValor(int valor, int numero) {
        this.valor[numero] = valor;
    }

    public int getNumeroEquipamento() {
        return numeroEquipamento;
    }

    public void setNumeroEquipamento(int numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }

    
}