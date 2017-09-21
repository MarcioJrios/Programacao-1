import javax.swing.JOptionPane;

public class Dialogo{
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Ola " + nome + "!");
	}
}
