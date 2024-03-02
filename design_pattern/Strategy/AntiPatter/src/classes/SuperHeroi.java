package classes;

public class SuperHeroi {
    String nome;
    String poder;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }


    public SuperHeroi(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }
}
