package arraylistelist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RespostaExercicio08 {
    public static void main(String[] args) {

    	List<String> nomes = new ArrayList<>();

    	nomes.add("Carlos");
    	nomes.add("Ana");
    	nomes.add("Bruno");
        
        Collections.sort(nomes);

        System.out.println(nomes);
    }
}