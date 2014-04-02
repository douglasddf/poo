

public class ClienteTestes {

	public static void main(String[] args) {
		
		// criando meu objeto
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Daniel";
		cliente1.CPF = "333.333.333.33";
		cliente1.telefone = "(81)9999-0000";
		
		cliente1.listarDados();
		
		
		cliente1.alterarNome("Jose");
		
		cliente1.listarDados();
	}
	
}
