public class Sistema {
    public static void main(String[] args) {
        Disco d = new Disco('C');
        Pasta escola = d.criaPasta("Escola");
        Pasta pessoal = d.criaPasta("Pessoal");
        d.listar(); // lista as pastas Escola e Pessoal
        Texto t = new Texto("Trabalho 10");
        escola.inserir(t);
        Apresentacao a = new Apresentacao("Defesa Projeto 2");
        escola.inserir(a);
        Planilha p = new Planilha("Calculo 2");
        escola.inserir(p);
        escola.listar();
        Video v = new Video("Aniversario");
        pessoal.inserir(v);
        Imagem i = new Imagem("Foto RJ");
        pessoal.inserir(i);
        Som s = new Som("Musica Chico");
        pessoal.inserir(s);
        pessoal.listar();
        t.abrir();
        a.abrir();
        p.abrir();
        v.abrir();
        i.abrir();
        s.abrir();
        escola.remover("Trabalho 10");
        escola.duplicar("Defesa Projeto 2");
        escola.listar();
        d.remover("Pessoal");
        d.listar();
    }

}