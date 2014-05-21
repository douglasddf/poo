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
        
        // testando GIT 
        
        //new TelaPrincipal().setVisible(true);
        TelaPrincipal minhaTela = new TelaPrincipal();
        minhaTela.setVisible(true);
        
    }
    
    
    public static void salvarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        
        // tambem gravando objeto em arquivo (OPCIONAL)
        Arquivos.gravarAlunoEmArquivo(aluno);
    }
    
    public static ArrayList<Aluno> getAlunos() {
        return listaAlunos;
    }
    
    
    public static void salvarDadosEmArquivo() {
        Arquivos.salvarAlunos(listaAlunos,listaAlunosArquivo);
    }
    
    public static void recuperarDadosEmArquivo() {
        listaAlunosArquivo = Arquivos.recuperarAlunos();
        listaAlunos = new ArrayList<Aluno>(listaAlunosArquivo);
        
        // usado para backup
        listaAlunosPastaArquivos = Arquivos.processarArquivos();
    }

    public static Aluno getAlunoByLogin(String login) {
        
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
