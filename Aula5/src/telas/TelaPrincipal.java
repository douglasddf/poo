package telas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelos.Aluno;


public class TelaPrincipal {

	private static ArrayList<Aluno>listaAlunos = new ArrayList<Aluno>();
	
	public static void main(String[] args) {
		// desenhar a tela
	}
	
	/**
	 * Fazer um menu com as opcoes:
	 * 
	 * 
	 * 1) Cadastrar Aluno;
	 * 2) Editar aluno
	 * 3) Apagar aluno
	 * 4) Apagar todos os alunos
	 * 5) Listar alunos
	 * 6) Sair
	 * 
	 */
	
	
	
	private static void cadastrarAluno() {
		
		// passo 1: ler dados do usuario
		String nome, nota1, nota2;
		nome = JOptionPane.showInputDialog("Nome aluno");
		nota1 = JOptionPane.showInputDialog("Nota 1");
		nota2 = JOptionPane.showInputDialog("Nota 2");
		
		// passo 2: criar objeto Aluno
		float n1 = Float.parseFloat(nota1);
		float n2 = Float.parseFloat(nota2);
		Aluno aluno = new Aluno(nome, n1, n2);
		
		// passo 3: cadastrar o aluno na lista
		listaAlunos.add(aluno);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
