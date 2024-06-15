package exemplo4;
public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        System.out.println(a.getMedia(10, 5));
        System.out.println(a.getMedia(10, 5, 3));
    }
}
