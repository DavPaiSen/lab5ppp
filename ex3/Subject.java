package ex3;

public interface Subject {
    public void addObserver(Observer observer);

    public void notifyObservers();
}
