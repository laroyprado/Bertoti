import java.util.ArrayList;
import java.util.List;

class LojaOnline {
    private List<EmailNotificacao> emailNotificadores = new ArrayList<>();
    private List<SMSNotificacao> smsNotificadores = new ArrayList<>();

    public void adicionarEmailNotificador(EmailNotificacao notificador) {
        emailNotificadores.add(notificador);
    }

    public void adicionarSMSNotificador(SMSNotificacao notificador) {
        smsNotificadores.add(notificador);
    }

    public void notificarNovoProduto(String novoProduto) {
        for (EmailNotificacao notificador : emailNotificadores) {
            notificador.notificar(novoProduto);
        }
        for (SMSNotificacao notificador : smsNotificadores) {
            notificador.notificar(novoProduto);
        }
    }
}
