package ex4;

import java.util.ArrayList;

public class Investidor implements ObservadorAcao{
    private ArrayList<Acao> acoes;
    private ArrayList<Double> minimos;
    private ArrayList<Double> maximos;
    private AcaoBroker corretor;

    public Investidor(AcaoBroker acaoBroker) {
        acoes = new ArrayList<Acao>();
        minimos = new ArrayList<>();
        maximos = new ArrayList<>();
        corretor = acaoBroker;
    }

    public void adicionaAcao(Acao adicionar, double minimo, double maximo) {
        acoes.add(adicionar);
        minimos.add(minimo);
        maximos.add(maximo);
    }

    public void adicionaAcao(Acao adicionar) {
        acoes.add(adicionar);
        minimos.add(adicionar.getValor() * 0.5);
        maximos.add(adicionar.getValor() * 2);
    }

    public void removeAcao(Acao remover) {
        if (acoes.contains(remover)) {
            int indice = acoes.indexOf(remover);
            acoes.remove(indice);
            minimos.remove(indice);
            maximos.remove(indice);
        }
    }

    public void update(SubjectAcao subject) {
        Acao acao = (Acao) subject;
        int indice = acoes.indexOf(acao);
        System.out.println("Acao " + indice + " mudou de valor, agora e: " + acao.getValor());
        if (acao.getValor() >= maximos.get(indice)) {
            System.out.println("Subiu muito de valor");
            corretor.vender(acao, this);
        } else if (acao.getValor() <= minimos.get(indice)) {
            System.out.println("Desceu muito de valor");
            corretor.vender(acao, this);
        }
    }

}
