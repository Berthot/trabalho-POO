package Trabalho8a;

public class Teste {
    public static void main(String[] args) throws Exception {
        Banco dollar = new Banco("Dollar");

        try{ dollar.criar_conta(1, "jubileu", 400); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.criar_conta(2, "123", 4000); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.criar_conta(3, "1254", 500); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.criar_conta(4, "jubi123", -250); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.criar_conta(5, "jubi", 800); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.sacar(5, "jubi", 800, 7); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.sacar(4, "jubi123", 900, 10); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.sacar(3, "1245", 800, 10); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.sacar(5, "jubi", 800, 10); }
        catch (Exception e){
            e.printStackTrace();
        }

        try{ dollar.sacar(5, "jubi", 800, 10); }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
