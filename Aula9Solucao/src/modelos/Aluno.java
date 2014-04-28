package modelos;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Aluno implements Serializable {

	// dados usados para gravar prefixo em arquivo
    public static final String CODIGO = "codigo_";
    public static final String NOME = "nome_";
    public static final String EMAIL = "email_";
    public static final String LOGIN = "login_";
    public static final String SENHA = "senha_";
    
    
	private int codigo;
    private String nome;
    private String email;
    private String login;
    private String senha;

    private static int contador = 1;

    public static void setContador(int contador) {
        Aluno.contador = contador;
    }
    
    public Aluno(String nome, String email,String login,String senha) {
        try {
            this.codigo = contador++;
            this.nome = nome;
            this.email = email;
            this.login = login;
            this.senha = Arquivos.convertPasswordToMD5(senha);
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Aluno() {
        // nao cria codigo automatico.
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString() {
    	
    	String rel = codigo+ ", "+nome+", "+email+", "+login;
    	
    	return rel;
    }
    
    
}
