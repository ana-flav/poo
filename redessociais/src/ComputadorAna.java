public class ComputadorAna {
   public static void main(String[] args) {
        AplicativosMensagens msi = null;
        String escolhido = "msn";

        if(escolhido.equals(("msn")))
            msi = new MSNMessenger();
        else if (escolhido.equals("fbm"))
            msi = new FacebookMessenger();
        else if(escolhido.equals("tlg"))
            msi = new Telegram();
        msi.enviarMensagem();
        msi.receberMensagem();
    }
}
