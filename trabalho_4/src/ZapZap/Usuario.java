package ZapZap;

import java.util.ArrayList;

public class Usuario {
    private String nome; // propio usuario
    ArrayList<Conversa> conversas = new ArrayList<>();

    Usuario(String nome){
        this.nome = nome;
    }


    public void enviarMsg(Usuario contato, String msg){
        Conversa x = new Conversa(contato.getName());
        x.salvarMsg(true,msg);
        conversas.add(x);
        contato.receberMsg(contato,contato.getName() + ": " + msg);

    }

    public void receberMsg(Usuario remetente, String msg){
        Conversa x = new Conversa(remetente.getName());
        x.salvarMsg(false,msg);
        conversas.add(x);
    }


    public boolean msgEmpty(){
        return conversas.isEmpty();
    }


    public String getName(){
        return this.nome;
    }

    public void imprimir(){
        for(Conversa x: conversas){
            x.imprimirConversa();
        }
    }

}
