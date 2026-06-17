public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras(new PixPagamento());
        carrinhoCompras.adicionaItem(new Item(10.0));
        carrinhoCompras.adicionaItem(new Item(15.0));
        carrinhoCompras.realizaPagamento();
    }
}
