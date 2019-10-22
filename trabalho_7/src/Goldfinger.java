public class Goldfinger extends Terrorista implements Personificacao {

    private Heroi heroi;

    public void personificar(Heroi h) {
        System.out.println("Goldfinger personificando");
        heroi = h;
    }

    public void camuflador(int cor) {
        super.cor = cor;
        System.out.println("Goldfinger camuflando");
    }

    public void saltar(float z) {
        super.posicao_z += z;
        System.out.println("Goldfinger saltando");
    }
}
