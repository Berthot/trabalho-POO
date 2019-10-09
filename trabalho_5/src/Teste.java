public class Teste {
    public static void main(String[] args) {
        Principiante principiante = new Principiante("Principiante",100, 52);
        principiante.ganhar(50);
        principiante.imprimir();
        principiante.perder(50);
        principiante.imprimir();
        Profissional profissional = new Profissional("profissional",100, 52);
        profissional.ganhar(50);
        profissional.imprimir();
        profissional.perder(50);
        profissional.imprimir();
        Senior senior = new Senior("senior",100,52,15);
        senior.ganhar(50);
        senior.imprimir();
        senior.perder(50);
        senior.imprimir();




    }
}
