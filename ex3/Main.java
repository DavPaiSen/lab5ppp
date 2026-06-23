package ex3;

public class Main {
    public static void main(String[] args) {
        CET cet = new CET();
        Aeroporto aeroporto = new Aeroporto();
        cet.addObserver(aeroporto);
        Prefeitura prefeitura = new Prefeitura();
        cet.addObserver(prefeitura);
        cet.setTudo(30, 0.5, 10);
        cet.setTudo(29, .7, 2);
    }
}
