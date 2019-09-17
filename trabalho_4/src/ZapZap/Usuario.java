package ZapZap;

import java.util.ArrayList;

public class Usuario {
    private String nome; // propio usuario
    ArrayList<Conversa> conversas = new ArrayList<>();
    ArrayList<Usuario> amigos = new ArrayList<>();

    Usuario(String nome){
        this.nome = nome;
    }

    public void iniciar_conversa(Conversa contato){

    }

    public void enviar_msg(Conversa contato, String texto){
        contato.envio();

    }

    public void receber_msg(Conversa remetente, Mensagem msg){

    }

    public void imprimir_msg(Conversa contato){
        // imprimir da conversa
    }

    public void add_user(Usuario user){
        amigos.add(user);

    }

    public String getName(){
        return this.nome;
    }
}
