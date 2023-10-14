
/*
 * "PrimeiraClasse" = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */
public class PrimeiraClasse {

    // Todo conteúdo deverá ser inserido aqui dentro

    public static void main(String[] args) {
        /**
         * Valores (int, double, float, long)
         * Texto (String)
         * Booleanos (Boolean)
         */
        int dadoTipoInt = 1;
        double dadoTipoDouble = 1.2;
        float dadoTipoFloat = 1.2f;
        long dadoTipoLong = 1l;
        String dadoDoTipoString = "Aqui vai um texto";
        boolean dadoDotipoBoolean = true;


        System.out.println("Inicio do exemplo do IF/ELSE");
        if (dadoTipoInt == 10) {
            System.out.println("O valor é igual a 10");
        } else if (dadoTipoInt == 12) {
            System.out.println("O valor é igual a 1.2");
        } else {
            System.out.println("O valor é diferente de 10");
        }
        System.out.println("Fim do exemplo do IF/ELSE\n");


        int valorInicial = 0;
        System.out.println("Inicio do exemplo do WHILE");
        while (valorInicial < 3) {
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("Fim do exemplo do WHILE\n");


        System.out.println("Inicio do exemplo do FOR");
        for (int i = 0; i < 3; i++) {
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("Fim do exemplo do FOR\n");
    }
    
}

// Fora do escopo da classe