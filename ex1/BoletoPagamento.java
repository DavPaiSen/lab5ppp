public class BoletoPagamento implements PagamentoStrategy{
    public void pagar(double total) {
        System.out.println("Pagando R$: " + total + " pelo boleto");
    }
}
