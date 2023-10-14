package conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("123", "João Paulo Mazzo", 1000);
        contaBancaria.depositar(100);
        contaBancaria.sacar(250);
    }

}
