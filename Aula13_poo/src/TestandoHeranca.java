import java.util.Date;


public class TestandoHeranca {
	
	public static void main(String[] args) {
		
		// criando objetos 
		
		Funcionario f = new Funcionario();
		f.setCodigo(1);
		f.setNome("Joao Pedro da Silva");
		f.setCarteiraTrabalho("222.333.ce");
		f.setTelefone("99999999");
		
		
		Cliente c = new Cliente();
		c.setCodigo(1);
		c.setNome("Daniela Vasconselos");
		c.setQuantidadeCompras(0);
		c.setTelefone("999997779");
		c.setDiaPrimeiraCompra(new Date());
		
		
		
	}

}
