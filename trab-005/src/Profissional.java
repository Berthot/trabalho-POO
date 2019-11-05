public class Profissional extends Jogador{
    private double capital;


    Profissional(String nome, int score, double capital) {
        super(nome, score);
        this.capital = capital;
    }

    @Override
    void imprimir(){
        super.imprimir();
        System.out.println(capital);
    }

    void ganhar(int p){
        super.score += Math.abs(p);
        capital += (Math.abs(p) * 4);

    }

    void perder(int p){
        super.score -= Math.abs(p);
        capital -= (Math.abs(p) * 4);

    }
}
