import classes.CarrinhoDeCompras;
import classes.PagamentoBoleto;
import classes.PagamentoCartaoCredito;
import classes.PagamentoPayPal;

public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.setMetodoDePagamento(new PagamentoCartaoCredito());
        carrinhoDeCompras.pagar(100.00);

        carrinhoDeCompras.setMetodoDePagamento(new PagamentoPayPal());
        carrinhoDeCompras.pagar(150.00);

        carrinhoDeCompras.setMetodoDePagamento(new PagamentoBoleto());
        carrinhoDeCompras.pagar(200.00);
    }

}