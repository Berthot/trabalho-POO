package ZapZap;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    public static ArrayList<Usuario> contatos = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int select;
        boolean continua = true;
        do{
            showMenu();
            select = Integer.parseInt(sc.next());
            if(select == 0){
                continua = false;
                continue;
            }
            menu(select);
        }while(continua);
    }


    public static void criaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Insira o nome do usuario que quer criar: ");
        Usuario user = new Usuario(entrada.nextLine());
        contatos.add(user);
        System.out.println("----------------------------");
        System.out.println("                           -");
    }

    private String verificaUsuario(Usuario procurar){
        for(Usuario x : contatos){
            if (x.equals(procurar)){
                return procurar.getName();
            }
        }
        return null;
    }

    public static void mostraContato(){
        int acc = 1;
        System.out.println("----------------------------");
        for(Usuario x: contatos){
            System.out.println(acc + " - " + x.getName());
            acc++;
        }
        System.out.println("----------------------------");
    }

    public static void showMenu(){
        System.out.println("[1] - Criar Novo Usuario:");
        System.out.println("[2] - Mostrar Usuarios criados:");
        System.out.println("[3] - Iniciar Conversa com um Usuario:");
        System.out.println("[4] - Mostrar usuario que se tem conversas:");
        System.out.println("[5] - Mostrar conversas de um usuario:");
        System.out.println("[0] - Encerrar programa:");
    }

    public static void menu(int x){

        if(x ==1){
            criaUsuario();
        }else if(x == 2){
            mostraContato();
        }else if(x == 3){
            enviaMsg();
        }else if(x == 4){
            temConversa();
        }else if(x == 5){
            mostraMsg();
        }else{
            System.out.println("Insira um valor Valido: ");;
        }


    }

    public static void mostraMsg(){
        System.out.println("---------------------------");
        Scanner usu = new Scanner(System.in);
        System.out.println("Insira o Usuario para ver as Conversas: ");
        String u = usu.next();
        Usuario x = null;
        for(Usuario y: contatos){
            if(y.getName().equals(u)){
                x = y;
                break;
            }
        }
        x.imprimir();
    }

    public static void enviaMsg(){
        Scanner u = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Insira seu Usuario: ");
        String usuario = u.nextLine();
        Usuario usuario42 = null;
        for(Usuario x: contatos){
            if(x.getName().equals(usuario)){
                usuario42 = x;
                break;
            }
        }
        Scanner re = new Scanner(System.in);
        System.out.println("Insira seu Remetente: ");
        String remetente = re.nextLine();
        Usuario reme = null;
        for(Usuario y: contatos){
            if(y.getName().equals(remetente)){
                reme = y;
                break;
            }
        }
        String msg;
        msg = " ";
        System.out.println("Insira sua Mensagem: ");
        while(!msg.equals("")){
            Scanner x = new Scanner(System.in);
            System.out.print(">>");
            msg = x.nextLine();
            usuario42.enviarMsg(reme, msg);
        }




    }

    public static void temConversa(){
        int acc = 1;
        for(Usuario x: contatos){
            if(!x.msgEmpty()){
                System.out.println(acc + ". " + x.getName());
            }
        }
    }

}