package telavisual;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Essa classe demonstra como criar uma tela
 * visual usando JFrame. 
 */
public class Tela {

	public static void main(String[] args) {
		
		// criar uma instancia JFrame (tela)
		JFrame tela = new JFrame("Título janela");
		
		// configurar para fechar no clique do close (x)
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setar largura e altura da tela
		tela.setSize(400, 400);
		
		// criar um PAINEL para evitar esticar componentes visuais
		JPanel painel = new JPanel();
		
		// adicionando um botao para a tela
		JButton botaoSair = new JButton("Sair");
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		// adicionar a instancia DO PAINEL na tela
		tela.add(painel); // agora eh o painel, nao o botao
		
		// ADICIONAR TODOS OS COMPONENTES NO PAINEL AGORA
		painel.add(botaoSair);
		painel.add(botaoCadastrar);
		
		
		// mandar a tela aparecer
		tela.setVisible(true);
		
	}
	
}
