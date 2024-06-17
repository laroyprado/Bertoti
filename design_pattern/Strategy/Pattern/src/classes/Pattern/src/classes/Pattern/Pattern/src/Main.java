package classes.Pattern.Pattern.src;

import classes.Pattern.Pattern.src.classes.CarrinhoDeCompras;
import classes.Pattern.Pattern.src.classes.PagamentoBoleto;
import classes.Pattern.Pattern.src.classes.PagamentoCartaoCredito;
import classes.Pattern.Pattern.src.classes.PagamentoPayPal;

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
