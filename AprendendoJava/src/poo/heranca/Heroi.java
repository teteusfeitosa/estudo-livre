package poo.heranca;

public class Heroi extends Jogador {
    Boolean atacar(Jogador oponente){
        Boolean ataque1 = super.atacar(oponente);
        Boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }

}
