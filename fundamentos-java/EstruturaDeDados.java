import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    public static void main(String[] args) {
        // Lista
        List<String> listaDeDados = new ArrayList<>();
        listaDeDados.add("João");
        listaDeDados.add("Paulo");
        listaDeDados.add("mazzo");
        System.out.println("Retorno de toda a lista = " + listaDeDados);
        System.out.println("Retorno de um index da lista = " + listaDeDados.get(1));

        System.out.println("\nEstrutura de FOR em uma lista");
        for (String nome : listaDeDados) {
            System.out.println("O nome é = " + nome);
        }

        System.out.println("\nEstrutura de FOREACH em uma lista");
        listaDeDados.forEach(System.out::println);
    }

}
