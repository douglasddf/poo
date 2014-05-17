import javax.swing.JOptionPane;


public class Matriz {
	
	
	public static void main(String[] args) {
		
		final int QUANTIDADE = 2;
		
		// declarando uma matriz, onde
		// lista[linha 0, 0] -> nome
		// lista[linha 1, 1] -> idade
		// lista[linha N, 2] -> CPF
		// lista[linha N, 3] -> codigo
		String[][] lista = new String[QUANTIDADE][4];
		

		
		
		
		for (int i = 0; i < QUANTIDADE; i++) {
			
			String codigo = JOptionPane.showInputDialog("Codigo "+(i+1));
			String nome = JOptionPane.showInputDialog("Nome "+(i+1));
			String idade = JOptionPane.showInputDialog("Idade "+(i+1));
			String cpf = JOptionPane.showInputDialog("CPF "+(i+1));

			// armazena os valores nas respectivas linhas, colunas
			lista[i][0] = nome;
			lista[i][1] = idade;
			lista[i][2] = cpf;
			lista[i][3] = codigo;
		}
		
	}

}
