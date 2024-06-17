package Patter;

class PagamentoBoleto implements MetodoDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto bancário.");
    }
}