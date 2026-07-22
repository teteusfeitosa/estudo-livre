package poo.composicao;

public class Motor {
    Double fatorInjecao = 1D;
    final Carro carro;
    Boolean ligado = false;

    Motor(Carro carro){
        this.carro = carro;
    }
    int giros(){
        if(!ligado){
            return 0;
        }
        return (int) Math.round(fatorInjecao * 3000);
    }
}
