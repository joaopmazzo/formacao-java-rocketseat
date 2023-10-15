package programacaoOrientadaObjetos;

public class Professor extends Pessoa {
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String imprimeDadosPessoa() {
        return super.imprimeDadosPessoa() + " e você é professor";
    }

}
