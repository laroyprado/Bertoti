package classes.Pattern.Pattern.src.classes.Pattern.src.classes;

public class CarrinhoDeCompras {
    private MetodoDePagamento metodoDePagamento;

    public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pagar(double valor) {
        if (metodoDePagamento == null) {
            throw new IllegalStateException("Método de pagamento não configurado");
        }
        metodoDePagamento.pagar(valor);
    }
}