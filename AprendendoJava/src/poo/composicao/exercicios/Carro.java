package poo.composicao.exercicios;

public class Carro {
    String modelo;
    final Motor motor;
    Boolean estaLigado = false;

    Carro(){
        this.motor = new Motor();
    }

    public void mostrarMotor(){
        System.out.println("A potencia do motor é " + this.motor.potencia +
                " O tipo do motor é " + this.motor.tipo);
    }

    public void estado(){
        System.out.println("O carro está ligado? " + this.estaLigado);
    }

    public void ligar(){
        this.estaLigado = true;
    }

    public void desligar(){
        this.estaLigado = false;
    }
}
