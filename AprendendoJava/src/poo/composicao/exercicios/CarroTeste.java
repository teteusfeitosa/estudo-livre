package poo.composicao.exercicios;

public class CarroTeste {
    static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari";
        ferrari.motor.potencia = 2000;
        ferrari.motor.tipo = "V2";

        ferrari.mostrarMotor();
        ferrari.estado();
        ferrari.ligar();
        ferrari.estado();
    }
}
