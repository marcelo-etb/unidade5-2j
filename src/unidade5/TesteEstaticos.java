package unidade5;
import javax.swing.JOptionPane;
public class TesteEstaticos {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = JOptionPane.showInputDialog("Digite o nome do aluno A");
        Aluno b = new Aluno();
        b.nome = JOptionPane.showInputDialog("Digite o nome do aluno B");
        
        JOptionPane.showMessageDialog(null, 
                "A: " + a.nome + "\nB: " + b.nome);
        
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o sal�rio:"));
        double salarioLiquido = salario - (salario * 11 / 100);
        JOptionPane.showMessageDialog(null, 
                "Sal�rio Bruto: R$ " + salario + "\n" +
                "Sal�rio L�quido: R$ " + salarioLiquido);        
        int anoNascimento = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        int idade = 2024-anoNascimento;
        JOptionPane.showMessageDialog(null, 
            "Voc� nasceu em " + anoNascimento + " e por isso tem " +
                idade + " anos");
        
        System.out.print("Quantidade: ");
        System.out.println(Aluno.quantidade);
        System.out.println("---------------------");
        for (int i = 0; i < 6; i++) {
            long numero = Math.round(Math.random() * 60);
            System.out.print(" | " + numero);
        }
        System.out.println(" | ");
    }
    
}
