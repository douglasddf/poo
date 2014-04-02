package modelos;

public class Aluno {
	
	
	private long matricula; // matricula auto incremental
	private String nome;
	private float nota1;
	private float nota2;
	
	private static long contadorMatricula = 0;
	
	
	public Aluno(){
		String nomeClasse = getClass().getSimpleName();
		System.out.println(nomeClasse+ " construtor default");
		
		// atualizar o contador
		contadorMatricula++;
		
		// atribuir o contador atual na matricula deste objeto
		matricula = contadorMatricula;
	}
	
	
	
	public Aluno(String nome, float nota1,float nota2){
		String nomeClasse = getClass().getSimpleName();
		System.out.println(nomeClasse+ " construtor com argumentos");
		// atualizar o contador
		contadorMatricula++;
		// atribuir o contador atual na matricula deste objeto
		matricula = contadorMatricula;
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	
	
	
	
	
	
	
	public void imprimirDados(){
		System.out.println("---------------- BEGIN");
		System.out.println(matricula);
		System.out.println(nome);
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println("---------------- END");
	}
	
	
	/**
	 * @return the matricula
	 */
	public long getMatricula() {
		return matricula;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the nota1
	 */
	public float getNota1() {
		return nota1;
	}
	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	/**
	 * @return the nota2
	 */
	public float getNota2() {
		return nota2;
	}
	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	
	

}
