public class EquipamentoCorrigido extends Equipamento
{
    int [] mesCompra; //Armazena mês de compra de cada equipamento [1-12]
    int mesCorrente;
    
    public EquipamentoCorrigido(int numeroTotal, int mesCorrente)
    {
        super(numeroTotal);
        this.mesCompra = new int[numeroTotal];
        this.mesCorrente = mesCorrente;
    }
    
    public int getMesCompra(int numero) {
        return this.mesCompra[numero];
    }
    
    public void setMesCompra(int numero, int mes) {
        this.mesCompra[numero] = mes;
    }
    
    public void corrige(int percentual) {
        for (int i = 0; i < this.getNumeroEquipamento(); i++) {
            int corrigido = getValor(i);
            if (this.mesCompra[i] == this.mesCorrente)
            {
                corrigido *= percentual/100;
                setValor(i, corrigido);
            }
        }
        this.mesCorrente++;
    }
    
    public int getMesCorrente(){
        return this.mesCorrente;
    }
    
    public void setMesCorrente(int mes){
        this.mesCorrente = mes;
    }
    
    public void substitui(EquipamentoCorrigido ec) {
        
        if (this.getNumeroEquipamento() == ec.getNumeroEquipamento()){
            for (int i = 0; i < this.getNumeroEquipamento(); i++) {
                this.setMesCompra(i, ec.getMesCompra(i));
                this.setValor(i, ec.getValor(i));
                this.setMesCorrente(ec.getMesCorrente());
            }
        }    
    }
}
