public class Main {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente cc = new ContaCorrente("CC-123", 1000);
        ContaPoupanca cp = new ContaPoupanca("CP-456", 0.01);
        
        // Operações
        cc.depositar(500);
        cc.sacar(200);
        cc.transferir(300, cp);
        
        cp.aplicarRendimento();
        
        // Polimorfismo
        Conta contaGenerica = cc;
        contaGenerica.depositar(100);
        
        // Saldos finais
        System.out.println("\nSaldo Conta Corrente: R$" + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + cp.getSaldo());
    }
}