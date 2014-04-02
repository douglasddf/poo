
public class LacosExemplos {
	
	public static void main(String[] args) {
		
		/*
		 * Mostrar 10 numeros em ordem crescente
		 */
		
		
		
		// LACO WHILE
		int numero = 1;
		while(numero <= 10) {
			// enquanto condicao eh verdadeira será repetido
			System.out.println(numero);
			numero = numero + 1; // ou numero++
		}
		
		
		
		// LACO DO/WHILE
		numero = 1;
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= 10);
		
		
		// LACO PARA
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		
	}
	

}
