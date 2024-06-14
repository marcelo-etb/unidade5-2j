package exemplo3;

public class TesteContaEspecial {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(123, "Marcelo", 500);
        boolean sucesso = ce.sacar(500);
        if (sucesso) {
            System.out.println("Saque efetado com sucesso!");
        } else {
            System.err.println("Erro ao efetuar saque!");
        }
        System.out.println(ce);
    }
}
