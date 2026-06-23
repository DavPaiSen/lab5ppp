import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Item> itens = new ArrayList<Item>();
    PagamentoStrategy pagamentoStrategy;
    FreteStrategy freteStrategy;

    public CarrinhoCompras(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item adicionar) {
        itens.add(adicionar);
    }

    public void removeItem(Item remover) {
        itens.remove(remover);
    }

    public double calculaFrete(double distancia) {
        return freteStrategy.calculaFrete(distancia);
    }

    public double calculaTotal(double distancia) {
        double soma = 0;
        for (Item i : itens) {
            soma += i.preco;
        }
        return soma + calculaFrete(distancia);
    }

    public void realizaPagamento(double distancia) {
        double total = calculaTotal(distancia);
        pagamentoStrategy.pagar(total);
    }
}
