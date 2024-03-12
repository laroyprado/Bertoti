import classes.Jornal;
import classes.Leitor;


public class Main {
    public static void main(String[] args) {
        Jornal jornal = new Jornal();

        Leitor leitor1 = new Leitor("João");
        Leitor leitor2 = new Leitor("Maria");


        jornal.registerObserver(leitor1);
        jornal.registerObserver(leitor2);


        jornal.publishNews("Novo prefeito eleito na cidade!");


        jornal.removeObserver(leitor2);

        jornal.publishNews("Aumento de impostos previsto para o próximo ano.");
    }
}
