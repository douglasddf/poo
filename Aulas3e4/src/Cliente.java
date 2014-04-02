import javax.swing.JOptionPane;


/**
 * Essa classe representa um modelo de Cliente.
 * 
 * @author douglasdanieldelfrari
 */
public class Cliente {
	

	// ATRIBUTOS
	String CPF;
	String nome;
	String telefone;
	
	// crior um metodo para alterar o nome
	void alterarNome(String nomeNovo) {
		nome = nomeNovo;
	}
	
	void listarDados() {
		
		String relatorio = "Nome: "+nome +
				   "\nCPF: "+CPF +
				   "\nTelefone: "+telefone;

		JOptionPane.showMessageDialog(null,relatorio);
		
	}
	
	
}
