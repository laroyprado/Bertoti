import classes.Lutar;
import classes.SuperHeroi;

public class Main {
    public static void main(String[] args) {
        SuperHeroi aranha = new SuperHeroi("Laroy", "Lançar Teia ", 40.0,10.0);

        SuperHeroi venom = new SuperHeroi("Larissa","Lançar Gosma",30.0, 5.0);
        Lutar iniciarLuta = new Lutar();

        iniciarLuta.lutar(aranha,venom);

    }
}