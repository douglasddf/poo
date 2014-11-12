package main;


import telas.TelaPrincipal;
import modelos.Aluno;
import java.util.ArrayList;
import util.Arquivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author douglasdanieldelfrari
 */
public class ProgramaPrincipal {

    private static ArrayList<Aluno> listaAlunos;
    private static ArrayList<Aluno> listaAlunosArquivo;
	private static ArrayList<Aluno> listaAlunosPastaArquivos;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recuperarDadosEmArquivo();
        
        TelaPrincipal minhaTela = new TelaPrincipal();
        minhaTela.setVisible(true);
        
    }
    
    /**
	 * Salva um objeto aluno na estrutura de memória RAM e também no arquivo.
	 * 
	 * @param aluno
	 *            o objeto {@link Aluno} para ser salvo.
	 */
    public static void salvarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        
        // tambem gravando objeto em arquivo (OPCIONAL)
        Arquivos.gravarAlunoEmArquivo(aluno);
    }
    
    /**
     * Retorna a lista de alunos da memória RAM.
     * 
     * @return a lista de ArrayList<Aluno>.
     */
    public static ArrayList<Aluno> getAlunos() {
        return listaAlunos;
    }
    
    /**
     * Salva os dados da memória RAM para estrutura de arquivos.
     */
    public static void salvarDadosEmArquivo() {
        Arquivos.salvarAlunos(listaAlunos,listaAlunosArquivo);
    }
    
    /**
     * Recupera os dados que estao salvos em arquivo local e atualiza
     * listas de dados em memória.
     */
    private static void recuperarDadosEmArquivo() {
        listaAlunosArquivo = Arquivos.recuperarAlunos();
        listaAlunos = new ArrayList<Aluno>(listaAlunosArquivo);
        
        // usado para backup
        listaAlunosPastaArquivos = Arquivos.processarArquivos();
    }

    /**
	 * Recupera objeto Aluno de um login específico. Se não encontrar login, o
	 * sistema retorna null.
	 * 
	 * @param login
	 *            o login do usuário
	 * 
	 * @return o objeto Aluno associado ao login passado, ou null caso
	 *         contrário.
	 */
    public static Aluno getAlunoByLogin(final String login) {
        
        Aluno alunoResult = null;
        
        for (Aluno aluno : listaAlunos) {
            if (aluno.getLogin().equals(login)) {
                alunoResult = aluno;
                break;
            }
        }
        
        return alunoResult;
    }
    

    
}
