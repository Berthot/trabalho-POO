public class Banco {
    public static void main(String[] args) {

        ContaCorrente j = new ContaCorrente(84037, 2500);
        Cliente jandira = new Cliente("Jandira");
        jandira.ligar_conta_corrente(j);

        ContaCorrente s = new ContaCorrente(70662, 1800);
        Cliente sandra_rod = new Cliente("Sandra");
        sandra_rod.ligar_conta_corrente(s);

        ContaCorrente l = new ContaCorrente(20718, 5000);
        Cliente luciana_tei = new Cliente("Luciana");
        luciana_tei.ligar_conta_corrente(l);

        System.out.println("-------------------------------------------");
        jandira.imprimir_dados();
        sandra_rod.imprimir_dados();
        luciana_tei.imprimir_dados();

        jandira.retirar_valor(1000);
        jandira.imprimir_dados();

        sandra_rod.retirar_valor(2000);
        sandra_rod.depositar_valor(500);
        sandra_rod.imprimir_dados();

        luciana_tei.depositar_valor(1000);
        luciana_tei.imprimir_dados();



    }

}
