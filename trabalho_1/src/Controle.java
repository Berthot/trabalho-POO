

public class Controle {


    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        System.out.println(s.MostraCor());

        for (int i = 0; i < 10; i++){
            s.MudaProximaCor();
            System.out.println(s.MostraCor());
        }

        s.MudaCorFixa(Semaforo.AMARELO);
        System.out.println(s.MostraCor());
    }


}
