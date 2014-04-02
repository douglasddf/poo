import javax.swing.JOptionPane;

/**
 * Essa é a entidade que representa um Produto.
 */
public class Produto {

	// atributos
	long codigo;
	String nome;
	String descricao;
	double preco;

	// métodos

	void listarDados() {
		String relatorio = "codigo: " + codigo +
				"\nnome: " + nome+
			    "\ndescrição: " + descricao + 
				"\npreço: " + preco;

		JOptionPane.showMessageDialog(null, relatorio);
	}

}
