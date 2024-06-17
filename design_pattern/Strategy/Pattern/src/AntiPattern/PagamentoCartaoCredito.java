package AntiPattern;

class PagamentoCartaoCredito extends MetodoDePagamento {
    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
