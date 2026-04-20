package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");

        // Acessando o elemento na posição 1
        System.out.println(frutas.get(1));
    }
}
