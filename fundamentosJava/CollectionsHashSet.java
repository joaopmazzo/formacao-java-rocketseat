import java.util.HashSet;
import java.util.Set;

public class CollectionsHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("João Paulo");
        set.add("Paulo");
        set.add("Arthur");
        set.remove("Arthur");
        System.out.println("Retorno de todo o set = " + set);
        System.out.println("O set possui o nome 'Paulo' = " + set.contains("Paulo"));

        System.out.println("\nEstrutura de FOR em um set");
        for (String value : set) {
            System.out.println("O valor é " + value);
        }

        System.out.println("\nEstrutura de FOREACH em um Set");
        set.forEach(System.out::println);
    }

}
