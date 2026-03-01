public class ContaBancaria {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(500);

        boolean sucesso = conta.sacar(600);

        if (!sucesso) {
            System.out.println("Erro: saldo insuficiente para saque.");
        } else {
            System.out.println("Saque realizado com sucesso.");
        }
    }
}