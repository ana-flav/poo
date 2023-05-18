public abstract class AplicativosMensagens {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    private void validarConectadoInternet(){
        System.out.println("conectado na internet");
    }
    private void salvarHistoricoMnesagem(){
        System.out.println("Salvando Historico Mensagem");
    }
}
