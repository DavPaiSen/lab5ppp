import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Item> itens = new ArrayList<Item>();
    PagamentoStrategy pagamentoStrategy;

    public CarrinhoCompras(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void adicionaItem(Item adicionar) {
        itens.add(adicionar);
    }

    public void removeItem(Item remover) {
        itens.remove(remover);
    }

    public double calculaTotal() {
        double soma = 0;
        for (Item i : itens) {
            soma += i.preco;
        }
        return soma;
    }

    public void realizaPagamento() {
        double total = calculaTotal();
        pagamentoStrategy.pagar(total);
    }
}
