import java.util.Scanner;

abstract class Personagem {
    static boolean vivo;
    protected float posicao_x = 0;
    protected float posicao_y = 0;
    protected float posicao_z = 0;
    protected int cor;

    public abstract void correr(float x, float y);

    public abstract void saltar(float z);

    public abstract void atirar();

    public void morrer(){
        vivo = false;
        System.out.println("Morto");
    }
}
