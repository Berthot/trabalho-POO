package Trabalho8a;

import Trabalho8b.ExcecaoContaInvalida;
import Trabalho8b.ExcecaoHorarioInvalido;
import Trabalho8b.ExcecaoSaldoInsuficiente;
import Trabalho8b.ExcecaoSenhaInvalida;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Banco {
    String nome;
    ArrayList<ContaCorrente> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void criar_conta(int numero, String senha, double saldo)
            throws ExcecaoSaldoInsuficiente, ExcecaoContaInvalida {
        if (numero <= 0 || senha.length() <= 5 || saldo <= 0) {
            throw new ExcecaoContaInvalida("O número da conta precisa ser maior que zero e a senha precisa ter mais de 5 caracteres! Tente novamente.");
        } else {
            ContaCorrente c = new ContaCorrente(this.nome, numero, senha, saldo);
            contas.add(c);
        }
    }

    public void sacar(int numero, String senha, double valor, int horario) throws ExcecaoSaldoInsuficiente, ExcecaoSenhaInvalida, ExcecaoHorarioInvalido {
        for (ContaCorrente c: contas){
            if (c.numero == numero){
                c.retirar(valor, senha, horario);
            }
        }
    }
}
