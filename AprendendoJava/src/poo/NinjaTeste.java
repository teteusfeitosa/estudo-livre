package poo;

public class NinjaTeste {
    public static void main(String[] args) {

        //obj1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto uzumaki";
        naruto.temBiju = true;
        naruto.ataqueBase();

        //obj2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke uchiha";
        sasuke.shariganAtivado();
        sasuke.ataqueBase();
    }
}
