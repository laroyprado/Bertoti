package Patter;

class PagamentoPayPal implements MetodoDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}