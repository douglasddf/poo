package entidades;

/**
 * Essa classe representa o modelo de dados Funcionario
 */
public class Funcionario {

	// atributos 
	private long codigo; // autoincremental
	private String nome;
	private String cpf;
	private String celular;
	
	// responsavel por manter na memoria um contador para armazenar a sequencia de codigos dos
	// funcionarios criados. Cada novo Funcionario criado, incrementa-se seu valor e joga-se para
	// o codigo atual.
	private static int contadorCodigo;
	
	// construtor default
	public Funcionario(){
		contadorCodigo++;
		codigo = contadorCodigo;
	}
	
	// construtor com argumentos
	public Funcionario(String nome, String cpf, String telefone) {
		
		contadorCodigo++;
		codigo = contadorCodigo;
		
		this.nome = nome;
		this.cpf = cpf;
		// quando os nomes das variáveis sao diferentes o operador this torna-se opcional
		celular = telefone; 
	}



	// operacoes

	// como o codigo é autoincremental nao deve permitir alterar o seu valor, portanto somente
	// podemos permitir consultar o valor atual através do getCodigo
	public long getCodigo() {
		return codigo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}


	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
}








