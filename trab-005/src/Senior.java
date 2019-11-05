public class Senior extends Profissional {
    private double premio;

    Senior(String nome, int score, double capital, double premio) {
        super(nome, score, capital);
        this.premio = premio;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println(premio);
    }

    void ganhar(int p){
        super.ganhar(p);
        premio += (Math.abs(p) * 2);

    }

    void perder(int p){
        super.perder(p);
        premio -= (Math.abs(p) / 2.0);

    }
}
