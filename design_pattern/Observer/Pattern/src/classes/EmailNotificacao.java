package classes;
import interfaces.Observador;


public class EmailNotificacao implements Observador {
    private String email;

    public EmailNotificacao(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String novoProduto) {
        System.out.println("Enviando e-mail para " + email + ": Novo produto disponível: " + novoProduto);
    }
}