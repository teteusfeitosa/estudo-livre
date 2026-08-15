package poo.composicao;

public class Carroteste {
    static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        Carro c2 = new Carro();

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        //faltou encapsulamento!!!
        c1.motor.fatorInjecao = -30D;



        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println(c1.motor.giros());

        //Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
