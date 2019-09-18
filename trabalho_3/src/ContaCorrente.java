public class ContaCorrente {
    private int id_conta;
    private double saldo;

    ContaCorrente(int id_conta, double saldo){
        this.id_conta = id_conta;
        this.saldo = saldo;

    }

    public void depositar(double valor){
        System.out.println("VALOR DO DEPOSITO: " + valor);
        valor = Math.abs(valor);
        saldo += valor;
    }

    public void retirar(double valor){
        if(valor > this.saldo){
            System.out.println("VALOR DO SAQUE: " + valor);
            System.out.println("VALOR RETIRADO " + (valor - (valor - this.saldo)));
            this.saldo = 0;
            System.out.println("SALDO ATUAL: " + this.saldo);
        }else {
            System.out.println("VALOR DO SAQUE: " + valor);
            System.out.println("VALOR DO RETIRADO: " + valor);
            valor = Math.abs(valor);
            this.saldo -= valor;
        }
    }

//    public void retirar(double valor){
//        if(valor > this.saldo){
//            System.out.println("Você Não possui saldo suficiente");
//        }else {
//            System.out.println("VALOR DO SAQUE: " + valor);
//            System.out.println("VALOR DO RETIRADO: " + valor);
//            valor = Math.abs(valor);
//            this.saldo -= valor;
//        }
//    }


    public void dados_conta(){
        System.out.println("ID - " + this.id_conta);
        System.out.println("SALDO - " +this.saldo);
        System.out.println("-------------------------------------------");
    }
}
