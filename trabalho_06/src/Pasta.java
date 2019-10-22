import java.util.ArrayList;


/*
Pasta:
inserir um	arquivo,
remover	um	arquivo,
listar	os nomes dos arquivos,
duplicar arquivos,
criar uma cópia de um arquivo,
imprimir o nome da pasta
 */


public class Pasta{
    private String nome;
    private ArrayList<Arquivo> colecaoArquivos = new ArrayList<>();


    public Pasta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inserir(Arquivo arquivo){
        this.colecaoArquivos.add(arquivo);
    }

    public void remover(String arquivo) {
        for (Arquivo x : this.colecaoArquivos) {
            if (x.getNome().equals(arquivo)) {
                this.colecaoArquivos.remove(x);
                System.out.println("Arquivo " +x.getNome() + " foi removido ");
                break;
            } else {
                System.out.println("Este arquivo nao se encontra!");
            }
        }
    }

    public void listar() {
        if (!this.colecaoArquivos.isEmpty()) {
            int acc = 1;
            for (Arquivo arq : this.colecaoArquivos) {
                System.out.println("Listando- " + acc + ". " + this.nome + "/" + arq.getNome());
                acc++;
            }
            System.out.println("--------------------------");
        }else{
            System.out.println("Não Possui arquivos!");
        }
    }

    public void duplicar(String nome) {
        for (Arquivo x : this.colecaoArquivos) {
            if (x.getNome().equals(nome)) {
                Arquivo novo = new Arquivo(x.getNome() + "(1)");
                this.colecaoArquivos.add(novo);
                System.out.println("Arquivo: " + x.getNome() + "(1) - Duplicado");
                break;
            } else {
                System.out.println("não é possivel duplicar pois nao tem ");
            }

        }
    }


/*
Pasta:
inserir um	arquivo,ok
remover	um	arquivo,ok
listar	os nomes dos arquivos,ok
duplicar arquivos,ok
criar uma cópia de um arquivo,ok
imprimir o nome da pastaok
 */
}
