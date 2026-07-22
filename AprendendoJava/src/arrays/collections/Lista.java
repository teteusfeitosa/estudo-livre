package arrays.collections;

import java.util.ArrayList;

public class Lista {
    static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");



        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("João"));
        lista.add(new Usuario("manu"));

        System.out.println(lista.get(3).nome);
        lista.remove(3);
        lista.remove(new Usuario("Manu")); // true ou false

        System.out.println(lista.contains("Carlos"));

        System.out.println("tem?" + "  " +lista.contains(new Usuario("lia")));

        for(Usuario u: lista){ // Acessa pelo índice
            System.out.println(u.toString());// ou u.nome;
        }




    }
}
