import javax.swing.JOptionPane;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		// PASSO INICIAL: pedir ao usuario para informar os valores
		long codigo =  Long.parseLong(
				JOptionPane.showInputDialog("Codigo"));
		String nome = JOptionPane.showInputDialog("Nome produto");
		double precoVenda = Double.parseDouble(
				JOptionPane.showInputDialog("Preco Venda"));
		double precoCusto = Double.parseDouble(
				JOptionPane.showInputDialog("Preco Custo"));
		
		// PASSO 2: criar o objetos Produto
		Produto produto = new Produto();
		
		// PASSO 3: atribuir valores para os objetos
		//          (preco -> venda e custo)
		produto.codigo = codigo;
		produto.nome = nome;
		produto.precoVenda = precoVenda;
		produto.precoCusto = precoCusto;
		
		// PASSO 4: imprimir na tela o lucro ATUAL produto
		produto.imprimir();
		produto.imprimirLucro();
		
		
		
		
	} // fim main

} // fim classe
