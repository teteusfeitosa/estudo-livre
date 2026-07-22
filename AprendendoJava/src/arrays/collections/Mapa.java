package arrays.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Roberto");
        usuarios.put(1,"Ricardo"); //substitui nesse caso
        usuarios.put(3,"lu");
        usuarios.put(4,"paquetá"); //substitui nesse caso
        usuarios.put(5,"passinho"); //substitui nesse caso

        System.out.println(usuarios.size());
        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet()); //todas colunas
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));

        System.out.println(usuarios.get(3));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

    }
}
