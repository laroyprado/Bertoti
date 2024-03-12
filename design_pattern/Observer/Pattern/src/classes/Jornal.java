package classes;

import interfaces.Observer;
import interfaces.Noticia;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Noticia {
    private List<Observer> observers;
    private String latestNews;

    public Jornal() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}