package ZapZap;

import java.util.ArrayList;

public class Conversa {

    private String contato; // contato
    ArrayList<Mensagem> mensagens = new ArrayList<>();

    Conversa(String contato){

        this.contato = contato;
    }


    public void salvarMsg(Boolean status, String msg){
        Mensagem m = new Mensagem(status, msg);
        mensagens.add(m);

    }

    public void imprimirConversa(){
        for(Mensagem j: mensagens){
            System.out.println(j.imprimir());
        }
    }

}
