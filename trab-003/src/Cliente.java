public class Cliente {
    private String nome;
    private ContaCorrente contacorrente;

    Cliente(String nome){
        this.nome = nome;
    }

    public void ligar_conta_corrente(ContaCorrente contacorrente){
        this.contacorrente = contacorrente;
    }

    public void depositar_valor(double valor){
        contacorrente.depositar(valor);
    }

    public void retirar_valor(double valor){
        contacorrente.retirar(valor);
    }

    public void imprimir_dados(){
        System.out.println("Nome: " + this.nome);
        contacorrente.dados_conta();
    }
}
