import javax.swing.JOptionPane;


public class Produto {

	// atributos
	long codigo;
	String nome;
	double precoVenda;
	double precoCusto;
	
	// operacoes

	void imprimir() {
		
		String message = "Código: "+codigo +
						 "\nNome: "+nome +
						 "\nPreço Venda: "+precoVenda + 
						 "\nPreço Custo: "+precoCusto;
						 
		JOptionPane.showMessageDialog(null, message);
	} // fim imprimir
	
	
	void imprimirLucro() {

		double lucroCalculado = precoVenda - precoCusto;
		
		JOptionPane.showMessageDialog(null, "Lucro: "+lucroCalculado);
		
		
	}
}








