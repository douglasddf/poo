import javax.swing.JOptionPane;


public class Aluno {
	
	// atributos
	String nome;
	int idade;
	
	// metodos
	
	void listarDados() {
		String relatorio = "Nome: "+nome +
		    	  "\nIdade: "+idade;
		JOptionPane.showMessageDialog(null,relatorio);
	}
	
	void cadastrarDados() {
		
		nome = JOptionPane.showInputDialog("Nome");
		idade = Integer.parseInt(
				JOptionPane.showInputDialog("Idade"));
		
		JOptionPane.showMessageDialog(null, "Cadastro Realizado");
		
	}
}
