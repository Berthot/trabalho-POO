import java.util.ArrayList;

public class Disco {
    private char nome;
    private ArrayList<Pasta> colecaoDePastas = new ArrayList<>();

    public Disco(char nome) {
        this.nome = nome;
    }


    public Pasta criaPasta(String nome){
        try {
            Pasta pasta = new Pasta(nome);
            colecaoDePastas.add(pasta);
            return pasta;
        }catch (Exception e){
            return new Pasta(nome);
        }
    }

    public void remover(String pasta){
        for (Pasta x: this.colecaoDePastas){
            if(x.getNome().equals(pasta)){
                this.colecaoDePastas.remove(x);
                System.out.println("Pasta " + pasta + " removida com sucesso!");
                break;
            }
        }


        if (this.colecaoDePastas.contains(pasta)) {
            this.colecaoDePastas.remove(pasta);
            System.out.println("A pasta " + pasta + " foi deletada com sucesso");
        }else{
            System.out.println("Esta pasta não se encontra!");
        }
    }

    public void listar(){
        if(!this.colecaoDePastas.isEmpty()){
            int acc = 0;
            System.out.println("Pastas já criadas no sistema!");
            for(Pasta x: this.colecaoDePastas){
                System.out.println(acc + "." + x.getNome());
                acc++;
            }
            System.out.println("--------------------------");

        }else{
            System.out.println("Não Possuem pastas o suficiente no sistema!");
        }

    }


}
