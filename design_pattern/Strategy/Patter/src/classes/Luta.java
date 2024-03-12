package classes;

public class Luta {

    public void lutar(SuperHeroi heroi1, SuperHeroi heroi2){
        while (true){
            heroi1.lancarPoder(heroi1);
            heroi2.lancarPoder(heroi2);


            if(heroi1.getVida() <= 0.0){
                System.out.println(heroi2.getNome() + " Ganhou a luta");
                break;
            }else if(heroi2.getVida() <= 0.0) {
                System.out.println(heroi1.getNome() + " Ganhou a luta");
                break;
            }
            }
        }
    }

