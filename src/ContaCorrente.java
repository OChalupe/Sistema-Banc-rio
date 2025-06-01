public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        if(valor > 0 && saldoDisponivel >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado (cheque especial: R$" + (saldo < 0 ? Math.abs(saldo) : 0) + ")");
            return true;
        }
        System.out.println("Limite do cheque especial excedido.");
        return false;
    }
}