package programacaoOrientadaObjetos;

public class Aluno extends Pessoa {
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String imprimeDadosPessoa() {
        return super.imprimeDadosPessoa() + " e você é aluno";
    }

}
