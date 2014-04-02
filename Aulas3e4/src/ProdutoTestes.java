import javax.swing.JOptionPane;


public class ProdutoTestes {

	public static void main(String[] args) {
		
		// criar o objetos PRODUTOS
		Produto p1 = new Produto();
		
		p1.codigo = 1;
		p1.nome = "caneta 1";
		p1.descricao = "desc 1...";
		p1.preco = 400.0; 
		
//		p1.codigo = Integer.parseInt(
//				JOptionPane.showInputDialog("codigo: "));
//		p1.nome = JOptionPane.showInputDialog("nome: ");
//		p1.descricao = JOptionPane.showInputDialog("descricao: ");
//		p1.preco =Double.parseDouble(
//				JOptionPane.showInputDialog("preco: ")); 
		
		Produto p2 = new Produto();
		p2.codigo = 2;
		p2.nome = "caneta 2";
		p2.descricao = "desc 2...";
		p2.preco = 300.0;
		
		p1.listarDados();
		p2.listarDados();
		
	}
	
}
