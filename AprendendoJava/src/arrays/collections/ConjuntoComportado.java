package arrays.collections;

import java.util.TreeSet;

public class ConjuntoComportado {
    static void main(String...args) {
        //Set<String> lista = new HashSet<String>(); //<>lista será tipo do daodos entre os <>
        TreeSet<String> lista = new TreeSet<>();

        lista.add("1.2");
        lista.add("Carlos");
        lista.add("los");
        lista.add("pf");
        lista.add("luan");
        lista.add("ana");

        for(String candidatos: lista){
            System.out.println(candidatos);
        }
        String s = "bom dia";


        TreeSet<Integer> listas = new TreeSet<>();
        System.out.println();

        listas.add(1);

        listas.add(2);
        listas.add(130);
        listas.add(4);
        listas.add(6);
        listas.add(7);

        for (Integer Pessoas : listas){
            System.out.println(Pessoas);
        }


    }
}
