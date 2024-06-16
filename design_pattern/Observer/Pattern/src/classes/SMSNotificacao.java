package classes;

import interfaces.Observador;

public class SMSNotificacao implements Observador {
    private String numeroTelefone;

    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void notificar(String novoProduto) {
        System.out.println("Enviando SMS para " + numeroTelefone + ": Novo produto disponível: " + novoProduto);
    }
}