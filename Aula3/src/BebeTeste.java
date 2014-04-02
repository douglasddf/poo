import javax.swing.JOptionPane;

public class BebeTeste {

	/**
	 * Funcao para iniciar a execucao.
	 * 
	 * @param args
	 *            um array de String para receber argumentos.
	 */
	public static void main(String[] args) {

		// criando objeto Bebe do MODELO
		Bebe bebe1 = new Bebe();
		
		// chama o ALGORITMO desta classe;
		// funcao LOCAL desta classe de teste
		lerDados(bebe1);

		// chama a OPERACAO do MODELO listarDados()
		bebe1.listarDados();
	}

	/**
	 * Funcao para fazer entrada de dados para o objeto.
	 * 
	 * @param bebe
	 *            o objeto Bebe que serah preenchido com os dados.
	 */
	static void lerDados(Bebe bebe) {
		bebe.setNome(entrada("Digite o nome do Bebe"));

		String sexo = "f";
		do {
			sexo = entrada("Qual o sexo do bebe? "
					+ "\n\n(F)eminino \n(M)asculino");

			if (sexo.equalsIgnoreCase("m")) {
				bebe.setEhMasculino(true);
			} 
			
		} while (!sexo.equalsIgnoreCase("f") && 
				!sexo.equalsIgnoreCase("m"));
		
		bebe.setPeso(Float.parseFloat(entrada("Qual o peso do bebe?")));
		bebe.setQuantidadeFezes(Integer
				.parseInt(entrada("Quantidade de fezes?")));

	}

	/**
	 * Metodo para realizar ENTRADAS de DADOS genérica.
	 * 
	 * @param valorImpresso
	 *            o valor a ser mostrado na tela
	 * 
	 * @return o valor digitado pelo usuario
	 */
	static String entrada(String valorImpresso) {

		return JOptionPane.showInputDialog(valorImpresso);
	}

}
