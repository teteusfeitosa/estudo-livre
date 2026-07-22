package arrays.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    static void main() {

        Queue<String> fila  = new LinkedList<>();
        // offer e add adiciona elementos difenrça se estiver cehia o offer n adiciona
        fila.add("bia");
        fila.offer("Anna"); // true ou false caso n conseguir adicionar
        fila.add("daniel"); // lança uma exceção se estiver a fila cheia
        fila.add("lucas");
        fila.add("luca");



        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção obtem o próximo elemento
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //
        // fila.contains()


    }

}
