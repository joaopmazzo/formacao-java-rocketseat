package programacaoOrientadaObjetos;

public class TesteDaPessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("48268869852");
        pessoa1.setNome("João Paulo Mazzo");
        pessoa1.setIdade(23);

        System.out.println(pessoa1.toString());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("0723216869");
        pessoa2.setNome("Paulo Mazzo");
        pessoa2.setIdade(58);

        System.out.println(pessoa2.toString());
    }

}
