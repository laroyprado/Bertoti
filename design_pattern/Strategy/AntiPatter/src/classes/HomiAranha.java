package classes;

public class HomiAranha extends SuperHeroi{

    boolean teia;

    public HomiAranha(String nome, String poder, boolean teia) {
        super(nome, poder);
        this.teia = teia;
    }


    public void lançarTeia(){
        if(teia){
            System.out.println("Lançou teia");
        } else{
            System.out.println("Sem capacidade");
        }
    }


    @Override
    public String getPoder() {
        return "O poder do " + nome + " é " + poder + " e lançar teia";
    }
}
