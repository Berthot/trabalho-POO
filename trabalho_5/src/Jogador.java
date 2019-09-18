public class Jogador {
    private String nome;
    protected int score;


    Jogador(String nome, int score){
        this.nome = nome;
        this.score = score;
    }


    void imprimir(){
        System.out.println(nome);
        System.out.println(score);
    }
}
