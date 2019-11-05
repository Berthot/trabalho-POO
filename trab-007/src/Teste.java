public class Teste {

    public static void main(String[] args) {
        System.out.println("\nBatman\n");
        Batman b = new Batman();
        b.atirar();
        b.camuflador(1);
        b.correr(2.0f,2.0f);
        b.morrer();
        b.saltar(2.0f);

        System.out.println("\nJamesBond\n");
        JamesBond j = new JamesBond();
        j.atirar();
        j.correr(2.0f,2.0f);
        j.morrer();
        j.saltar(2.0f);

        System.out.println("\nCoringa\n");
        Coringa c = new Coringa();
        c.atirar();
        c.correr(2.0f,2.0f);
        c.morrer();
        c.saltar(2.0f);

        System.out.println("\nPinguim\n");
        Pinguim p = new Pinguim();
        p.atirar();
        p.correr(2.0f,2.0f);
        p.morrer();
        p.saltar(2.0f);

        System.out.println("\nGoldfinger\n");
        Goldfinger g = new Goldfinger();
        g.atirar();
        g.correr(2.0f,2.0f);
        g.morrer();
        g.saltar(2.0f);
        g.camuflador(2);
        g.personificar(b);

        System.out.println("\nDrNo\n");
        DrNo d = new DrNo();
        d.atirar();
        d.correr(2.0f,2.0f);
        d.morrer();
        d.saltar(2.0f);
    }
}
