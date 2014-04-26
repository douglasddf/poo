package arquivo.exemplo2;
import java.io.Serializable;

/**
 * Se implementar Serializable podemos persistir o objeto em arquivo.
 */
public class Pessoa implements Serializable {

	/**
	 * gerado pelo Eclipse com um codigo unico para essa classe Pessoa.
	 * Isso eh recomendado porque classes serializadas precisam ser persistentes
	 * com um codigo Hash unico em memoria. Fazendo isso garantimos que esse objeto 
	 * poderá ser recuperado com sua identidade recuperada de forma segura. 
	 */
	private static final long serialVersionUID = -973521140850535441L;
	
	private String nome;
	private String sobrenome;

	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;

	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void setSobrenome(String sobrenome) {

		this.sobrenome = sobrenome;

	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " \n" + "Sobrenome: " + this.sobrenome;
	}

}
