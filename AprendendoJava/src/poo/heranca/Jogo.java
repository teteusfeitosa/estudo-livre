package poo.heranca;

public class Jogo {
    static void main(String[] args) {
        Monstro monstro = new Monstro(); // Monstro j1 = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi= new Heroi(); // Jogador j2 = new Jogador(); // Heroi j2 = new Heroi();
        // todo hero é jogador
        heroi.x = 10;
        heroi.y = 11;

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.OESTE);


        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println(heroi.vida);
        System.out.println(monstro.vida);


    }
}
