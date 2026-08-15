package poo;

public class Uchiha extends Ninja {
    String nivelDoSharigan;
    public void shariganAtivado(){
        System.out.println("Sharigan Ativado");
    }
    @Override
    public void ataqueBase(){
        System.out.println("Eu sou um ninja e taque uma kunai do elemento fogo");
    }
}
