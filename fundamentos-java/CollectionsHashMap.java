import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {
    
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("João Paulo", 10);
        map.put("Paula", 8);
        map.put("Jey", 5);
        System.out.println("Retorno de todo o map = " + map);
        System.out.println("Retorno de um index do map = " + map.get("Paula"));

        System.out.println("\nEstrutura de FOR em um map");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println("A chave é " + key + " e o valor é " + value);
        }

        // System.out.println("\nEstrutura de FOREACH em uma lista");
        // listaDeDados.forEach(System.out::println);
    }

}
