public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }
    }

    public boolean sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para conta " + destino.numero);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}