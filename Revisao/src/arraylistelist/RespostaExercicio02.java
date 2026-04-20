package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class RespostaExercicio02 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        
        System.out.println("Tamanho da Lista: " + numeros.size() + " posições.");
    }
}