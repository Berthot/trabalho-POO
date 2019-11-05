public class Principiante extends Jogador {
    private double bonus;

    Principiante(String nome, int score, double bonus){
        super(nome, score);
        this.bonus = bonus;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println(bonus);
    }

    void ganhar(int p){
        super.score += Math.abs(p);
        bonus += (Math.abs(p) * 0.1);

    }

    void perder(int p){
        super.score -= Math.abs(p);
        bonus -= (Math.abs(p) * 0.1);

    }


}
