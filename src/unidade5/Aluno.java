package unidade5;

public class Aluno {
    String nome;
    String curso;
    static int quantidade;
    public Aluno() {
        quantidade++;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", curso=" + curso + ", quantidade=" + quantidade + '}';
    }
    
}
