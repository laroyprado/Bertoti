import classes.EmailNotificacao;
import classes.LojaOnline;
import classes.SMSNotificacao;
import interfaces.Observador;

public class Main {

    public static void main(String[] args) {
        LojaOnline lojaOnline = new LojaOnline();

        Observador emailUsuario1 = new EmailNotificacao("usuario1@example.com");
        Observador smsUsuario1 = new SMSNotificacao("123456789");

        lojaOnline.adicionarObservador(emailUsuario1);
        lojaOnline.adicionarObservador(smsUsuario1);

        lojaOnline.notificarNovoProduto("Smartphone modelo XYZ");

        Observador emailUsuario2 = new EmailNotificacao("usuario2@example.com");
        lojaOnline.adicionarObservador(emailUsuario2);
        lojaOnline.notificarNovoProduto("Fone de ouvido Bluetooth ABC");
    }

}
