package arraylistelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo05 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");

        // Verificando se contém um elemento
        if (nomes.contains("Ana")) {
            System.out.println("Ana está na lista");
        }

        // Ordenando a lista
        Collections.sort(nomes);

        System.out.println(nomes);
    }
}
