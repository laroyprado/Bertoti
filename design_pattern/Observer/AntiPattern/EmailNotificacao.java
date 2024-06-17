class EmailNotificacao {
    private String email;

    public EmailNotificacao(String email) {
        this.email = email;
    }

    public void notificar(String novoProduto) {
        System.out.println("Enviando e-mail para " + email + ": Novo produto disponível: " + novoProduto);
    }
}
