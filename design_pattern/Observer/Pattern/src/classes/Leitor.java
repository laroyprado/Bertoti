package classes;


import interfaces.Observer;

public class Leitor implements Observer {
    private String name;

    public Leitor(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println("Notícia para " + name + ": " + news);
    }
}