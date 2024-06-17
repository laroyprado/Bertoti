package classes.Pattern.Pattern.src.classes;

public class PagamentoCartaoCredito extends MetodoDePagamento {
    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}