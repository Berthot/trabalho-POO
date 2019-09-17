package ZapZap;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    public static ArrayList<Usuario> contatos = new ArrayList<>();

    public static void main(String[] args) {

        int select;
        boolean continua = true;

        do{
            show_menu();
            Scanner scan = new Scanner(System.in);
            select = Integer.parseInt(scan.next());
            if(select == 0){
                continua = false;
                continue;
            }
            menu(select);
        }while(continua);




    }


    public static void criar_usuario(){
        Scanner nome_usuario = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Insira o nome do usuario que quer criar: ");
        Usuario user = new Usuario(nome_usuario.nextLine());
        contatos.add(user);
        System.out.println("----------------------------");
        System.out.println("                           -");
    }

    private String verificar_usuario(Usuario procurar){
        for(Usuario x : contatos){
            if (x.equals(procurar)){
                return procurar.getName();
            }
        }
        return null;
    }

    public static void mostra_contatos(){
        System.out.println("----------------------------");
        for(Usuario x: contatos){
            System.out.print(x.getName());
        }
        System.out.println("----------------------------");
    }


    public static void show_menu(){
        System.out.println("[1] - Criar Novo Usuario:");
        System.out.println("[2] - Mostrar Usuarios criados:");
        System.out.println("[3] - Iniciar Conversa com um Usuario:");
        System.out.println("[4] - Mostrar usuario que se tem conversas:");
        System.out.println("[5] - Enviar uma mensagem de um usuario para outro:");
        System.out.println("[6] - Mostrar conversas de um usuario:");
        System.out.println("[0] - Encerrar programa:");
    }


    public static void menu(int x){

        if(x ==1){
            criar_usuario();
        }else if(x == 2){
            mostra_contatos();
        }else if(x == 3){
            System.out.println('3');
        }else if(x == 4){
            System.out.println('4');
        }else if(x == 5){
            System.out.println('5');
        }else if(x == 6){
            System.out.println('6');
        }else if(x == 7){
            System.out.println('7');
        }
    }

}

//        1. Criar	um	novo	usuário (e	inseri-lo	numa	coleção	de	usuários)
//        2. Mostrar	todos	os	usuários	criados
//        3. Iniciar	uma conversa	entre	dois	usuários
//        4. Mostrar	a	lista	de	usuários	com	os	quais	um	usuário	mantém	conversas
//        5. Enviar	uma	mensagem	de	um	usuário	para outro Usuario Conversa Mensagem 1 n 1 n
//        6. Mostrar todas	as	mensagens	de	uma	conversa	de	um	usuário
//        7. Encerrar	o	programa

