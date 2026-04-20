package arraylistelist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo04 {
    public static void main(String[] args) {

        List<String> cidades = new ArrayList<>();

        cidades.add("Manaus");
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");

        // Percorrendo com for
        for (int i = 0; i < cidades.size(); i++) {
            System.out.println(cidades.get(i));
        }
    }
}
