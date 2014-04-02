package testes;
import modelos.Aluno;


public class AlunoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jesus");;
		aluno1.setNota1(5.0f);
		aluno1.setNota2(10.0f);
		aluno1.imprimirDados();
		
		Aluno aluno2 = new Aluno();
		aluno2.imprimirDados();
		
		Aluno aluno3 = new Aluno("Maria",8.0f,6.9F);
		aluno3.imprimirDados();
		
	}

}
