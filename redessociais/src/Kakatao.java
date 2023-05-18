public class Kakatao extends AplicativosMensagens{
    @Override
    public void enviarMensagem(){
        System.out.println("enviando mensagem Whatsapp");
    }
    
    @Override
    public void receberMensagem(){
        System.out.println("recebendo mensagem");
    }
}