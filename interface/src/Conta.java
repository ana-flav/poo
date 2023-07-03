abstract class Conta {
    private double saldo;
    private int agencia;
    private int numeroConta;
    private String nomeBanco;
    



    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double sacar(double valor){
        this.saldo = this.saldo - valor;
        
        return valor;
    }

    public void depositar (double valor) {
        this.saldo += valor;
    }
    




}
