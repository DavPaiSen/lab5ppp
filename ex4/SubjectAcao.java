package ex4;

public interface SubjectAcao {
    public void addObserver(ObservadorAcao observer);

    public void notifyObservers();
}
