package ZapZap;


public class Mensagem {
    private String texto;
    private Boolean enviado;

    Mensagem(Boolean enviado, String texto){
        this.enviado = enviado;
        this.texto = texto;
    }

    public String imprimir(){
        if(enviado){
            return "ENVIADO: " + this.texto;
        }else{
            return "RECEBIDO " + this.texto;
        }
    }


}
