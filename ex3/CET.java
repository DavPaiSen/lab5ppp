package ex3;

import java.util.ArrayList;

public class CET implements Subject{
    private double temperatura;
    private double umidade;
    private double velocidadeVento;

    private ArrayList<Observer> observadores;

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void setTudo(double temperatura, double umidade, double velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void notifyObservers() {
        for (Observer o : observadores) {
            o.update(this);
        }
    }

    public CET() {
        observadores = new ArrayList<Observer>();
    }
}
