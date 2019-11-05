package ZapZap;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    private static ArrayList<Usuario> contatos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String select;
        boolean continua = true;
        do{
            showMenu();
            select = sc.next();
            if(!select.equals("0")){
                menu(select);
            }else{
                continua = false;
            }
        }while(continua);
    }

    private static void criaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Insira o nome do usuario que quer criar: ");
        String input = entrada.nextLine().toLowerCase();
        if(input.equals("")){
            System.out.println("Insira um usuario valido!");
            System.out.println("----------------------------");
        }else {
            Usuario user = new Usuario(input);
            contatos.add(user);
            System.out.println("----------------------------");
        }
    }

    private static boolean verificaUsuario(String procurar){
        for(Usuario x : contatos){
            if (x.getNome().equals(procurar)){
                return false;
            }
        }
        return true;
    }

    private static void mostraContato(){
        int acc = 1;
        System.out.println("----------------------------");
        for(Usuario x: contatos){
            System.out.println(acc + " - " + x.getNome());
            acc++;
        }
        System.out.println("----------------------------");
    }

    private static void showMenu(){
        System.out.println("[1] - Criar Novo Usuario:");
        System.out.println("[2] - Mostrar Usuarios criados:");
        System.out.println("[3] - Iniciar Conversa com um Usuario:");
        System.out.println("[4] - Mostrar usuario que se tem conversas:");
        System.out.println("[5] - Mostrar conversas de um usuario:");
        System.out.println("[0] - Encerrar programa:");
    }

    private static void menu(String x){
        switch (x) {
            case "1":
                criaUsuario();
                break;
            case "2":
                mostraContato();
                break;
            case "3":
                if(verificaEnvio()){
                    enviaMsg();
                }else
                    System.out.println("Não existe contatos suficientes Adicionados.");
                break;
            case "4":
                temConversa();
                break;
            case "5":
                mostraMsg();
                break;
            default:
                System.out.println("----------------------------");
                System.out.println("Insira um valor Valido: ");
                System.out.println("----------------------------");
                break;
        }
    }

    private static void mostraMsg(){
        System.out.println("----------------------------");
        Scanner usu = new Scanner(System.in);
        String u;
        System.out.println("Insira o Usuario para ver as Conversas: ");
        u = usu.next().toLowerCase();

        while(verificaUsuario(u)){
            System.out.println("Insira um Usuario Valido para ver as Conversas: ");
            u = usu.next().toLowerCase();
        }
        Usuario user;
        user = getUser(u);
        assert user != null;
        user.imprimir();
        System.out.println("----------------------------");
    }

    private static Usuario getUser(String usuario){
        for(Usuario x: contatos){
            if(x.getNome().equals(usuario)){
                return x;
            }
        }
        return null;
    }

    private static Boolean verificaEnvio(){
        System.out.println("----------------------------");
        System.out.println();
        return contatos.size() > 1;
    }

    private static void enviaMsg(){


        Scanner remete = new Scanner(System.in);
        String usuario;
        boolean end = false;
        int acc = 0;
        do{
            System.out.println("----------------------------");
            System.out.println("Insira seu Remetente: ");
            usuario = remete.nextLine().toLowerCase();
            if(acc == 3){
                end = true;
                break;
            }
            System.out.println("Voce ainda tem " + (3 - acc) + " Tentativas até reiniciar!");
            acc++;
        }while(verificaUsuario(usuario));
        if(!end) {
            end = false;
            Usuario Remetente;
            Remetente = getUser(usuario);
            Scanner dest = new Scanner(System.in);
            String destinatario;
            acc = 0;
            do {
                System.out.println("----------------------------");
                System.out.println("Insira seu Destinatario: ");
                destinatario = dest.nextLine().toLowerCase();
                if(acc == 3){
                    end = true;
                    break;
                }
                System.out.println("Voce ainda tem " + (3 - acc) + " Tentativas até reiniciar!");
                acc++;
            } while (verificaUsuario(destinatario));
            if(!end) {


                Usuario Destinatario;
                Destinatario = getUser(destinatario);
                String msg;
                msg = " ";
                System.out.println("----------------------------");
                System.out.println("Insira sua Mensagem: ");
                while (!msg.equals("")) {
                    Scanner x = new Scanner(System.in);
                    System.out.print(">>");
                    msg = x.nextLine();
                    assert Remetente != null;
                    assert Destinatario != null;
                    Remetente.enviarMsg(Destinatario, msg);
                }
            }
        }
        System.out.println("----------------------------");
    }

    private static void temConversa(){
        System.out.println("----------------------------");
        int acc = 1;
        for(Usuario x: contatos){
            if(!x.msgEmpty()){
                System.out.println(acc + ". " + x.getNome());
                acc++;
            }
        }
        System.out.println("----------------------------");
    }

}
