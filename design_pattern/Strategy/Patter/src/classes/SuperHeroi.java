package classes;

import interfaces.Poder;


public class SuperHeroi implements Poder {

    String nome;
    String nomePoder;
    Double vida;

    Double qntPoder;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePoder() {
        return nomePoder;
    }

    public void setNomePoder(String nomePoder) {
        this.nomePoder = nomePoder;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public SuperHeroi(String nome, String nomePoder,Double vida,Double qntPoder) {
        this.nome = nome;
        this.nomePoder = nomePoder;
        this.vida = vida;
        this.qntPoder = qntPoder;
    }

    public void lancarPoder(SuperHeroi superHeroi){
        superHeroi.setVida(superHeroi.getVida() - 10.0);


    }



}
