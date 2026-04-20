package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Removendo pelo índice
        numeros.remove(1);

        System.out.println(numeros);
    }
}
