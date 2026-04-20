package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class RespostaExercicio06 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}