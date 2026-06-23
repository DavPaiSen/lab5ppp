package ex3;

public class Aeroporto implements Observer{
    public void update(Subject cet) {
        System.out.println("Aeroporto:\nVento de " + ((CET)cet).getVelocidadeVento() + "km/h");
    }
}
