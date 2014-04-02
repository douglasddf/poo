package telas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Funcionario;

public class TelaPrincipal {

	/*
	 * estrutura de dados do tipo ArrayList do Java. Estudar o capítulo 7, Java Como Programar.
	 */
	private static ArrayList<Funcionario> listaFuncionarios
								= new ArrayList<Funcionario>();
	
	
	
	public static void main(String[] args) {

		desenharTela();
		
	} // fim do main
	
	
	private static void desenharTela() {
		
			
		String tela = "1) Cadastrar Funcionário"+
					  "\n2) Listar Funcionários"+
					  "\n3) Pesquisar por código"+
					  "\n4) Sair";
		String opcao = null;
		
		do {
			opcao = JOptionPane.showInputDialog(tela);
			
			if (opcao.equals("1")){
				cadastrarFuncionario();
			} else if (opcao.equals("2")) {
				listarFuncionarios();
			} else if (opcao.equals("3")) {
				pesquisarPorCodigo();
			}
			
			
		} while (!opcao.equals("4"));
		
		
	} // fim do desenharTela
	
	
	
	private static void pesquisarPorCodigo() {
		
		// verificar se tem ou nao elementos
		if (listaFuncionarios.size() == 0) {
			JOptionPane.showMessageDialog(null,
					"Nenhum funcionário cadastrado!");
			return;
		}
		
		// pede para usuario digitar o codigo que deseja encontrar
		String codigoPesquisar = JOptionPane
				.showInputDialog("Código para encontrar:");
		// converte de String para long, pois o código é desse tipo
		long codigo = Long.parseLong(codigoPesquisar);
		
		// declara um objeto temporario para guardar o Funcionário (caso encontre)
		Funcionario funcionarioProcurado = null;
		
		// procurar em todos os elementos e comparar se código existe
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			
			// pega o funcionario atual
			Funcionario f = listaFuncionarios.get(i);
			
			// comparar o codigo a ser encontrado com o codigo do obj. Funcionario
			if (codigo == f.getCodigo()) {
				// achei, guarda na variavel temporario e para de buscar
				funcionarioProcurado = f;
				break;
			}
		} // fim laco
		
		// se objeto funcionarioProcurado existir, ele esta na mao e pode ser 
		// exibido na tela
		String dados = "Nenhum funcionário de código ( "+codigo+" ) foi encontrado.";
		if (funcionarioProcurado != null) {
			// limpa variavel
			dados = "";
			dados += funcionarioProcurado.getCodigo() + " - " +
					funcionarioProcurado.getNome() + " - " + 
					funcionarioProcurado.getCpf() + " - "  +
					funcionarioProcurado.getCelular();
		} 
		
		// joga na tela visual. Se nenhum codigo foi encontrado, entao a mensagem
		// que será exibida já foi personalizada para informar que não foi encontrado
		// nenhum codigo. Porém, se a busca encontrou, o valor correto será encontrado.
		JOptionPane.showMessageDialog(null, dados);
		
	} // fim do pesquisarPorCodigo
	
	
	private static void cadastrarFuncionario(){
		
		// entrada dos dados
		String nome = JOptionPane.showInputDialog("Nome funcionário");
		String cpf = JOptionPane.showInputDialog("CPF");
		String celular = JOptionPane.showInputDialog("Celular");
	
		// criar objeto funcionario
		Funcionario funcionario = new Funcionario(nome,cpf,celular);
		
		// guardar o objeto numa lista (ArrayList)
		listaFuncionarios.add(funcionario);
		
	} // fim cadastrarFuncionario
	
	
	
	private static void listarFuncionarios() {
		
		String relatorio = "";
		
		// verificar se tem ou nao elementos
		if (listaFuncionarios.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
			return;
		}
		
		
		// listar os funcionarios obtendo da lista (ArrayList)
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			
			Funcionario f = listaFuncionarios.get(i);
			
			relatorio += f.getCodigo() + " - " +
						 f.getNome() + " - " + 
					     f.getCpf() + " - "  +
					 	 f.getCelular() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		
		
		// o código comentado abaixo exemplifica o laço 'foreach', que 
		// funciona quando usamos ArrayList. Ele simplifica a iteração
		// entre os elementos.
		
		
//		for (Funcionario f : listaFuncionarios) {

//		relatorio += f.getCodigo() + " - " +
//				 f.getNome() + " - " + 
//			     f.getCpf() + " - "  +
//			 	 f.getCelular() + "\n";
		
//		}
		
	} // fim listarFuncionarios
	
	
} // fim da classe