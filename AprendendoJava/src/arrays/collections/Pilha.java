package arrays.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno príncipe");
        livros.push("Don Quixote"); //return nada
        livros.push("Don"); //return nada

        for(String Livrov: livros){
            //System.out.println(livrov);
        }

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros); // remove sequencialmente
        System.out.println(livros); // retorna nulo
        System.out.println(livros);
        System.out.println(livros);

        //livros.size();
        //livros.clear();
        //livros.isEmpty();

    }
}
