abstract class Heroi  extends Personagem {

    public void correr(float x, float y) {
        super.posicao_x += x;
        super.posicao_y += y;
        System.out.println("Heroi correndo");
    }

    public void saltar(float z) {
        super.posicao_z += z;
        System.out.println("Heroi saltando");
    }
}
