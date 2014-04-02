import javax.swing.JOptionPane;



public class TabuadaTestes {

	
	public static void main(String[] args) {
		
		
		// PASSO 1: pedir qual a tabuada para usuario 
		int numero;
		String valor;
		
		// Recebe o valor informado pelo usuario e armazena na String
		valor = JOptionPane.showInputDialog("Digite a tabuada (1 a 10)");
		
		// converte a String lida e obtem o valor inteiro correspondente
		numero = Integer.parseInt(valor);
		
		// OU
//		numero = Integer.parseInt(JOptionPane.showInputDialog(
//				"Digite a tabuada (1 a 10)"));
		
		
		// PASSO 2: processar as respostas de acordo com a tabuada
		
		String message = "";
		
		for (int i = 1; i <= 10; i++) {
			
			message = message + numero+" x "+i+" = "+(numero*i) + "\n";
			
			// ou 
//			message += numero+" x "+i+" = "+(numero*i) + "\n";
			
			
		} // fim laço
		
		JOptionPane.showMessageDialog(null, message);
		
		
	} // fim do main
	
} // fim classe





