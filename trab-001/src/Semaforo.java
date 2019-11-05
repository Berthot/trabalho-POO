public class Semaforo {

    private int cor = 2; // 0 - Vermelho // 1 - Amarelo // 2 - Verde

    static final int VERMELHO = 0;
    static final int AMARELO = 1;
    static final int VERDE = 2;

    Semaforo(){

    }

    public void MudaProximaCor(){
        if (cor == 2){
            cor = 0;
        }else
            cor ++;
    }

    public void MudaCorFixa(int escolha){
        this.cor = escolha;
    }

//    public int MostraCor(){
//        return cor;
//    }

    public String MostraCor(){
        if (this.cor == 0){
            return "Vermelho";
        }
        if (this.cor == 1){
            return "Amarelo";
        }
        if (this.cor == 2){
            return "Verde";
        }
        return null;
    }

}
