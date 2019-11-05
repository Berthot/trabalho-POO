public class JamesBond  extends Heroi {

    public void atirar() {
        System.out.println("JamesBond atirando...");
    }

    public void saltar(float z) {
        super.posicao_z += z;
        System.out.println("JamesBond saltando");
    }
}
