public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras(new PixPagamento(), new FreteSedex());
        double distancia = 100.0;
        carrinhoCompras.adicionaItem(new Item(10.0));
        carrinhoCompras.adicionaItem(new Item(15.0));
        System.out.println("Total do frete: " + carrinhoCompras.calculaFrete(distancia));
        carrinhoCompras.realizaPagamento(distancia);
    }
}
