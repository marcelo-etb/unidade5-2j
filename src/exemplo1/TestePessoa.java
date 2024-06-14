package exemplo1;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        p.nome = "Marcelo";
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p2);
    }
}
