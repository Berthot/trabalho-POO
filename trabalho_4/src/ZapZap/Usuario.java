package ZapZap;

import java.util.ArrayList;

public class Usuario {
    private String nome; // propio usuario
    ArrayList<Conversa> conversas = new ArrayList<>();

    Usuario(String nome){
        this.nome = nome;
    }


    public void enviarMsg(Usuario contato, String msg){
        Conversa x = new Conversa(contato.getNome());
        x.salvarMsg(true,this.nome + ": " + msg);
        conversas.add(x);
        contato.receberMsg(contato,contato.getNome() + ": " + msg);

    }

    public void receberMsg(Usuario remetente, String msg){
        Conversa x = new Conversa(remetente.getNome());
        x.salvarMsg(false,msg);
        conversas.add(x);
    }


    public boolean msgEmpty(){
        return conversas.isEmpty();
    }


    public String getNome(){
        return this.nome;
    }

    public void imprimir(){
        for(Conversa x: conversas){
            x.imprimirConversa();
        }
    }

}
