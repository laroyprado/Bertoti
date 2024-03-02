import classes.HomemAranha;
import classes.Venom;

public class Main {
    public static void main(String[] args) {
        HomemAranha aranha = new HomemAranha("Homi Aranha","Lancar Teia ");
        Venom venom = new Venom();
        aranha.lancarPoder(venom);
        System.out.println(venom.getVida());
    }
}