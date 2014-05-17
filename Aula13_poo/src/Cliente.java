import java.util.Date;


// subclass de Pessoa (eh uma classe filha)
public class Cliente extends Pessoa {
	

	private int quantidadeCompras;
	private Date diaPrimeiraCompra;

	public int getQuantidadeCompras() {
		return quantidadeCompras;
	}

	public void setQuantidadeCompras(int quantidadeCompras) {
		this.quantidadeCompras = quantidadeCompras;
	}

	public Date getDiaPrimeiraCompra() {
		return diaPrimeiraCompra;
	}

	public void setDiaPrimeiraCompra(Date diaPrimeiraCompra) {
		this.diaPrimeiraCompra = diaPrimeiraCompra;
	}
	
	

}
