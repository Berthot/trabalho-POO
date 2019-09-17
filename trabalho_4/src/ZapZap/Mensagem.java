package ZapZap;


public class Mensagem {
    private String texto;
    private Boolean enviado;

    final Boolean ENVIADO = true;
    final Boolean RECEBIDO = false;

    Mensagem(Boolean enviado, String texto){
        this.enviado = enviado;
        this.texto = texto;
    }

    public void imprimir(){
        System.out.println();
    }

}
