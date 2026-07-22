package arrays.collections;

import java.util.HashSet;

public class Hash {
    static void main() {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        Usuario u1 = new Usuario("Lucas");
        usuarios.add(new Usuario("pedro"));
        usuarios.add(new Usuario("guilherme"));
        usuarios.add(new Usuario("ana"));
        usuarios.add(u1);

        boolean resultado = usuarios.contains(new Usuario("guilherme"));
        System.out.println(resultado);

    }
}
