
public class Bebe {
	
	// atributos do bebe
	private String nome;
	private boolean ehMasculino;
	private float peso;
	private float volumeEmDecibeis;
	private int quantidadeFezes;
	
	// operacoes
	
	/**
	 * Esse metodo lista os dados da classe Bebe na saída textual.
	 */
	void listarDados() {
		String relatorio = "nome="+nome+
						   ", ehMasculino="+ehMasculino+
						   ", peso="+peso+
						   ", volumeEmDecibeis="+volumeEmDecibeis+
						   ", quantidadeFezes="+quantidadeFezes;
		
		System.out.println(relatorio);
	}
	
	
	public void setNome(String nomeNovo) {
		nome = nomeNovo;
	}
	
	public String getNome() {
		
		return nome;
	}


	/**
	 * @return the ehMasculino
	 */
	public boolean isEhMasculino() {
		return ehMasculino;
	}


	/**
	 * @param ehMasculino the ehMasculino to set
	 */
	public void setEhMasculino(boolean ehMasculino) {
		this.ehMasculino = ehMasculino;
	}


	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}


	/**
	 * @return the volumeEmDecibeis
	 */
	public float getVolumeEmDecibeis() {
		return volumeEmDecibeis;
	}


	/**
	 * @param volumeEmDecibeis the volumeEmDecibeis to set
	 */
	public void setVolumeEmDecibeis(float volumeEmDecibeis) {
		this.volumeEmDecibeis = volumeEmDecibeis;
	}


	/**
	 * @return the quantidadeFezes
	 */
	public int getQuantidadeFezes() {
		return quantidadeFezes;
	}


	/**
	 * @param quantidadeFezes the quantidadeFezes to set
	 */
	public void setQuantidadeFezes(int quantidadeFezes) {
		this.quantidadeFezes = quantidadeFezes;
	}
	
	

}
