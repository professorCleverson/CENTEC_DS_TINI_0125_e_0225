package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class RespostaExercicio07 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}