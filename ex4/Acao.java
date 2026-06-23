package ex4;

import java.util.ArrayList;

public class Acao implements SubjectAcao{
    private double valor;
    private ArrayList<ObservadorAcao> observers;

    public Acao(double valor) {
        this.valor = valor;
        observers = new ArrayList<ObservadorAcao>();
    }

    public void addObserver(ObservadorAcao adicionar) {
        observers.add(adicionar);
    }

    public void notifyObservers() {
        for (ObservadorAcao o : observers) {
            o.update(this);
        }
    }

    public void setValor(double valor) {
        this.valor = valor;
        notifyObservers();
    }

    public double getValor() {
        return valor;
    }


}
