package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {

        // Criando uma lista de Strings
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");

        // Exibindo a lista
        System.out.println(nomes);
    }
}