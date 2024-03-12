package interfaces;

public interface Noticia {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}