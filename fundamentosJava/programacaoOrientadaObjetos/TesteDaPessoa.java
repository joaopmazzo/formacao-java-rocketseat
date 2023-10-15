package programacaoOrientadaObjetos;

public class TesteDaPessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("48268869852");
        pessoa1.setNome("João Paulo Mazzo");
        pessoa1.setIdade(23);
        System.out.println(pessoa1.imprimeDadosPessoa());

        Professor professor = new Professor();
        professor.setCpf("0723216869");
        professor.setNome("Paulo Mazzo");
        professor.setIdade(58);
        professor.setSalario(3000);
        System.out.println(professor.imprimeDadosPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("0723216869");
        aluno.setNome("Paulo Mazzo");
        aluno.setIdade(58);
        aluno.setMatricula("123a");
        System.out.println(aluno.imprimeDadosPessoa());
    }

}
