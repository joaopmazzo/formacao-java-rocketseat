package conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + ". Saldo atual de R$ " + this.saldo);
        } else {
            System.out.println("O valor de depósito é invalido, por favor, informe um valor positovo");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if ((this.saldo - valor) >= 0) {
                this.saldo -= valor;
                System.out.println("Depósito de R$ " + valor + ". Saldo atual de R$ " + this.saldo);
            } else {
                System.out.println("O saldo da conta é menor que o valor que deseja sacar, o seu saldo atual é de R$ " + this.saldo);
            }
        } else {
            System.out.println("O valor que deseja sacar é invalido, por favor, informe um valor positovo");
        }
    }

}
