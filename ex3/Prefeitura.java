package ex3;

public class Prefeitura implements Observer{
    public void update(Subject cet) {
        System.out.println("Prefeitura:\nUmidade do ar em " + ((CET)cet).getUmidade()*100 + "%");
    }
}
