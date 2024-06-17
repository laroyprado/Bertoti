class SMSNotificacao {
    private String numeroTelefone;

    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void notificar(String novoProduto) {
        System.out.println("Enviando SMS para " + numeroTelefone + ": Novo produto disponível: " + novoProduto);
    }
}
