import javax.swing.JOptionPane;


public class TestandoArray {
	

	

	public static void main(String[] args) {
		

		int QUANTIDADE = 0;
		
		// pede o tamanho e armazena na variavel
		// necessario converter de String para inteiro
		QUANTIDADE = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Quantos usuários deseja casdastrar?"));
		
		// declara e inicializa os vetores 
		String nomes[] = new String[QUANTIDADE];
		int idades[] = new int[QUANTIDADE];
		String cpfs[] = new String[QUANTIDADE]; 
		
		
		for (int i = 0; i < nomes.length; i++) {
			// entrada de dados
			String nome = JOptionPane.showInputDialog("Nome "+(i+1));
			String idade = JOptionPane.showInputDialog("Idade "+(i+1));
			String cpf = JOptionPane.showInputDialog("CPF "+(i+1));
			
			// atribuir os dados nos vetores
			nomes[i] = nome;
			idades[i] = Integer.parseInt(idade); // converter
			cpfs[i] = cpf;
			
 		} // fim laco
		
		// listar os dados como um relatorio
		String relatorio = "";
		for (int i = 0; i < QUANTIDADE; i++) {
			
			relatorio += nomes[i] + ", "+idades[i]+", "+cpfs[i] + "\n";
			
		} // fim laco
		
		// imprime na tela visual
		JOptionPane.showMessageDialog(null, relatorio);
		
		
		
	} // fim maim
	
} // fim programa
