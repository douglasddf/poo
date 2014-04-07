import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class IMC {

	public static void main(String[] args) {
		
		double pesoEmKg = 0.0;
		double alturaEmMetros = 0.0;
		double imc = 0.0;
		
		String relatorioIMC = "Relatório de Índice Massa Corporal:\n"+
							  "\n(Abaixo do peso): menos que 18.5"+
							  "\n(Normal): entre 18.5 e 24.9"+
							  "\n(Acima do peso): entre 25 e 29.9"+
							  "\n(Obeso): 30 ou mais";
		
		pesoEmKg = Double.parseDouble(JOptionPane.showInputDialog("Peso em quilos"));
		alturaEmMetros = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		
		imc = pesoEmKg / (alturaEmMetros * alturaEmMetros);
		
		JOptionPane.showMessageDialog(null, relatorioIMC + "\n\nSeu IMC     : "
				+ converterDoubleDoisDecimais(imc));
		
	}
	
	public static double converterDoubleDoisDecimais(double precoDouble) {  
	    DecimalFormat fmt = new DecimalFormat("0.00");        
	    String string = fmt.format(precoDouble);  
	    String[] part = string.split("[,]");  
	    String string2 = part[0]+"."+part[1];  
	        double preco = Double.parseDouble(string2);  
	    return preco;  
	}
	
	
}
