import javax.swing.JOptionPane;


public class Cliente {
	
	// atributos
	long codigo;
	String nome;
	String cpf;
	String telefone;
	int quantItensComprados;
	
	
	// operacoes
	void imprimir() {
		String rel = "codigo: " + codigo +
					 "\nnome: " + nome +
					 "\nCPF: " + cpf +
					 "\ntelefone: " + telefone +
					 "\nquantidade itens comprados: " 
					 		+ quantItensComprados;
		
		JOptionPane.showMessageDialog(null, rel);
		
	} // fim imprimir
	
} // fim classe
