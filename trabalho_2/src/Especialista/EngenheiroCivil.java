package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {

    private String nome,formacao;
    private int idade;

    public EngenheiroCivil(String nome, int idade, String formacao){
        this.nome = nome;
        this.idade = idade;
        this.formacao = formacao;

    }

    public void mostrar_dados_pessoais(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Formação Academica: " + formacao);
        System.out.println();
    }

    public static void main(String[] args) {
        EngenheiroCivil clovis = new EngenheiroCivil("clovis da silva", 45, "Engenheiro Civil");

        clovis.mostrar_dados_pessoais();

        Retangulo r = new Retangulo(4.7f, 8.2f);
        System.out.println("Area: " + r.area());
        System.out.println("Perimetro: " + r.perimetro());

    }
}
