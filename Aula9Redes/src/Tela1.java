import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tela1 {

	public static void main(String[] args) {

		
		// declarar uma variavel que representa uma tela
		JFrame tela = new JFrame();
		
		// permite adicionar os botoes sem esticar
		JPanel painel = new JPanel();
		
		// permite setar as dimensoes da tela (largura,altura)
		tela.setSize(400, 300);
		
		// permite fechar o programa quando o X da janela for pressionado
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// cria um botao visual para aparecer na tela com nome 'Sair' 
		JButton botaoSair = new JButton("Sair");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		// adicionar o painel na tela principal
		tela.add(painel);
		
		// adicionar o botao no painel
		painel.add(botaoCadastrar);
		painel.add(botaoSair);
		
		// pemite fazer a tela aparecer
		tela.setVisible(true);
		
		
		// TAREFA: criar um botao CADASTRAR e fazer aparecer na tela

	}

}
