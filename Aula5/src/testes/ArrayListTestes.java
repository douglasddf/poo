package testes;

import java.util.ArrayList;

import modelos.Aluno;

public class ArrayListTestes {

	
	public static void main(String[] args) {
		
		
		ArrayList lista = new ArrayList();
		lista.add("Ola");
		lista.add(1000);
		lista.add(true);
		
//		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
//		listaAlunos.add("Ola");
//		listaAlunos.add(1000);
//		listaAlunos.add(true);
//		
//		ArrayList<String> listaNome = new ArrayList<String>();
//		listaNome.add("Ola");
//		listaNome.add(1000);
//		listaNome.add(true);
		
	
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(i + " - "+lista.get(i));
			
		}
		
		
		
	}
	
}
