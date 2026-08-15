package poo.heranca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    Boolean atacar(Jogador oponente){
        int deltaX = Math.abs(this.x -  oponente.x);
        int deltaY = Math.abs(this.y -  oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 &&  deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }

    Boolean andar(Direcao direcao) {
       switch (direcao) {
           case NORTE:
               y++;
               break;
           case LESTE:
               x++;
               break;
           case SUL:
               y--;
               break;
           case OESTE:
               x--;
               break;
       }
        return true;
    }

}
