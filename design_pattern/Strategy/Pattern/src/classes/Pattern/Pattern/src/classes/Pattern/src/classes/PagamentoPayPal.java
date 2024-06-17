package classes.Pattern.Pattern.src.classes.Pattern.src.classes;

public class PagamentoPayPal extends MetodoDePagamento {
    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}