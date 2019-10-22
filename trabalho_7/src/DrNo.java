public class DrNo  extends Terrorista {

    public void correr(float x, float y) {
        super.posicao_x += x;
        super.posicao_y += y;
        System.out.println("DrNo correndo");
    }

    public void atirar() {
        System.out.println("DrNo atirando...");
    }

    public void saltar(float z) {
        super.posicao_z = z;
        System.out.println("DrNo saltando");
    }
}
