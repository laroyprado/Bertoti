package AntiPattern;

class PagamentoBoleto extends MetodoDePagamento {
    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto bancário.");
    }
}