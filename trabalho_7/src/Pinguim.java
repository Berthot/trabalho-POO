public class Pinguim  extends Ladrao {

    public void atirar() {
        System.out.println("Pinguim atirando...");
    }

    public void correr(float x, float y) {
        super.posicao_x += x;
        super.posicao_y += y;
        System.out.println("Pinguim correndo");
    }
}
