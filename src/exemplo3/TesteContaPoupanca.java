package exemplo3;

public class TesteContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(111, "Lauane");
        cp.depositar(1000);
        System.out.println(cp);
        cp.reajustar(1);
        System.out.println(cp);
    }
}
