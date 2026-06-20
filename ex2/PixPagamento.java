public class PixPagamento implements PagamentoStrategy{
    public void pagar(double total) {
        System.out.println("Pagando R$: " + total + " por PIX");
    }
}
