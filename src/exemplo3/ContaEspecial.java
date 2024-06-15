package exemplo3;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        // Envia os atributos para o construtor da classe m√£e
        super(numero, nomeTitular);
        this.limite = limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite() {
        return this.limite;
    }    
    
    public double getLimiteDisponivel() {
        if (getSaldo() < 0) {
            return this.limite + getSaldo();
        } else {
            return limite;
        }
    }
    
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            depositar(-valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial\n" + 
                "N˙mero: " + getNumero() + "\n" +
                "Titular: " + getNomeTitular()+ "\n" +
                "Saldo: R$ " + getSaldo() + "\n" +
                "Limite total: R$ " + getLimite() + "\n" +
                "Limite disponÌvel: R$ " + getLimiteDisponivel()+ "\n" +
                "-----------------------";
    }
}
