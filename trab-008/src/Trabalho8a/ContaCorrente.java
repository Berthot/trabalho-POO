package Trabalho8a;

import Trabalho8b.ExcecaoContaInvalida;
import Trabalho8b.ExcecaoHorarioInvalido;
import Trabalho8b.ExcecaoSaldoInsuficiente;
import Trabalho8b.ExcecaoSenhaInvalida;

public class ContaCorrente extends Banco {
    public int numero;
    private String senha;
    private double saldo;

    public ContaCorrente(String nomeDoBanco, int numero, String senha, double saldo){
        super(nomeDoBanco);
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void retirar(double valor, String senha, int horario)
            throws ExcecaoSenhaInvalida, ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido {
        if (horario > 22 || horario < 8){
            throw new ExcecaoHorarioInvalido("Você pode sacar somente entre 8h e 22h!");
        }
        if (!senha.equals(senha)) {
            throw new ExcecaoSenhaInvalida("Senha inválida!");
        }
        if (saldo < 0)
            throw new ExcecaoSaldoInsuficiente("Você não tem saldo para realizar essa operação!");
        else {
            saldo -= valor;
        }
    }
}
