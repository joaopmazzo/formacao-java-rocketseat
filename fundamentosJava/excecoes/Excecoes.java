package excecoes;

import programacaoOrientadaObjetos.Pessoa;

public class Excecoes {
    
    /**
     * CHECKED EXCEPTION
     * São exceções que o compilador consegue indentificar na hora de compilar
     */

     /**
     * UNCHECKED EXCEPTION
     * São exceções que ocorrer no tempo de execução do código, ex: nullPointerException
     */

     public static void main(String[] args) {
        System.out.println("Inicio do código");

        // try {
        //     validarNumero();
        // } catch (Exception e) {
        //     System.out.println("Não foi possivel validar o numero");
        //     e.printStackTrace();
        // }

        Pessoa p = null;
        p.getCpf();

        System.out.println("Fim do código");
     }

     public static void validarNumero() throws Exception {
        System.out.println("Inicio do código de validarNumero");
        
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }

        System.out.println("Fim do código de validarNumero");
     }

}
