import javax.swing.JOptionPane;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.codigo = 1;
		cliente1.nome = "Joao Silva";
		cliente1.cpf = "222.222.222.22";
		cliente1.telefone = "88888888";
		cliente1.quantItensComprados = 1;

		Cliente cliente2 = new Cliente();
		cliente2.codigo = 2;
		cliente2.nome = "Maria da Madalena";
		cliente2.cpf = "333.222.222.22";
		cliente2.telefone = "444444444";
		cliente2.quantItensComprados = 0;

		cliente1.imprimir();
		cliente2.imprimir();
		
		
		
		
		// com interacao com usuario

		// PASSO 1: ler os dados
		String cod = JOptionPane.showInputDialog("CODIGO");
		int codigo = Integer.parseInt(cod); // conversao
		
		String nome = JOptionPane.showInputDialog("NOME");
		String cpf = JOptionPane.showInputDialog("CPF");
		String celular = JOptionPane.showInputDialog("CELULAR");
		
		String itens = JOptionPane.showInputDialog("Quant. Itens Comprados");
		int quantItens = Integer.parseInt(itens); // conversao
		
		// PASSO 2: criar o objeto 
		Cliente cliente3 = new Cliente();
		
		// PASSO 3: setar os dados no objeto
		cliente3.codigo = codigo;
		cliente3.nome = nome;
		cliente3.cpf = cpf;
		cliente3.telefone = celular;
		cliente3.quantItensComprados = quantItens;
		
		cliente3.imprimir();
		
		
	} // fim main

} // fim classe
