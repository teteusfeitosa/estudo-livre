package poo.heranca.desafio;

public class Carro {
    Double velocidade = 0D;
    Boolean estaligado = false;

    public void acelerar(){
        this.velocidade += 5D;
        System.out.printf("Velocidade: %.2fkm/h\n", velocidade);
    }
    public void frear(){
        if(this.velocidade < 5 ){
            System.out.println("Carro não pode frear mais");
            this.velocidade = velocidade;
        }else {
            this.velocidade -= 5D;
            System.out.printf("Velocidade: %.2fkm/h\n", velocidade);
        }

    }

}
