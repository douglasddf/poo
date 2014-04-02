import javax.swing.JOptionPane;


public class TelaPrincipal {

	public static void main(String[] args) {
		
		// desenhar uma tela com as seguintes opcoes:
		
		/*
		 * 1) Cadastrar Cliente
		 * 2) Listar Clientes
		 * 3) Sair
		 */
		desenharTela();
	}

	private static void desenharTela() {
		
		int opcao = 0;
		String menu = "1) Cadastrar cliente"+
					  "\n2) Listar clientes"+
					  "\n3) Sair";
		do {
			
			// ler o valor do usuario usando entrada de dados VISUAL
			String escolha = 
					JOptionPane.showInputDialog(menu);
			
			// converter o valor String para inteiro
			opcao = Integer.parseInt(escolha);
			
			// comparar o valor para saber o que deve ser chamado
			if (opcao == 1) {
				// cadastrar aqui
			} else if (opcao == 2) {
				// listar aqui
			}
			
			
		} while (opcao != 3);
		
	} // fim desenharTela
	
} // fim classe principal





