package exemplo3;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String nomeTitular) {
        // Repassa os valores para a classe mãe
        super(numero, nomeTitular);
    }
    
    public void reajustar(double percentual) {
        double saldoAtual = this.getSaldo();
        double juros = saldoAtual * percentual / 100;
        this.depositar(juros);
    }
}
