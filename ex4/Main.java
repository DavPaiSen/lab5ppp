package ex4;

public class Main {
    public static void main(String[] args) {
        Acao a1 = new Acao(100);
        Acao a2 = new Acao(1000);
        AcaoBroker corretor = new AcaoBroker();
        Investidor investidor = new Investidor(corretor);
        corretor.comprar(a1, investidor);
        corretor.comprar(a2, investidor);
        a1.setValor(50);
        a2.setValor(2001);
    }
}
