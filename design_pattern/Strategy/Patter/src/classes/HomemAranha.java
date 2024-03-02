package classes;

import interfaces.Poder;

public class HomemAranha implements Poder {

    String nome;
    String poder;
    Float vida;


    public void lancarPoder(Venom venom){
        venom.setVida(venom.getVida() - 10);
        if(venom.getVida() == 0){
            System.out.println("Venom morreu");
        }
        System.out.println(this.poder);
    }

    public HomemAranha(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;

    }
}
