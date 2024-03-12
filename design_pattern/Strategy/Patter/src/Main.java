import classes.Luta;
import classes.SuperHeroi;

public class Main {
    public static void main(String[] args) {
        SuperHeroi laroy = new SuperHeroi("Laroy", "Lançar Teia ", 40.0,10.0);

        SuperHeroi larissa = new SuperHeroi("Larissa","Lançar Gosma",300.0, 50.0);
        Luta iniciarLuta = new Luta();

        iniciarLuta.lutar(laroy,larissa);

    }
}