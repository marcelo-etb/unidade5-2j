package exemplo2;
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = null;
        String menu = "Selecione o tipo de conta para abrir:\n"
                + "1 - Conta Comum\n"
                + "2 - Conta Poupança\n"
                + "3 - Conta Especial";
        byte opcao = Byte.parseByte(
            JOptionPane.showInputDialog(menu));
        switch (opcao) {
            case 1: c = new Conta(); break;
            case 2: c = new ContaPoupanca(); break;
            case 3: c = new ContaEspecial(); break;
            default: JOptionPane
                .showMessageDialog(null, "Tipo de conta inválido");
        }
        if (c != null) {
            c.imprimirTipoConta();
        }
    }
}
