import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,2,2,6,8,8,9,10};
        System.out.println(getNumerosRepitidos(numbers));


//        __________________________________________________


        int[] numerosDesordenados = {5, 3, 8, 4, 2, 7, 9, 1, 10};

        System.out.println("\n\nDesordenado\n"+ Arrays.toString(numerosDesordenados));

        quickSort(numerosDesordenados, 0, numerosDesordenados.length - 1);

        System.out.println("Desordenado\n"+ Arrays.toString(numerosDesordenados));


//        __________________________________________________

        int numeroParaCalcularFatorial = 5;
        System.out.printf("\n\nFatorial de %d é %d", numeroParaCalcularFatorial, fatorial(numeroParaCalcularFatorial));
    }

    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) return 1;

        return numero * fatorial(numero - 1);
    }

    public static void quickSort(int[] numerosDesordenados, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(numerosDesordenados, esquerda, direita);
            quickSort(numerosDesordenados, esquerda, p);
            quickSort(numerosDesordenados, p + 1, direita);
        }
    }

    public static int particao(int[] numerosDesordenados, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = numerosDesordenados[meio];

        while (true) {
            while (numerosDesordenados[esquerda] < pivo) {
                esquerda++;
            }
            while (numerosDesordenados[direita] > pivo) {
                direita--;
            }

            if (esquerda >= direita) {
                return direita;
            }

            troca(numerosDesordenados, esquerda, direita);
        }
    }

    public static void troca(int[] numerosDesordenados, int valorEsquerda, int valorDireita) {
         int temp = numerosDesordenados[valorEsquerda];
        numerosDesordenados[valorEsquerda] = numerosDesordenados[valorDireita];
        numerosDesordenados[valorDireita] = temp;
    }

    public static List<Integer> getNumerosRepitidos(int[] numbers) {
        Map<Integer, Integer> ocorrenciasNumeros = new HashMap<>();
        List<Integer> duplicados = new ArrayList<>();

        for (int number : numbers) {
            ocorrenciasNumeros.put(number, ocorrenciasNumeros.getOrDefault(number, 0) +1);
        }

        for (Map.Entry<Integer, Integer> entry : ocorrenciasNumeros.entrySet()) {
            if (entry.getValue() > 1) duplicados.add(entry.getKey());
        }

        return duplicados;
    }
  }