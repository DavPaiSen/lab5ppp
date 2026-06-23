package ex4;

public class AcaoBroker {
    public void vender(Acao acao, Investidor investidor) {
        System.out.println("Vendendo acao por " + acao.getValor() + " R$");
        investidor.removeAcao(acao);
    }

    public void comprar(double valor, Investidor investidor) {
        Acao nova = new Acao(valor);
        nova.addObserver(investidor);
        investidor.adicionaAcao(nova);
    }

    public void comprar (Acao acao, Investidor investidor) {
        acao.addObserver(investidor);
        investidor.adicionaAcao(acao);
    }

}
